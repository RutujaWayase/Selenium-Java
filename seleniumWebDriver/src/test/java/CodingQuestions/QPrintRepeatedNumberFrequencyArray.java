package CodingQuestions;

import java.util.HashMap;
import java.util.Map;

public class QPrintRepeatedNumberFrequencyArray {
    public static void main(String[] args) {

        //Method 1:  (using counter array)
    /* 
        int a[] = {1,6,4,6,4,8,2,4,1,1, 2 , 5, 8, 0, 9, 10, 10};
        int max = Integer.MIN_VALUE;

        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
        }

        int b[] = new int[max+1];
        for(int i=0; i<a.length; i++){
            //increment in array b for every integer
            //in a
            b[a[i]]++;
        }
        for(int i=0; i<=max; i++){
            //output only if element is more than
            //1 time in array a
            if(b[i]>1){
                System.out.println(i+"-"+b[i]);
            }
        }
    */
    
    //Method 2: (Using HashMap)
    /* 
    int[] a = {1,6,4,6,4,8,2,4,1,1, 2 , 5, 8, 0, 9, 10, 10};
    int n = a.length; // size of array
    //using Hashmap
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=0; i<n; i++){
        if(map.containsKey(a[i])){
            //if element is already present in map then increase the value of element at index of 1
            int c = map.get(a[i]);
            map.replace(a[i], c+1);
        }

        //if element is not in map than assign it by 1
        else{
            map.put(a[i], i);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            //print only if count of element is greater than 1
            if(entry.getValue() > 1){
                System.out.println(entry.getKey()+" : "+ entry.getValue());
            }else{
                continue;  
            }
        }
      }       
    */
    
    // Java program to maintain 
// the count of each element 
// by using map. 
//import java.util.*; 

//class GFG { 

	//public static void main(String[] args) 
	//{ 

		int[] a = { 1, 6, 4, 6, 4, 8, 2, 4, 1, 1 }; 
		int n = a.length; // size of array 

		HashMap<Integer, Integer> map = new HashMap<>(); 
		for (int i = 0; i < n; i++) { 

			if (map.containsKey(a[i])) { 

				// if element is already in map 
				// then increase the value of element at 
				// index by 1 

				int c = map.get(a[i]); 
				map.replace(a[i], c + 1); 
			} 

			// if element is not in map than assign it by 1. 
			else
				map.put(a[i], 1); 
		} 
		for (Map.Entry<Integer, Integer> i : 
			map.entrySet()) { 

			// print only if count of element is greater 
			// than 1. 
			if (i.getValue() > 1) 
				System.out.println(i.getKey() + " "
								+ i.getValue()); 

			else
				continue; 
		} 
	} 
}

  //  }
    
//}
