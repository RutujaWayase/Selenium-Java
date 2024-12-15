package CodingQuestions;
import org.apache.commons.exec.util.StringUtils;
public class RemoveSpacesInString {
	public static void main(String[] args) {
		//String str = "Hello Geeks . Welcome ,    Do you  know, Geeks ";
		//System.out.println(str.replaceAll("\\s+", " ").trim());
	//	String newString = "    This  is my  java code    ";
		//trim () methods remove spaces at begining and ending of string
		//"\\s" removes spaces one by one
		//"\\s+" removes spaces together
		
		//String remString = StringUtils.deleteWhitespace(newString);
		//System.out.println(remString);
		
		
		//Without using inbuild functions
		//String newString = "    This  is my  java code    ";
		/* String newString = "Hi Automation Labs"
				+ "\n java course"
				+ "\n core java tutorials    "
				+ "\t spring boot course \t";
		System.out.println(newString);
		String noWhiteSpaceString = "";
		for(int i=0; i< newString.length(); i++) {
			if((newString.charAt(i)!=' ') && (newString.charAt(i)!='\t')) {
				noWhiteSpaceString = noWhiteSpaceString + newString.charAt(i);
				
			}
		}
		//System.out.println(noWhiteSpaceString); // O/P => Thisismyjavacode
		System.out.println(noWhiteSpaceString); // O/P => HiAutomationLabs
	                                            //javacourse
		                                        //corejavatutorialsspringbootcourse
      */
		
		//using split and StringBuffer
		String newString = "   Naveen Automation Labs"
				+ " testing "
				+ " python "
				+ " \n javascript \t";
		System.out.println(newString);
		String newArr[] = newString.split("\\s");
		StringBuffer remString = new StringBuffer();
		for(String e : newArr) {
			remString.append(e);
		}
		System.out.println(remString);
	}

}
