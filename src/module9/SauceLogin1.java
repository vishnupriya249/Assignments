package module9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceLogin1 {
	
	WebDriver driver;
	
	@BeforeMethod 
	public void Launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	
	@Test
  public void Details() 
	{
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		WebElement UserName = driver.findElement(By.id("user-name"));
				UserName.sendKeys("standard_user");
		WebElement Password = driver.findElement(By.id("password"));
				Password.sendKeys("secret_sauce");
		WebElement Login = driver.findElement(By.xpath("//input[@id='login-button']"));
				Login.click();
	}
	
	@AfterMethod
	public void Close()
	{
		driver.close();
	}
}
