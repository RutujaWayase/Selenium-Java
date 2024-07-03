package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {
	
	public static void main(String[] args) {
		//Invoking browser
		//Chrome: ChromeDriver -> Methods
		//Firefox: FirefoxDriver -> Methods
		//Safari: SafariDriver -> Methods
		//WebDriver is an Interface
		//WebDriver methods + class methods
/*		ChromeDriver driver = new ChromeDriver();
		driver.resetInputState();
*/		
		
		
		// Chromedriver.exe -> Chrome browser Selenium Manager
		// step to invoke chrome driver //
		//System.out.println("webdriver.chrome.driver", "D:/Automation/Selenium BDD/Drivers/chromedriver-win64");
		//Webdriver.chrome.driver -> value of path
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		//Lock the output 
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit();
	}

}
