package org.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Browser_Launch {

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

	
//find the loc Contact us
	WebElement btn = driver.findElement(By.xpath("//a[@href='contact.php']"));
	btn.click();
//name
	WebElement name = driver.findElement(By.name("name"));
	name.sendKeys("Dinesh");
	
	WebElement mail = driver.findElement(By.name("email"));
	mail.sendKeys("dinesh@gmail.com");
	
	WebElement phone = driver.findElement(By.name("phone"));
	phone.sendKeys("83442101");
	
	//WebElement courses = driver.findElement(By.name("courses"));
	//courses.click();
	
	Select dropdown = new Select(driver.findElement(By.name("courses")));  
	
	dropdown.selectByVisibleText("C/C++");
	
	Select dropdown1 = new Select(driver.findElement(By.name("branch")));  
	dropdown1.selectByIndex(1);
	
	Select dropdown2 = new Select(driver.findElement(By.name("time")));  
	dropdown2.selectByIndex(1);
	
	WebElement msgbox = driver.findElement(By.xpath("//textarea[@class='form-control input-message']"));
	msgbox.sendKeys("i wanna job in cts");
	
	WebElement submit = driver.findElement(By.xpath("//span[text()='Submit Now']"));
	submit.click();

	
			
	/*insert valuestxtFrom.sendKeys("Hello");
	
//find the loc of password
	WebElement txtTo = driver.findElement(By.name("pass"));
	txtTo.sendKeys("dnsh");
	
//login
	WebElement btnlogin = driver.findElement(By.xpath("//input[@value='Log In']"));
	
	btnlogin.click();
	//Quit
	//driver.quit();

	
	*/
}
}
