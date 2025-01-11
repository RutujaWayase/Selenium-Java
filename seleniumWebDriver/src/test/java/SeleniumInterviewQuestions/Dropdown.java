package SeleniumInterviewQuestions;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Dropdown{

//public class waitforDropdown{
 public static void main(String[] args){
  WebDriver driver = new ChromeDriver();
  driver.get("https://google.com"); //pass URL as per requirement
  //WebDriver wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  //WebDriver wait = (WebDriver) driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
  By dropdownLocator = By.id("dropdownid"); //pass actual dropdown id
  WebElement dropdownElement = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(dropdownLocator));
 // WebElement dropdownElement = wait.until(ExpectedConditions.elementToBeClikable(dropdownLocator));
  Select select = new Select(dropdownElement);
select.selectByIndex(0);
driver.quit();

}
}
