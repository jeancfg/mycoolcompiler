(* E does not conform to returned type A *)

class A{
};

class B inherits A{
};

class C inherits A{
};

class D inherits B{
};

class E{
};

class Main{
	f1(): A{
		new A
	};

	f2(): B{
		new B
	};

	f3(): C{
		new C
	};

	f4(): D{
		new D
	};

	f5(): E{
		new E
	};	

	main(): A {
		{
			f1();
			f2();
			f3();
			f4();
			f5();
		}
	};
};
