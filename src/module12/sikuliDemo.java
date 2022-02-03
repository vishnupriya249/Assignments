package module12;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class sikuliDemo {

	public static void main(String[] args) throws AWTException, FindFailed, InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://smallpdf.com/word-to-pdf");
		
		Screen s = new Screen();
		
		Pattern p = new Pattern("D:\\Selenium\\Upload.png");
		s.click(p);
	
		Robot r = new Robot();
		 
		StringSelection s1 = new StringSelection("C:\\Users\\ram mohan reddy\\Downloads\\Ratios.docx");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(9000);
		Pattern p1 = new Pattern("D:\\Selenium\\download.png");
		s.click(p1);
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_TAB);
		//r.keyPress(KeyEvent.VK_TAB);
		
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.close();
		

	}

}
