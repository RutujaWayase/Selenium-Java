package day21SeleniumIntroduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Test case
1) Launch browser (chrome)
2) Open URL https://demo.opencart.com/
3) Validate title should be "Your Store"
4) Close browser
*/

public class FirstTestCase {
	public static void main(String[] args) throws InterruptedException {
		//1)Launch browser (chrome)
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDrive();
		
		//driver.wait(5000);
		//2) Open URL https://demo.opencart.com/
		driver.get("https://demo.opencart.com/");
		
		
		//3) Validate title should be "Your Store"
		String act_title = driver.getTitle();
		
		if(act_title.equals("Your Store")) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		
		//4) Close browser
		driver.close();
		//driver.quit();
	}

}
