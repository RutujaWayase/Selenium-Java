package CodingQuestions;

public class LaregestElementArray {
    public static void main(String[] args){
        int[] arr = {1, 3, 5, 6, 9};
        int largest = 0;
        for(int num:arr){
            if(num>largest){
                largest=num;
            }
        }
        System.out.println(largest);
    }
    
}
