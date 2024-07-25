package questions;

import java.io.IOException;
import java.net.URL;

import sun.net.www.protocol.http.HttpURLConnection;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLines2 {
	
	public static void main(String[] args) throws IOException {
		//WebDriver driver = new ChromeDriver();
		
		
		URL url = new URL("https://qspiders.com");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		
		int code = con.getResponseCode(); //200=ok i.e. notbroken
		
		System.out.println(code);
		
		String msg = con.getResponseMessage(); //if message is ok then link is not broken
		System.out.println(msg);
		
		
	}

}
