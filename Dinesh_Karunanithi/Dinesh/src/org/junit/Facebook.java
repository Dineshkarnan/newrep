package org.junit;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Facebook {
	@Beforeclass
	public static void launch()
	{
		System.out.println("Before Class");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh karunanithi\\eclipse-workspace\\Dinesh_Karunanithi\\Dinesh\\dir1\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		boolean[] contains;
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.facebook.com/"));
		
	/*Assert Equals*/
	WebElement mail = driver.findElement(By.id("email"));
	mail.sendKeys("dinesh");
	Assert.assertNotEquals("dinesh",mail.getAttribute("value"));
	
	WebElement pwd = driver.findElement(By.id("pass"));
	pwd.sendKeys("124578");
	Assert.assertEquals("124578", pwd.getAttribute("value"));
	}
	
	
	

}
