tree grammar COOLTreeChecker;

options {
	tokenVocab = COOLTreeBuilder;
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

program [Classes cl]
	: (classdef { $cl.appendElement($classdef.result); })+
	;
	
classdef returns [class_ result]
	: ^(CLASS_T name=TYPE features)
	{
		$result = new class_($CLASS.line,
			AbstractTable.idtable.addString($name.text),
			AbstractTable.idtable.addString("Object"),
			$features.result,
			AbstractTable.stringtable.addString(getFileName()));
			
	}
	| ^(CLASS_T name=TYPE parent=TYPE features)
	{
		$result = new class_($CLASS.line,
			AbstractTable.idtable.addString($name.text),
			AbstractTable.idtable.addString($parent.text),
			$features.result,
			AbstractTable.stringtable.addString(getFileName()));
	}
	;
	
features returns [Features result]
	: ^(FEATURES_T { $result = new Features($FEATURES.line); } 
		//(feature { $result.appendElement($feature.result); })*
	   )
	;
	
feature returns [Feature result]
	: 
	;



