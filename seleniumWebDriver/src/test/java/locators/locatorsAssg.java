package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//https://www.demoblaze.com/
//https://www.demoblaze.com/index.html

public class locatorsAssg {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		
		//links
		List<WebElement> links = driver.findElements(By.className("nav-item"));
		System.out.println("Total number of links: "+ links.size());
		
		//images
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images: "+images.size());
		
		Thread.sleep(1500);
		
		//product linktext or partialtext
		driver.findElement(By.linkText("Samsung galaxy s6")).click();
		Thread.sleep(1500);
		driver.findElement(By.linkText("Add to cart")).isDisplayed();
		
	}

}
