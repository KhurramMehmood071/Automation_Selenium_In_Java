package LoginTest.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Three_CSS_Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AKDNdHRC\\Selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Browser Open in Maximise Window
		driver.manage().window().maximize();

		// Open sauce demo web page
		driver.get("https://www.saucedemo.com");

		// Locate User name By CSS Locator -- [tag#id] -- CSS Locator # 01
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");

		// Locate Password by By CSS Locator -- (tag[attribute=value]) -- CSS Locator #
		// 03
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");

		// Locate Login Button by CSS Locator using [tag.value of class name] -- CSS
		// Locator # 02
		driver.findElement(By.cssSelector("input.btn_action")).click();

		// Switch to Product Page
		String currWindoeHanle = driver.getWindowHandle();
		driver.switchTo().window(currWindoeHanle);

		// Locate Sauce Labs Bolt T-Shirt By Link Text [Enter Full Link Text]
		// driver.findElement(By.linkText("Sauce Labs Backpack")).click(); //Click
		// Operation

		// Switch to Product Page
		// String currWindoeHanle1 = driver.getWindowHandle();
		// driver.switchTo().window(currWindoeHanle1);

		// Locate Add to Cart Button by CSS Locator using
		// (tag.valueClass[attribute=value]) -- CSS Locator # 04
		driver.findElement(By.cssSelector("button.btn[name= add-to-cart-sauce-labs-backpack")).click();

		// Locate Add to Cart Button by CSS Locator using
		// (tag[attribute(Symbol)=substring]) -- CSS Locator # 05
		// Symbol = ^ starts-With, $ ends-With, * contains-With.
		driver.findElement(By.cssSelector("button[name*= bike")).click();

		// Locate Add to Cart Button by CSS Locator using
		// (tag[attribute(Symbol)=substring]) -- CSS Locator # 05
		// Symbol = ^ starts-With, $ ends-With, * contains-With.
		driver.findElement(By.cssSelector("button[name$= shirt")).click();

	}

}
