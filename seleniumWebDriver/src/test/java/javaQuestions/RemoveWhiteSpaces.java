package javaQuestions;

public class RemoveWhiteSpaces {
	
	public static void main(String[] args) {
		String str = "Java programming seenium automation";
		
		System.out.println("Before removing white spaces: "+str);
		
		str=str.replaceAll("\\s", "");
		System.out.println("After removing white spaces: "+str);
	}

}
