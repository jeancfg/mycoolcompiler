grammar COOLTreeBuilder;

options {
output = AST;
ASTLabelType = CommonTree;
}

tokens {
CLASS_T;                // tipul clasa
BLOCK_T;                // tipul block
CALL_T;                 // tipul apel de functie
FEATURES_T;
ASSIGN_T;
METHOD_T;
BOOL_T;
EXPR_T;                 // tipul expresie
RETURN_TYPE_T;          // tipul intors de o functie
TYPE_ID;                // tipul unui obiect
FORMALS_T;              // tipul parametri de apel al functiilor
ATTR_T;                 // tipul atribut

ID_T;                   // tipul id
INTEGER_T;              // tipul integer

OP_T;                   // tipul operator
}

@members {
}

program	
	:
	(class_stat ';')+ -> ^(class_stat)+
	;

class_stat	
	:
	CLASS_ST name=TYPE (INHERITS_ST baseClass=TYPE)? '{' (feature ';')* '}'
	 -> ^(CLASS_T $name $baseClass? ^(FEATURES_T feature*))
	;

feature	
	:	
	ID '(' (formal (',' formal)*)? ')' ':' type=TYPE '{' expr '}'
	 -> ^(METHOD_T ID TYPE ^(FORMALS_T formal*) ^(EXPR_T expr))
	|
	ID ':' TYPE ('<-' expr)?
	 -> ^(ATTR_T ID TYPE ^(EXPR_T expr)?)
	;

formal 	
	:	
	ID ':' TYPE -> ^(TYPE_ID ID TYPE)
	;

expr	
	:	
  assignExpr
	;
 
assignExpr
  :
  ID '<-'^ assignExpr
  |
  notExpr
  ;

notExpr
  :
  (NOT_ST^ notExpr)
  |
  relExpr
  ;

relExpr
  :
  sumExpr
  (
    ('<=') => '<='^ sumExpr
    |
    ('<') => '<'^ sumExpr
    |
    ('=') => '='^ sumExpr
  )*
  ;

sumExpr
  :
  multExpr
  (
    ('+') => '+'^ multExpr
    |
    ('-') => '-'^ multExpr
  )*
  ;

multExpr
  :
  isVoidExpr
  (
    ('*') => '*'^ isVoidExpr
    |
    ('/') => ('/'^ isVoidExpr)
  )*
  ;

isVoidExpr
  :
  (ISVOID_ST^ isVoidExpr)
  |
  tildaExpr
  ;

tildaExpr
  :
  ('~'^ tildaExpr)
  |
  dispatchExpr
  ;

dispatchExpr
  :
   atom (
    ('@') => '@'^ TYPE
    |
  )
  (('.' dispatchExprAux) => '.'^ dispatchExprAux)*
  ;

dispatchExprAux
  :
  ID '('! (expr (','! expr)*)? ')'!
  ;

atom
  :   INTEGER
  |   ID
  |   '('! expr ')'!
  |   TRUE_ST
  |   FALSE_ST
  |   STRING
  |   ID '(' (expr (',' expr)*)? ')' -> ^(CALL_T ID expr*)
  |  '{'^ (expr ';'!)+ '}'!
  |   NEW_ST^ TYPE
  |   IF_ST^ expr THEN_ST! expr ELSE_ST! expr FI_ST! 
  |   WHILE_ST^ expr LOOP_ST! expr POOL_ST! 
  |   CASE_ST^ expr OF_ST! (ID ':'! TYPE '=>'! expr ';'!)+ ESAC_ST! 
  |   LET_ST^ ID ':'! TYPE ('<-' expr)? (',' ID ':'! TYPE ('<-' expr)?)* IN_ST! expr 
  
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

INTEGER
  : 
  ('0'..'9')+
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
    '\"'
    (
      (ESC_SEQ) => ESC_SEQ
    	|
      ~('\\\n' | '\"')
    )* '\"'
    ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    ;
  
WS  
  :   
  ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
      ;
