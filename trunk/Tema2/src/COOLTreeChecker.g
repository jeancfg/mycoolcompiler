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
    (
      feature { $result.appendElement($feature.result); }
    )*
   )
  ;

feature returns [Feature result]
  :
  ^(METHOD_T name=ID returnType formals expr)
  {
    $result = new method($METHOD_T.line, new IdSymbol($name.text, $name.text.length(), 0),
        $formals.result, $returnType.result, $expr.result);
  }
  ;

returnType returns [AbstractSymbol result]
  :
  ^(RETURN_TYPE_T type=TYPE)
  {
    $result = new IdSymbol($type.text, $type.text.length(), 0);
  }
  ;

//$result = new Formals($formal.line);
formals returns [Formals result]
@init
{
  $result = new Formals(0);
}
  :
  ^(TYPE_ID (formal {
    $result.addElement($formal.result); } )*)
  ;
  
formal returns [Formal result]
  :
  ^(FORMAL_T ID type=TYPE)
  {
    $result = new formal($ID.line,
        new IdSymbol($ID.text, $ID.text.length(), 0),
        new StringSymbol($type.text, $type.text.length(), 0));
  }
  ;
  
exprs returns [Expressions result]
  :
  ;
  
expr returns [Expression result]
  :
  ^(EXPR_T INTEGER)
  {
    $result = new string_const($EXPR_T.line, new StringSymbol($INTEGER.text, $INTEGER.text.length(), 0)); 
  }
  ;
