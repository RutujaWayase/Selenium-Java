package CodingQuestions;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){

        //taking input from user at run time
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = sc.nextInt();

        //1) Using algorithm
       /* 
        int rev=0;
        while(num!=0){
            rev=rev*10 + num%10; //0+1234%10=4 40+3=43 430+2=432 4320+1=4321 
            num=num/10; //1234/10=123 123/10=12 12/10=1 1/10=0
        }
        System.out.println("Reverse Number is: "+ rev);
       */ 

        //2) Using StringBuffer class
        //StringBuffer rev;
       /*  
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();

        System.out.println("Reverse number is: "+rev);
       */ 

        //3) Using StringBuilder class

        StringBuilder sb1 = new StringBuilder();
        sb1.append(num);
        StringBuilder rev = sb1.reverse();
        System.err.println("Reverse Number is: "+ rev);

    }
    
}
