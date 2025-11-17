grammar ParserProject;

program: expr+ EOF;

expr: assignment
	| expr ('+' | '-' | '*' | '/' | '%') expr
	| blocks
	| INT
	| DOUBLE
	| STRING
    | VARNAME
    | bool
	| '[' innerarray
	| NEWLINE;
	
INT: ('-')?[0-9]+ ;

DOUBLE: ('-')?[0-9]+ '.' [0-9]+;

STRING: ('\'' | '"')[a-zA-Z0-9 ]*('\'' | '"');

innerarray: (INT | STRING | DOUBLE) (', ')? innerarray | ']';

VARNAME: [a-zA-Z0-9_]+;

bool: 'True' | 'False';

assignment:  VARNAME ('=' | '+=' | '-=' | '*=' | '/=') expr;

blocks: 'if' conditional NEWLINE
	| 'elif' conditional NEWLINE
	| 'else' ':' NEWLINE;

conditional: expr ('>' | '<' | '<=' | '>=' | '!=' | '==') expr two
    | ('not')? (VARNAME)
    | '(' conditional ')' two;

two: 'and' conditional
    | 'or' conditional
    | ':';

NEWLINE: [\n\r\t]+;

WS: [ ]+ -> skip;
