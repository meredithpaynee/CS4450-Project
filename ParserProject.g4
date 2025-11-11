grammar ParserProject;

prog: expr EOF;

expr: assignment
	| expr ('+' | '-' | '*' | '/' | '%') expr
	| INT
	| DOUBLE
	| '[' innerarray
	| STRING
	| NEWLINE;
	
INT: [0-9]+ ;

DOUBLE: [0-9]+ '.' [0-9]+;

STRING: ('\'' | '"')[a-zA-Z0-9]+('\'' | '"');

innerarray: INT ',' innerarray | ']';

VARNAME: [a-zA-Z0-9_]+;

assignment:  VARNAME ('=' | '+=' | '-=' | '*=' | '/=') expr;

WS: [ ]+ -> skip;

NEWLINE: [\r\n];
