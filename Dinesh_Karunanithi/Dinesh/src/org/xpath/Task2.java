package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh karunanithi\\eclipse-workspace\\Dinesh_Karunanithi\\Dinesh\\dir1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" http://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement mail = driver.findElement(By.name("email"));
	
		mail.sendKeys("dinesh karunanithi");
	
		WebElement password = driver.findElement(By.name("pass"));
		
		password.sendKeys("dinesh");
		
		
		WebElement btn = driver.findElement(By.xpath("//input[@value='Log In']"));
	
		btn.click();
	}
}
