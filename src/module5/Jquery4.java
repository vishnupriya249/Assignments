package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Jquery4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.jquery-az.com/javascript/demo.php?ex=151.1_1");
		
		WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Click here to show confirm alert')]"));
		button.click();
		
		String message1 = driver.switchTo().alert().getText();
		System.out.println("First Alert Message is :"+message1);
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		String message2 = driver.switchTo().alert().getText();
		System.out.println("Second Alert Message is :"+message2);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.close();
		

	}

}
