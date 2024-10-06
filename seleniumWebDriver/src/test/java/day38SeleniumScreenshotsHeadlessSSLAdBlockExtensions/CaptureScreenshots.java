package day38SeleniumScreenshotsHeadlessSSLAdBlockExtensions;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new chromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//1) capture full page screenshot
	/*	TakesScreenshot ts = (TakesScreenshot)driver;
		//TakesScreenshot ts = driver;
		
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
		
		sourcefile.renameTo(targetFile); // copy sourcefile to target file
	
	*/
		//2) capture screenshot of specific section
	/*	WebElement featuredProducts = driver.findElement(By.xpath("div[@class='product-grid home-page-product-grid']"));
		
		File sourcefile = featuredProducts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\featuredproducts.png");
		sourcefile.renameTo(targetfile); //copy sourcefile to target file
	*/	
		//3) capture screenshot of webelement
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourcefile = logo.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
		sourcefile.renameTo(targetfile);
		
		
		
		driver.quit();
		
		
		
		 
	}

}
