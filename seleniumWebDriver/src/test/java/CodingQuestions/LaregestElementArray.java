package CodingQuestions;

public class LaregestElementArray {
    public static void main(String[] args){
        //int[] arr = {8, 1, 3, 5, 6, 9};
        int arr[] = {32,45,6,87,12,1};
        int n = arr.length;
        System.out.println("Original array: ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+"");
        }
        int largest = 0;
        int temp = 0;

        //Sort the provided array

        //int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        //Print sorted array

        System.out.println("Sorted array: ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+"");
        }

        //Find largest element of an array

        for(int num:arr){
            if(num>largest){
                largest=num;
            }
        }
        System.out.println("Largest element is: "+largest);
    }
    
    
}
