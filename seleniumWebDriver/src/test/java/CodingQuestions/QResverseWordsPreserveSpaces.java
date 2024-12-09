package CodingQuestions;

public class QResverseWordsPreserveSpaces {

    //Java program for Input:  Welcome to  Java. Output should be:  Java to  Welcome
    //Approach 1
    //Using Build in functions => StringBuilder

     
        public static void main(String[] args) {
            // Input string
            String input = "Welcome to Java.";
    
            // Split the input string into words using space as delimiter
            String[] words = input.split(" ");
    
            // Create a new StringBuilder to hold the output
            StringBuilder reversed = new StringBuilder();
    
            // Loop through the words array in reverse order and append each word
            for (int i = words.length - 1; i >= 0; i--) {
                reversed.append(words[i]);
                if (i != 0) {
                    reversed.append(" "); // Add a space between words
                }
            }
    
            // Print the reversed string
            System.out.println(reversed.toString());
        }
    
      
    
    //////////////////////////// Output Wrong ///////////////////////////

        //Approach 2
        //Without Using Build In Functions
    /*     
        public static void main(String[] args) {
            // Input string
            String input = "Welcome to Java.";
    
            // Variable to store the result
            String output = "";
    
            // Temporary string to store each word
            String word = "";
    
            // Traverse the input string from the end to start
            for (int i = input.length() - 1; i >= 0; i--) {
                // Check if we encounter a space or start of the string
                if (input.charAt(i) == ' ' || i == 0) {
                    // If it's the start of the string, add the first word to output
                    if (i == 0) {
                        word = input.charAt(i) + word;
                    }
                    
                    // Add the word to the output
                    output = word + " " + output;
    
                    // Reset the word for the next iteration
                    word = "";
                } else {
                    // Build the word by adding characters to the front
                    word = input.charAt(i) + word;
                }
            }
    
            // Print the result
            System.out.println(output.trim());
        }
    */

    ////////////////////////////////////////////////////////////////////////////
    
    ///////// Preserve space and reverse /////////////////
    /* 
    public class Main
{
	public static void main(String[] args) {
		String str = " this is   work";
		reverse(str);
		
		
	}
	static void reverse(String str){
	    char[] input = str.toCharArray();
	    char[] output = new char[input.length];
	    int j = output.length-1;
	    
	    for(int i=0; i<input.length; i++){
	        if(input[i] == ' '){
	            output[i] = ' ';
	        }
	    }
	    
	    for(int i=0; i<input.length; i++){
	        if(input[i] != ' '){
	            if(output[j] == ' '){
	                j--;
	            }
	            output[j] = input[i];
	            j--;
	        }
	    }
	    System.out.println(output);
	    
	    
	    
	    
	}
}
    */
}
    
