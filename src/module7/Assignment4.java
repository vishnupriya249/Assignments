package module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.selenium.dev/downloads"); 
		
		WebElement java = driver.findElement(By.xpath("//tbody/tr[2]/td[1]"));
		System.out.println("java Text is:" +java.getText());
		
		WebElement python = driver.findElement(By.xpath("//tbody/tr[3]/td[1]"));
		System.out.println("java Text is:" +python.getText());
		
		driver.close();
		
		
	}

}
