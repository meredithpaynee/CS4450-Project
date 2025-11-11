grammar ParserProject;

Prog: expr EOF;

Expr: assignment
	| expr ('+' | '-' | '*' | '/' | '%') expr
	| INT;
	
INT: [0-9]+ ;

VARNAME: [a-zA-z]+;

Assignment:  VARNAME ('=' | '+=' | '-=' | '*=' | '/=') expr;

WS: [\t\n\r]+ -> skip;
