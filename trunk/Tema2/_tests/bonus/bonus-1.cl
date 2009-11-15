%define VARIANT_A

class Test inherits IO {
	print() : SELF_TYPE {
%if def VARIANT_A
		out_string("Variant A:")
%else
		out_string("Variant B:")
%end if
	};
	
};

%undefine VARIANT_A


%if !(def VARIANT_A)

%define X 1
%define Y 10

class Main {
	var%%X%% : Int <- 10;
	var%%X+1%% : Int <- 20;
	var%%X*3%% : Int <- 30;
	
	main() : Int {
		let test : Test <- new Test in {
			test.print().out_string("%X%").out_int(%X+Y*2-def Y*10%);
			test.out_string("It all happened in ").out_string(%%__FILE__%%);
			test.out_string("We are here: ").out_string(%__LINE__%);
			0;
		}
	};
};
%end if