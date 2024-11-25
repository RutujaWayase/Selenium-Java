package CodingQuestions;

public class Swap {
    public static void main(String[] args){
        int a =10, b=20;
        System.out.println("Before swapping values are: "+ a+ " "+b);

        //Logic 1 - Third variable
      /* 
        int t=a;
        a=b;
        b=t;
        System.out.println("After swapping values are: "+ a+ " "+b);
      */ 

        //Logic 2 - using addition and subtraction + and - operator without using third variable
      /* 
        a=a+b; //10+20=30
        b=a-b; //30-20=10
        a=a-b; //30-10=20
        System.out.println("After swapping values are: "+ a+ " "+b);
      */  

        //Logic 3 - using multiplication and division * and / operator without using third variable
        //here a & b values should not be zero
        // a=a*b; //10*20=200
        // b=a/b; //200/20=10
        // a=a/b; //200/10=20

        // System.out.println("After swapping values are: "+ a+ " "+b);

        //Logic 4 - bitwise XOR (^)
       /* 
        a=a^b; //10^20=30
        b=a^b; //30^20=10
        a=a^b; //30^10=20

        System.out.println("After swapping values are: "+ a+ " "+b);
       */ 

        //Logic 5 - Single statement
        b=a+b-(a=b); //10+20-(20) =10

        System.out.println("After swapping values are: "+ a+ " "+b);







    }
    
}
