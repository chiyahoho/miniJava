package cpl;

import org.antlr.v4.runtime.Token;

class TypeListener extends miniJavaBaseListener {
    @Override public void enterMainClass(miniJavaParser.MainClassContext ctx) {
        Type.types.put("int[]",new Type("int[]"));
        Type.types.put("int",new Type("int"));
        Type.types.put("boolean",new Type("boolean"));
        String typeName=ctx.Id(0).getText();
        Type.types.put(typeName, new Type(typeName));
    }

    @Override public void enterClassDeclaration(miniJavaParser.ClassDeclarationContext ctx) {
        String typeName=ctx.Id(0).getText();
        if(Type.types.put(typeName, new Type(typeName)) != null){
            Token token = ctx.Id(0).getSymbol();
            System.err.printf("Duplicate class name at Line %d, Char %d: %s\n", token.getLine(), token.getCharPositionInLine(), ctx.Id(0).getText());
            System.exit(2);
        }
    }
}