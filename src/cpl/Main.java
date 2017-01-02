package cpl;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException{
	    String ss = new String(Files.readAllBytes(Paths.get(args[0])));
        miniJavaLexer lexer = new miniJavaLexer(new ANTLRInputStream(ss));
        lexer.removeErrorListeners();
        miniJavaParser parser = new miniJavaParser(new CommonTokenStream(lexer));

        parser.removeErrorListeners();
        parser.addErrorListener(new DiagnosticErrorListener());
        parser.addErrorListener(new SyntaxListener());

        ParseTree tree = parser.goal();
        ParseTreeWalker.DEFAULT.walk(new TypeListener(), tree);
        ParseTreeWalker.DEFAULT.walk(new MethodListener(), tree);

        org.antlr.v4.gui.TreeViewer tv=new org.antlr.v4.gui.TreeViewer(Arrays.asList(miniJavaParser.ruleNames),tree);
        tv.open();
    }
}
