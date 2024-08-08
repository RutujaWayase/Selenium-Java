package questions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//JavaScript Alerts
		
	/*	
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//alert: OK
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		//alert: cancel
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		
		//alert: input box
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
		Alert alertwindow = driver.switchTo().alert();
		System.out.println("The message displayed on alert: "+ alertwindow.getText());
		
		alertwindow.sendKeys("Welcome");
		alertwindow.accept();
	*/
		
		//Authentication
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		//Syntax
		// http://admin:admin@the-internet.herokuapp.com/basic_auth
		// http://username:password@URL
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	
		//PermissionPopupNotification
	
	/*	
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.redbus.in/");
		
	*/
	}

}
