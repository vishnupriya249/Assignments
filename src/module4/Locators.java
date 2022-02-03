package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators {
	
	
	static WebElement EmailAdd = OracleRegister.driver.findElement(By.id("sView1:r1:0:email::content"));
	static WebElement Pass = OracleRegister.driver.findElement(By.name("sView1:r1:0:password"));
	static WebElement RePass = OracleRegister.driver.findElement(By.name("sView1:r1:0:retypePassword"));
	static WebElement FirstName = OracleRegister.driver.findElement(By.name("sView1:r1:0:firstName"));
	static WebElement LastName = OracleRegister.driver.findElement(By.name("sView1:r1:0:lastName"));
	static WebElement JobTitle = OracleRegister.driver.findElement(By.name("sView1:r1:0:jobTitle"));
	static WebElement WorkPh = OracleRegister.driver.findElement(By.name("sView1:r1:0:workPhone"));
	static WebElement CompanyName = OracleRegister.driver.findElement(By.name("sView1:r1:0:companyName"));
	static WebElement Address1 = OracleRegister.driver.findElement(By.name("sView1:r1:0:address1"));
	static WebElement Address2 = OracleRegister.driver.findElement(By.name("sView1:r1:0:address2"));
	static WebElement City = OracleRegister.driver.findElement(By.name("sView1:r1:0:city"));
	static WebElement ZIP = OracleRegister.driver.findElement(By.name("sView1:r1:0:postalCode"));
	static WebElement Create = OracleRegister.driver.findElement(By.linkText("Create Account"));
	static WebElement Country =OracleRegister. driver.findElement(By.id("sView1:r1:0:country::content"));
	static WebElement State = OracleRegister.driver.findElement(By.id("sView1:r1:0:state::content"));

}
