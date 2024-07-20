package cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssLocator {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); //ctrl+shift+O => shortcut to import dependencies
		driver.manage().window().maximize(); //maximize the browser window
		
		driver.get("https://demo.nopcommerce.com/");
		
		//   driver.manage().window().maximize();
		
		//css selector: id -> tag#id
		//tag id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
		
		//css selector: classname -> tag.classname
		//tag classname
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Laptop");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Laptop"); 
		
		//css selector: attribute -> tag[attribute='value']
		//tag attribute
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Book);
		//driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("Book");
		
		//css selector: class attribute -> tag.class[attribute='value']
		//tag class attribute
		//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Book);
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("Book");
						
		
		
		
	}

}
