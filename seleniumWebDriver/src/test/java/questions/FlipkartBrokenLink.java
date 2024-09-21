package questions;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartBrokenLink {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//Storing Links in a List
		List<WebElement> links = driver.findElements(By.tagName("a"));
		//link count
		System.out.println("no. of links: "+ links.size());
		
		//checking the links fetched
		for(int i=0; i<links.size(); i++) {
			WebElement Ele = links.get(i);
			String url = Ele.getAttribute("href");
			verifyLinks(url);
		}
		driver.quit();
	}
	
	
	
	public static void verifyLinks(String LinkUrl) {
		try {
			URL url = new URL(LinkUrl);
			//creating url connection and getting response code
			HttpURLConnection httpURLconnection = (HttpURLConnection)url.openConnection();
			httpURLconnection.setConnectTimeout(3000);
			httpURLconnection.connect();
			
			if(httpURLconnection.getResponseCode()>=400) {
				System.out.println(LinkUrl+ "---->"+ httpURLconnection.getResponseMessage()+ "is a Broken Link");
			}
			else {
				System.out.println(LinkUrl + "---->"+ httpURLconnection.getResponseMessage()+ "is a Valid Link");
			}
			
		}
		catch(Exception e){
			
		}
	}

	
}
