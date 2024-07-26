package javaQuestions;

public class RemoveJunkSpecialCharString {
	
	public static void main(String[] args) {
		String s= "A2#@5$&*(*%#@! latin string 12345678";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
