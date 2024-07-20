package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsDemo {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://demo.opencart.com/");
		driver.get("https://demo-opencart.com/");
		driver.manage().window().maximize();
		
		//name
		driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id
		boolean logoDisplayedStatus=driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(logoDisplayedStatus);
		
		//linktext & partiallinkText
		//driver.findElement(By.linkText("Tablets")).click();
		driver.findElement(By.partialLinkText("Table")).click();
		
		//classname
		//for multiple elements
		List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
		//headerLinks.size();
		System.out.println("total number of header links: "+ headerLinks.size()); 
		
		//tagname
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: "+links.size());
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images: "+images.size());
		
	}

}
