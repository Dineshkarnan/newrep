package org.xpath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh karunanithi\\eclipse-workspace\\Dinesh_Karunanithi\\Dinesh\\dir1\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.redbus.in/");
			
			driver.manage().window().maximize();
			
			
			Thread.sleep(2000);


			Alert al = driver.switchTo().alert();
		
			al.dismiss();
			
			
		
		
		
		
		
		
		
		
		
		}


}
