package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh karunanithi\\eclipse-workspace\\Dinesh_Karunanithi\\Dinesh\\dir1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" http://www.greenstechnologys.com/");
		
		driver.manage().window().maximize();
		
		WebElement cont = driver.findElement(By.xpath("//a[@href='contact.php']"));
		
		cont.click();
		
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys("Dinesh");
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("Dineshlajjljl@gmail.com");

	
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("8344210");
		
		WebElement courses = driver.findElement(By.name("courses"));
		courses.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
