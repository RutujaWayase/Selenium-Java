package day30SeleniumHandlingFramesiFramesNestediFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleframes {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		//frame 1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1); //passed frame as a webelement //switch to frame1
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
		
		
		driver.switchTo().defaultContent(); // go back to page
		
		//frame 2
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("How are you?");
		
		
		driver.switchTo().defaultContent(); // go back to page
		
		
		//frame 3
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("good");
		
	}

}
