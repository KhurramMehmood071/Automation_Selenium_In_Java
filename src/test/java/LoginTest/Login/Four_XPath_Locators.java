package LoginTest.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Four_XPath_Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AKDNdHRC\\Selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//Browser Open in Maximise Window 
		driver.manage().window().maximize();

		// Open sauce demo web page
		driver.get("https://www.saucedemo.com");

		// Locate User name By using single attribute (Relative Xpath)
		// Here are a few basic XPath examples in Selenium using the syntax:
		// XPath = //tagname[@Attribute=’Value’]
		//driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		
		// Locate User name By Xpath using contains expression (Relative Xpath)
		// Here are a few basic XPath examples in Selenium using the syntax:
		// XPath = //tagname[contains(@Attribute,'Value')]
		//driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("standard_user");
		
		// Locate User name By Xpath using Starts-With Method (Relative Xpath)
		// Here are a few basic XPath examples in Selenium using the syntax:
		// XPath = //tagname[starts-with(@Attribute,'Value')]
		driver.findElement(By.xpath("//input[starts-with(@id,'user')]")).sendKeys("standard_user");

		// Locate Password By using multiple attributes (Relative Xpath)
		// Here are a few basic XPath examples in Selenium using the syntax:
		// 1. //<HTML tag>[@attribute_name1='attribute_value1'][@attribute_name2='attribute_value2]  OR
		// 2. //*[@attribute_name1='attribute_value1'][@attribute_name2='attribute_value2]  
		driver.findElement(By.xpath("//*[@id='password'][@name='password']")).sendKeys("secret_sauce");
		
		// Locate Login Button by Xpath
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		// Switch to Product Page
		String currWindoeHanle = driver.getWindowHandle();
		driver.switchTo().window(currWindoeHanle);
		
		// Locate Button By using Xpath and expressions (Relative Xpath)
		// Here is a basic XPath examples in Selenium using the syntax:
		// 1. //<HTML tag>[@attribute_name1='attribute_value1' and @attribute_name2='attribute_value2]   OR
		// 2. //*[@attribute_name1='attribute_value1' and @attribute_name2='attribute_value2]
		driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack' and @name='add-to-cart-sauce-labs-backpack']")).click();
		
		// Locate Button By using Xpath or expressions (Relative Xpath)
		// Here is a basic XPath examples in Selenium using the syntax:
		// 1. //<HTML tag>[@attribute_name1='attribute_value1' or @attribute_name2='attribute_value2]   OR
		// 2. //*[@attribute_name1='attribute_value1' or @attribute_name2='attribute_value2]
		driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bike-light' or @name='add-to-cart-sauce-labs-bike-light']")).click();
		

	}

}
