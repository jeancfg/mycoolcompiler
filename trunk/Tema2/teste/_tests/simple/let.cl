(* Simple let constructions *)

class Main  inherits IO{
	main(): Object {
		let a: Int <- 10, b: Int <- 20 in {
			let c : Int <- 30 in (a <- a + c);
			a + b;
			let a: Int <- 0 in let b: Int <- 1 in let c: Int<-2 in out_int(a+b+c);
		}
	};
};


	
	
		
	
