grammar ParserProject;

start: x'a'x'a'x EOF;

x:  | 'b'x ;

WS : [ \t\r\n]+ -> skip ;