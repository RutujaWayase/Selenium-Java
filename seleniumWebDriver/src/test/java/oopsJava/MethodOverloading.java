package oopsJava;


/*
Method Overloading: If a class has multiple methods having same name but different in paramters is known as Method Overloading.
Different ways to overload the method:
	1) By Changing number of arguments.
    2) By changing the data type
*/


//1) Changing no. of arguments
/*
class Adder{
	static int add(int a, int b) {
		return a+b;
	}
	static int add(int a, int b, int c) {
		return a+b+c;
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		System.out.println(Adder.add(11, 11));
		System.out.println(Adder.add(11, 11, 11));
	}

}

*/

//2) Changing data type of arguments
class Adder{
	static int add(int a, int b) {
		return a+b;
	}
	static double add(double a, double b) {
		return a+b;
	}
}
public class MethodOverloading{
	public static void main(String[] args) {
		System.out.println(Adder.add(11, 11));
		System.out.println(Adder.add(11.22, 22.44));
	}
}

//Note: Method overloading is not possible by changing return type of method only => Ambiguity => o/p: Compile Time Error: method add(int, int) is already defined in class

/*
class Adder{
	static int add(int a, int b) {
		return a+b;
	}
	static double add(int a, int b) {
		return a+b;
	}
	
}
public class MethodOverloading{
	public static void main(String[] args) {
		System.out.println(Adder.add(11,11)); //ambiguity
	}
}

*/