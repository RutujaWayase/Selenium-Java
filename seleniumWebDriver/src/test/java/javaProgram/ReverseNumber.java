package javaProgram;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		//1. Using algorithm
	/*
		int rev=0;
		while(num!=0) {
			rev=rev*10 + num%10; //0*10 + 1234%10=4
			num = num/10; //1234/10=123
		}
	*/	
		
		//Using StringBuffer class
		//StringBuffer rev;
	/*
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
	
	*/
		
		//Using StringBuilder class
		StringBuilder sb1 = new StringBuilder();
		sb1.append(num);
		StringBuilder rev = sb1.reverse();
		System.out.println("Reverse Number is: "+rev);
		
		
	}

}
