package SeleniumInterviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		//driver.get("https://www.amazon.in/");
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.navigate().back(); //back
		driver.navigate().forward(); //forward
		driver.navigate().refresh(); //refresh/reload the page
		
	}

}
