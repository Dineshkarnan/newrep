package org.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh karunanithi\\eclipse-workspace\\Dinesh_Karunanithi\\Dinesh\\dir1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
		 name.sendKeys("Dinesh");
		 
		 WebElement lname = driver.findElement(By.id("lastname"));
		 lname.sendKeys("Karunanithi");
		 
		 WebElement popup = driver.findElement(By.id("cookie_action_close_header"));
		 popup.click();
		 
		 Thread.sleep(1000);
		
		
		 
		 /*WebElement sap = driver.findElement(By.xpath("//button[@id='buttonwithclass']"));
		 sap.click();*/
		 
		 WebElement sex = driver.findElement(By.xpath("//input[@id='sex-0']"));
		 sex.click();
		 
		 
		 WebElement exp = driver.findElement(By.id("exp-0"));
		 exp.click();
		 
		 WebElement date = driver.findElement(By.id("datepicker"));
		 date.sendKeys("24/03/1994");
		 Thread.sleep(2000);
		 
		 WebElement manual = driver.findElement(By.id("profession-0"));
		 manual.click();
		 Thread.sleep(2000);
		 
		 
		 WebElement auto = driver.findElement(By.id("profession-1"));
		 auto.click();
		 
		 
		 WebElement photo = driver.findElement(By.id("photo"));
		 photo.sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures");
		 
		 
		 
		WebElement tool = driver.findElement(By.id("tool-0"));
		tool.click();
		Thread.sleep(1000);
		
		WebElement cont = driver.findElement(By.name("continents"));
		Select co = new Select(cont);
		
		co.selectByValue("EU");
		
		//to check the size of The DropDown
		List<WebElement> all = co.getOptions();
		int size = all.size();
		System.out.println(size);
		
		for(WebElement con:all)
		{
			String continents = con.getText();
			System.out.println(continents);
		}
		
		
	
		WebElement c = driver.findElement(By.id("continentsmultiple"));
		Select mulcon = new Select(c);
		mulcon.selectByIndex(1);
		mulcon.selectByValue("EU");
		mulcon.selectByValue("SA");
		 Thread.sleep(1000);
		 mulcon.deselectAll();
		
		 
		 WebElement cmds = driver.findElement(By.id("selenium_commands"));
		 Select multicmds = new Select(cmds);
		 multicmds.selectByIndex(2);
		 multicmds.selectByVisibleText("Browser Commands");
		 Thread.sleep(1000);
		 
	}

}
