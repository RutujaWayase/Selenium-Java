package SeleniumInterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultipleDropDown {
	
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		//WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial");
		
		
		//Approach 1
		Select noOfEmpsdrp = new Select(driver.findElement(By.name("NoOfEmployees")));
		noOfEmpsdrp.selectByVisibleText("16 - 20");
		Select industryDrp = new Select(driver.findElement(By.name("Industry")));
		industryDrp.selectByVisibleText("Travel");
		Select countryDrp = new Select(driver.findElement(By.name("Country")));
		countryDrp.selectByVisibleText("Aruba");
		
		//Approach 2
		WebElement noOfEmpsEle = driver.findElement(By.name("NoOfEmployees"));
		selectOptionFromDropDown(noOfEmpsEle, "16 - 20");
		WebElement industryEle = driver.findElement(By.name("Industry"));
		selectOptionFromDropDown(industryEle,"Travel");
		WebElement country = driver.findElement(By.name("Country"));
		selectOptionFromDropDown(country,"Ghana");
		
		
	}
	
	
	public static void selectOptionFromDropDown(WebElement ele, String value){
    
		Select drp = new Select(ele);
		
		List<WebElement> alloptions = drp.getOptions();
		
		for(WebElement option:alloptions) {
			if(option.getText().equals("Cuba")) {
				option.click();
				break;
			}
		}
	}
}
