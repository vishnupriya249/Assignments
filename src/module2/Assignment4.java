package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.google.com");
		Thread.sleep(5000);
		System.out.println("Title of the page is "+driver.getTitle());

	
    	driver.close();

	}

}
