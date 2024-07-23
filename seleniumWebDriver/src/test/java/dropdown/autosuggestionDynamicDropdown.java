package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestionDynamicDropdown {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("selenium");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println("Searched Elements: ");
		/*
		   for(WebElement ele:list) {
		 
			System.out.println(ele.getText());
		}
		
		*/
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains(" tutorial")) {
				   list.get(i).click();
				   break;
		}
		}
		
			boolean tutorialStatus = driver.findElement(By.xpath("//h3[text()='Selenium Tutorial']")).isDisplayed();
		    System.out.println(tutorialStatus);
		    
		    driver.findElement(By.xpath("//h3[text()='Selenium Tutorial']")).click();
		    
		}
		
}


