package SeleniumInterviewQuestions;

import java.util.*;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class Alert {

   // public class HandleAlert{
    public static void main(String[] args){
    WebDriver driver = new ChromeDriver();
    driver.get("https://google.com"); //pass actual URL
    WebElement submitButton = driver.findElement(By.id("submitButton")); //pass actual id
    submitButton.click();
    //WebDriver wait = new WebDriver(driver, Duration.ofSeconds(10));
    WebElement wait = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(10));
    Alert alert = wait.until(ExpectedConditions.alertIsPresent(submitButton));
    alert.accept();
    driver.quit();
    
    }
}

