package SeleniumInterviewQuestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.assertEquals;

public class Alert {

   // public class HandleAlert{
    public static void main(String[] args){
    WebDriver driver = new ChromeDriver();
  /*  
    driver.get("https://google.com"); //pass actual URL
    WebElement submitButton = driver.findElement(By.id("submitButton")); //pass actual id
    submitButton.click();
    //WebDriver wait = new WebDriver(driver, Duration.ofSeconds(10));
    WebElement wait = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(10));
    Alert alert = wait.until(ExpectedConditions.alertIsPresent(submitButton));
    alert.accept();
    driver.quit();
  */ 

    
    driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
    WebElement enterMessageField = driver.findElement(By.id("user-message"));
    String inputMessage = "This is a test";
    enterMessageField.sendKeys(inputMessage);
    
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    wait.until(ExpectedConditions.elementToBeClickable(By.id("showInput"))).click();
    
    String messageText = driver.findElement(By.id("message")).getText();
    assertEquals(messageText, inputMessage);
    }
}

