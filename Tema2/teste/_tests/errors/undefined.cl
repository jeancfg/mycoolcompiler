(* Undefined symbols *)

class Main {
	value : Int <- 100;
	
	main(): Int {
		{ 
			let a: Int <- 10 in a <- a + value;
			a;
		}
	};
};