package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathLocator {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo-opencart.com/");
		
		//xpath with single attribute
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("TShirt");
		
		//xpath with multiple attributes
		driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Tshirts");
		
		//xpath with and operator
		driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("Tshirts");
		
		//xpath with or operator
		driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("tShirts");
		
		//xpath with inner text - text()
		//a[text()='Desktops']
		//a[text()='MacBook']
		//driver.findElement(By.xpath("//a[text()= 'MacBook']")).click();
		//driver.findElement(By.xpath("//*[text()= 'MacBook']")).click();
		
		boolean displaystatus = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		System.out.println(displaystatus);
		
		String value = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		System.out.println(value);
		
		//xpath with contains()
		driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Tshirts");
		
		//xpath with starts-with()
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Tshirt");
		
		//chained xpath
		boolean status = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		System.out.println(status);
		
	}

}
