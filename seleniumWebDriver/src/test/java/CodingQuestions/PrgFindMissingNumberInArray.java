package CodingQuestions;

/*
 *  Approach
 1. Calculate 
A = n (n+1)/2 where n is largest number in series 1…N.
 2. Calculate B = Sum of all numbers in given series
 3. Missing number = A – B
 */

public class PrgFindMissingNumberInArray {
    public static void main(String[] args) {
        int total;
        int[] number = new int[]{1, 2, 3, 4, 6, 7};
        total = 7;
        int expected_sum = total*((total+1)/2);
        int num_sum = 0;
        for(int i: number){
            num_sum += i;
        }
        System.out.println(expected_sum-num_sum);
    }
    
}
