package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh karunanithi\\eclipse-workspace\\Dinesh_Karunanithi\\Dinesh\\dir1\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get(" http://demo.automationtesting.in/Register.html");
			
			driver.manage().window().maximize();
			
			WebElement firstName = driver.findElement(By.className("form-control ng-pristine ng-invalid ng-invalid-required ng-touched"));
		
			firstName.sendKeys("dinesh");
	
			WebElement lastName = driver.findElement(By.className("form-control ng-pristine ng-untouched ng-invalid ng-invalid-required"));
	
			lastName.sendKeys("Karunanithi");
	
	
	
	}

}
