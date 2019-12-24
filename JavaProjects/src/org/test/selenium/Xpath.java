package org.test.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) {
		//set property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh karunanithi\\eclipse-workspace\\JavaProjects\\src\\direc\\chromedriver.exe");
	
		//launch browser
		WebDriver driver = new ChromeDriver();
		
		//enter url
		driver.get("https://www.facebook.com");
	}

}
