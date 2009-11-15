import java.io.PrintStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;

/**
 * This class may be used to contain the semantic information such as the
 * inheritance graph. You may use it or not as you like: it is only here to
 * provide a container for the supplied methods.
 */
@SuppressWarnings("unchecked")
class ClassTable {
	private static boolean DEBUG = false;

	private int semantErrors;
	private PrintStream errorStream;
	private final static String INT = "Int";
	private final static String STRING = "String";
	private final static String BOOL = "Bool";
	private final static String OBJECT = "Object";
	private final static String SELF_TYPE = "SELF_TYPE";
	private final static String SELF = "self";
	private final static String NO_EXPR = "no_expr";
	private final static String MAIN_METHOD = "main";
	private final static String MAIN_CLASS = "Main";

	private HashMap<String, HashMap<String, method>> methodsDefinedByClass;
	private HashMap<String, HashMap<String, attr>> attributesDefinedByClass;

	private HashMap<class_, String> classesParent;
	private HashMap<String, class_> loadedClasses;

	private class_ currentClass;
	private HashMap<String, method> currentClassMethods;
	private HashMap<String, attr> currentClassAttributes;

	private SymbolTable symbolTable;

	private static String currentFilename;

	private boolean mainClassDefined = false;
	private boolean mainMethodDefined = false;

	public static void setCurrentFilename(String filename) {
		currentFilename = filename;
	}

	public static String getCurrentFilename() {
		return currentFilename;
	}

	private static void reportError(Object obj, String msg) {
		if (DEBUG) {
			System.out.println();
			System.out.println("INTERNAL ERROR");
			if (obj != null)
				System.out.println(obj.getClass());
			System.out.println(msg);
		}
		System.exit(1);
	}

	private void reportSemantError(int line, String msg) {
		semantError().append(
				"[" + currentFilename + ":" + line + "] " + msg + ".\n");
		System.exit(0);
	}

	/**
	 * Creates data structures representing basic Cool classes (Object, IO, Int,
	 * Bool, String). Please note: as is this method does not do anything
	 * useful; you will need to edit it to make if do what you want.
	 * */
	private void installBasicClasses() {
		AbstractSymbol filename = AbstractTable.stringtable
				.addString("<basic class>");

		// The following demonstrates how to create dummy parse trees to
		// refer to basic Cool classes. There's no need for method
		// bodies -- these are already built into the runtime system.

		// IMPORTANT: The results of the following expressions are
		// stored in local variables. You will want to do something
		// with those variables at the end of this method to make this
		// code meaningful.

		// The Object class has no parent class. Its methods are
		// cool_abort() : Object aborts the program
		// type_name() : Str returns a string representation
		// of class name
		// copy() : SELF_TYPE returns a copy of the object

		class_ Object_class = new class_(
				0,
				TreeConstants.Object_,
				TreeConstants.No_class,
				new Features(0)
						.appendElement(
								new method(0, TreeConstants.cool_abort,
										new Formals(0), TreeConstants.Object_,
										new no_expr(0)))
						.appendElement(
								new method(0, TreeConstants.type_name,
										new Formals(0), TreeConstants.Str,
										new no_expr(0)))
						.appendElement(
								new method(0, TreeConstants.copy,
										new Formals(0),
										TreeConstants.SELF_TYPE, new no_expr(0))),
				filename);

		// The IO class inherits from Object. Its methods are
		// out_string(Str) : SELF_TYPE writes a string to the output
		// out_int(Int) : SELF_TYPE "    an int    " "     "
		// in_string() : Str reads a string from the input
		// in_int() : Int "   an int     " "     "

		class_ IO_class = new class_(
				0,
				TreeConstants.IO,
				TreeConstants.Object_,
				new Features(0)
						.appendElement(
								new method(0, TreeConstants.out_string,
										new Formals(0)
												.appendElement(new formal(0,
														TreeConstants.arg,
														TreeConstants.Str)),
										TreeConstants.SELF_TYPE, new no_expr(0)))
						.appendElement(
								new method(0, TreeConstants.out_int,
										new Formals(0)
												.appendElement(new formal(0,
														TreeConstants.arg,
														TreeConstants.Int)),
										TreeConstants.SELF_TYPE, new no_expr(0)))
						.appendElement(
								new method(0, TreeConstants.in_string,
										new Formals(0), TreeConstants.Str,
										new no_expr(0))).appendElement(
								new method(0, TreeConstants.in_int,
										new Formals(0), TreeConstants.Int,
										new no_expr(0))), filename);

		// The Int class has no methods and only a single attribute, the
		// "val" for the integer.

		class_ Int_class = new class_(0, TreeConstants.Int,
				TreeConstants.Object_, new Features(0).appendElement(new attr(
						0, TreeConstants.val, TreeConstants.prim_slot,
						new no_expr(0))), filename);

		// Bool also has only the "val" slot.
		class_ Bool_class = new class_(0, TreeConstants.Bool,
				TreeConstants.Object_, new Features(0).appendElement(new attr(
						0, TreeConstants.val, TreeConstants.prim_slot,
						new no_expr(0))), filename);

		// The class Str has a number of slots and operations:
		// val the length of the string
		// str_field the string itself
		// length() : Int returns length of the string
		// concat(arg: Str) : Str performs string concatenation
		// substr(arg: Int, arg2: Int): Str substring selection

		class_ Str_class = new class_(
				0,
				TreeConstants.Str,
				TreeConstants.Object_,
				new Features(0)
						.appendElement(
								new attr(0, TreeConstants.val,
										TreeConstants.Int, new no_expr(0)))
						.appendElement(
								new attr(0, TreeConstants.str_field,
										TreeConstants.prim_slot, new no_expr(0)))
						.appendElement(
								new method(0, TreeConstants.length,
										new Formals(0), TreeConstants.Int,
										new no_expr(0)))
						.appendElement(
								new method(0, TreeConstants.concat,
										new Formals(0)
												.appendElement(new formal(0,
														TreeConstants.arg,
														TreeConstants.Str)),
										TreeConstants.Str, new no_expr(0)))
						.appendElement(
								new method(
										0,
										TreeConstants.substr,
										new Formals(0)
												.appendElement(
														new formal(
																0,
																TreeConstants.arg,
																TreeConstants.Int))
												.appendElement(
														new formal(
																0,
																TreeConstants.arg2,
																TreeConstants.Int)),
										TreeConstants.Str, new no_expr(0))),
				filename);

		/*
		 * Do somethind with Object_class, IO_class, Int_class, Bool_class, and
		 * Str_class here
		 */
		loadedClasses = new HashMap<String, class_>();

		loadedClasses.put(Object_class.name.str, Object_class);
		loadClassDefinition(Object_class);

		loadedClasses.put(IO_class.name.str, IO_class);
		loadClassDefinition(IO_class);

		loadedClasses.put(Int_class.name.str, Int_class);
		loadClassDefinition(Int_class);

		loadedClasses.put(Bool_class.name.str, Bool_class);
		loadClassDefinition(Bool_class);

		loadedClasses.put(Str_class.name.str, Str_class);
		loadClassDefinition(Str_class);
	}

	private void checkAttribute(attr attr_v) {
		if (attr_v.name.equals(SELF))
			reportSemantError(attr_v.lineNumber,
					"Cannot define attribute named self");
		if (symbolTable.probe(attr_v.name) != null)
			reportSemantError(attr_v.lineNumber, "Attribute " + attr_v.name.str
					+ " already defined");
		symbolTable.addId(attr_v.name, attr_v.type_decl);
		checkExpression(attr_v.init);
	}

	private void checkFormals(Formals formals) {
		Enumeration enumeration = formals.getElements();
		Object aux;
		formal formal;

		while (enumeration.hasMoreElements()) {
			aux = enumeration.nextElement();
			if (aux instanceof formal) {
				formal = (formal) aux;
				if (formal.name.equals(SELF))
					reportSemantError(formal.lineNumber,
							"Cannot define formal named self");
				symbolTable.addId(formal.name, formal.type_decl);
			} else
				reportError(aux, "[ERROR] Expected formal instance");
		}
	}

	private boolean searchMethod(class_ cl, String name) {
		// Caut metoda in clasa curenta
		// Daca nu exista atunci o caut recursiv
		// in clasa parinte
		if (cl == null)
			return false;

		HashMap<String, method> methods = methodsDefinedByClass
				.get(cl.name.str);
		if (methods.containsKey(name))
			return true;
		if (cl.parent != null)
			return searchMethod(loadedClasses.get(cl.parent.str), name);
		return false;
	}

	private String checkExpression(Expression expr) {
		if (expr instanceof plus || expr instanceof sub || expr instanceof mul
				|| expr instanceof divide || expr instanceof neg)
			return m_arith(expr);
		else if (expr instanceof lt || expr instanceof leq
				|| expr instanceof eq || expr instanceof comp
				|| expr instanceof isvoid)
			return m_bool(expr);
		else if (expr instanceof object)
			return m_object((object) expr);
		else if (expr instanceof let)
			return m_let((let) expr);
		else if (expr instanceof int_const) {
			expr.set_type(AbstractTable.idtable.addString(INT));
			return INT;
		} else if (expr instanceof dispatch)
			return m_dispatch((dispatch) expr);
		else if (expr instanceof no_expr)
			return NO_EXPR;
		else if (expr instanceof string_const) {
			expr.set_type(AbstractTable.idtable.addString(STRING));
			return STRING;
		} else if (expr instanceof block)
			return m_block((block) expr);
		else if (expr instanceof bool_const) {
			expr.set_type(AbstractTable.idtable.addString(BOOL));
			return BOOL;
		} else if (expr instanceof loop)
			return m_loop((loop) expr);
		else if (expr instanceof cond)
			return m_cond((cond) expr);
		else if (expr instanceof assign)
			return m_assign((assign) expr);
		else if (expr instanceof typcase)
			return m_typcase((typcase) expr);
		else if (expr instanceof static_dispatch)
			return m_staticDispatch((static_dispatch) expr);
		else if (expr instanceof new_)
			return m_new((new_) expr);
		reportError(expr, "[ERROR] Expected expression instance");
		return null;
	}

	private void checkMethod(method method_v) {
		symbolTable.enterScope();

		currentClassMethods.put(method_v.name.str, method_v);

		Formals formals = method_v.formals;
		checkFormals(formals);

		Expression expr = method_v.expr;
		String result = checkExpression(expr);

		if (!canCast(result, method_v.return_type.str))
			reportSemantError(((Expression) expr).lineNumber, "Cannot cast "
					+ result + " to " + method_v.return_type.str);

		symbolTable.exitScope();
	}

	private void iterateOverFeatures(Features features) {
		Enumeration elements = features.getElements();
		Object aux;
		attr attr_v;
		method method_v;

		while (elements.hasMoreElements()) {
			aux = elements.nextElement();

			if (aux instanceof attr) {
				attr_v = (attr) aux;
				checkAttribute(attr_v);
			} else if (aux instanceof method) {
				method_v = (method) aux;
				checkMethod(method_v);
			}
		}
	}

	private void iterateOverClass(class_ cl) {
		symbolTable.enterScope();

		currentClass = cl;
		currentClassAttributes = attributesDefinedByClass.get(cl.name.str);
		currentClassMethods = methodsDefinedByClass.get(cl.name.str);
		iterateOverFeatures(cl.features);

		symbolTable.exitScope();
	}

	public ClassTable(Classes cls) {
		methodsDefinedByClass = new HashMap<String, HashMap<String, method>>();
		attributesDefinedByClass = new HashMap<String, HashMap<String, attr>>();
		classesParent = new HashMap<class_, String>();
		semantErrors = 0;
		errorStream = System.err;

		symbolTable = new SymbolTable();

		// initialization
		installBasicClasses();

		/* fill this in */
		Enumeration cls_e = cls.getElements();
		Object aux;

		// Iterez de doua ori peste fisierul sursa
		// - in prima etapa incarc definitiile claselor, functiilor
		// si a atributelor
		// - in a doua evaluez expresia de initializare
		while (cls_e.hasMoreElements()) {
			aux = (class_) cls_e.nextElement();
			if (aux instanceof class_)
				loadClassDefinition((class_) aux);
			else
				reportError(aux, "[ERROR] Expected class_ instance");
		}

		Iterator<String> it = loadedClasses.keySet().iterator();
		while (it.hasNext()) {
			aux = loadedClasses.get(it.next());
			loadInheritData((class_) aux, 0);
		}

		// FIXME:
		// Debugger.iterateOverAttrHashMap(attributesDefinedByClass);
		// Debugger.iterateOverMethodHashMap(methodsDefinedByClass);

		if (!mainClassDefined || !mainMethodDefined) {
			if (!mainMethodDefined)
				reportSemantError(0, "Class Main not found");
			if (!mainClassDefined)
				reportSemantError(0, "Method main() not found");
		}

		cls_e = cls.getElements();
		while (cls_e.hasMoreElements()) {
			aux = (class_) cls_e.nextElement();
			if (aux instanceof class_)
				iterateOverClass((class_) aux);
			else
				reportError(aux, "[ERROR] Expected class_ instance");
		}
	}

	/**
	 * Prints line number and file name of the given class.
	 * 
	 * Also increments semantic error count.
	 * 
	 * @param c
	 *            the class
	 * @return a print stream to which the rest of the error message is to be
	 *         printed.
	 * 
	 * */
	public PrintStream semantError(class_ c) {
		return semantError(c.getFilename(), c);
	}

	/**
	 * Prints the file name and the line number of the given tree node.
	 * 
	 * Also increments semantic error count.
	 * 
	 * @param filename
	 *            the file name
	 * @param t
	 *            the tree node
	 * @return a print stream to which the rest of the error message is to be
	 *         printed.
	 * 
	 * */
	public PrintStream semantError(AbstractSymbol filename, TreeNode t) {
		errorStream.print(filename + ":" + t.getLineNumber() + ": ");
		return semantError();
	}

	/**
	 * Increments semantic error count and returns the print stream for error
	 * messages.
	 * 
	 * @return a print stream to which the error message is to be printed.
	 * 
	 * */
	public PrintStream semantError() {
		semantErrors++;
		return errorStream;
	}

	/** Returns true if there are any static semantic errors. */
	public boolean errors() {
		return semantErrors != 0;
	}

	private String plusExpr(plus plus) {
		checkExpression(plus.e1);
		checkExpression(plus.e2);

		if (plus.e1.get_type().str.equals(INT)
				&& plus.e2.get_type().str.equals(INT)) {
			plus.set_type(plus.e1.get_type());
			return INT;
		}

		reportSemantError(plus.lineNumber,
				"Plus operation failed; expected INT object, received "
						+ plus.e1.get_type().str + " type");
		return null;
	}

	private String subExpr(sub sub) {
		checkExpression(sub.e1);
		checkExpression(sub.e2);

		if (sub.e1.get_type().str.equals(INT)
				&& sub.e2.get_type().str.equals(INT)) {
			sub.set_type(sub.e1.get_type());
			return INT;
		}

		reportSemantError(sub.lineNumber,
				"Sub operation failed; expected INT object, received "
						+ sub.e1.get_type().str + " type");

		return null;
	}

	private String mulExpr(mul mul) {
		checkExpression(mul.e1);
		checkExpression(mul.e2);

		if (mul.e1.get_type().str.equals(INT)
				&& mul.e2.get_type().str.equals(INT)) {
			mul.set_type(mul.e1.get_type());
			return INT;
		}

		reportSemantError(mul.lineNumber,
				"Mul operation failed; expected INT object, received "
						+ mul.e1.get_type().str + " type");

		return null;
	}

	private String divExpr(divide div) {
		checkExpression(div.e1);
		String e2 = checkExpression(div.e2);

		if (div.e1.get_type().str.equals(INT)
				&& div.e2.get_type().str.equals(INT)) {
			if (e2.equals("0")) {
				// zero division
				reportSemantError(div.lineNumber, "Division by 0 !!!");
				return null;
			}
			div.set_type(div.e1.get_type());
			return INT;
		}

		reportSemantError(div.lineNumber,
				"Div operation failed; expected INT object, received "
						+ div.e1.get_type().str + " type");
		return null;
	}

	private String negExpr(neg neg) {
		checkExpression(neg.e1);

		if (neg.e1.get_type().str.equals(INT)) {
			neg.set_type(neg.e1.get_type());
			return INT;
		}

		reportSemantError(neg.lineNumber,
				"Neg operation failed; expected INT object, received "
						+ neg.e1.get_type().str + " type");
		return null;
	}

	private String m_arith(Object expr) {
		if (expr instanceof plus)
			return plusExpr((plus) expr);
		else if (expr instanceof sub)
			return subExpr((sub) expr);
		else if (expr instanceof mul)
			return mulExpr((mul) expr);
		else if (expr instanceof divide)
			return divExpr((divide) expr);
		else if (expr instanceof neg)
			return negExpr((neg) expr);
		return null;
	}

	private String ltExpr(lt lt) {
		String e1 = checkExpression(lt.e1);
		String e2 = checkExpression(lt.e2);

		if (e1.equals(INT) && e2.equals(INT)) {
			lt.set_type(AbstractTable.idtable.addString(BOOL));
			return BOOL;
		}

		reportSemantError(lt.lineNumber,
				"Less then operation failed; expected INT objects, received "
						+ e1 + " and " + e2);
		return null;
	}

	private String leqExpr(leq leq) {
		String e1 = checkExpression(leq.e1);
		String e2 = checkExpression(leq.e2);

		if (e1.equals(INT) && e2.equals(INT)) {
			leq.set_type(AbstractTable.idtable.addString(BOOL));
			return BOOL;
		}

		reportSemantError(leq.lineNumber,
				"Less or equal operation failed; expected INT objects, received "
						+ e1 + " and " + e2);
		return null;
	}

	private boolean eqValid(String str) {
		// return str.equals(STRING) || str.equals(BOOL) || str.equals(INT);

		// Operatia de "egalitate" se poate aplica pentru orice
		// clasa definita de utilizator
		if (str.equals(SELF_TYPE))
			return true;
		return this.loadedClasses.containsKey(str);
	}

	private String eqExpr(eq eq) {
		String e1 = checkExpression(eq.e1);
		String e2 = checkExpression(eq.e2);

		if (eqValid(e1) && eqValid(e2)) {
			eq.set_type(AbstractTable.idtable.addString(BOOL));
			return BOOL;
		}

		reportSemantError(eq.lineNumber,
				"Equal operation failed; undefined classes " + e1 + " and "
						+ e2);
		return null;
	}

	private String compExpr(comp comp) {
		String e1 = checkExpression(comp.e1);

		if (e1.equals(INT) || e1.equals(BOOL)) {
			comp.set_type(AbstractTable.idtable.addString(BOOL));
			return BOOL;
		}

		reportSemantError(comp.lineNumber,
				"Comp operation failed; expected (INT || BOOL) object, received "
						+ e1);
		return null;
	}

	private String isvoidExpr(isvoid isvoid) {
		String e1 = checkExpression(isvoid.e1);

		if (e1 != null) {
			isvoid.set_type(AbstractTable.idtable.addString(BOOL));
			return BOOL;
		}

		reportSemantError(isvoid.lineNumber, "IsVoid operation failed");
		return null;
	}

	private String m_bool(Object expr) {
		if (expr instanceof lt)
			return ltExpr((lt) expr);
		else if (expr instanceof leq)
			return leqExpr((leq) expr);
		else if (expr instanceof eq)
			return eqExpr((eq) expr);
		else if (expr instanceof comp)
			return compExpr((comp) expr);
		else if (expr instanceof isvoid)
			return isvoidExpr((isvoid) expr);
		return null;
	}

	private String m_object(object object) {
		// Setez tipul obiectului in expresie, daca nu e setat
		if (object.get_type() == null) {
			Object type = symbolTable.lookup(object.name);

			if (type == null && object.name.str.equals(SELF)) {
				object.set_type(AbstractTable.idtable.addString(SELF_TYPE));
				return AbstractTable.idtable.addString(SELF_TYPE).str;
			} else if (type instanceof AbstractSymbol) {
				object.set_type((AbstractSymbol) type);
				return ((AbstractSymbol) type).str;
			} else if (type instanceof String) {
				object.set_type(AbstractTable.idtable.addString((String) type));
				return (String) type;
			} else if (type == null) {
				attr attr = currentClassAttributes.get(object.name.str);
				if (attr == null) {
					reportSemantError(object.lineNumber, "Variable "
							+ object.name.str + " not defined");
					return null;
				}
				object.set_type(attr.type_decl);
				return attr.type_decl.str;
			}

			reportError(type, "[ERROR] Expected abstract symbol instance");
			return null;
		}

		return object.get_type().str;
	}

	private String m_let(let let) {
		symbolTable.enterScope();

		if (let.identifier.str.equals(SELF))
			reportSemantError(let.lineNumber,
					"Declaring self as variable in let construction is illegal");

		if (let.identifier.str.equals(SELF))
			reportSemantError(let.lineNumber,
					"Cannot define let variable named self");
		symbolTable.addId(let.identifier, let.type_decl);

		String initType = checkExpression(let.init);
		String result = null;

		if (initType.equals(let.type_decl.str)
				|| initType.equals(NO_EXPR)
				|| getCommonClass(initType, let.type_decl.str).equals(
						let.type_decl))
			result = checkExpression(let.body);
		else {
			reportError(initType, "[ERROR] Inconsistent state");
			checkExpression(let.body);
		}

		if (result == null)
			reportError(null, "[ERROR] Inconsistent state in let expression");

		let.set_type(let.body.get_type());

		symbolTable.exitScope();
		return result;
	}

	private String m_dispatch(dispatch dispatch) {
		Enumeration params = dispatch.actual.getElements();
		Object call_p = null, def_p = null;
		String call_t = null, def_t = null;
		String objType = null;
		class_ currentClass;
		HashMap<String, method> currentClassMethods;

		objType = checkExpression(dispatch.expr);

		if (objType == null) {
			reportSemantError(dispatch.lineNumber, "Variable "
					+ dispatch.name.str + " not defined");
			return null;
		}

		// Caut definitia metodei
		boolean search = false;

		if (objType.equals(SELF_TYPE))
			currentClass = this.currentClass;
		else
			currentClass = loadedClasses.get(objType);

		search = searchMethod(currentClass, dispatch.name.str);

		if (!search) {
			reportSemantError(dispatch.lineNumber, "Method "
					+ dispatch.name.str + " not defined");
			return null;
		}

		currentClassMethods = this.methodsDefinedByClass
				.get(currentClass.name.str);

		method method = currentClassMethods.get(dispatch.name.str);

		Enumeration method_params = method.formals.getElements();

		while (params.hasMoreElements() && method_params.hasMoreElements()) {
			call_p = params.nextElement();
			def_p = method_params.nextElement();

			if (call_p instanceof Expression)
				call_t = checkExpression((Expression) call_p);
			else
				reportError(call_p, "[ERROR] Expected params instance");

			if (def_p instanceof formal)
				def_t = ((formal) def_p).type_decl.str;
			else
				reportError(def_p, "[ERROR] Expected formal instance");

			if (call_t.equals(SELF_TYPE))
				call_t = this.currentClass.name.str;

			if (def_t.equals(SELF_TYPE))
				reportError(null,
						"SELF_TYPE painful error in formal parameters");

			if (!getCommonClass(call_t, def_t).equals(
					AbstractTable.idtable.addString(def_t)))
				reportSemantError(dispatch.lineNumber,
						"Types do not match at calling method "
								+ dispatch.name.str + "; expecting " + def_t
								+ " , received " + call_t);
		}

		if (params.hasMoreElements())
			reportSemantError(dispatch.lineNumber,
					"Too many parameters for calling method "
							+ dispatch.name.str);
		else if (method_params.hasMoreElements())
			reportSemantError(dispatch.lineNumber,
					"Too few parameters for calling method "
							+ dispatch.name.str);

		if (method.return_type.str.equals(SELF_TYPE)
				&& !currentClass.name.str.equals(this.currentClass.name.str)) {
			// Schimb tipul din SELF_TYPE in numele clasei
			// doar daca numele clasei curente difera de self-ul referit
			// de metoda
			dispatch.set_type(currentClass.name);
			return currentClass.name.str;
		}
		dispatch.set_type(method.return_type);
		return method.return_type.str;
	}

	private String m_block(block block) {
		Enumeration exprs = block.body.getElements();
		Object expr = null;
		String result = null;

		while (exprs.hasMoreElements()) {
			expr = exprs.nextElement();
			if (expr instanceof Expression) {
				result = checkExpression((Expression) expr);
				if (result == null)
					return null;
			} else
				reportError(expr,
						"[ERROR] Expected expression in block instance");
		}

		// if (expr != null) {
		// block.set_type(((Expression) expr).get_type());
		// return block.get_type().str;
		// }

		if (result != null) {
			block.set_type(AbstractTable.idtable.addString(result));
			return result;
		}

		return null;
	}

	private String m_loop(loop loop) {
		checkExpression(loop.pred);
		String result = checkExpression(loop.body);

		if (result != null)
			loop.set_type(AbstractTable.idtable.addString(OBJECT));

		return result;
	}

	private String m_cond(cond cond) {
		String thenExpr, elseExpr;
		checkExpression(cond.pred);

		symbolTable.enterScope();
		thenExpr = checkExpression(cond.then_exp);
		symbolTable.exitScope();

		symbolTable.enterScope();
		elseExpr = checkExpression(cond.else_exp);
		symbolTable.exitScope();

		String then_ret = null;
		if (thenExpr != null)
			then_ret = cond.then_exp.get_type().str;

		String else_ret = null;
		if (elseExpr != null)
			else_ret = cond.else_exp.get_type().str;

		if (then_ret.equals(else_ret))
			cond.set_type(cond.then_exp.get_type());
		else
			cond.set_type(getCommonClass(else_ret, then_ret));

		return cond.get_type().str;
	}

	private String m_assign(assign assign) {
		String result = checkExpression(assign.expr);

		if (result != null) {
			symbolTable.addId(assign.name, assign.expr.get_type());
			assign.set_type(assign.expr.get_type());
		}

		return result;
	}

	private String m_typcase(typcase typcase) {
		String result = checkExpression(typcase.expr);
		AbstractSymbol type = null, aux_type = null;

		if (result == null)
			return null;

		Enumeration cases = typcase.cases.getElements();
		Object aux;

		while (cases.hasMoreElements()) {
			aux = cases.nextElement();

			if (aux instanceof branch) {
				branch branch = (branch) aux;
				symbolTable.enterScope();
				symbolTable.addId(branch.name, branch.type_decl);
				if (checkExpression(branch.expr) != null
						&& branch.expr.get_type() != null) {
					if (type == null)
						type = branch.expr.get_type();
					else
						aux_type = branch.expr.get_type();
				}
				symbolTable.exitScope();
			} else
				reportError(aux, "[ERROR] Expected branch in typcase instance");

			if (aux_type != null && type != null && !type.equals(aux_type)) {
				type = getCommonClass(type.str, aux_type.str);
			}
		}

		if (type != null)
			typcase.set_type(type);

		if (type != null)
			return type.str;
		return null;
	}

	private String m_staticDispatch(static_dispatch static_dispatch) {
		if (checkExpression(static_dispatch.expr) == null)
			return null;

		Enumeration params = static_dispatch.actual.getElements();
		method method = null;
		Object param = null;

		while (params.hasMoreElements()) {
			param = params.nextElement();
			if (param instanceof Expression)
				checkExpression((Expression) param);
			else
				reportError(param,
						"[ERROR] Expected expression in static dispatch");
		}

		if (methodsDefinedByClass.get(static_dispatch.type_name.str) == null) {
			reportSemantError(static_dispatch.lineNumber, "Class "
					+ static_dispatch.type_name.str
					+ " not defined; static dispatch failed.\n");
			return null;
		}
		method = methodsDefinedByClass.get(static_dispatch.type_name.str).get(
				static_dispatch.name.str);

		if (method == null) {
			reportSemantError(static_dispatch.lineNumber, "Method "
					+ static_dispatch.name.str + " not found in class "
					+ static_dispatch.type_name.str);
			return null;
		}

		static_dispatch.set_type(method.return_type);
		return method.return_type.str;
	}

	private String m_new(new_ new_) {
		new_.set_type(new_.type_name);
		return new_.type_name.toString();
	}

	private AbstractSymbol getCommonClass(String cl1, String cl2) {
		class_ c1 = null, c2 = null;

		if (cl1.equals(SELF_TYPE))
			c1 = currentClass;
		else
			c1 = loadedClasses.get(cl1);

		if (cl2.equals(SELF_TYPE))
			c2 = currentClass;
		else
			c2 = loadedClasses.get(cl2);

		for (class_ i1 = c1; i1 != null && i1.parent != null; i1 = loadedClasses
				.get(i1.parent.str)) {
			for (class_ i2 = c2; i2 != null && i2.parent != null; i2 = loadedClasses
					.get(i2.parent.str))
				if (i1 == i2)
					return AbstractTable.idtable.addString(i1.name.str);
		}

		return null;
	}

	private void loadClassDefinition(class_ cl) {
		if (loadedClasses.get(cl.name.str) != null && cl.lineNumber > 0)
			reportSemantError(cl.lineNumber, "Class " + cl.name + " redefined");

		checkInheritFrom(cl.parent.str, cl.lineNumber);
		classesParent.put(cl, cl.parent.str);
		loadedClasses.put(cl.name.str, cl);

		currentClass = cl;

		currentClassMethods = new HashMap<String, method>();
		methodsDefinedByClass.put(cl.name.str, currentClassMethods);

		currentClassAttributes = new HashMap<String, attr>();
		attributesDefinedByClass.put(cl.name.str, currentClassAttributes);

		loadFeatures(cl.features);
	}

	private void loadFeatures(Features features) {
		Enumeration elements = features.getElements();
		Object aux;
		attr attr_v;
		method method_v;

		while (elements.hasMoreElements()) {
			aux = elements.nextElement();

			if (aux instanceof attr) {
				attr_v = (attr) aux;
				if (currentClassAttributes.containsKey(attr_v.name.str))
					reportSemantError(currentClassAttributes
							.get(attr_v.name.str).lineNumber, "Attribute "
							+ currentClassAttributes.get(attr_v.name.str).name
							+ " redefined");
				if (attr_v.name.str.equals(SELF))
					reportSemantError(attr_v.lineNumber,
							"Declaring self as attribute is illegal");
				currentClassAttributes.put(attr_v.name.str, attr_v);
			} else if (aux instanceof method) {
				method_v = (method) aux;
				if (currentClassMethods.containsKey(method_v.name.str))
					reportSemantError(currentClassMethods
							.get(method_v.name.str).lineNumber, "Method "
							+ currentClassMethods.get(method_v.name.str).name
							+ " redefined");
				currentClassMethods.put(method_v.name.str, method_v);
			}
		}
	}

	private void loadInheritData(class_ cl, int depth) {
		// Copiez functiile din clasa parinte
		// si le suprascriu in copil, daca e cazul
		HashMap<String, method> inheritedMethods = null;
		HashMap<String, attr> inheritedAttributes = null;

		if (cl == null)
			return;

		if (depth > loadedClasses.size()) {
			reportSemantError(0, "Inheritance graph contains cycles");
			System.exit(0);
		}

		// Incarc metodele parintelui si apoi le mostenesc
		if (cl.parent != null)
			loadInheritData(loadedClasses.get(cl.parent.str), depth + 1);

		// Copiez functiile din clasa parinte
		// si le suprascriu in copil, daca e cazul
		inheritedMethods = methodsDefinedByClass.get(cl.parent.str);
		inheritedAttributes = attributesDefinedByClass.get(cl.parent.str);

		currentClassMethods = methodsDefinedByClass.get(cl.name.str);
		if (inheritedMethods != null) {
			Iterator<String> it = inheritedMethods.keySet().iterator();
			while (it.hasNext()) {
				String key = it.next();
				method m1 = currentClassMethods.get(key);
				method m2 = inheritedMethods.get(key);

				if (m1 == null)
					currentClassMethods.put(key, inheritedMethods.get(key));
				else {
					Enumeration f1 = m1.formals.getElements();
					Enumeration f2 = m2.formals.getElements();
					while (f1.hasMoreElements() && f2.hasMoreElements()) {
						Object o1 = f1.nextElement();
						String t1 = null;

						Object o2 = f2.nextElement();
						String t2 = null;

						if (o1 instanceof formal)
							t1 = ((formal) o1).type_decl.str;

						if (o2 instanceof formal)
							t2 = ((formal) o2).type_decl.str;

						if (t1 != null && t2 != null && t1.equals(t2))
							;
						else
							reportSemantError(m1.lineNumber,
									" Trying to override a method with not the same signature");
					}

					if (f1.hasMoreElements() || f2.hasMoreElements())
						reportSemantError(m1.lineNumber,
								" Trying to override a method with not the same signature");
				}
			}
		}

		if (cl.name.str.equals(MAIN_CLASS)) {
			mainClassDefined = true;
			if (currentClassMethods.containsKey(MAIN_METHOD))
				mainMethodDefined = true;
		}

		currentClassAttributes = attributesDefinedByClass.get(cl.name.str);
		if (inheritedAttributes != null) {
			Iterator<String> it = inheritedAttributes.keySet().iterator();
			while (it.hasNext()) {
				String key = it.next();
				if (currentClassAttributes.containsKey(key)
						&& currentClassAttributes.get(key) != inheritedAttributes
								.get(key))
					reportSemantError(
							currentClassAttributes.get(key).lineNumber,
							"Attribute " + currentClassAttributes.get(key).name
									+ " redefined");
				currentClassAttributes.put(key, inheritedAttributes.get(key));
			}
		}
	}

	private void checkInheritFrom(String cl, int line) {
		if (cl.equals(INT) || cl.equals(BOOL) || cl.equals(STRING))
			reportSemantError(line, "Class " + cl + " is not inheritable");
	}

	private boolean canCast(String from, String to) {
		class_ from_c;
		String aux;

		// Pot casta la OBJECT orice tip
		if (from.equals(to) || to.equals(OBJECT))
			return true;

		if (from.equals(SELF_TYPE))
			from_c = currentClass;
		else
			from_c = loadedClasses.get(from);

		if (from_c.name.str.equals(to))
			return true;

		while (from_c.parent != null && !from_c.parent.str.equals(OBJECT)) {
			aux = from_c.parent.str;
			if (aux.equals(to))
				return true;
			from_c = loadedClasses.get(aux);
		}
		return false;
	}
}
