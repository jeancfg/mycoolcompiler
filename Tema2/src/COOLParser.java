import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

public class COOLParser {
	public static CommonTokenStream prepareParsing(InputStream is)
			throws IOException {
		ANTLRInputStream input = new ANTLRInputStream(is);
		COOLTreeBuilderLexer lexer = new COOLTreeBuilderLexer(input);

		CommonTokenStream tokenStream = new CommonTokenStream(lexer);

		return tokenStream;
	}

	public static CommonTree buildCOOLTree(InputStream is) throws IOException,
			RecognitionException {
		CommonTokenStream tokenStream = prepareParsing(is);

		COOLTreeBuilderParser parser = new COOLTreeBuilderParser(tokenStream);

		COOLTreeBuilderParser.program_return retVal = parser.program();

		return (CommonTree) retVal.getTree();
	}

	public static void generateOutputData(Classes cl, CommonTree ast,
			String fileName) throws RecognitionException {
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(ast);

		COOLTreeChecker checker = new COOLTreeChecker(nodeStream);
		checker.setFileName(fileName);

		checker.program(cl);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * There should be one class list per program. This list would collect
		 * the classes from all the source files that mycoolc takes at the
		 * command line.
		 */
		boolean initDone = false;
		Classes cl = null;
		Program prg = null;

		// Command line processing (you may modify it at will)
		args = Flags.handleFlags(args);

		/*
		 * The current strategy creates an ANTLR AST for each compilation file,
		 * and during tree parsing, each detected class is added to the global
		 * class list. Note that this strategy needs additional semantic
		 * checking after all the classes have been added to the list.
		 */

		try {
//		_tests/advanced/expressions.cl
//			_tests/complex/graph.cl
//			_tests/complex/lam.cl

			for (String fname : args) { // Iterate through the input file names
				CommonTree rootNode = null;
				FileInputStream fis = new FileInputStream(fname);

				rootNode = buildCOOLTree(fis); // Build the ANTLR AST

				if (!initDone) {
					initDone = true;
					cl = new Classes(rootNode.getLine());
					prg = new program(rootNode.getLine(), cl);
				}

				// Parse the AST and add the partial results to the class list
				ClassTable.setCurrentFilename(fname);
				generateOutputData(cl, rootNode, fname);

				fis.close();
			}

			if (prg != null) {
				prg.semant();

				// Important: Do not remove this line!
				prg.dump_with_types(System.out, 0);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (RecognitionException ex) {
			ex.printStackTrace();
		}
	}
}
