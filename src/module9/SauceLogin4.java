package module9;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceLogin4 {
   
	WebDriver driver;
	
    @BeforeMethod
    public void Launch()
    {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://saucedemo.com");
    }
	
	
	@Test
 	public void Login() throws IOException 
	{
		ReadDetails r = new ReadDetails();
		WebElement UserName = r.getElementInfo("User", driver);
		UserName.sendKeys("standard_user");
		
		WebElement Password = r.getElementInfo("Password", driver);
		Password.sendKeys("secret_sauce");
		
		r.getElementInfo("Login", driver);
	}
	
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	
}
