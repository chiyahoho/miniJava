package cpl;

import org.antlr.v4.runtime.Token;
import java.util.HashSet;
import java.util.Set;

class VarListener extends miniJavaBaseListener {
    private final Set<String> cLass = new HashSet<>();
    private final Set<String> mEthod = new HashSet<>();
    private Set Now;

    @Override public void enterMainClass(miniJavaParser.MainClassContext ctx) {
        Now = mEthod;
    }
    @Override public void exitMainClass(miniJavaParser.MainClassContext ctx) {
        mEthod.clear();
        Now = cLass;
    }

    @Override public void enterClassDeclaration(miniJavaParser.ClassDeclarationContext ctx) {
        Now = cLass;
    }
    @Override public void exitClassDeclaration(miniJavaParser.ClassDeclarationContext ctx) {
        cLass.clear();
    }

    @Override public void enterMethodDeclaration(miniJavaParser.MethodDeclarationContext ctx) {
        Now = mEthod;
    }
    @Override public void exitMethodDeclaration(miniJavaParser.MethodDeclarationContext ctx) {
        mEthod.clear();
        Now = cLass;
    }

    @Override public void enterVarDeclaration(miniJavaParser.VarDeclarationContext ctx) {
        String type = ctx.type().getText();
        String id = ctx.Id().getText();
        if(!Type.types.containsKey(type)) {
            Token token = ctx.Id().getSymbol();
            System.err.printf("Unknown class name at Line %d, Char %d: %s\n", token.getLine(), token.getCharPositionInLine(), type);
            System.exit(1);
        }
        if(cLass.contains(id) || mEthod.contains(id)){
            Token token = ctx.Id().getSymbol();
            System.err.printf("Duplicate identifier at Line %d, Char %d: %s\n", token.getLine(), token.getCharPositionInLine(), id);
            System.exit(1);
        }
        Now.add(id);
    }

    @Override public void enterStmt(miniJavaParser.StmtContext ctx) {
        if(ctx.Id() == null) return;
        String id = ctx.Id().getText();
        if(!cLass.contains(id) && ! mEthod.contains(id)){
            Token token = ctx.Id().getSymbol();
            System.err.printf("Unknown identifier at Line %d, Char %d: %s\n", token.getLine(), token.getCharPositionInLine(), id);
            System.exit(1);
        }
    }

    @Override public void enterExp(miniJavaParser.ExpContext ctx) {
        if(ctx.getStart().getText().equals("new") && ctx.Id() != null) {
            String type = ctx.Id().getText();
            if(!Type.types.containsKey(type)){
                Token token = ctx.Id().getSymbol();
                System.err.printf("Invalid type name at Line %d, Char %d: %s\n", token.getLine(), token.getCharPositionInLine(), type);
                System.exit(1);
            }
        }
        if(ctx.getStart().getType() == miniJavaLexer.Id) {
            String id = ctx.Id().getText();
            if(!cLass.contains(id) && ! mEthod.contains(id)){
                Token token = ctx.Id().getSymbol();
                System.err.printf("Unknown identifier at Line %d, Char %d: %s\n", token.getLine(), token.getCharPositionInLine(), id);
                System.exit(1);
            }
        }
    }
}
