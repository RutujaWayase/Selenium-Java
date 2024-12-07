package CodingQuestions;

public class ReverseEachWordString { 
    public static void main(String[] args) {

        //Approach 1

    /*     
        String str = "Welcome to Java"; //Original String

        String[] words = str.split(" "); //Splitting string into words

        String reverseString = "";
        for(String w:words){ //Welcome To Java
            String reverseword = "";
            for(int i=w.length()-1; i>=0; i--){ //Welcome To Java
                reverseword = reverseword + w.charAt(i); 
            }
            reverseString = reverseString+reverseword+" "; //emoclew oT avaJ
        }
        System.out.println("Reverse words in a String: "+ reverseString);
    */

    //Approach2

    String str = "Welcome To Java";
    String[] words = str.split("\\s");

    String reverseword=""; //Java
    for(String w:words){
        StringBuilder sb = new StringBuilder(w);
        sb.reverse(); //avaJ

        reverseword = reverseword + sb.toString()+ " "; //emocleW oT avaJ
    }
    System.out.println(reverseword);



    }
    
}
