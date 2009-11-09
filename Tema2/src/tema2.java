import java.io.File;
import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;

/**
 * Tema 2 CPL
 */

/**
 * TODO:
 */

public class tema2 {
	private static final String COOL_SOURCE_FILE = ".cl";

	private static final String simpleTestsRoot = "teste/_tests/simple/";
	private static final String advancedTestsRoot = "teste/_tests/advanced/";
	private static final String complexTestsRoot = "teste/_tests/complex/";

	// private static final String errorsTestsRoot = "teste/_tests/errors/";
	// private static final String bonusTestsRoot = "teste/_tests/bonus/";

	private static void runTest(String inputFileName) {
		try {
			System.out.println("Running grammer on test " + inputFileName);
			ANTLRFileStream input = new ANTLRFileStream(inputFileName);
			COOLLexer lexer = new COOLLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			COOLParser parser = new COOLParser(tokens);
			parser.program();
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
		//runBatteryOfTests(simpleTestsRoot);
		//runBatteryOfTests(advancedTestsRoot);
		//runBatteryOfTests(complexTestsRoot);
		//runTest("/home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/teste/_tests/complex/multifile-1.cl");
		runTest("/home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/teste/_tests/simple/inheritance.cl");
		// runTest(advancedTestsRoot + "ml-comments.cl");
		// runTest(simpleTestsRoot + "my-ml-comments.cl");
		// runTest(simpleTestsRoot + "attributes.cl");
	}
}
