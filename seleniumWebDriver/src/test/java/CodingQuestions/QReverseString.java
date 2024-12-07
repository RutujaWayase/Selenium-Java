package CodingQuestions;

public class QReverseString {
    public static void main(String[] args) {
        String str = "Rutuja Wayase";
        String rev = " ";
        char ch;
        for(int i=0; i<str.length(); i++){
            //extract each charachter
            ch = str.charAt(i);
            //add each character in 
            rev = ch+rev;
        }
        System.out.println(rev);

    }
    
}
