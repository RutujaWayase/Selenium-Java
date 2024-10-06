package day37SeleniumJavascriptExecutorScrollingPagesUploadFiles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("John"); ////input[@placeholder='Enter Name']
		WebElement inputbox = driver.findElement(By.xpath("//input[@id='name']"));
		
		//upcasting: storing child class object in parent class, i.e. here we are storing ChromeDriver object to javaScriptExecutor object.
		
		//passing the text into inputbox - alternate of sendkeys() 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//JavascriptExecutor js = driver;
		js.executeScript("arguments[0].setAttribute('value','John')", inputbox);
		
		//clicking on element - alternate of click()
		WebElement radiobtn = driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()", radiobtn);
		
	}

}
