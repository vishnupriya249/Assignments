package module9;


import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SauceDemo3 {
WebDriver driver;
	
	@BeforeClass
	public void Launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	
    @Test(priority=1, dataProvider="input")
    public void Details(String UserName1, String Password1) throws IOException 
	{
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		
		WebElement UserName = driver.findElement(By.id("user-name"));
		UserName.sendKeys(UserName1);
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(Password1);
		
		WebElement Login = driver.findElement(By.xpath("//input[@id='login-button']"));
				Login.click();
			//	logout();
	}
	@DataProvider
	public Object[][] input() throws IOException
	{
		ReadExcel r = new ReadExcel();
		int Rows = r.getRowCount(0);
		int Cols = r.getColCount(0);
		System.out.println(Rows+" "+Cols);
		
		Object[][] info = new Object[Rows][Cols];
		
		info[0][0] = r.getExcelData(0, 0, 0);
		info[0][1] =r.getExcelData(0, 0, 1);
		
		
		int i,j;
		for (i = 0; i<Rows; i++) {
		for ( j = 0; j< Cols; j++)
		{
				
				info[i][j] = r.getExcelData(0, i, j);
				
				
		}}
			
	
		return info;
	}
	@AfterMethod
	public void logout() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Open Menu')]")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		System.out.println("Inside Logout...");
	}

	
	@AfterClass
	public void Close()
	{
		driver.close();
	}
}
