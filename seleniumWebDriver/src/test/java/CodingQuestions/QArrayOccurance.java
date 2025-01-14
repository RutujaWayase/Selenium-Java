/* 
public import java.util.*;

class Main {
    public static void occurance(int[] arr){
        int oddCount = 0;
        Map<Integer, Integer> numbercount = new HashMap<>();
        
        for(int num : arr){
            numbercount.put(num, numbercount.getOrDefault(num, 0)+1);
            
            if(num %2 !=0){
                oddCount++;
            }
        }
        System.out.println(oddCount);
        System.out.println("Occurance");
        for(Map.Entry<Integer, Integer> entry : numbercount.entrySet()){
            if(entry.getKey()%2 != 0){
            
            System.out.println(entry.getKey()+ " = "+ entry.getValue());
            }
        }
    }
    
    
    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3, 4, 4, 5, 6, 7, 7, 5};
        occurance(numbers);
        
    }
} 

/*QArrayOccurance {
    
}
*/


/* 
// o/P =>
6
Occurance
1 = 1
3 = 1
5 = 2
7 = 2
*/