package CodingQuestions;

import java.util.HashMap;

public class MaxRepeatedChar {
    public static void main(String[] args) {
		String str = "stress";
		System.out.println("Repeated char: "+ maxOccur(str));
	}
	static char maxOccur(String str) {
	    HashMap<Character, Integer> input = new HashMap<>();
	    int n = str.length();
	    char output = 0;
	    int count = 0;
	    for(int i=0; i< n; i++){
	        char c = str.charAt(i);
	        input.put(c, input.getOrDefault(c, 0) + 1);
	        
	        if(count < input.get(c)){
	            output = c;
	            count = input.get(c);
	        }
	    }
	    return output;
	}
    
}

/*
 import java.util.*;

public class Main
{
	public static void main(String[] args) {
		String str = "stress";
		System.out.println("Repeated char: "+ maxOccur(str));
	}
	static char maxOccur(String str) {
	    HashMap<Character, Integer> input = new HashMap<>();
	    int n = str.length();
	    char output = 0;
	    int count = 0;
	    for(int i=0; i< n; i++){
	        char c = str.charAt(i);
	        input.put(c, input.getOrDefault(c, 0) + 1);
	        
	        if(count < input.get(c)){
	            output = c;
	            count = input.get(c);
	        }
	    }
	    return output;
	}
}
 */