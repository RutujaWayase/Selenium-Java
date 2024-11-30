package CodingQuestions;

public class UniqueWord {

    public static void main(String[] args) {
	    String str = "today is saturday saturday";
	    //String[] strArray = str.split("\s+");
	    printUniqueWords(str);
	    
	}
	   /* 
	    Map<String, String> hMap = new LinkedHashMap<String, String>();
	    for(int i=0; i<strArray.length; i++){
	        if(!hMap.containsKey(strArray[i])){
	            hMap.put(strArray[i], "Unique");
	        }
	        System.out.println(hMap);
	   */     
	   static void printUniqueWords(String str) {
	        int count;
	        String[] strArray = str.split("\\W");
	        for(int i=0; i<strArray.length; i++){
	            count=1;
	            for(int j=i+1; j<strArray.length; j++){
	                if(strArray[i].equalsIgnoreCase(strArray[j])){
	                    count++;
	                    strArray[j] = "";
	                }
	            }
	            if(count ==1 && strArray[i] != ""){
	                System.out.println(strArray[i]);
	            }
	        }
	    }
    
}

/*
 public class Main
{
	public static void main(String[] args) {
	    String str = "today is saturday saturday";
	    //String[] strArray = str.split("\s+");
	    printUniqueWords(str);
	    
	}
	   /* 
	    Map<String, String> hMap = new LinkedHashMap<String, String>();
	    for(int i=0; i<strArray.length; i++){
	        if(!hMap.containsKey(strArray[i])){
	            hMap.put(strArray[i], "Unique");
	        }
	        System.out.println(hMap);
	   */     
    /*   static void printUniqueWords(String str) {
        int count;
        String[] strArray = str.split("\\W");
        for(int i=0; i<strArray.length; i++){
            count=1;
            for(int j=i+1; j<strArray.length; j++){
                if(strArray[i].equalsIgnoreCase(strArray[j])){
                    count++;
                    strArray[j] = "";
                }
            }
            if(count ==1 && strArray[i] != ""){
                System.out.println(strArray[i]);
            }
        }
    }
    
}

    
    //today is saturday saturday
//	}
//}
 */