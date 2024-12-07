package CodingQuestions;

public class QPalindromeString {
    public static void main(String[] args) {
        //String str = "Rutuja Wayase";
        String str = "civic";
        String org_str = str;
        String rev= "";
        int len = str.length();
        for(int i=len-1; i>=0;i--){
            rev = rev + str.charAt(i);
        }
        if(org_str.equals(rev)){
            System.err.println(org_str+ " is a Palindrome Sting");
        }else{
            System.out.println(org_str+" is not a Palindrome String");
        }
    }
    
}

