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
	 else
	   System.out.println("Unknown operator " + op);
	   
	 return result;
	}
}

// TODO: You have below a sample ANTLR AST parser that makes use of the tree API to
// generate a valid tree to be serialized to the output.
// You must extend / rewrite it to your own needs.

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
      AbstractTable.idtable.addString($type.text), null);//__expr);    
  }
  ;

expr returns [Expression result, AbstractSymbol returnType]
  :
  ^(EXPR_T INTEGER)
  {
    $result = new int_const($EXPR_T.line, AbstractTable.inttable.addInt(Integer.parseInt($INTEGER.text)));
    $returnType = new IntSymbol("Int", 3, 0); 
  }
  |
  ^(EXPR_T STRING)
  {
    // Elimin ghilimelele de la inceputul si sfarsitul string-ului
    //   "abc" => abc
    String str = $STRING.text;    
    str = str.substring(1, str.length() - 1);

    $result = new string_const($EXPR_T.line, new StringSymbol(str, str.length(), 0));
    $returnType = new StringSymbol("String", 6, 0);
  }
  |
  ^(EXPR_T op)
  {
    $result = $op.result;
    $returnType = $op.returnType;
  }
  |
  op
  {
    $result = $op.result;
    $returnType = $op.returnType;
  }
  |
  ID
  {
    $result = new object($ID.line, new IdSymbol($ID.text, $ID.text.length(), 0));
    $returnType = 
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
    AbstractSymbol __name = new IdSymbol($name.text, $name.text.length(), 0);
    AbstractSymbol __type = new IdSymbol($type.text, $type.text.length(), 0);
    
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
      __name = new int_const($o.line, new IntSymbol($p1.result, $p1.result.length(), 0));
    else if ($p1.type.equals("Id"))
      __name = new object($o.line, new IdSymbol($p1.result, $p1.result.length(), 0));

    if ($p2.type.equals("Integer"))
      __expr = new int_const($o.line, new IntSymbol($p2.result, $p2.result.length(), 0));
    else if ($p2.type.equals("Id"))
      __expr = new object($o.line, new IdSymbol($p2.result, $p2.result.length(), 0));

    applyOp($o.text, $o.line, __name, __expr);
  }
  ;

op_bin returns [String text, int line]
  :
  e = ('+' | '-' | '*' | '/')
  {
    $text = $e.text;
    $line = $e.line;
  }
  ;
