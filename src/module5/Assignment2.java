package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2 {
	
	static WebDriver driver;
	 
public static void main(String[] args) throws InterruptedException 
{
			
		Assignment2 a = new Assignment2();
		a.initialize("chrome");
		a.initialize("firefox");
		
		
}
 
public void initialize(String name) throws InterruptedException
{
	
	if(name.equals("chrome")) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		open();
		login();
		close();
	}
	
	if(name.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		open();
		login();
		close();
	}
	
}

public void open() throws InterruptedException
{
	driver.get("https://www.facebook.com"); // opening Face book page
	driver.manage().window().maximize();
}

public void login()
{
	WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
	Email.sendKeys("test@gmail.com");
	
	WebElement Pass = driver.findElement(By.xpath("//input[@name='pass']"));
	Pass.sendKeys("test@gmail.com");
	
	WebElement Login = driver.findElement(By.xpath("//button[contains(text(),'Log In')]"));
	Login.click();
	
}

public void close()
{
	driver.close();
}
}
