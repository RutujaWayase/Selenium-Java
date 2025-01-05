package CodingQuestions;

import java.util.HashMap;
import java.util.Map;

public class QPrintCountOfOccuranceOfRepeatedWordsString {
    public static void main(String[] args){
        String str = "hello how are what hello how are you";
        //split string into words
        String[] words = str.split("\\W+");
        //create a map to store word counts
        Map<String, Integer> wordCount = new HashMap<>();
        //loop through each word
        for(String word : words){
            //convert to Lowercase to ensure case-insensitivity
            word = word.toLowerCase();
            //if the word already exists in the map, increment its count
            wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
        }
        //print the word counts
        for(Map.Entry<String, Integer> entry : wordCount.entrySet()){
            System.err.println(entry.getKey()+" : "+entry.getValue());
        }
    }
    
}
