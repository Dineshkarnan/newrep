package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh karunanithi\\eclipse-workspace\\Dinesh_Karunanithi\\Dinesh\\dir1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologies.in/selenium-training.php");
		
		driver.manage().window().maximize();
		
		WebElement cts = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[4]/div[2]/div[6]/ul/li[6]/a"));
		cts.click();
	}

}
