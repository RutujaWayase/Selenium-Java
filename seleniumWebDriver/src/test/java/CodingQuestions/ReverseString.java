package CodingQuestions;

public class ReverseString {
    public static void main(String[] args){
        //1) Using + (string concatenation) operator
    
        String str = "Rutuja Wayase";
        String rev = "";

     /*   
        int len = str.length(); //13
        for(int i=len-1; i>=0; i--){ //12 11 ... -1
            rev = rev+str.charAt(i); //e s
        }
        System.out.println("Reversed String is: "+ rev);
     */  

        //2) Using character array
      /*   
        char a[] = str.toCharArray();
        int len = a.length; //13

        for(int i=len-1; i>=0; i--){
            rev = rev+a[i];
        }
        System.out.println("Reverse string is: "+ rev);
      */
      
       
       //3) Using String Buffer class
       StringBuffer sb = new StringBuffer(str);
       System.out.println(sb.reverse());

    }
    
}
