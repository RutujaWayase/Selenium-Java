package CodingQuestions;

import java.util.Arrays;

public class TwoStringsANAGRAM {
    public static void main(String[] args){
        //ANAGRAM means length and charachters of string/words are same
        String str1 = "stop";
        //String str2 = "tops";
        //String str2 = "map";
        //String str2 = "tophill";
        //String str2 = "maps";
        String str2 = "stoo";

        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)){
            System.out.println("Given strings are anagram");
        }else{
            System.out.println("Given strings are not anagram");
        }
    }
    
}
