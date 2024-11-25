package CodingQuestions;

public class PalindromeString {
    public static void main(String[] args) {
        //Palindrome String => A palindrome string is a String that remains the same when characters are reversed. Like MADAM
    /* 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
    */  
        String str = "Rutuja Wayase";
        //String str = sc.next();
       String org_str = str;
        String rev = "";

        int len = str.length();

        for(int i=len-1; i>=0; i--){
            rev = rev+str.charAt(i);
        }

        if(org_str.equals(rev)){
            System.out.println(org_str + " is a Palindrome String");
        } else{
            System.out.println(org_str + " is not a Palindrome String");
        }
    }
    
}
