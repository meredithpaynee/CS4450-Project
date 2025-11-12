grammar ParserProject;

program: expr+ EOF;

expr: assignment
	| expr ('+' | '-' | '*' | '/' | '%') expr
	| INT
	| DOUBLE
	| STRING
    | VARNAME
	| '[' innerarray
	| NEWLINE;
	
INT: ('-')?[0-9]+ ;

DOUBLE: ('-')?[0-9]+ '.' [0-9]+;

STRING: ('\'' | '"')[a-zA-Z0-9]+('\'' | '"');

innerarray: (INT | STRING | DOUBLE) (', ')? innerarray | ']';

VARNAME: [a-zA-Z0-9_]+;

assignment:  VARNAME ('=' | '+=' | '-=' | '*=' | '/=') expr;

NEWLINE: [\n\r]+;

WS: [ ]+ -> skip;
