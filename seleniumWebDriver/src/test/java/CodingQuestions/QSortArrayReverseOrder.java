package CodingQuestions;

public class QSortArrayReverseOrder {
    public static void main(String[] args) {
        int arr[] = {56, 78, 9, 3, 1, 0, 5, 2};
        System.out.println("Array before sorting: "+ arr);
        //sorting logic
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int temp=0;
                //Assending order
                //if(arr[i]>arr[j]){
                //Descending order
                if(arr[i]<arr[j]){    
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
    
}
