package LoginTest.Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ten_MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AKDNdHRC\\Selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Wait 10 Seconds
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));

		// Browser Open in Maximise Window
		driver.manage().window().maximize();

		// Open url web demo page
		driver.get("https://practice.expandtesting.com/hovers");

		// Find MouseOver Web Element
		WebElement element = driver.findElement(By.xpath("//body/main/div/div/div[1]/img[1]")); // MouseOver Web Element

		// Using Actions Property MouseOver
		Actions act = new Actions(driver);
		act.moveToElement(element).perform(); // moveToElement() Mouse hover action

	}

}
