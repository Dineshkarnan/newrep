package org.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mail {
	public static void main(String[] args) {
		//set property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh karunanithi\\eclipse-workspace\\Dinesh_Karunanithi\\Dinesh\\dir1\\chromedriver.exe");
		
	//launch browser
		WebDriver driver = new ChromeDriver();
		
	//Enter url

		driver.get("http://www.gmail.com/");

		
	//Print The title
		String title = driver.getTitle();
		System.out.println(title);
		
	//Print the url
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		
	//name
		WebElement mail = driver.findElement(By.xpath("//input[@type='email']"));
		mail.sendKeys("dnshkarthi726");
		
	}
}
