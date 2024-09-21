package questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFrame {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("URL");
		
		WebElement iframeElement = driver.findElement(By.id("iFrameResult"));
		driver.switchTo().frame(0);
		driver.switchTo().defaultContent();
		driver.quit();
		
	}

}
