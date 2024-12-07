package CodingQuestions;

public class SumOfElementsArray {
    public static void main(String[] args) {
        int a[] = {5, 3, 2, 9, 8};
        int sum=0;

        //normal for loop
        /* 
        for(int i=0; i<=a.length-1; i++){
            sum = sum +a[i];
        }
        */

        //enhance for loop
        for(int value:a){
            sum=sum+value;
        }


        System.out.println("Sum of Array elements: "+sum);
         
    }
    
}
