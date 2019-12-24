package org.greens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh karunanithi\\eclipse-workspace\\Dinesh_Karunanithi\\Dinesh\\dir1\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement okbtn = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		okbtn.click();
		
		//Switch to alert
		Thread.sleep(6000);
		
		org.openqa.selenium.Alert al = driver.switchTo().alert();
		String text=al.getText();
		System.out.println( text);
		al.accept();
		
		Thread.sleep(3000);
		WebElement okc = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		okc.click();
	}

}
