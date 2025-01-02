package SeleniumInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumComands {

    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        //Navigate to url
        driver.get("https://www.google.com");
        //Navigate from one url to another url
        driver.navigate().to("https://www.google.com");
        //Checking an Element
        WebElement button = driver.findElement(By.id("submit"));
        button.click();
        //Entering a Text
        WebElement inputField = driver.findElement(By.name("username"));
        inputField.sendKeys("testuser");
        //Clearing Text
        WebElement inputField1 = driver.findElement(By.name("username"));
        inputField1.clear();
        //Retrieving Text
        WebElement label = driver.findElement(By.id("welcomeMessage"));
        String text = label.getText();
        System.err.println("Text: "+text);
        //Retrieving Attribute Value
        WebElement element = driver.findElement(By.id("email"));
        String value = element.getAttribute("value");
        System.out.println("value: "+value);
        //Getting Tag Name
        WebElement element3 = driver.findElement(By.id("submit"));
        String tagName = element3.getTagName();
        System.err.println("Tag Name: "+tagName);
        //Checking Element Display Status
        WebElement element4 = driver.findElement(By.id("hiddenElement"));
        boolean isDisplayed = element4.isDisplayed();
        System.err.println("Is Displayed: "+isDisplayed);
        //Checking Element Enabled Status
        WebElement element5 = driver.findElement(By.id("submit"));
        boolean isEnabled = element5.isEnabled();
        System.err.println("Is Enabled: "+isEnabled);
        //Checking Element Selected Status
        WebElement checkbox = driver.findElement(By.id("agreeTerms"));
        boolean isSelected = checkbox.isSelected();
        System.err.println("Is Selected: "+isSelected);
        //Selecting a Dropdown Value
       // Select dropdown = new Select(driver.findElement(By.id("country")));
        


    }
    
}
