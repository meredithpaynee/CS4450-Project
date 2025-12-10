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

blocks: if;

if :'if' conditional+ NEWLINE innerloop elif* else?; 

elif: 'elif' conditional+ NEWLINE innerloop;

else: 'else' ':' NEWLINE innerloop;

loops: for | while;

for: 'for' VARNAME 'in' (VARNAME | FUNCTION) ':' NEWLINE innerloop;

while: 'while' conditional+ NEWLINE innerloop;

innerloop: (('\t'+ expr | '\t'+ if '\t'* elif* | '\t'+ loops) NEWLINE?)+;

conditional: '('? expr ('>' | '<' | '<=' | '>=' | '!=' | '==') expr ')'? two
    | ('not')? (VARNAME)
    | '(' conditional ')' two
    | bool two;

two: 'and' conditional
    | 'or' conditional
    | ':';
    
ONELINECOMMENT: ('#' | '##') .*? -> skip;

MULTICOMMENT: '\'\'\'' ( . | '\n' | '\r')*? '\'\'\'' ->skip ;

NEWLINE: [\n\r]+;

WS: [ ]+ -> skip;