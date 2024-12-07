package CodingQuestions;

import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int a =sc.nextInt();

        System.out.println("Enter Second Number:");
        int b =sc.nextInt();

        System.out.println("Enter Third Number:");
        int c =sc.nextInt();

        //Approach 1 -Logic
    /* 
        if(a>b && a>c){
            System.out.println(a+" is largest Number");
        }else if(b>a && b>c){
            System.out.println(b+ " is a largest number");
        }else{
            System.out.println(c+" is a largest number");
        }
    */    


        //Ternary operator
        int largest=a>b?a:b; //largest of a & b
        int largest_number=c>largest?c:largest; //largest of c & largest(a&b)

        int largest1 = c> (a>b?a:b) ? c: (a>b?a:b);
        System.out.println(largest_number+ "is largest number");
        System.out.println(largest1+" is the largest no here");



    }
    
}
