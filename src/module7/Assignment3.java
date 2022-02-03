package module7;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment3 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		
		driver.get("https://launchpad.net/sikuli"); 
		
		driver.findElement(By.linkText("sikulixide-2.0.5.jar")).click();
		
		Robot r = new Robot();
		
		r.delay(3000);
	
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		
		r.keyRelease(KeyEvent.VK_TAB);
		
		
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(70000);
		
		driver.close();
		

	}

}
