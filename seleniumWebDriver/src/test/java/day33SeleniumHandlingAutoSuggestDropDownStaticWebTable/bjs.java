package day33SeleniumHandlingAutoSuggestDropDownStaticWebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bjs {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bjs.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("se");
		Thread.sleep(5000);
		List<WebElement> lists = driver.findElements(By.xpath("//div[@data-cnstrc-item-section='Search Suggestions']//div"));
		System.out.println(lists.size());
		
		for(int i=0; i<lists.size(); i++) {
			System.out.println(lists.get(i).getText());
			if(lists.get(i).getText().equals("seltzer")) {
				lists.get(i).click();
				Thread.sleep(5000);
				break;
			}
		}
		
	}

}
