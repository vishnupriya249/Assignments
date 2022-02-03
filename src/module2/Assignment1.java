package module2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class Assignment1 {
	
	WebDriver driver;

	@Test
	public void chrome() 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Opening Chorme Browser...");
		driver.get("https://www.google.com");
		
	}
	@Test
	public void mozilla() throws IOException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		System.out.println("Opening Firefox Browser...");
		driver.get("https://www.google.com");
	}
	@Test
	public void ie() {
	
	System.setProperty("webdriver.edge.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\msedgedriver.exe");
	driver = new EdgeDriver();
	System.out.println("Opening Internet Explorer Browser...");
	driver.get("https://www.Google.com");
	

	}
}
