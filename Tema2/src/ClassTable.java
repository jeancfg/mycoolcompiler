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
	private int semantErrors;
	private PrintStream errorStream;
	private final static String INT = "Int";
	private final static String STRING = "String";
	private final static String BOOL = "Bool";
	private final static String OBJECT = "Object";
	private final static String SELF_TYPE = "SELF_TYPE";
	private final static String SELF = "self";
	private final static String NO_EXPR = "no_expr";

	private HashMap<String, HashMap<String, method>> methodsDefinedByClass;
	private HashMap<String, HashMap<String, attr>> attributesDefinedByClass;

	private HashMap<class_, String> classesParent;
	private HashMap<String, class_> loadedClasses;

	private class_ currentClass;
	private HashMap<String, method> currentClassMethods;
	private HashMap<String, attr> currentClassAttributes;

	private SymbolTable symbolTable;

	private static void reportError(Object obj, String msg) {
		System.out.println();
		System.out.println("INTERNAL ERROR");
		if (obj != null)
			System.out.println(obj.getClass());
		System.out.println(msg);
		System.exit(1);
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
		iterateOverClass(Object_class);

		loadedClasses.put(IO_class.name.str, IO_class);
		iterateOverClass(IO_class);

		loadedClasses.put(Int_class.name.str, Int_class);
		iterateOverClass(Int_class);

		loadedClasses.put(Bool_class.name.str, Bool_class);
		iterateOverClass(Bool_class);

		loadedClasses.put(Str_class.name.str, Str_class);
		iterateOverClass(Str_class);
	}

	private void checkAttribute(attr attr_v, boolean evalExpr) {
		if (!evalExpr) {
			currentClassAttributes.put(attr_v.name.str, attr_v);
			symbolTable.addId(attr_v.name, attr_v.type_decl);
		} else
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
		System.out.println(expr.getClass());
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
		// FIXME:
		reportError(expr, "[ERROR] Expected expression instance");
		return null;
	}

	private void checkMethod(method method_v) {
		symbolTable.enterScope();

		currentClassMethods.put(method_v.name.str, method_v);
		Formals formals = method_v.formals;
		checkFormals(formals);

		Expression expr = method_v.expr;
		checkExpression(expr);

		symbolTable.exitScope();
	}

	private void iterateOverFeatures(Features features) {
		Enumeration elements = features.getElements();
		Object aux;
		attr attr_v;
		method method_v;

		// Iterez de doua ori peste atribute
		// - in prima etapa incarc definitia lor
		// - in a doua evaluez expresia de initializare

		while (elements.hasMoreElements()) {
			aux = elements.nextElement();

			if (aux instanceof attr) {
				attr_v = (attr) aux;
				checkAttribute(attr_v, false);
			}
		}

		elements = features.getElements();
		while (elements.hasMoreElements()) {
			aux = elements.nextElement();

			if (aux instanceof attr) {
				attr_v = (attr) aux;
				checkAttribute(attr_v, true);
			}
		}

		elements = features.getElements();
		while (elements.hasMoreElements()) {
			aux = elements.nextElement();

			if (aux instanceof method) {
				method_v = (method) aux;
				checkMethod(method_v);
			}
		}
	}

	private void iterateOverClass(class_ cl) {
		symbolTable.enterScope();

		classesParent.put(cl, cl.parent.str);
		loadedClasses.put(cl.name.str, cl);

		currentClass = cl;
		currentClassMethods = new HashMap<String, method>();
		methodsDefinedByClass.put(cl.name.str, currentClassMethods);

		currentClassAttributes = new HashMap<String, attr>();
		attributesDefinedByClass.put(cl.name.str, currentClassAttributes);

		// Copiez functiile din clasa parinte
		// si le suprascriu in copil, daca e cazul
		HashMap<String, method> inheritedMethods = methodsDefinedByClass
				.get(cl.parent.str);
		HashMap<String, attr> inheritedAttributes = attributesDefinedByClass
				.get(cl.parent.str);

		if (inheritedMethods != null) {
			Iterator<String> it = inheritedMethods.keySet().iterator();
			while (it.hasNext()) {
				String key = it.next();
				currentClassMethods.put(key, inheritedMethods.get(key));
			}
		}

		if (inheritedAttributes != null) {
			Iterator<String> it = inheritedAttributes.keySet().iterator();
			while (it.hasNext()) {
				String key = it.next();
				currentClassAttributes.put(key, inheritedAttributes.get(key));
			}
		}

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

		semantError().append(
				"Invalid operands type at line " + plus.lineNumber + "\n");
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

		semantError().append(
				"Invalid operands type at line " + sub.lineNumber + "\n");
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

		semantError().append(
				"Invalid operands type at line " + mul.lineNumber + "\n");
		return null;
	}

	private String divExpr(divide div) {
		checkExpression(div.e1);
		String e2 = checkExpression(div.e2);

		if (div.e1.get_type().str.equals(INT)
				&& div.e2.get_type().str.equals(INT)) {
			if (e2.equals("0")) {
				// zero division
				semantError().append(
						"Division by zero encountered at line "
								+ div.lineNumber + "\n");
				return null;
			}
			div.set_type(div.e1.get_type());
			return INT;
		}
		semantError().append(
				"Invalid operands type at line " + div.lineNumber + "\n");
		return null;
	}

	private String negExpr(neg neg) {
		checkExpression(neg.e1);

		if (neg.e1.get_type().str.equals(INT)) {
			neg.set_type(neg.e1.get_type());
			return INT;
		}
		semantError().append(
				"Invalid operand type at line " + neg.lineNumber + "\n");
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

		return null;
	}

	private String leqExpr(leq leq) {
		String e1 = checkExpression(leq.e1);
		String e2 = checkExpression(leq.e2);

		if (e1.equals(INT) && e2.equals(INT)) {
			leq.set_type(AbstractTable.idtable.addString(BOOL));
			return BOOL;
		}

		return null;
	}

	private boolean eqValid(String str) {
		return str.equals(STRING) || str.equals(BOOL) || str.equals(INT);
	}

	private String eqExpr(eq eq) {
		String e1 = checkExpression(eq.e1);
		String e2 = checkExpression(eq.e2);

		if (eqValid(e1) && eqValid(e2)) {
			eq.set_type(AbstractTable.idtable.addString(BOOL));
			return BOOL;
		}

		return null;
	}

	private String compExpr(comp comp) {
		String e1 = checkExpression(comp.e1);

		if (e1.equals(INT) || e1.equals(BOOL)) {
			comp.set_type(AbstractTable.idtable.addString(BOOL));
			return BOOL;
		}

		return null;
	}

	private String isvoidExpr(isvoid isvoid) {
		String e1 = checkExpression(isvoid.e1);

		if (e1.equals(INT) || e1.equals(BOOL)) {
			isvoid.set_type(AbstractTable.idtable.addString(BOOL));
			return BOOL;
		}

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
			}

			reportError(type, "[ERROR] Expected abstract symbol instance");
			return null;
		}
		return object.get_type().str;
	}

	private String m_let(let let) {
		symbolTable.enterScope();

		symbolTable.addId(let.identifier, let.type_decl);

		String initType = checkExpression(let.init);

		String result = null;

		System.out.println(initType);
		System.out.println(let.type_decl.str);

		if (initType.equals(let.type_decl.str) || initType.equals(NO_EXPR)) {
			result = checkExpression(let.body);
			if (result != null)
				let.set_type(let.body.get_type());
		} else {
			reportError(initType, "[ERROR] Inconsistent state");
			checkExpression(let.body);
		}

		if (result == null) {
			System.out.println("HMM");
			System.exit(0);
		}

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

		if (dispatch.expr instanceof string_const) {
			new Integer(5);
		}
		objType = checkExpression(dispatch.expr);
		System.out.println(objType);
		try {
			// System.in.read();
		} catch (Exception e) {

		}

		if (objType == null)
			semantError().append(
					"Could not find type for object " + dispatch.name.str);

		// Caut definitia metodei
		boolean search = false;

		if (objType.equals(SELF_TYPE))
			currentClass = this.currentClass;
		else
			currentClass = loadedClasses.get(objType);

		search = searchMethod(currentClass, dispatch.name.str);

		if (!search) {
			semantError().append(
					"Method " + dispatch.name.str + " not defined.\n");
			return null;
		}

		currentClassMethods = this.methodsDefinedByClass
				.get(currentClass.name.str);
		method method = currentClassMethods.get(dispatch.name.str);
		Enumeration method_params = method.formals.getElements();

		while (params.hasMoreElements() && method_params.hasMoreElements()) {
			call_p = params.nextElement();
			def_p = method_params.nextElement();

			if (call_p instanceof Expression) {
				call_t = checkExpression((Expression) call_p);
			} else
				reportError(call_p, "[ERROR] Expected params instance");

			if (def_p instanceof formal)
				def_t = ((formal) def_p).type_decl.str;
			else
				reportError(def_p, "[ERROR] Expected formal instance");

			System.out.println(call_t + "|||" + def_t);

			if (!call_t.equals(def_t))
				semantError().append(
						"Types does not match at calling method "
								+ dispatch.name.str + ".\n");
		}

		if (params.hasMoreElements())
			semantError().append(
					"Too many parameters for calling method "
							+ dispatch.name.str + ".\n");
		else if (method_params.hasMoreElements())
			semantError().append(
					"Too few parameters for calling method "
							+ dispatch.name.str + ".\n");

		if (method.return_type.str.equals(SELF_TYPE))
			dispatch.set_type(currentClass.name);
		else
			dispatch.set_type(method.return_type);
		return method.return_type.str;
	}

	private String m_block(block block) {
		Enumeration exprs = block.body.getElements();
		Object expr = null;

		while (exprs.hasMoreElements()) {
			expr = exprs.nextElement();
			if (expr instanceof Expression) {
				if (checkExpression((Expression) expr) == null)
					return null;
			} else
				reportError(expr,
						"[ERROR] Expected expression in block instance");
		}

		if (expr != null) {
			block.set_type(((Expression) expr).get_type());
			return block.get_type().str;
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
		thenExpr = checkExpression(cond.then_exp);
		elseExpr = checkExpression(cond.else_exp);

		String then_ret = null;
		if (thenExpr != null)
			then_ret = cond.then_exp.get_type().str;

		String else_ret = null;
		if (elseExpr != null)
			else_ret = cond.else_exp.get_type().str;

		if (then_ret.equals(else_ret)) {
			cond.set_type(cond.then_exp.get_type());
		} else {
			System.out.println("TURC PROST");
			// AbstractSymbol resultSymbol = getCommonClass(then_ret, else_ret);
			// String result = resultSymbol.str;
			// cond.set_type(resultSymbol);
			// return result;
		}

		return thenExpr;
	}

	private String m_assign(assign assign) {
		String result = checkExpression(assign.expr);

		if (result != null)
			assign.set_type(assign.expr.get_type());

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
				if (checkExpression(branch.expr) != null
						&& branch.expr.get_type() != null) {
					if (type == null)
						type = branch.expr.get_type();
					else
						aux_type = branch.expr.get_type();
				}
			} else
				reportError(aux, "[ERROR] Expected branch in typcase instance");

			if (aux_type != null && type != null && !type.equals(aux_type)) {
				System.out.println(type + " " + aux_type);
				System.out.println("Tre sa alegi intre tipuri in plm.....");
				System.exit(0);
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

		method = methodsDefinedByClass.get(static_dispatch.type_name.str).get(
				static_dispatch.name.str);

		if (method == null)
			semantError()
					.append(
							"Cannot find method " + static_dispatch.name.str
									+ " in class"
									+ static_dispatch.type_name.str + ".");
		static_dispatch.set_type(method.return_type);
		return static_dispatch.type_name.str;
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
}
