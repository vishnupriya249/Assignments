package module8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SaucePageLogin {
  
	WebDriver driver;
	
	@BeforeMethod
	public void Launch() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void Login()
	{
		driver.get("https://www.saucedemo.com");
		
		SauceDemoLogin s = new SauceDemoLogin(driver);
		
		s.login("standard_user","secret_sauce");
	}
	
	@AfterMethod
	public void Close()
	{
	   driver.close();
	}
  
}


