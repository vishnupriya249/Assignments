package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FBRegistration {
	
	WebDriver driver;
	
	public void Registration(String dri) throws InterruptedException
	{
		
		switch(dri)
		{
		
		case "chrome": System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
						driver = new ChromeDriver();
						System.out.println("Chrome Execution Started...");
						this.open();
						this.textChrome();
						this.close();
						System.out.println("Chrome Execution Stopped...");
						
						break;
		
		case "mozilla": System.setProperty("webdriver.gecko.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\geckodriver.exe");
						driver = new FirefoxDriver();
						System.out.println("FireFox Execution Started...");
						this.open();
						this.dropdowns();
						this.close();
						System.out.println("Firefox Execution Stopped...");
						break;
		 
		default: 		System.out.println("Invalid Input");
			 			break;
		}
		
	}	
		
		public void textChrome() throws InterruptedException
		{
		
		WebElement FirstName = driver.findElement(By.name("firstname"));
		 FirstName.sendKeys("FirstName");
		
		 System.out.println("The data in First Name is "+FirstName.getAttribute("value"));
		
		
		WebElement SurName = driver.findElement(By.name("lastname"));
		SurName.sendKeys("SurName");
		System.out.println("The data in Sur Name is "+SurName.getAttribute("value"));
	
		WebElement Mail = driver.findElement(By.name("reg_email__"));
		Mail.sendKeys("test123");
		System.out.println("The data in Mail Name is "+Mail.getAttribute("value"));
		
		WebElement Pass = driver.findElement(By.name("reg_passwd__"));
		Pass.sendKeys("test@123");
		System.out.println("The data in Password is "+Pass.getAttribute("value"));
		
		this.dropdowns();
		
		WebElement Gender = driver.findElement(By.xpath("//div/span/span[1]/input[@type='radio']"));
		
		Gender.click();
		System.out.println("Gender Selected "+Gender.isSelected());
		Thread.sleep(5000);
		
		
		
		WebElement Submit = driver.findElement(By.name("websubmit"));
		Submit.click();
		
		System.out.println("Data Entered in Chrome:");
		
		
		
		
		}
   
	
		
		public void open() throws InterruptedException
		{
		driver.get("https://www.facebook.com"); // opening Face book page
		driver.manage().window().maximize();
		
		
		WebElement create= driver.findElement(By.linkText("Create New Account")); // find the id of the element
		create.click(); // Clicking on the Create New Account
		System.out.println("Clicked on Create New Account");
		
	
		Thread.sleep(3000);
		}
		
		
		public void dropdowns()
		{
		WebElement Day = driver.findElement(By.id("day"));
		Select s = new Select(Day);
		s.selectByValue("15");
		
		WebElement Month = driver.findElement(By.id("month"));
		Select m = new Select(Month);
		m.selectByVisibleText("Nov");
		
		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByIndex(31);
		
		}
		
		public void close()
		{
			driver.close();
		
		}
}
