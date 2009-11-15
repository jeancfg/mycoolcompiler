tree grammar COOLTreeChecker;

options {
  tokenVocab   = COOLTreeBuilder;
  ASTLabelType = CommonTree;
}

@header {
  import java.util.LinkedList;
}

@members {
  // Do not touch; variabile folosite pentru '@'
  int static_dispatchLine = -1;
  Expression static_dispatchExpr = null;
  AbstractSymbol static_dispatchObj = null;
  int level = 0;
  int static_dispatchLevel = 0;
  // End
  
	private String fileName = "Unnamed"; // The file name is needed by the tree API.
	
	public String getFileName() { return fileName; }
	public void setFileName(String fileName) { this.fileName = fileName; }
	
	private Expression applyOp(String op, int line, Expression __name, Expression __expr)
	{
	 Expression result = null;
	 
	 if (op.equals("+"))
	   result = new plus(line, __name, __expr);
	 else if (op.equals("-"))
	   result = new sub(line, __name, __expr);
	 else if (op.equals("*"))
	   result = new mul(line, __name, __expr);
	 else if (op.equals("/"))
	   result = new divide(line, __name, __expr);
	 else if (op.equals("<"))
	   result = new lt(line, __name, __expr);
	 else if (op.equals("<="))
	   result = new leq(line, __name, __expr);
	 else if (op.equals("="))
	   result = new eq(line, __name, __expr);
	 else
	   System.out.println("Unknown operator " + op);
	   
	 return result;
	}
	

  private static boolean isESQ(char c) {
    return c == 'b' || c == '\b' || c == 't' || c == '\t' || c == 'n'
        || c == '\n' || c == 'f' || c == '\f' || c == 'r' || c == '\r'
        || c == '\"' || c == '\'' || c == '\\';
  }

  private static char normESQ(char c) {
    if (c == 'b')
      return '\b';
    if (c == 't')
      return '\t';
    if (c == 'n')
      return '\n';
    if (c == 'f')
      return '\f';
    return c;
  }

  public static String normalize(String str) {
    int size = str.length();
    StringBuilder s = new StringBuilder();
    char aux;

    for (int i = 1; i < size - 1;) {
      if (str.charAt(i) == '\\') {
        if (i < size - 1 && isESQ(str.charAt(i + 1))) {
          s.append(normESQ(str.charAt(i + 1)));
          i += 2;
        } else {
          s.append(str.charAt(++i));
          i++;
        }
      } else {
        s.append(str.charAt(i));
        i++;
      }
    }

    return s.toString();
  }
}

program[Classes cl]
  :
  (
    classdef { $cl.appendElement($classdef.result); }
  )+
  ;

classdef returns [class_ result]
  :
  ^(CLASS_T name=TYPE features)
  {
  	$result = new class_($CLASS_T.line,
			AbstractTable.idtable.addString($name.text),
			AbstractTable.idtable.addString("Object"),
			$features.result,
			AbstractTable.stringtable.addString(getFileName()));
	}
  |
  ^(CLASS_T name=TYPE parent=TYPE features)
  {
		$result = new class_($CLASS_T.line,
			AbstractTable.idtable.addString($name.text),
			AbstractTable.idtable.addString($parent.text),
			$features.result,
			AbstractTable.stringtable.addString(getFileName()));
	}
  ;

features returns [Features result]
  :
  ^(
    FEATURES_T { $result = new Features($FEATURES_T.line); }
    (
      feature { $result.appendElement($feature.result); }
    )*
   )
  ;

feature returns [Feature result]
  :
  ^(METHOD_T name=ID type=TYPE formals expr)
  {
    AbstractSymbol returnType = AbstractTable.idtable.addString($type.text);    
    $result = new method($METHOD_T.line, AbstractTable.idtable.addString($name.text),
        $formals.result, returnType, $expr.result);
  }
  |
  ^(ATTR_T name=ID type=TYPE)
  {
    $result = new attr($ATTR_T.line, AbstractTable.idtable.addString($name.text),
      AbstractTable.idtable.addString($type.text), new no_expr(0));
  }
  |
  ^(ATTR_T name=ID type=TYPE e=expr)
  {
    Expression __expr = $expr.result;
    __expr.set_type($expr.returnType);
    
    $result = new attr($ATTR_T.line, AbstractTable.idtable.addString($name.text),
      AbstractTable.idtable.addString($type.text), __expr);
  }
  ;

expr returns [Expression result, AbstractSymbol returnType]
  :
  (^(EXPR_T l=let) | l=let)
  {
    $result = $l.result;
    $returnType = $l.returnType;
    $result.set_type($returnType);
  }
  |
  (^(EXPR_T bl=block) | bl=block)
  {
    $result = $bl.result;
    $returnType = $bl.returnType;
  }
  |
  (^(EXPR_T c=call) | c=call)
  {
    $result = $c.result;
    $returnType = $c.returnType;
  }
  |
  (^(EXPR_T i=INTEGER) | i=INTEGER)
  {
    $result = new int_const($i.line, AbstractTable.inttable.addInt(Integer.parseInt($i.text)));
    $returnType = AbstractTable.idtable.addString("Int"); 
  }
  |
  (^(EXPR_T s=STRING) | s=STRING)
  {
    // Elimin ghilimelele de la inceputul si sfarsitul string-ului
    //   "abc" => abc
    // si apoi normalizez string-ul in functia normalize()
    String str = $s.text;
    int newLines = 0;
    
    for (int __my_private_i = 0 ; __my_private_i < str.length() ; __my_private_i++)
      if (str.charAt(__my_private_i) == '\n')
        newLines++;
        
    str = normalize(str);

    $result = new string_const($s.line + newLines, new StringSymbol(str, str.length(), 0));
    $returnType = AbstractTable.idtable.addString("String");
  }
  |
  (^(EXPR_T o=op) | o=op)
  {
    $result = $o.result;
    $returnType = $o.returnType;
  }
  |
  (^(EXPR_T id=ID) | id=ID)
  {
    $result = new object($id.line, AbstractTable.idtable.addString($id.text)); 
  }
  |
  (^(EXPR_T b=TRUE_ST) | b=TRUE_ST)
  {
    $result = new bool_const($b.line, true);
    $returnType = AbstractTable.idtable.addString("Bool");
    $result.set_type($returnType);
  }
  |
  (^(EXPR_T b=FALSE_ST) | b=FALSE_ST)
  {
    $result = new bool_const($b.line, false);
    $returnType = AbstractTable.idtable.addString("Bool");
    $result.set_type($returnType);
  }
  |
  (^(EXPR_T w=while_r) | w=while_r)
  {
    $result = $w.result;
    $returnType = $w.returnType;
    $result.set_type($returnType);
  }
  |
  (^(EXPR_T if_r_=if_r) | if_r_=if_r)
  {
    $result = $if_r_.result;
    $returnType = $if_r_.returnType;
    $result.set_type($returnType);
  }
  |
  (^(EXPR_T case_r_=case_r) | case_r_=case_r)
  {
    $result = $case_r_.result;
    $returnType = $case_r_.returnType;
    $result.set_type($returnType);
  }
  |
  (^(EXPR_T new_r_=new_r) | new_r_=new_r)
  {
    $result = $new_r_.result;
    $returnType = $new_r_.returnType;
    $result.set_type($returnType);
  }
  ;

formals returns [Formals result]
  :
  ^(FORMALS_T { $result = new Formals($FORMALS_T.line); }
    (formal
      { $result.appendElement($formal.result); }
    )*
   )
  ;

formal returns [formal result]
  :
  ^(TYPE_ID name=ID type=TYPE)
  {
    AbstractSymbol __name = AbstractTable.idtable.addString($name.text);
    AbstractSymbol __type = AbstractTable.idtable.addString($type.text);
    
    $result = new formal($TYPE_ID.line, __name, __type);
  }
  ;

adapt_id_integer returns [String result, String type]
  :
  INTEGER { $result = $INTEGER.text; $type = "Integer"; }
  |
  ID      { $result = $ID.text; $type = "Id"; }
  ;

op returns [Expression result, AbstractSymbol returnType]
  :
  (^(op_bin expr expr)) => ^(o = op_bin e1 = expr e2 = expr)
  {
    $result = applyOp($o.text, $o.line, $e1.result, $e2.result);
  }
  |
  ^(o = op_bin p1 = adapt_id_integer p2 = adapt_id_integer)
  {
    Expression __name = null;
    Expression __expr = null;

    if ($p1.type.equals("Integer"))
      __name = new int_const($o.line, AbstractTable.inttable.addInt(Integer.parseInt($p1.result)));
    else if ($p1.type.equals("Id"))
      __name = new object($o.line, AbstractTable.idtable.addString($p1.result));

    if ($p2.type.equals("Integer"))
      __expr = new int_const($o.line, AbstractTable.inttable.addInt(Integer.parseInt($p2.result)));
    else if ($p2.type.equals("Id"))
      __expr = new object($o.line, AbstractTable.idtable.addString($p2.result));

    applyOp($o.text, $o.line, __name, __expr);
  }
  |
  ^(e='~' expr)
  {
    $result = new neg($e.line, $expr.result);
    $returnType = $expr.returnType;
  }
  |
  ^(NOT_ST expr)
  {
    $result = new comp($NOT_ST.line, $expr.result);
    $returnType = $expr.returnType;
  }
  |
  ^(ISVOID_ST expr)
  {
    $result = new isvoid($ISVOID_ST.line, $expr.result);
    $returnType = $expr.returnType;
  }
  |
  ^(assignStr='<-' ID expr)
  {
    $result = new assign($assignStr.line, AbstractTable.idtable.addString($ID.text), $expr.result);
  }
  ;

op_bin returns [String text, int line]
  :
  ('<=') => e = '<='
  {
    $text = $e.text;
    $line = $e.line;
  }
  |
  e = ('+' | '-' | '*' | '/' | '<' | '=')
  {
    $text = $e.text;
    $line = $e.line;
  }
  ;

block returns [block result, AbstractSymbol returnType]
@init {
  Expressions exprs = null;
}
  :
  ^(p='{' { exprs = new Expressions($p.line); $result = null; $result = new block($p.line, exprs); } 
    (expr { exprs.appendElement($expr.result); $returnType = $expr.returnType; } )*
  )
  ;

call returns [Expression result, AbstractSymbol returnType]
@init {
  Expressions exprs = null;
  level++;
}
@after {
  level--;
}
  :
  ^(CALL_T { exprs = new Expressions($CALL_T.line); } 
    ID {
          Expression self_type = new object($ID.line, AbstractTable.idtable.addString("self"));
          self_type.set_type(AbstractTable.idtable.addString("SELF_TYPE"));
          $result = new dispatch($CALL_T.line, self_type, AbstractTable.idtable.addString($ID.text), exprs); 
       }
    (e2=expr { exprs.appendElement($e2.result); $returnType = $e2.returnType; } )*
  )
  |
  ^(aux='.' { exprs = new Expressions($aux.line); }
    e1=expr ID
    {
        if (level != static_dispatchLevel - 1)
        {
	        $result = new dispatch($aux.line, $e1.result, AbstractTable.idtable.addString($ID.text),
	          exprs);
	      }
    }
    (e2=expr { exprs.appendElement($e2.result); })*
    )
    {
        // Atasez de parinte dispatch-ul static
        if (level == static_dispatchLevel - 1)
        {
          $result = new static_dispatch(static_dispatchLine, static_dispatchExpr, static_dispatchObj,
            AbstractTable.idtable.addString($ID.text), exprs);
          static_dispatchLevel = -1;
          static_dispatchLine = -1;
          static_dispatchExpr = null;
          static_dispatchObj = null;
        }
    }
  |
  ^(aux='@' expr TYPE)
  {
    static_dispatchExpr = $expr.result;
    static_dispatchObj = AbstractTable.idtable.addString($TYPE.text);
    static_dispatchLine = $aux.line;
    static_dispatchLevel = level;
  }
  ;
  
let returns [let result, AbstractSymbol returnType]
@init {
  int line = -1;
  LinkedList queue = new LinkedList();
  Expression lastExpr = null;
  Expression firstExpr = null;
  String firstId = null, firstType = null;
  Expression my_expr = null, my_aux_expr = null;
  String my_id = null, my_type = null;
  Integer my_line = null;
}
@after {
  Object[] buffer = new Object[4];
  Object it = null;
  
  if (queue.size() > 0)
  {
	  queue.removeLast();
	  
	  while(queue.size() > 0)
	  {
	    int counter = 0;
		  // Fac pop() la ultimul "let" din lista
		  while(queue.size() > 0)
		  {
		    it = queue.removeLast();
		    if (it == null)
		     break;
		    buffer[counter++] = it;
		  }
		  
		  if (counter == 3)
		  {
		    my_type = (String) buffer[0];
		    my_id = (String) buffer[1];
		    my_line = (Integer) buffer[2];
		    
	      my_aux_expr = new let(my_line, AbstractTable.idtable.addString(my_id),
	        AbstractTable.idtable.addString(my_type), new no_expr(0), lastExpr);  
		  }
		  else if (counter == 4)
		  {
		    my_expr = (Expression) buffer[0];
		    my_type = (String) buffer[1];
		    my_id = (String) buffer[2];
		    my_line = (Integer) buffer[3];
		    
	      my_aux_expr = new let(my_line, AbstractTable.idtable.addString(my_id),
	       AbstractTable.idtable.addString(my_type), my_expr, lastExpr);
		  }
		  lastExpr = my_aux_expr;
	  }
  }

  if (firstExpr == null)
    firstExpr = new no_expr(0);
    
  if (lastExpr == null)
    lastExpr = new no_expr(0);
    
  $result = new let(line, AbstractTable.idtable.addString(firstId),
	 AbstractTable.idtable.addString(firstType), firstExpr, lastExpr);
}
  :
  ^(LET_ST id=ID type=TYPE ('<-' e1=expr)? (',' id_=ID type_=TYPE ('<-' expr_=expr)?
    {
      if ($id_.line == 277)
      {
        System.out.println("askjdal");
        System.exit(0);
      }
       
      queue.add(new Integer($id_.line));
      queue.add($id_.text);
      queue.add($type_.text);
      if (expr_ != null)
        queue.add($expr_.result);
      queue.add(null);
    }
  )* e2=expr)
  {
    line = $id.line;
    lastExpr = $e2.result;
    firstId = $id.text;
    firstType = $type.text;
    firstExpr = $e1.result;
  }
  ;

while_r returns [loop result, AbstractSymbol returnType]
  :
  ^(WHILE_ST e1=expr e2=expr)
  {
    $result = new loop($WHILE_ST.line, $e1.result, $e2.result);
    $returnType = $e2.returnType;
  }
  ;

if_r returns [cond result, AbstractSymbol returnType]
  :
  ^(IF_ST e1=expr e2=expr e3=expr)
  {
    $result = new cond($IF_ST.line, $e1.result, $e2.result, $e3.result);
    $returnType = $e2.returnType;
  }
  ;

case_r returns [typcase result, AbstractSymbol returnType]
@init {
  Cases cases = null;
}
  :
  ^(CASE_ST e1=expr {
    cases = new Cases($CASE_ST.line);
    $result = new typcase($CASE_ST.line, $e1.result, cases);
  }
    (ID TYPE e2=expr
      {
        branch br = new branch($ID.line,
          AbstractTable.idtable.addString($ID.text),
          AbstractTable.idtable.addString($TYPE.text),
          $e2.result);
        cases.appendElement(br);
      }
    )+
  )
  ;

new_r returns [new_ result, AbstractSymbol returnType]
  :
  ^(NEW_ST TYPE)
  {
    $returnType = AbstractTable.idtable.addString($TYPE.text);
    $result = new new_($NEW_ST.line, AbstractTable.idtable.addString($TYPE.text));
  }
  ;
