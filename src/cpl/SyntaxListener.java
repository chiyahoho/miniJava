package cpl;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

class SyntaxListener extends BaseErrorListener {
    @Override public void syntaxError(Recognizer<?,?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e){
        System.err.printf("SyntaxError at Line %d, Char %d: %s\n", line, charPositionInLine, msg);
        System.exit(1);
    }
}