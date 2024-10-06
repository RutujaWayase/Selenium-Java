package day37SeleniumJavascriptExecutorScrollingPagesUploadFiles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class FileUpload {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		//single file upload - Test1.txt
	/*	driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("D:\\Automation\\Selenium BDD\\Selenium-Java\\Test1.txt");
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Test1.txt")) {
			System.out.println("File is successfully uploaded");
		}
		else {
			System.out.println("Upload failed");
		}
	*/
		
		//multiple file upload
		
		String file1 = "D:\\Automation\\Selenium BDD\\Selenium-Java\\Test1.txt";
		String file2 = "D:\\Automation\\Selenium BDD\\Selenium-Java\\Test2.txt";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		int noOfFilesUploaded = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		if(noOfFilesUploaded==2) {
			System.out.println("All Files are uploaded");
		}
		else {
			System.out.println("Files are not uploaded or incorrect files uploaded");
		}
		
		//validate file names
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Test1.txt") 
				&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Test2.txt")) {
					System.out.println("File names are matching...");
				}
		else {
			System.out.println("Files name are not matching");
		}

		
	}

}
