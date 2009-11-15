import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;

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
	private static final String errorsTestsRoot = "teste/_tests/errors/";

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
			System.out.println("Rulez pentru fisierul " + fname);

			if (fname.contains("multifile"))
				return;
			System.out.println("Running test for " + fname);
			CommonTree rootNode = null;
			FileInputStream fis = new FileInputStream(fname);

			rootNode = COOLParser.buildCOOLTree(fis); // Build the ANTLR AST
			// System.out.println(rootNode.toStringTree());

			Classes cl = new Classes(rootNode.getLine());
			Program prg = new program(rootNode.getLine(), cl);

			// Parse the AST and add the partial results to the class list
			ClassTable.setCurrentFilename(fname);
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
			boolean initDone = false;
			Classes cl = null;
			Program prg = null;
			String fname = "/home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/teste/_tests/complex/multifile";

			for (int i = 1; i < 3; i++) {
				System.out.println("Running test for " + fname + "-" + i
						+ ".cl");
				CommonTree rootNode = null;
				FileInputStream fis = new FileInputStream(fname + "-" + i
						+ ".cl");

				rootNode = COOLParser.buildCOOLTree(fis); // Build the ANTLR AST
				// System.out.println(rootNode.toStringTree());

				if (!initDone) {
					initDone = true;
					cl = new Classes(rootNode.getLine());
					prg = new program(rootNode.getLine(), cl);
				}

				// Parse the AST and add the partial results to the class list
				ClassTable.setCurrentFilename(fname + "-" + i + ".cl");
				COOLParser.generateOutputData(cl, rootNode, fname + "-" + i
						+ ".cl");
				fis.close();
			}
			prg.semant();

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
		multiTest();
		// runBatteryOfTests(simpleTestsRoot, false);
		// runBatteryOfTests(advancedTestsRoot, false);
		// runBatteryOfTests(complexTestsRoot, false);

		// FIXME: Nu merg urmatoarele teste AMR 11
		// test("teste/_tests/errors/block.cl");

		// test("teste/_tests/errors/string-error-1.cl");
		// test("teste/_tests/errors/string-error-2.cl");
	}

	public static void iterateOverAttrHashMap(
			HashMap<String, HashMap<String, attr>> map) {
		Iterator<String> it = map.keySet().iterator();
		Iterator<String> it_attr = null;

		System.out.println();
		System.out.println("Debugging attributes");
		while (it.hasNext()) {
			String name = it.next();
			it_attr = map.get(name).keySet().iterator();

			System.out.println(name);

			while (it_attr.hasNext()) {
				String attr_name = it_attr.next();
				attr attr = map.get(name).get(attr_name);
				System.out.println("  " + attr_name + " " + attr.type_decl);
			}
		}
	}

	public static void iterateOverMethodHashMap(
			HashMap<String, HashMap<String, method>> map) {
		Iterator<String> it = map.keySet().iterator();
		Iterator<String> it_attr = null;

		System.out.println();
		System.out.println("Debugging methods");
		while (it.hasNext()) {
			String name = it.next();
			it_attr = map.get(name).keySet().iterator();

			System.out.println(name);

			while (it_attr.hasNext()) {
				String method_name = it_attr.next();
				method method = map.get(name).get(method_name);
				System.out.println("  " + method_name + " "
						+ method.return_type);
			}
		}
	}

	// FIXME: se poate
	// - suprascrierea metodelor prin mostenire doar daca
	// au aceeasi signatura
	// - bind to self in let/case/formal parameter
}
