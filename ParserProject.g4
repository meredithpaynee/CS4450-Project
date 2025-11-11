grammar ParserProject;

prog: expr EOF;

expr: assignment
	| expr ('+' | '-' | '*' | '/' | '%') expr
	| INT
	| DOUBLE
	| '[' INNERARRAY;
	
INT: [0-9]+ ;

DOUBLE: [0-9]+ '.' [0-9]+;

INNERARRAY: INT ',' INNERARRAY | ']';

VARNAME: [a-zA-Z0-9_]+;

assignment:  VARNAME ('=' | '+=' | '-=' | '*=' | '/=') expr;

WS: [ \t\n\r]+ -> skip;
