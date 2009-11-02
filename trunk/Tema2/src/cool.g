grammar cool;

program 
  :
  (class_stat ';')+
  ;

class_stat  
  : 
  'class' TYPE ('inherits' TYPE)? '{' (feature ';')* '}'
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
  | 'true' 
  | 'false' 
  | ID '(' (expr (',' expr)*)? ')' 
  | '{' (expr ';')+ '}' 
  | '~' expr 
  | 'isvoid' expr 
  | 'new' TYPE 
  | 'if' expr 'then' expr 'else' expr 'fi' 
  | 'while' expr 'loop' expr 'pool' 
  | 'case' expr 'of' (ID ':' TYPE '=>' expr ';')+ 'esac' 
  | 'let' ID ':' TYPE ('<-' expr)? (',' ID ':' TYPE ('<-' expr)?)* 'in' expr 
  | '(' expr ')' 
  | 'not' expr 
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
