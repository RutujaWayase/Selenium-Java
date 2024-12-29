package CodingQuestions;

/*
 *  Approach
 1. Define a string.
 2. Convert the string into lowercase to make the comparison insensitive.
 3. Split the string into words.
 4. Two loops will be used to find duplicate words. Outer loop will select a word and 
Initialize variable count to 1. Inner loop will compare the word selected by outer 
loop with rest of the words.
 5. If a match found, then increment the count by 1 and set the duplicates of word to 
'0' to avoid counting it again.
 6. After the inner loop, if count of a word is greater than 1 which signifies that the 
word has duplicates in the string.
 */

public class PrgFindDuplicateWordsInString {
    public static void main(String[] args){
        String str = "Big black bug bit a big black dog on his big black nose";
        int count;
        //Convert string into lowercase
        str = str.toLowerCase();
        //Split string into words using build-in function
        String words[] = str.split(" ");
        System.out.println("Duplicate words in a given string: ");
        for(int i=0; i<words.length; i++){
            count =1;
            for(int j=i+1; j<words.length; j++){
                if(words[i].equals(words[j])){
                    count++;
                    //Set words[j] to 0 to avoid printing visited word
                    words[j] = "0";
                }
            }
            //Displays the Duplicate word if count is greater than 1
            if(count>1 && words[i]!="0"){
                System.err.println(words[i]);
            }
        }


    }
    
}
