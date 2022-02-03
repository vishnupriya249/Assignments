package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		
		
		WebElement text = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		Actions a = new Actions(driver);
		
		a.moveToElement(text).doubleClick().perform();
		
		driver.switchTo().alert().accept();
		
		driver.close();
		
		
		

	}

}
