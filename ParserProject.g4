grammar ParserProject;

program: expr EOF;

expr: assignment
	| expr ('+' | '-' | '*' | '/' | '%') expr
	| INT
	| DOUBLE
	| STRING
	| '[' innerarray
	| NEWLINE;
	
INT: [0-9]+ ;

DOUBLE: [0-9]+ '.' [0-9]+;

STRING: '\''[a-zA-Z]+'\'';

innerarray: (INT | STRING | DOUBLE) ', ' innerarray | ']';

VARNAME: [a-zA-Z0-9_]+;

assignment:  VARNAME ('=' | '+=' | '-=' | '*=' | '/=') expr;

NEWLINE: [\r\n]+;

WS: [ ]+ -> skip;
