import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        COOLTreeBuilderLexer lex = new COOLTreeBuilderLexer(new ANTLRFileStream("/home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/output/__Test___input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        COOLTreeBuilderParser g = new COOLTreeBuilderParser(tokens, 49100, null);
        try {
            g.program();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}