package javaProgram;

public class CountNumberEvenOdd {
	public static void main(String[] args) {
		int num=123456790; //1234;
		int evn_count=0;
		int odd_count=0;
		while(num>0) { //1234 123 12 1 0
			int rem=num%10; //4 3 2 1
			if(rem%2==0) {
				evn_count++; //1 2
			}
			else {
				odd_count++; //1 2
			}
			num=num/10; //123 12 1 0
		}
		System.out.println("Number of Even numbers: "+evn_count);
		System.out.println("Number of Odd numbers: "+odd_count);
	}

}
