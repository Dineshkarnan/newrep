package org.cts1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debug {
	public static void main(String[] args) {
		//set property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh karunanithi\\eclipse-workspace\\Dinesh_Karunanithi\\Dinesh\\dir1\\chromedriver.exe");
		
	//launch browser
		WebDriver driver = new ChromeDriver();
		
		
	//Enter url

		driver.get("http://www.greenstechnologys.com/");

		
	//Print The title
		String title = driver.getTitle();
		System.out.println(title);
		
	//Print the url
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);


	}

}
