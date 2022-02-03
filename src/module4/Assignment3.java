package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		Assignment3 a = new Assignment3();
		a.open();
		a.locators();
		a.close();
		
		

	}
	
	public void locators() throws InterruptedException
	{
		
		WebElement FirstName = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		 FirstName.sendKeys("FirstName");
		
		 System.out.println("The data in First Name is "+FirstName.getAttribute("value"));
		
		
		WebElement SurName = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		SurName.sendKeys("SurName");
		System.out.println("The data in Sur Name is "+SurName.getAttribute("value"));
	
		WebElement Mail = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		Mail.sendKeys("test123");
		System.out.println("The data in Mail Name is "+Mail.getAttribute("value"));
		
		WebElement Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/input[1]"));
		Pass.sendKeys("test@123");
		System.out.println("The data in Password is "+Pass.getAttribute("value"));
		
	
		
		WebElement Gender = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/span[1]/span[1]/input[1]"));
		
		Gender.click();
		System.out.println("Gender Selected "+Gender.isSelected());
		Thread.sleep(5000);
		
		
		
		WebElement Submit = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[10]/button[1]"));
		Submit.click();
		
		System.out.println("Data Entered in Chrome:");
		
		WebElement Day = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[2]/span[1]/span[1]/select[1]"));
		Select s = new Select(Day);
		s.selectByValue("15");
		
		WebElement Month = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[2]/span[1]/span[1]/select[2]"));
		Select m = new Select(Month);
		m.selectByVisibleText("Nov");
		
		WebElement year = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[2]/span[1]/span[1]/select[3]"));
		Select y = new Select(year);
		y.selectByIndex(31);
	}
	public void open() throws InterruptedException
	{
		driver.get("https://www.facebook.com"); // opening Face book page
		driver.manage().window().maximize();
		
		
		WebElement create= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")); // find the id of the element
		create.click(); // Clicking on the Create New Account
		System.out.println("Clicked on Create New Account");
		
	
		Thread.sleep(3000);
	}
		
		
		public void close()
		{
			driver.close();
		
		}
}
