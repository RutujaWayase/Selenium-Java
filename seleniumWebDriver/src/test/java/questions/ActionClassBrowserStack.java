package questions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassBrowserStack {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
	/*	
		//click action: moveToElement()
		WebElement element = driver.findElement(By.linkText("Get started free"));
		
		action.moveToElement(element).click().perform();
	*/
		
		//Mouse Hover action: 
		WebElement live = driver.findElement(By.cssSelector("div.product-section__content-wrapper a[title='Live']"));
		action.moveToElement(live).build().perform();
		
		Thread.sleep(3000);
		
		WebElement automate = driver.findElement(By.cssSelector("div.product-section__content-wrapper a[title='Automate']"));
		automate.click();
		
		//Double Click action: doubleClick()
		WebElement trial = driver.findElement(By.xpath("//a[@title='Free Trial']"));
		trial.click();
		
		
		
		
	}

}
