package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame5 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		
		WebElement framename = driver.findElement(By.id("iframeResult"));
		
		driver.switchTo().frame(framename);
		
		Thread.sleep(5000);
		WebElement tryit = driver.findElement(By.xpath("//button[contains(text(),'Try it')]"));
		tryit.click();
		
		driver.switchTo().alert().sendKeys("Belle");
		driver.switchTo().alert().accept();
		
		WebElement printtext = driver.findElement(By.xpath("//p[@id='demo']"));
		
		System.out.println("The printed text is: "+printtext.getText());
		driver.close();

	}

}
