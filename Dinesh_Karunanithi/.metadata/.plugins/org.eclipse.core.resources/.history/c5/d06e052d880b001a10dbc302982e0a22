package org.cts1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh karunanithi\\eclipse-workspace\\Dinesh_Karunanithi\\Dinesh\\dir1\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.greenstechnologys.com/");
	
	WebElement contact = driver.findElement(By.xpath("//a[@href='contact.php']"));
	contact.click();
	
	
	WebElement name = driver.findElement(By.name("name"));
	name.sendKeys("Dinesh karunanithi");
	
	

	WebElement mail = driver.findElement(By.name("email"));
	mail.sendKeys("Dineshkarunanithi@gmail.com");
	

	WebElement phone = driver.findElement(By.name("phone"));
	phone.sendKeys("83442101");
	
	WebElement course = driver.findElement(By.className("form-control"));
	course.click();
	
	}

}
