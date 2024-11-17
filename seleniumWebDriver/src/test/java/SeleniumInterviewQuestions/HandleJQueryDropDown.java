package SeleniumInterviewQuestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleJQueryDropDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("justAnInputBox")).click();
		//creating generic methods
		//selectChoiceValues(driver, "");
		selectChoiceValues(driver, "choice1", "choice2", "choice 2 1");
		
		//for selecting all the choices use: all
		selectChoiceValues(driver, "all");
		
		selectChoiceValues(driver, "choice 1");
	}

	//String... => is a method in java where String can have one or multiple value of same data type
	public static void selectChoiceValues(WebDriver driver, String... value) {
		List<WebElement> choiceList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
		if(!value[0].equalsIgnoreCase("all")) {
			for(WebElement item:choiceList) {
				String text = item.getText();
				for(String val:value) {
					if(text.equals(val)) {
						item.click();
						break;
					}
					
				}
			}
		}
		else {
			try {
				for(WebElement item:choiceList) {
					item.click();
					
				}
			}
			catch(Exception e) {
				
			}
		}
	}

}

