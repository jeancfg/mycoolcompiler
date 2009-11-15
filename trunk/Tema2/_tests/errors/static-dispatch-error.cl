(* class NotDefinedClass is not defined *)

class Main{
	x : Int;
	main():Object{
		x@NotDefinedClass.methodName()
	};
};
