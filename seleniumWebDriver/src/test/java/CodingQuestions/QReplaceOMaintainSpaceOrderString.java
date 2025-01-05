package CodingQuestions;

public class QReplaceOMaintainSpaceOrderString {
    public static void main(String[] args) {
        String input = "hello world hello hello java world";
        //convert the string to character array (since strings in Java are immutable)
        char[] charArray = input.toCharArray();
        //iterate through the character array
        for(int i=0; i<charArray.length; i++){
            //if the charachter is 'o', replace it with the desired character (eg.: 'x')
            if(charArray[i]=='o'){
                charArray[i] = '\0'; //Replace 'o' with empty
            }
        }
        //convert the modified array back to a string and print the result
        String result = new String(charArray);
        System.err.println(result);
    }
    
}
