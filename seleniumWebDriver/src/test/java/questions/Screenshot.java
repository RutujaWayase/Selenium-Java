package questions;

import java.awt.Dimension;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(1552,840));
		
		File screenshot = ((TakeScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new file("D:\\Automation\\Selenium BDD\\Selenium-Java\\seleniumWebDriver\\src\\test\\java\\questions\\screnshot"));
	}

}
