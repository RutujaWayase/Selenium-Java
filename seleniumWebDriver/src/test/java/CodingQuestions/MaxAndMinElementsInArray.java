package CodingQuestions;

public class MaxAndMinElementsInArray {
    public static void main(String[] args) {
        int a[] = {50, 30, 40, 20, 60};

        //maxium value
/* 
    int max= a[0];

    for(int i=1; i<a.length; i++){
        if(a[i]>max){
            max=a[i];
        }
    }
    System.out.println("Maximum Element in array is: "+max);
*/
   
  //minimum value
  int min=a[0];
  for(int i=1; i<=a.length-1; i++){
    if(a[i]<min){
        min=a[i];
    }
  }
  System.err.println("Minium Element in an array: "+min);





}



}
