grammar ParserProject;

program: (expr | blocks | loops | ONELINECOMMENT | NEWLINE)+ EOF;

expr: assignment
	| expr ('+' | '-' | '*' | '/' | '%') expr
	| INT
	| DOUBLE
	| STRING
    | VARNAME
    | bool
	| '[' innerarray
	NEWLINE;
	
INT: ('-')?[0-9]+ ;

DOUBLE: ('-')?[0-9]+ '.' [0-9]+;

STRING: ('\'' | '"')[a-zA-Z0-9 ]*('\'' | '"');

innerarray: ((INT | STRING | DOUBLE) (', ')?)+ ']';

VARNAME: [a-zA-Z0-9_]+;

FUNCTION: VARNAME '(' INT ',' INT ')';

bool: 'True' | 'False';

assignment:  VARNAME ('=' | '+=' | '-=' | '*=' | '/=') expr;

blocks: if | elif | else;

if :'if' conditional+ NEWLINE ('\t' expr NEWLINE)+; 

elif: 'elif' conditional+ NEWLINE ('\t' expr NEWLINE)+;

else: 'else' ':' NEWLINE ('\t' expr NEWLINE)+;

loops: for | while;

for: 'for' VARNAME 'in' (VARNAME | FUNCTION) ':' NEWLINE ('\t' expr | '\t' blocks | '\t' loops)+;

while: 'while' conditional+ NEWLINE ('\t' expr | '\t' blocks | '\t' loops)+;

conditional: expr ('>' | '<' | '<=' | '>=' | '!=' | '==') expr two
    | ('not')? (VARNAME)
    | '(' conditional ')' two
    | bool two;

two: 'and' conditional
    | 'or' conditional
    | ':';
    
ONELINECOMMENT: ('#' | '##') .*?;

multilineComment: ('\'\'\'' | '"""')(. | NEWLINE | '\t')+?('\'\'\'' | '"""');

NEWLINE: [\n\r]+;

WS: [ ]+ -> skip;

//the tree structure is not nested properly. The blocks under an if statement should be nested appropriately 
//under the if statment. Similarly for if and else parts for an if-else statement. Similarly for the if-elif-else 
//statement. The statements in each block should be nested together appropriately under a sub-tree. Each statement
//is split into its own subtree.
