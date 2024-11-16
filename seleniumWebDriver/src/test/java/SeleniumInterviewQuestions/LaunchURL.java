package SeleniumInterviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchURL {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		System.out.println("Title of page is: "+driver.getTitle());
		System.out.println("URL of page is: "+driver.getCurrentUrl());
		System.out.println("Page Source is: "+ driver.getPageSource());
		
	}

}
