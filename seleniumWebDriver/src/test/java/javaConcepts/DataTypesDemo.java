package javaConcepts;


public class DataTypesDemo {
	
	public static void main(String[] args) {
		
		//numeric data types
		int a=100, b=200;
		System.out.println("the value of a is: "+a);
		System.out.println("the value of b is: "+b);
		System.out.println(a+b);
		System.out.println("the sum of value of a and b is: "+(a+b));
		
		byte by=125;
		System.out.println(by);
		
		short sh=3535;
		System.out.println(sh);
		
		long l=21212121234567l; //specify literal i.e. 'l' or 'L' at end
		System.out.println(l);
		
		//decimal numbers - float, double
		float item_price = 15.5F; //123.456F; //specify literal i.e. 'f' or 'F' at end
		System.out.println(item_price);
		
		//literals are need for 2 data types : long and float.
		
		double dbl = 1234.345632;
		System.out.println(dbl);
		
		char grad='A';
		System.out.println(grad);
		
		String name="John";
		System.out.println(name);
		
		//char ch='ABC'; //invalid
		//String ch='ABC'; //invalid
		//String ch='A'; //invalid
		String ch="A"; //valid
		
		boolean bl = true; //false; //allows only true/false
		System.out.println(bl);
		
		//boolean bl="true"; //not valid
		//boolean bl="false"; //not valid
		
		//String bl=true; //not valid
		//String bl=false; //not valid
		
		//String bl="true"; //valid
		
	}

}
