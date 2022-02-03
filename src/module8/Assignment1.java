package module8;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Assignment1 {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://smallpdf.com/word-to-pdf");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//body/div[@id='app']/div[2]/div[1]/*[1]")).click();
		
		upload();
		download();
	
		driver.close();
	
		
	}	
		
	public static void upload() throws AWTException, InterruptedException
		{
		WebElement file = driver.findElement(By.xpath("//span[contains(text(),'Choose Files')]"));
		
		file.click();
		
		Robot r = new Robot();
		
		StringSelection s = new StringSelection("C:\\Users\\ram mohan reddy\\Downloads\\Ratios.docx");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		}
		
	public static void download() throws InterruptedException, AWTException
		{
		
		
	     Thread.sleep(15000);
		 
		 
		 String locator = "//span[contains(text(),'Download')]/parent::button";
		    

			WebElement download = driver.findElement(By.xpath(locator));
			System.out.println("Uploading and Converting...");
		
		 	if(download.isDisplayed())
		 		{ 
		 			download.click();
		 			System.out.println("Downloading file...");
		 		}
		 	else
			    {	
		 			System.out.println("Startover...");
		 			startover();
			    }
		 		
		 Thread.sleep(3000);
	  }
	public static void startover() throws AWTException, InterruptedException
		{
			WebElement start = driver.findElement(By.xpath("//div[contains(text(),'Start over')]"));
			start.click();
			upload();
			download();
		}


}
