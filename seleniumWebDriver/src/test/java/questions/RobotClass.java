package questions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {
	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://the-internet.herokuapp.com/upload");
		
		Robot rob = new Robot();
		StringSelection string = new StringSelection("C:\\Users\\Rutuja\\Downloads\\upload.png");
		
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string, null);

		// Choosing the WebElement and performing a click on it
		Actions actions=new Actions(driver);
		WebElement choosingButton= driver.findElement(By.id("file-upload"));
		actions.moveToElement(choosingButton).click().build().perform();

		// Setting the delay of 2 seconds
		rob.delay(2000);

		// Doing Ctrl+V
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);

		// Releasing the pressed keys Ctrl+V
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_V);

		// Setting the delay of 2 seconds
		rob.delay(2000);

		// Pressing enter key to upload the file
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	}

}
