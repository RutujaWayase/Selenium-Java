package CodingQuestions;


public class QReverseWordsInString {
   
	public static void main(String[] args) {
		String str = "my name is rutuja";
		String[] words = str.split(" ");
		String reverse = "";
		for(String output:words){
		    String reverseword = "";
		    for(int i=output.length()-1; i>=0; i--){
		        reverseword = reverseword + output.charAt(i);
		    }
		    reverse = reverse + reverseword+ " ";
		}
		System.out.println("Output is: "+ reverse);
	}
}
