package locators;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Intro {
	
	public static void main(String[] args) {
		
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://demo.opencart.com/");
		driver.get("https://demo-opencart.com/");
		//driver.get("https://google.com");
		String act_title=driver.getTitle();
		
		if(act_title.equals("Your Store")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		//driver.close();
		//driver.quit();
		
	}

}
