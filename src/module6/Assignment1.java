package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		WebElement closeButton = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/button[1]"));
		closeButton.click();
		Thread.sleep(3000);
		WebElement fashion = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[2]"));
		
		Actions a = new Actions(driver);
		a.moveToElement(fashion).perform();
		
		Thread.sleep(5000);
		WebElement womenw = driver.findElement(By.xpath("//a[contains(text(),'Women Western')]"));
		a.moveToElement(womenw).perform();
			
		WebElement womend = driver.findElement(By.xpath("//a[contains(text(),'Women Dresses')]"));
		womend.click();
		Thread.sleep(5000);
		WebElement women1 = driver.findElement(By.xpath("//div[@id='container']/div[1]/div[2]/div[1]/div[1]/child::span[4]"));
		a.moveToElement(women1).perform();
		

	}

}
