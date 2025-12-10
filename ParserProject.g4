grammar ParserProject;

program: (expr | blocks | loops | ONELINECOMMENT | MULTICOMMENT | NEWLINE)+ EOF;

expr: assignment
	| expr ('+' | '-' | '*' | '/' | '%') expr
	| INT
	| DOUBLE
	| STRING
    | VARNAME
    | bool
	| '[' innerarray
	| NEWLINE;
	
INT: ('-')?[0-9]+ ;

DOUBLE: ('-')?[0-9]+ '.' [0-9]+;

STRING: ('\'' | '"')[a-zA-Z0-9 .']*('\'' | '"');

innerarray: ((INT | STRING | DOUBLE) (', ')?)+ ']';

VARNAME: [a-zA-Z0-9_]+;

FUNCTION: VARNAME '(' INT ',' INT ')';

bool: 'True' | 'False';

assignment:  VARNAME ('=' | '+=' | '-=' | '*=' | '/=') expr;

blocks: 'if' conditional ':' NEWLINE innerloop
    ('elif' conditional ':' NEWLINE innerloop )*
    ('else' ':' NEWLINE innerloop)?;

loops: for | while;

for: 'for' VARNAME 'in' (VARNAME | FUNCTION) ':' NEWLINE innerloop;

while: 'while' conditional ':' NEWLINE innerloop;

innerloop: (TAB+ innerInner (NEWLINE TAB+ innerInner)* NEWLINE?);
innerInner: TAB* (expr|blocks|loops);

conditional: '('? expr ('>' | '<' | '<=' | '>=' | '!=' | '==') expr ')'? two
    | 'not' (VARNAME) two
    | '(' conditional ')' two
    | bool two;

two: 'and' conditional
    | 'or' conditional
    | ':'
    | ;
    
ONELINECOMMENT: ('#' ~[\r\n]*) -> skip;

MULTICOMMENT: ('\'\'\'' .*? '\'\'\'') ->skip ;

TAB: '\t';
NEWLINE: [\n\r]+;

//current issues
//slightly incorrect nesting
//comments are not being red as comments

WS: [ ]+ -> skip;
