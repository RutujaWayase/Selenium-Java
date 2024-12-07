package CodingQuestions;

public class RemoveJunkSpecialCharString {
    public static void main(String[] args) {

        String str = "a2345ty6u7ikjyuhtgrfds@#$%^&*()yuiop";
        String str1 = "@#$%^&*()_sdfghjk#$%^dfghjk";

        String s=str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);

        str1=str1.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str1);

        
    }
    
}
