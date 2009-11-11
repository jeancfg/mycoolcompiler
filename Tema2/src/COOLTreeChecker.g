tree grammar COOLTreeChecker;

options {
  tokenVocab   = COOLTreeBuilder;
  ASTLabelType = CommonTree;
}

@members {
	private String fileName = "Unnamed"; // The file name is needed by the tree API.
	
	public String getFileName() { return fileName; }
	public void setFileName(String fileName) { this.fileName = fileName; }
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
    //(
      //feature { $result.appendElement($feature.result); }
    //)*
   )
  ;

feature returns [Feature result]
  :
//  ^(METHOD_T name=ID returnType formals expr)
//  {
//    $expr.result.set_type(new IdSymbol($returnType.returnStr, 3, 0));
//    $result = new method($METHOD_T.line, new IdSymbol($name.text, $name.text.length(), 0),
//        $formals.result, $returnType.result, $expr.result);
//  }
//  |
  ^(a = ATTR_T name=ID type=TYPE)
  {
    System.out.println("AJUNG AICI");
  }
  |
  ^(a = ATTR_T name=ID type=TYPE expr)
  {
    $result = new attr($a.line, new IdSymbol($name.text, $name.text.length(), 0),
      new IdSymbol($type.text, $type.text.length(), 0), $expr.result);    
  }  
  ;

expr returns [Expression result]
  :
  ^(EXPR_T INTEGER)
  {
    $result = new int_const($EXPR_T.line, new IntSymbol($INTEGER.text, $INTEGER.text.length(), 0));
  }
  |
  ^(EXPR_T STRING)
  {
    $result = new string_const($EXPR_T.line, new StringSymbol($STRING.text, $STRING.text.length(), 0));
  }
  ;
