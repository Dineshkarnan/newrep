package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task7 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh karunanithi\\eclipse-workspace\\Dinesh_Karunanithi\\Dinesh\\dir1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/trains");
		
		driver.manage().window().maximize();
		
		WebElement from = driver.findElement(By.id("from_station"));
		from.sendKeys("chennai");
		
		WebElement to = driver.findElement(By.id("to_station"));
		to.sendKeys("Ariyalur");
		
		WebElement clas = driver.findElement(By.id("trainClass"));
		clas.click();
		
		
		Select s = new Select(clas);
		s.selectByIndex(1);
		
		
	}

}
