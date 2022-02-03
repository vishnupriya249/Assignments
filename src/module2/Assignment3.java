package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com");
		Thread.sleep(5000);
		System.out.println("Title of the page is "+driver.getTitle());

	
    	driver.close();

	}

}
