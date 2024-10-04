package day31SeleniumDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenDropDown {
	public static void main(String[] args) throws InterruptedException {
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
		
		//clicked on dropdown
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div/div[2]/i")).click();
		Thread.sleep(5000);
		
		//select single option
		//Ex: "//span[normalize-space()='Financial Analyst']"
		driver.findElement(By.xpath("//div[normalize-space()='My Job Title 7962230']")).click(); ////div[normalize-space()='My Job Title 7962230']
		
		//count number of options
		List<WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		
		System.out.println("no. of options: "+ options.size()); //29
		
		
		//printing options
		
		for(WebElement op:options) {
			System.out.println(op.getText());
		}
	}

}
