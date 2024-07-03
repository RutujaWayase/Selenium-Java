package CoreJava;

public class CoreJavaBrushUp {
	
	public static void main(String[] args) {
		int myNum = 5;
		String website = "Rahul Shetty Academy";
		char letter = 'r';
		double dec = 2.22;
		boolean value = true;
		
		System.out.println(myNum + ": is the value stored in myNum");
		System.out.println(website);
		
		
		//Arrays:
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int[] arr2 = {3,6, 9, 12};
		System.out.println(arr2[0]);
		
		//For loop
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		//array of strings
		String[] name = {"Mark", "John", "Gail"};
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		//Enhance for loop
		for(String s: name) {
			System.out.println(s);
		}
		
	
	}

}
