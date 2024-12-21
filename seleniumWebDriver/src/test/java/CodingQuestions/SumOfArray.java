package CodingQuestions;

public class SumOfArray {
    public static void main(String[] args){
        //initialize array
        int[] arr = new int[] {1, 2, 3, 4, 5, 6};
        int sum = 0;
        //loop to caluclate sum
       /*  for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }  
            //using enhanced/advanced for loop
            for (int number: arr) {
            sum += number;
        }
        
        System.out.println("Sum of all the elements of array:"+ sum);
       */ 

        //Using enhanced for loop
        // an array of numbers
        int[] numbers = {3, 4, 5, -5, 0, 12};
       // int sum = 0;
        
        // iterating through each element of the array 
        for (int number: numbers) {
            sum += number;
        }
        System.out.println("Sum = " + sum);
    }
    
    }
 
    
//}
