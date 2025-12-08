grammar ParserProject;

program: expr+ EOF;

expr: assignment
	| expr ('+' | '-' | '*' | '/' | '%') expr
	| if
	| elif
	| else
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

innerarray: ((INT | STRING | DOUBLE) (', ')?)+ | ']';

VARNAME: [a-zA-Z0-9_]+;

bool: 'True' | 'False';

assignment:  VARNAME ('=' | '+=' | '-=' | '*=' | '/=') expr;

if:  'if' conditional NEWLINE ('\t' expr NEWLINE)+; 

elif: 'elif' conditional NEWLINE ('\t' expr NEWLINE)+;

else: 'else' ':' NEWLINE ('\t' expr NEWLINE)+;

conditional: expr ('>' | '<' | '<=' | '>=' | '!=' | '==') expr two
    | ('not')? (VARNAME)
    | '(' conditional ')' two;

two: 'and' conditional
    | 'or' conditional
    | ':';

NEWLINE: [\n\r]+;

WS: [ ]+ -> skip;