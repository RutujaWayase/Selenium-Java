package CodingQuestions;

public class CountCharacterOccurence {
    public static void main(String[] args){
        String str = "Java is object oriented language";
        int result = str.length() - str.replaceAll("a","").length();
        System.out.println(result);
    }
    
}
