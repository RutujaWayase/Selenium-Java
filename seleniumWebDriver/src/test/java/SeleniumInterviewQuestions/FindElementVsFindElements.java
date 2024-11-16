package SeleniumInterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementVsFindElements {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		//findElement() => Return the Single WebElement
		
		//1
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		searchbox.sendKeys("XYZ");
		
		//2
		WebElement ele = driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(ele.getText());
		
		//3 NoSuchElement Exception
		WebElement searchButton = driver.findElement(By.xpath("//button[normalize-space()='Login']")); // no such element present on page
		
		
		//findElements => Returns multiple web elements
		
		//1
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println("Number of elements captured: "+ links.size()); //22
		
		//to get each and every webelement
		
		for(WebElement elements:links) {
			System.out.println(elements.getText());
		}
		
		//2
		List<WebElement> logo= driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(logo.size());
		
		//3 when no element is present it will return zero
		List<WebElement> elementsnotpresent = driver.findElements(By.xpath("//img[contains(title, 'Electronics')]"));
		System.out.println(elementsnotpresent.size()); //0
		
		
	}

}
