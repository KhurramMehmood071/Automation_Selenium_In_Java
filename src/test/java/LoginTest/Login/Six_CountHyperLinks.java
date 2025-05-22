package LoginTest.Login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Six_CountHyperLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AKDNdHRC\\Selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Browser Open in Maximise Window
		driver.manage().window().maximize();

		// Open calculator web demo page
		driver.get("https://www.calculator.net/");

		// Print Size HyperLinks Options
		List<WebElement> allhyperlinks = driver.findElements(By.tagName("a"));
		System.out.println("Total Links on Web Page: " + allhyperlinks.size()); // Print Size

		// Print all HyperLinks Options
		for (WebElement el : allhyperlinks) {
			System.out.println(el.getText());
		}

	}

}
