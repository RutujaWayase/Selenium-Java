package CodingQuestions;

/*
 * Input: a = 100, b= 200;
Output: a = 200, b= 100;
 */

public class PrgSwap2Numbers {
    public static void main(String[] args){
        int a=100, b=200;
        System.out.println("Before swapping a = "+a+" and b = "+b);
        //1)Swapping using third variable
        int temp =a; 
        a = b;
        b = temp;
        System.out.println("After swapping a = "+a+" and b = "+b);
        //2)Using Two Variables
        a = a+ b;
        b = a-b;
        a = a-b;
        System.out.println("After swapping a = "+a+" and b = "+b);
        //3)Swapping a and b using XOR
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("Before swapping a = "+a+" and b = "+b);
    }
    
}
