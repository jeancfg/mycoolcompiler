import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

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

	public static void runBatteryOfTests(String root, boolean debug) {
		File tests = new File(root);
		for (File inputFile : tests.listFiles()) {
			if (inputFile.getName().endsWith(COOL_SOURCE_FILE)) {
				if (debug)
					runTest(inputFile.getAbsolutePath());
				else
					test(inputFile.getAbsolutePath());
				try {
					System.in.read();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void test(String fname) {
		try {
			Classes cl = new Classes(1);
			Program prg = new program(11, cl);

			// System.out.println("Running test for " + fname);
			CommonTree rootNode = null;
			FileInputStream fis = new FileInputStream(fname);

			rootNode = COOLParser.buildCOOLTree(fis); // Build the ANTLR AST
			System.out.println(rootNode.toStringTree());

			// Parse the AST and add the partial results to the class list
			COOLParser.generateOutputData(cl, rootNode, fname);

			prg.semant();

			fis.close();

			String fout = fname + ".my.ast";

			PrintStream output = new PrintStream(fout);
			prg.dump_with_types(output, 0);
			output.close();

			System.out.println("Logging result to " + fout);

			fname = fname.substring(0, fname.lastIndexOf('.')) + ".ast";
			System.out.println(fname);
			Runtime.getRuntime().exec("meld " + fname + " " + fout);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void multiTest() {
		try {
			Classes cl = new Classes(1);
			Program prg = new program(11, cl);
			String fname = "/home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/teste/_tests/complex/multifile";

			for (int i = 1; i < 3; i++) {
				System.out.println("Running test for " + fname + "-" + i
						+ ".cl");
				CommonTree rootNode = null;
				FileInputStream fis = new FileInputStream(fname + "-" + i
						+ ".cl");

				rootNode = COOLParser.buildCOOLTree(fis); // Build the ANTLR AST
				System.out.println(rootNode.toStringTree());

				// Parse the AST and add the partial results to the class list
				COOLParser.generateOutputData(cl, rootNode, fname);

				fis.close();
			}
			String fout = fname + ".my.ast";

			PrintStream output = new PrintStream(fout);
			prg.dump_with_types(output, 0);
			output.close();

			System.out.println("Logging result to " + fout);

			if (fname.lastIndexOf('.') != -1)
				fname = fname.substring(0, fname.lastIndexOf('.')) + ".ast";
			else
				fname = fname + ".ast";
			System.out.println(fname);
			Runtime.getRuntime().exec("meld " + fname + " " + fout);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// test(
		// "/home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/teste/_tests/simple/attributes.cl");
		// test(
		// "/home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/teste/_tests/simple/case-insensitive.cl");

		// test greu - tre sa ma uit la definitia altor clase
		// test(
		// "/home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/teste/_tests/simple/dispatch.cl");

		// test("/home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/teste/_tests/simple/empty.cl");

		test("/home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/teste/_tests/simple/expressions.cl");
		// runBatteryOfTests(simpleTestsRoot, false);
		// runBatteryOfTests(advancedTestsRoot, false);
		// runBatteryOfTests(complexTestsRoot, false);

		// multiTest();

		// runTest("/home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/teste/_tests/advanced/random_expressions.cl");
		// runTest("/home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/teste/_tests/simple/inheritance.cl");
		// runTest(advancedTestsRoot + "ml-comments.cl");
		// runTest(simpleTestsRoot + "my-ml-comments.cl");
		// runTest(simpleTestsRoot + "attributes.cl");
	}

}
