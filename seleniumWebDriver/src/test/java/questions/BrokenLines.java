package questions;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLines {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int broken=0, notbroken=0;
		
		for(WebElement link:allLinks) {
			String href = link.getAttribute("href");
			String txt = link.getText();
			System.out.println("Link: "+txt);
			System.out.println("URL: "+href);
			
			try {
				URL url = new URL(href);
				HttpURLConnection con = (HttpURLConnection) url.openConnection();
				
				int code = con.getResponseCode();
				if(code==200) {
					System.out.println("Links are not broken.");
					notbroken++;
				}
				else {
					System.out.println("Link is broken1: ");
					System.out.println(con.getResponseMessage());
					broken++;
				}
			}
			catch(Exception e) {
				System.out.println("Link is broken2: ");
				broken++;
			}
			System.out.println("------------------");
		}
		System.out.println("Total number of links: "+allLinks.size());
		System.out.println("Number of broken links: "+broken);
		System.out.println("number of non broken links: "+notbroken);
		
		Thread.sleep(2000);
		driver.close();
	}

}
