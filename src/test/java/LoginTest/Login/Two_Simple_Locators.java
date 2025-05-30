package LoginTest.Login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Two_Simple_Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\AKDNdHRC\\\\Selenium\\\\Training Sessions\\\\Session 01\\\\MavenLoginTest\\\\Login\\\\chromedriver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Browser Open in Maximise Window
		driver.manage().window().maximize();

		// Open sauce demo web page
		driver.get("https://www.saucedemo.com");

		// Locate Username By id [id="user-name"]
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		// Locate Username By tagname [<input></input>]
		// driver.findElement(By.tagName("input")).sendKeys("standard_user");

		// Locate Password by Name [name="password"]
		driver.findElement(By.name("password")).sendKeys("secret_sauce");

		// Locate Login Button by Class [class="btn_action"]
		driver.findElement(By.className("btn_action")).click();

		// Switch to Product Page
		String currWindoeHanle = driver.getWindowHandle();
		driver.switchTo().window(currWindoeHanle);

		// Locate Sauce Labs Bolt T-Shirt By Link Text [Enter Full Link Text]
		// driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click(); //Click
		// Operation

		// Locate Sauce Labs Bolt T-Shirt By Partial Link Text [Enter Any Key Word of
		// Link Text]
		// driver.findElement(By.partialLinkText("Bolt")).click(); //Click Operation

		// Use of findElements Return List of same Elements in a Web Page
		List<WebElement> elementList = driver.findElements(By.partialLinkText("Labs"));
		System.out.println("Element Size: " + elementList.size());

	}

}
