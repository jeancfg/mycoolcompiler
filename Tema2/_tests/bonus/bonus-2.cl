class Class0 {
	
};

%for classnum in [0..8] step 2
class Class%%classnum+2%% inherits Class%%classnum%% {

};

%end for


class Matrix inherits Class10 {
%for i in [1..3]
%for j in (1, 2, 3)
	a%%i%%%%j%% : Int <- %(i-1)*3+(j-1)%;
%end for
%end for

	init(
%for i in [0..7]
		va%%i/3 + 1%%%%i-(i/3)*3 + 1%% : Int ,
%end for
		va33 : Int
	) : SELF_TYPE {
		{
%for i in [1..3]
			a%%i%%1 <- va%%i%%1;
			a%%i%%2 <- va%%i%%2;
			a%%i%%3 <- va%%i%%3;
			
%end for
			self;
		}
	};
};

class Main {
	main() : String {
		"Just contemplating the power of preprocessing"
	};
};