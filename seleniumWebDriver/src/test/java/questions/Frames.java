package questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	public static void main(String[] args) {
	//	WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
	
		//Frames
	/*	
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		
		//1) Switch to frame
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//a[normalize-space() = 'org.openqa.selenium']")).click();
		driver.switchTo().defaultContent();
	*/	
		//IFrames
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
		
		WebElement outerframe = driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']"));
		driver.switchTo().frame(outerframe);
		
		//WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		WebElement innerframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(innerframe);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome");
		
		//switchTo().parentFrame() - concept to switch back 
		
		
	}

}
