grammar COOL;

options {
output = AST;
ASTLabelType = CommonTree;
}

tokens {
CLASS_T;
ASSIGN_T;
METHOD_T;
BOOL_T;
EXPR_T;
}

@lexer::members
{
  int counter = 0;
  boolean error = false;
}

program	
	:
	(class_stat ';'!)+
	{
	 System.out.println($program.tree);
	}
	;

class_stat	
	:
	CLASS_ST TYPE (INHERITS_ST TYPE)? '{' (feature ';')* '}' -> ^(CLASS_T feature*)
	;	

feature	
	:	
	ID '(' (formal (',' formal)*)? ')' ':' TYPE '{' expr '}' -> ^(METHOD_T ID ^(EXPR_T expr))
	| ID ':' TYPE ('<-' expr)? -> ^(ASSIGN_T ID ^(EXPR_T expr?))
	;

formal 	
	:	
	ID ':' TYPE
	;

expr	
	:	
	(ID '<-'^ expr// -> ^(ASSIGN_T ID expr)
	| TRUE_ST^    // -> ^(BOOL_T TRUE_ST)
	| FALSE_ST^    //-> ^(BOOL_T FALSE_ST)
	| ID '(' (expr (',' expr)*)? ')' 
	| '{'^ (expr ';'!)+ '}' 
	| '~'^ expr 
	| ISVOID_ST^ expr 
	| NEW_ST^ TYPE 
	| IF_ST^ expr THEN_ST expr ELSE_ST expr FI_ST 
	| WHILE_ST^ expr LOOP_ST expr POOL_ST! 
	| CASE_ST^ expr OF_ST! (ID ':' TYPE '=>' expr ';')+ ESAC_ST! 
	| LET_ST^ ID ':'! TYPE ('<-' expr)? (',' ID ':' TYPE ('<-' expr)?)* IN_ST! expr 
	| '('! expr ')'! 
	| NOT_ST^ expr
	| STRING^ 
	| INTEGER^
	| ID^)
	(('@' TYPE)? '.' ID '(' (expr (',' expr)*)? ')' 
	| '+'^ expr
	| '-'^ expr 
	| '*'^ expr 
	| '/'^ expr 
	| '<'^ expr
	| '<='^ expr 
	| '>'^ expr 
	| '>='^ expr 
	| '='^ expr)*
	;

MULTI_COMMENT
	:	'(*'
		(	~('('|'*')
			|	('(' ~'*') => '('
			|	('*' ~')') => '*'
			|	MULTI_COMMENT
		)*
		'*)'
    {
      $channel=HIDDEN;
    }
	;

SINGLE_COMMENT
	:	'--' (~'\n')* {$channel=HIDDEN;}
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
	(('A'..'Z')
	(('a'..'z') | ('A'..'Z') | '1'..'9')*)
	|
	'SELF_TYPE'
	;
	
ID	
	:
	(('a'..'z') 
	| ('A'..'Z')
	| '_'
	| ('1'..'9')
	)+
	;
    	
STRING
    :
    '\"' ( ESC_SEQ | ~('\\\n' | '\"') )* '\"'
    ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    ;

	
INTEGER	
	:	
	'0'..'9'+
	;
  
WS  
  :   
  ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
      ;
