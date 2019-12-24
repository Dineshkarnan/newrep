package org.cts1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh karunanithi\\eclipse-workspace\\Dinesh_Karunanithi\\Dinesh\\dir1\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("https://www.google.com/");
		
		WebElement goo = driver.findElement(By.name("q"));
	goo.sendKeys("Greens Technology");	
	*/
		
		/*driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	
		WebElement id = driver.findElement(By.name("DUMMY1"));
		id.sendKeys("dp");
	
		
		WebElement pas = driver.findElement(By.name("AuthenticationFG.ACCESS_CODE"));
	pas.sendKeys("12678");
	*/
		
		
		driver.get("https://netbanking.hdfcbank.com/");
		WebElement pas = driver.findElement(By.name("fldLoginUserId"));
		pas.sendKeys("12678ykuu");

		
		
	}
}
