package CodingQuestions;

/*
 * Armstrong number is a number that is equal to the sum of cubes of its digits.
Input: 153 , Output: Yes
153 is an Armstrong number. ==> (1*1*1) + (5*5*5) + (3*3*3) = 153
 */

public class PrgArmstrongNumber {
    public static void main(String[] args) {
        int sum =0, res, temp;
        int num = 153; //It is the number to check Armstrong
        temp = num;
        while(num>0){
            res = num % 10;
            num = num / 10;
            sum = sum + (res * res * res);
        }
        if(temp == sum){
            System.err.println(temp+" is armstrong number");
        }else{
            System.err.println(temp+" is not armstrong number");
        }
    }
    
}
