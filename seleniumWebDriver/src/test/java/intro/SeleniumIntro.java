package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
		//System.setProperty("webdriver.chrome.driver", "D:/Automation/Selenium BDD/Drivers/chromedriver-win64");
		//Webdriver.chrome.driver -> value of path
		WebDriver driver = new ChromeDriver();
		
		//Firefox launch -> GekoDriver
		//System.setProperty("webdriver.geko.driver", "D:/Automation/Selenium BDD/Drivers/geckodriver-v0.34.0-win-aarch64.exe");
		WebDriver driver1 = new FirefoxDriver();
		
		//Edge launch -> EdgeDriver
		//System.setProperty("webdriver.edge.driver", "D:/Automation/Selenium BDD/Drivers/edgedriver_win64");
		WebDriver driver2 = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/");
		//Lock the output 
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit();
	}

}
