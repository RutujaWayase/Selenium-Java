package interviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckWebElement {
	public static void main(String[] args) {
	/*	
		//Methods:
		1) isDisplayed()
        2) isEnabled()
        3) isSelected()
    */
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		//isDisplayed() isEnabled()
		WebElement searchStore = driver.findElement(By.id("small-searchterms"));
		
		System.out.println("Display status: "+ searchStore.isDisplayed());
		System.out.println("Enabled status: "+ searchStore.isEnabled());
		
		//isSelected - radio button, checkboxes, dropdown
		WebElement register = driver.findElement(By.linkText("Register"));
		register.click();
		
		
		WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		male.click(); //select radio button
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		male.clear();
		female.click();
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		
		
		
	}

}
