package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com"); // opening Face book page
			driver.manage().window().maximize();
			
			
			WebElement create= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")); // find the id of the element
			create.click(); // Clicking on the Create New Account
			System.out.println("Clicked on Create New Account");
			
		
			Thread.sleep(3000);
			
			WebElement FirstName = driver.findElement(By.name("firstname"));
			 FirstName.sendKeys("Bele");
			 System.out.println("The data in First Name when entered first time: "+FirstName.getAttribute("value"));
			 FirstName.clear();
			 System.out.println("The data in First Name after clearing: "+FirstName.getAttribute("value"));
			 FirstName.sendKeys("Belle");
			 System.out.println("The data in First Name is when entered second time: "+FirstName.getAttribute("value"));
			 driver.close();

	}
}
