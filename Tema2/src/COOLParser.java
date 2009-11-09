import java.io.File;
import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

/**
 * Tema 2 CPL
 */

/**
 * TODO:
 */

public class COOLParser {
	private static final String COOL_SOURCE_FILE = ".cl";

	private static final String simpleTestsRoot = "teste/_tests/simple/";
	private static final String advancedTestsRoot = "teste/_tests/advanced/";
	private static final String complexTestsRoot = "teste/_tests/complex/";

	// private static final String errorsTestsRoot = "teste/_tests/errors/";
	// private static final String bonusTestsRoot = "teste/_tests/bonus/";

	private static void runTest(String inputFileName) {
		try {
			String outputFileName = inputFileName.replace(".cl", ".ast");
			System.out.println("Running grammer on test " + inputFileName);
			ANTLRFileStream input = new ANTLRFileStream(inputFileName);
			COOLTreeBuilderLexer lexer = new COOLTreeBuilderLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			COOLTreeBuilderParser parser = new COOLTreeBuilderParser(tokens);
			COOLTreeBuilderParser.program_return r = parser.program();
			System.out.println(((CommonTree) r.getTree()).toStringTree());
		} catch (Exception e) {
			e.printStackTrace();
			System.err
					.println("Ai dat fisierul de intrare ca prim parametru ?");
		}

	}

	private static void runBatteryOfTests(String root) {
		File tests = new File(root);
		for (File inputFile : tests.listFiles()) {
			if (inputFile.getName().endsWith(COOL_SOURCE_FILE)) {
				runTest(inputFile.getAbsolutePath());
				try {
					System.in.read();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// runBatteryOfTests(simpleTestsRoot);
		// runBatteryOfTests(advancedTestsRoot);
		// runBatteryOfTests(complexTestsRoot);
		runTest("/home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/teste/_tests/simple/attributes.cl");
		// runTest("/home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/teste/_tests/simple/inheritance.cl");
		// runTest(advancedTestsRoot + "ml-comments.cl");
		// runTest(simpleTestsRoot + "my-ml-comments.cl");
		// runTest(simpleTestsRoot + "attributes.cl");
	}
}
