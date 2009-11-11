tree grammar COOLTreeChecker;

options {
  tokenVocab   = COOLTreeBuilder;
  ASTLabelType = CommonTree;
}

@members {
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
	
	private boolean isESQ(char c) {
	   return c == 'b' || c == 't' ||
	     c == 'n' || c == 'f' ||
	     c == 'r' || c == '\"' ||
	     c == '\'' || c == '\\';
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
    $expr.result.set_type(returnType);
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
    String str = $s.text;
    str = str.substring(1, str.length()-1);    
    //str = normalize(str);

    $result = new string_const($s.line, new StringSymbol(str, str.length(), 0));
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
  (^(EXPR_T l=let) | l=let)
  {
    $result = $l.result;
    $returnType = $l.returnType;
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
  ^(BLOCK_T { exprs = new Expressions($BLOCK_T.line); $result = new block($BLOCK_T.line, exprs); } 
    (expr { exprs.appendElement($expr.result); $returnType = $expr.returnType; } )*
  )
  ;

call returns [dispatch result, AbstractSymbol returnType]
@init {
  Expressions exprs = null;
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
//        Expression self_type = new object($ID.line, AbstractTable.idtable.addString("self"));
//        self_type.set_type(AbstractTable.idtable.addString("SELF_TYPE"));
        $result = new dispatch($aux.line, $e1.result, AbstractTable.idtable.addString($ID.text),
          exprs);
    }
    (e2=expr { exprs.appendElement($e2.result); })*)
  ;
  
let returns [let result, AbstractSymbol returnType]
  :
  ^(LET_ST name=ID type=TYPE ('<-' e=expr)? expr)
  {
    ;    
  }
  ;
