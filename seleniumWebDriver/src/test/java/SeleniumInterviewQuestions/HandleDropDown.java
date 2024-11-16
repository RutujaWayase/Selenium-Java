package SeleniumInterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		WebElement drpCountryEle = driver.findElement(By.id("input-country"));
		Select drpCountry = new Select(drpCountryEle);
		drpCountry.selectByVisibleText("Denmark");
		drpCountry.selectByValue("10"); //Argentina
		drpCountry.selectByIndex(12); //index starts from 0
		
		//selecting options from dropdown without using methods (select)
		
		List<WebElement> alloptions = drpCountry.getOptions();
		
		for(WebElement option:alloptions) {
			if(option.getText().equals("Cuba")) {
				option.click();
				break;
			}
		}
	}

}
