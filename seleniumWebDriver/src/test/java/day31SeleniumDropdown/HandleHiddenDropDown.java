package day31SeleniumDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenDropDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
		driver.manage().window().maximize();
		
		
		//Login steps
		driver.findElement(By.name("username")).sendKeys("Admin"); ////input[@name="username"]
		driver.findElement(By.name("password")).sendKeys("admin123");
		////button[@type='submit']
		
		////label[normalize-space(text()) = 'some label']
		
		//button[normalize-space() = 'Login'] ; Ex: //button[normalize-space()='Login']
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//clicking on PIM
		driver.findElement(By.xpath("//span[normalize-space()='PIM']"));
		
	}

}
