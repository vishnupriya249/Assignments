package module8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceDemoLogin {
	
	WebDriver driver;
	
	By UserName = By.id("user-name");
	By Password = By.id("password");
	By log = By.xpath("//input[@id='login-button']");
	
	public SauceDemoLogin(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void login(String User, String Pass)
	{
		driver.findElement(UserName).sendKeys(User);
		driver.findElement(Password).sendKeys(Pass);
		driver.findElement(log).click();
		
	}

}
