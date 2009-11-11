import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;

/**
 * Tema 2 CPL
 */

public class Debugger {
	private static final String COOL_SOURCE_FILE = ".cl";

	public static final String simpleTestsRoot = "teste/_tests/simple/";
	public static final String advancedTestsRoot = "teste/_tests/advanced/";
	public static final String complexTestsRoot = "teste/_tests/complex/";

	// private static final String errorsTestsRoot = "teste/_tests/errors/";
	// private static final String bonusTestsRoot = "teste/_tests/bonus/";

	public static void runTest(String inputFileName) {
		try {
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

	public static void runBatteryOfTests(String root) {
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

	public static void test(String fname, Classes cl) {
		try {
			CommonTree rootNode = null;
			FileInputStream fis = new FileInputStream(fname);

			rootNode = COOLParser.buildCOOLTree(fis); // Build the ANTLR AST
			System.out.println(rootNode.toStringTree());

			// Parse the AST and add the partial results to the class list
			COOLParser.generateOutputData(cl, rootNode, fname);

			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Classes cl = new Classes(1);
		Program prg = new program(11, cl);
		System.out
				.println(normalize("\"This is\\\n\t(* a literal *)\\\n\ttoo\""));
		System.out
				.println(normalize("\"\\a\\b\\c\\d\\e\\f\\g\\h\\i\\j\\k\\l\\m\\n\\o\\p\\q\\r\\s\\t\\u\\v\\w\\x\\y\\z\\\"\\\n\t\\'\\{\\}\\;\""));
		System.exit(0);

		//	

		test(
				"/home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/teste/_tests/simple/case-insensitive.cl",
				cl);
		// runBatteryOfTests(simpleTestsRoot);
		// runBatteryOfTests(advancedTestsRoot);
		// runBatteryOfTests(complexTestsRoot);
		// runTest("/home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/teste/_tests/advanced/random_expressions.cl");
		// runTest("/home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/teste/_tests/simple/inheritance.cl");
		// runTest(advancedTestsRoot + "ml-comments.cl");
		// runTest(simpleTestsRoot + "my-ml-comments.cl");
		// runTest(simpleTestsRoot + "attributes.cl");

		prg.dump_with_types(System.out, 0);
	}

	private static Character normESQ(char c) {
		if (c == '\b')
			return 'b';
		if (c == '\t')
			return 't';
		if (c == '\n')
			return 'n';
		if (c == '\f')
			return 'f';
		if (c == '\r')
			return 'r';
		if (c == '\"')
			return '\"';
		if (c == '\'')
			return '\'';
		if (c == '\\')
			return '\\';
		return c;
	}

	public static String normalize(String str) {
		int size = str.length();
		StringBuffer s = new StringBuffer();
		Character aux = null;

		for (int i = 1; i < size - 1;) {
			if (str.charAt(i) == '\\') {
				if (i < size - 1 && (aux = normESQ(str.charAt(i + 1))) != null) {
					s.append('\\');
					s.append(aux);
					i += 2;
				} else {
					s.append(str.charAt(++i));
					i++;
				}
			} else {
				aux = normESQ(str.charAt(i));

				if (!aux.equals(str.charAt(i)))
					s.append('\\');
				s.append(aux);
				i++;
			}
		}

		return s.toString();
	}

}
