package cpl;

import org.antlr.v4.runtime.Token;
import java.util.ArrayList;
import java.util.List;

class MethodListener extends miniJavaBaseListener {
    private Type Now;

    @Override public void enterMainClass(miniJavaParser.MainClassContext ctx) {
        Now = Type.types.get(ctx.Id(0).getText());
    }
    @Override public void enterClassDeclaration(miniJavaParser.ClassDeclarationContext ctx) {
        Now = Type.types.get(ctx.Id(0).getText());
    }

    @Override public void enterMethodDeclaration(miniJavaParser.MethodDeclarationContext ctx) {
        String typeName = ctx.type(0).getText();
        String methodName = ctx.Id(0).getText();
        List<Type> args = new ArrayList<>();
        if(Type.types.get(typeName) == null){
            Token token = ctx.Id(0).getSymbol();
            System.err.printf("Unknown class name at Line %d, Char %d: %s\n", token.getLine(), token.getCharPositionInLine(), typeName);
            System.exit(3);
        }
        args.add(Type.types.get(typeName));
        for(int i = 1; ctx.type(i) != null; i++) {
            if(Type.types.get(ctx.type(i).getText()) == null){
                Token token = ctx.Id(i).getSymbol();
                System.err.printf("Unknown class name at Line %d, Char %d: %s\n", token.getLine(), token.getCharPositionInLine(), ctx.type(i).getText());
                System.exit(3);
            }
            args.add(Type.types.get(ctx.type(i).getText()));
        }
        if(Now.addMethod(methodName, args)){
            Token token = ctx.Id(0).getSymbol();
            System.err.printf("Duplicate method name at Line %d, Char %d: %s\n", token.getLine(), token.getCharPositionInLine(), methodName);
            System.exit(4);
        }
    }
}