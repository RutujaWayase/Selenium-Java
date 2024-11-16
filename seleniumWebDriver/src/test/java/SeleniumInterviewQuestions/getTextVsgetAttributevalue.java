package SeleniumInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextVsgetAttributevalue {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		WebElement emailinputbox = driver.findElement(By.id("Email"));
		emailinputbox.clear();
		emailinputbox.sendKeys("admin123@gmail.com");
		
		//capturing text from input box
		System.out.println("Result from getAttribute() method: " + emailinputbox.getAttribute("value")); //Result from getAttribute() method: admin123@gmail.com
		System.out.println("Result from getAttribute() method: " + emailinputbox.getText()); //Result from getAttribute() method: 
		
		//getText() => method returns value of inner text 
		//Eg: <input name="email" id="user" value="admin@yourstore.com">abc@mail.com</input>
		//here name, id are attributes (the values of it can be capcured using getAttribute method). And abc@mail.com is inner text value (the value of it can be captured using getText() method)
		//getAttribute("name") ----> email
		//getAttribute("id") -----> user
		//getAttribute("value") ----> admin@yourstore.com
		
		//abc@mail.com ----> inner text
		//getText() ----> abc@mail.com
		
		//Login button
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
		
		System.out.println(button.getAttribute("type"));
		System.out.println(button.getAttribute("class"));
		
		System.out.println(button.getText());
		
		String title = driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
		System.out.println(title);
		
		
	} 

}
