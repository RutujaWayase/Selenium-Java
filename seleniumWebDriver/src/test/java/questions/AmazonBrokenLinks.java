package questions;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBrokenLinks {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//storing the links in a list
		List<WebElement> links = driver.findElements(By.tagName("a"));
		//line count
		System.out.println("No of links are: "+ links.size());
		
		//checking the links fetched
		for(int i=0; i<links.size(); i++) {
			WebElement E1 = links.get(i);
			String url = E1.getAttribute("href");
			verifyLinks(url);
		}
		driver.quit();
	}
	
	public static void verifyLinks(String linkurl) {
		try {
			URL url = new URL(linkurl);
			
			//creating url connection and getting response code
			HttpURLConnection httpURLconnection = (HttpURLConnection)url.openConnection();
			httpURLconnection.setConnectTimeout(3000);
			httpURLconnection.connect();
			
			if(httpURLconnection.getResponseCode()>=400) {
				System.out.println(linkurl + " ----> "+ httpURLconnection.getResponseMessage() + "is a broken line");
			}
			else {
				System.out.println(linkurl + "------> "+ httpURLconnection.getResponseMessage());
			}
		}
		catch(Exception e) {
			
		}
	}

}
