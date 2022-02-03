package module3;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		
		System.out.println("Title of the Home page:" +driver.getTitle());
		
		WebElement frame=driver.findElement(By.name("login_page"));
		driver.switchTo().frame(frame);
		WebElement link = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/p[1]/a[1]"));
		link.click();
		
		Set<String> loop = driver.getWindowHandles();
		Iterator i = loop.iterator();                                
	    String mainID = (String) i.next();
	    String ID1 = (String) i.next();
	    
		driver.switchTo().window(ID1);
		System.out.println("Title of the Know more page:" +driver.getTitle());
		driver.close();
		                             
		driver.switchTo().window(mainID);
		System.out.println("Title of the Home page:" +driver.getTitle());	
		
		driver.close();

	}

}
