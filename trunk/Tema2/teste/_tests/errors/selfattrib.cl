(* Attributes cannot be access through self *)

class Main {
	myval : Int <- 10;
	
	main() : Int {
		self.myval <- 100
	}
}