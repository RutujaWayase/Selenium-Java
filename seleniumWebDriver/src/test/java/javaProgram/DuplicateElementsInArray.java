package javaProgram;

import java.util.HashSet;

public class DuplicateElementsInArray {
	public static void main(String[] args) {
	//	String arr[] = {"java", "c", "c++", "python", "java"};
		
		//Approach 1
	/*	boolean flag = false;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Found Duplicate Element: "+arr[i]);
					flag=true;
				}
			}
		}
		if(flag==false) {
			System.out.println("Duplicate Element not found");
		}
		
	}
  */
		//Approach 2: HashSet
		String arr[] = {"java", "c", "c++", "python", "java"};
		HashSet <String>langs=new HashSet();
		boolean flag=false;
		for(String l:arr) {
			if(langs.add(l)==false) {
				System.out.println("Found Duplicate Element: "+l);
				flag=true;
			}
			}
		if(flag==false) {
			System.out.println("Duplicate Element not Found");
		}
		}
		

}
