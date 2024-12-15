package interviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	public static void main(String[] args) {
		
	/*	
		//Methods:
		1) navigate.back()
        2) navigate.forward()
        3) navigate.refresh()
        4) navigate.to()
	*/
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		//driver.get("https://www.amazon.in/");
		
		driver.navigate().to("https://www.amazon.in/ ");
		
		driver.navigate().back();  //snapdeal
		driver.navigate().forward(); //amazon
		
		driver.navigate().refresh(); //refresh/reload the page
		
	}

}
