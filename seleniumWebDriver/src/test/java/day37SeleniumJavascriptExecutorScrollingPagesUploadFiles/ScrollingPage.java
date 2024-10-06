package day37SeleniumJavascriptExecutorScrollingPagesUploadFiles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");//driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//1) scroll down page by pixel number
		
	/*	js.executeScript("window.scrollBy(0,1500)", ""); //js.executeScript("window.scrollBy(0,3000)", "");
		System.out.println(js.executeScript("return window.pageYOffset;")); //1500
		//For horizontal off set use : pageXOffset
	*/
		
		//2) scroll the page till element is visible
	
	/*	
		WebElement ele = driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
		js.executeScript("arguments[0].scrollIntoView();", ele);
		System.out.println(js.executeScript("return window.pageYOffset;")); //2103.428466796875
		//For horizontal off set use : pageXOffset
	*/
		
		//3) scroll page till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//For horizontal offset use : scrollWidth in place of scrollHeight
		System.out.println(js.executeScript("return window.pageYOffset;")); //2103.428466796875
		//For horizontal off set use : pageXOffset
		
		Thread.sleep(5000);
		
		//scrolling up to initial position
		js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		//For horizontal offset use : scrollWidth in place of scrollHeight
		
		
	
		
	}

}
