package CoreJava;

import java.util.ArrayList;

public class loop {
	public static void main(String[] args) {
		int[] arr2 = {1,2, 3, 4, 5, 6, 7, 8};
		//2,4,6,8 //Check array is multiple of 2
		for(int i=0; i<arr2.length; i++) {
			if(arr2[i]%2==0) {
				System.out.println(arr2[i]);
			}
			else {
				System.out.println(arr2[i] + ": is not multiple of 2");
			}
		}
		
		//ArrayList
		ArrayList<String> a = new ArrayList<String>();
		a.add("John");
		a.add("Mark");
		a.add("Cypress");
		a.add("Selenium");
		System.out.println(a.get(3));
		
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println("*******");
		
		for(String val : a) {
			System.out.println(val);
		}
	}

}

