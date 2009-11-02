(* Class A is defined more than once *)

class A inherits IO{
};

class B inherits A{
};

class C inherits B{
};

class A inherits IO{
};
