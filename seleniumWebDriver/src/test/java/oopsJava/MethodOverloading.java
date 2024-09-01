package oopsJava;

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