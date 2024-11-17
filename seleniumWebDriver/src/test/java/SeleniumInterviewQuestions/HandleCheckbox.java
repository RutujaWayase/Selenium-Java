package SeleniumInterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckbox {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://itera-qa.azurewebsites.net/home/automation");
		//1) Select specific check box
		driver.findElement(By.xpath("//input[@id='monday']")).click(); //Monday
		
		//2) Select all the checkboxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id, 'day')]"));
		System.out.println("Total no. of checkboxes: "+ checkboxes.size());
		
		//using for loop
		
		for(int i=0; i<=checkboxes.size(); i++) {
			checkboxes.get(i).click();
		}
		
		//using for..each loop
		for(WebElement chbox:checkboxes) {
			chbox.click();
		}
		
		//3) Select multiple check boxes by choice
		//Monday & Sunday
		for(WebElement chbox:checkboxes) {
			String checkboxname = chbox.getAttribute("id");
			if(checkboxname.equals("monday") || checkboxname.equals("sunday")) {
				chbox.click();
			}
		}
		
		//4) Select Last 2 check boxes
		//Total no of check boxes = no of check boxes want to select = starting index
		
		//7-2 = 5
		
		int totalcheckboxes = checkboxes.size();
		for(int i=totalcheckboxes-2; i<totalcheckboxes; i++) {
			checkboxes.get(i).click();
		}
		
		//5) Select First 3 check boxes
		for(int i=0; i<totalcheckboxes; i++) {
			if(i<3) {
				checkboxes.get(i).click(); 
			}
		}
		
	}

}
