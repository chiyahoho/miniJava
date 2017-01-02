package cpl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException{
	    String s = new String(Files.readAllBytes(Paths.get(args[0])));
        miniJavaLexer lexer = new MiniJavaLexer(new ANTLRInputStream(s));
        //lexer.removeErrorListeners();
        MiniJavaParser parser = new MiniJavaParser(new CommonTokenStream(lexer));
        //parser.removeErrorListeners();

        ParseTree tree = parser.goal();
        org.antlr.v4.gui.TreeViewer tv=new org.antlr.v4.gui.TreeViewer(Arrays.asList(MinijavaParser.ruleNames),tree);
        tv.open();
    }
}
