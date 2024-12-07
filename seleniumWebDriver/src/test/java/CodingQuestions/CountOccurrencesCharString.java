package CodingQuestions;

public class CountOccurrencesCharString {
    public static void main(String[] args) {
        String s = "java Programming Java oops";
        int totalcount = s.length();
        int totalcount_afterRemove = s.replace("a", "").length();
        int count = totalcount - totalcount_afterRemove;
        System.out.println("Number of occurance of a is: "+count);
    }
    
}
