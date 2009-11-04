grammar COOL;

program	
	:
	(class_stat ';')+
	;

class_stat	
	:	
	CLASS_ST TYPE (INHERITS_ST TYPE)? '{' (feature ';')* '}'
	;	

feature	
	:	
	ID '(' (formal (',' formal)*)? ')' ':' TYPE '{' expr '}'
	| ID ':' TYPE ('<-' expr)?
	;

formal 	
	:	
	ID ':' TYPE
	;

expr	
	:	
	(ID '<-' expr 
	| TRUE_ST 
	| FALSE_ST 
	| ID '(' (expr (',' expr)*)? ')' 
	| '{' (expr ';')+ '}' 
	| '~' expr 
	| ISVOID_ST expr 
	| NEW_ST TYPE 
	| IF_ST expr THEN_ST expr ELSE_ST expr FI_ST 
	| WHILE_ST expr LOOP_ST expr POOL_ST 
	| CASE_ST expr OF_ST (ID ':' TYPE '=>' expr ';')+ ESAC_ST 
	| LET_ST ID ':' TYPE ('<-' expr)? (',' ID ':' TYPE ('<-' expr)?)* IN_ST expr 
	| '(' expr ')' 
	| NOT_ST expr 
	| STRING 
	| INTEGER 
	| ID) 
	(('@' TYPE)? '.' ID '(' (expr (',' expr)*)? ')' 
	| '+' expr 
	| '-' expr 
	| '*' expr 
	| '/' expr 
	| '<' expr
	| '<=' expr 
	| '>' expr 
	| '>=' expr 
	| '=' expr)*
	;
	
CLASS_ST
	:
	('C' | 'c')('L' | 'l')('A' | 'a')('S' | 's')('S' | 's')
	;
	
INHERITS_ST
	:
	('I' | 'i')('N' | 'n')('H' | 'h')('E' | 'e')('R' | 'r')('I' | 'i')('T' | 't')('S' | 's')
	;
	
LET_ST
	:
	('L' | 'l')('E' | 'e')('T' | 't')
	;
	
IN_ST
	:
	('I' | 'i')('N' | 'n')
	;
	
WHILE_ST
	:
	('W' | 'w')('H' | 'h')('I' | 'i')('L' | 'l')('E' | 'e')
	;
	
LOOP_ST
	:
	('L' | 'l')('O' | 'o')('O' | 'o')('P' | 'p')
	;
	
POOL_ST
	:
	('P' | 'p')('O' | 'o')('O' | 'o')('L' | 'l')
	;
	
CASE_ST	
	:
	('C' | 'c')('A' | 'a')('S' | 's')('E' | 'e')
	;
	
OF_ST
	:
	('O' | 'o')('F' | 'f')
	;
	
ESAC_ST
	:
	('E' | 'e')('S' | 's')('A' | 'a')('C' | 'c')
	;
	
TRUE_ST
	:
	('T' | 't')('R' | 'r')('U' | 'u')('E' | 'e')
	;

FALSE_ST
	:
	('F' | 'f')('A' | 'a')('L' | 'l')('S' | 's')('E' | 'e')
	;

ISVOID_ST
	:
	('I' | 'i')('S' | 's')('V' | 'v')('O' | 'o')('I' | 'i')('D' | 'd')
	;
	
NEW_ST
	:
	('N' | 'n')('E' | 'e')('W' | 'w')
	;
	
IF_ST
	:
	('I' | 'i')('F' | 'f')
	;
	
THEN_ST
	:
	('T' | 't')('H' | 'h')('E' | 'e')('N' | 'n')
	;
	
ELSE_ST
	:
	('E' | 'e')('L' | 'l')('S' | 's')('E' | 'e')
	;
	
FI_ST
	:
	('F' | 'f')('I' | 'i')
	;
	
NOT_ST
	:
	('N' | 'n')('O' | 'o')('T' | 't')
	;

TYPE	
	:	
	('A'..'Z')
	(('a'..'z') | ('A'..'Z'))*
	;
	
ID	
	:	
	(('a'..'z') 
	| ('A'..'Z')
	)+
	;
	
WS  
	:   
	( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    	;
STRING	
	:	
	'"' ~'"'* '"'
	;
	
INTEGER	
	:	
	'0'..'9'+
	;

COMMENT
  :
  '(*' ( options {greedy=false;} : . )* '*)' {$channel = HIDDEN;}
  | '--' ~('\n'|'\r')* '\r'? ('\n')* {$channel = HIDDEN;}
  ;
  