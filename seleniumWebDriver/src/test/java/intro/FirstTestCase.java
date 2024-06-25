package intro;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/*
 Test case:
 1) Launch browser
 2) Open URL https://demo.opencart.com
 3) Validate title should be "Your Store"
 4) Close browser
 
 */
public class FirstTestCase {
	
	public static void main(String[] args) {
		//System.out.println("testing");
		
		//1) Launch browser (chrome)
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		//2) Open URL https://demo.opencart.com
		driver.get("https://demo.opencart.com/");
		
		//3) Validate title should be "Your Store"
		String actual_title= driver.getTitle();
		if(actual_title.equals("Your Store"));
		
		//4) Close browser
		
	}

}
