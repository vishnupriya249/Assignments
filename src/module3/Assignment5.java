package module3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		System.out.println("URL of the page is "+ driver.getCurrentUrl());
		
		driver.get("https://www.selenium.dev/");
		
		System.out.println("URL of the page is "+ driver.getCurrentUrl());
		
		driver.navigate().back();
		
		System.out.println("URL of the page is "+ driver.getCurrentUrl());
		
		driver.navigate().forward();
		
		System.out.println("URL of the page is "+ driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
		System.out.println("URL of the page is "+ driver.getCurrentUrl());
		
		driver.close();
		
		

	}

}
