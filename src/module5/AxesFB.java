package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AxesFB {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		String str = "//form[1]/descendant::div[2]/input";
		WebElement UserName = driver.findElement(By.xpath(str));
		UserName.sendKeys("UserName");
		
		String str2= "//form[1]/descendant::div[4]/input[1]";
		WebElement Password = driver.findElement(By.xpath(str2));
		Password.sendKeys("Password");
		
		WebElement Submit = driver.findElement(By.xpath("//form[1]/div[2]/child::button[1]"));
		Submit.click();
		
			
	}

}
