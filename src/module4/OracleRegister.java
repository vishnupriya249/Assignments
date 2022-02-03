package module4;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class OracleRegister {
	
	 public static WebDriver driver;
	
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
						Thread.sleep(3000);
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
		
			Thread.sleep(5000);
		 
			Locators.EmailAdd.sendKeys("test123");
			System.out.println("Email Address Entered: "+Locators.EmailAdd.getAttribute("value"));
		
		
			Locators.Pass.sendKeys("Krishna@24");
			System.out.println("Password Entered: "+Locators.Pass.getAttribute("value"));
	
		
			Locators.RePass.sendKeys("Krishna@24");
			System.out.println("Re-enter Password Entered: "+Locators.RePass.getAttribute("value"));
		
		
			Locators.FirstName.sendKeys("Belle");
			System.out.println("First Name Entered: "+Locators.FirstName.getAttribute("value"));
		
		
			Locators.LastName.sendKeys("cornor");
			System.out.println("Last Name Entered: "+Locators.LastName.getAttribute("value"));
			
		
			Locators.JobTitle.sendKeys("Sofware Engineerr");
			System.out.println("Job Title Entered: "+Locators.JobTitle.getAttribute("value"));
		
		
			Locators.WorkPh.sendKeys("45454545");
			System.out.println("Work Phone Entered: "+Locators.WorkPh.getAttribute("value"));
		
		
			Locators.CompanyName.sendKeys("TCS");
			System.out.println("Company Name Entered: "+Locators.CompanyName.getAttribute("value"));
		
		
		
			Locators.Address1.sendKeys("BlueBerry Street");
			System.out.println("Address Line one Entered is:"+Locators.Address1.getAttribute("value"));
		
		
			Locators.Address2.sendKeys("Gandhi Nagar");
			System.out.println("Address Line Two Entered is: "+Locators.Address2.getAttribute("value"));
		
		
			Locators.City.sendKeys("Hyderabad");
			System.out.println("City Entered is: "+Locators.City.getAttribute("value"));
		
		
			Locators.ZIP.sendKeys("500072");
			System.out.println("ZIP Entered is: "+Locators.ZIP.getAttribute("value"));
		
			this.dropdowns();
		
			Thread.sleep(5000);
		
		
			Locators.Create.click();
		
			System.out.println("Data Entered in Chrome:");
		
		}
   
	
		
		public void open() throws InterruptedException
		{
			driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx"); // opening Face book page
			driver.manage().window().maximize();

			Thread.sleep(3000);
		}
		
		
		public void dropdowns()
		{
		
		Select c = new Select(Locators.Country);
		c.selectByValue("IN");
		
		
		Select s = new Select(Locators.State);
		s.selectByVisibleText("Andhra Pradesh ");
		
		
		}
		
		public void close()
		{
			driver.close();
		
		}

}
