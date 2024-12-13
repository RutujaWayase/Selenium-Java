package SeleniumInterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("wheat");
		
		//Collect list of items
		List<WebElement> vegs = driver.findElements(By.xpath(""));

	}

}
