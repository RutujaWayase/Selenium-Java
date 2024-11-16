package SeleniumInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusOfWebElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		
		//isDisplayed()   isEnabled()
		
		WebElement searchStore = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println("Display status: "+searchStore.isDisplayed()); //true
		System.out.print("Displayed status: "+searchStore.isEnabled());
		
		//isSelected()
		WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		//male.isSelected(); // true/false
		System.out.println(male.isSelected()); //false
		System.out.println(female.isSelected()); //false
		
		male.click();
		System.out.println(male.isSelected()); //false
		System.out.println(female.isSelected()); //false
		
		
		
		
	}

}
