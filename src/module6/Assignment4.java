package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;

public class Assignment4 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		WebElement slide= driver.findElement(By.xpath("//div[@id='slider']/span"));
		Actions a = new Actions(driver);
		
		System.out.println(slide.getLocation()); 
		a.dragAndDropBy(slide, 285, 0).build().perform();
		System.out.println(slide.getLocation()+" "+slide.getAttribute("style"));		  
		
		}

}
