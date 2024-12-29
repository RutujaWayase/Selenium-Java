package CodingQuestions;

/*
 *  Approach
 1. Append second string to first string and store in first string: 
a = a + b
 2. call the method substring(int beginindex, int endindex) 
by passing beginindex as 0 and endindex as, 
a.length() - b.length(): 
b = substring(0,a.length()-b.length());
 3. call the method substring(int beginindex) by passing 
b.length() as argument to store the value of initial 
b string in a 
a = substring(b.length());
 */

public class PrgSwap2StringVariablesWithoutTempVariable {
    public static void main(String[] args) {
        
        //Declare two strings
        String a = "Hello";
        String b = "World";
        //Print string before swapping
        System.out.println("String before swap: a = "+a+" and b = "+b);
        //append 2nd string to 1st string
        a = a+b;
        //store initial string a in string b;
        b = a.substring(0, a.length() - b.length());
        //store initial string b in string a
        a = a.substring(b.length());
        //print String after swapping
        System.err.println("String after swapping: a = "+a+" and b = "+b);
    }
    
}
