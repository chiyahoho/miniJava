grammar miniJava;

goal : mainClass (classDeclaration)* ;
mainClass:
    'class' Id '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' Id ')' '{' (stmt) '}' '}';
classDeclaration:
    'class' Id ( 'extends' Id )? '{' (varDeclaration)* (methodDeclaration)* '}' ;
varDeclaration:
    type Id ';' ;
methodDeclaration:
    'public' type Id '(' (type Id (',' type Id)*)? ')' '{' (varDeclaration)* (stmt)* 'return' exp ';' '}' ;

type:
    'int' '[' ']'
|   'boolean'
|   'int'
|   Id;

stmt:
    '{' (stmt)* '}'
|   'if' '(' exp ')' stmt 'else' stmt
|   'while' '(' exp ')' stmt
|   'System.out.println' '('  exp ')' ';'
|   Id '=' exp ';'
|   Id '[' exp ']' '=' exp ';' ;

exp:
    exp ('&&' | '<' | '+' | '-' | '*') exp
|   exp '[' exp ']'
|   exp '.length'
|   exp '.' Id '(' (exp (',' exp)* )? ')'
|   INT
|   'true'
|   'false'
|   Id
|   'this'
|   'new' 'int' '[' exp ']'
|   'new' Id '(' ')'
|   '!' exp
|   '(' exp ')' ;

Id : [a-zA-Z_] [a-zA-Z0-9_]* ;
INT : [0-9]+ ;

WS : [ \r\t\n]+ -> skip ;
MULTILINE_COMMENT : '/*' .*? '*/' -> skip ;
LINE_COMMENT : '//' .*? '\n' -> skip ;