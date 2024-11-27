package CodingQuestions;

public class SecondLargestElementArray {
    public static void main(String[] args){
        int[] array = {100, 20, 60, 80, 40};
        //Sort array in ascending order using nested loops
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        //After sorting, print the sorted array
        System.out.println("Sorted Array in Ascending order: ");
        for(int num:array){
            System.out.println(num + "");
        }

        //Access the second largest element for the sorted array
        System.out.println("\nSecond Largest Elemen: "+ array[array.length-2]);
    }
    
}
