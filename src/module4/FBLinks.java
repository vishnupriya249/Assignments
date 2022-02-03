package module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com"); // opening Face book page
		//driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Number of links in facebook page is:"+links.size());
		
		for(int a = 0; a<links.size(); a++) // array starts from a = 0 so, a should be < links.size()
		{
			
			String name = links.get(a).getAttribute("title");
			
			if(links.get(a).isDisplayed())
			if(name.equals("Hindi") ||name.equals("Telugu") || name.equals("Urdu") || name.equals("Tamil") ||name.equals("Marathi") ||name.equals("Gujarati") ||name.equals("Kannada") ||name.equals("Malayalam") ||name.equals("Bengali") || a==16)
			System.out.println("Name of link "+a+" is : "+name);
			else
			System.out.println("Name of link "+a+" is : "+links.get(a).getText());
			
			
		}
		
		

	}
}
