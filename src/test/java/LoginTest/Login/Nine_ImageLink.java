package LoginTest.Login;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nine_ImageLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AKDNdHRC\\Selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Wait 10 Seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Browser Open in Maximise Window
		driver.manage().window().maximize();

		// Open url web demo page
		driver.get("https://www.opencart.com/index.php?route=cms/feature");

		// Find Web Element image link open Cart
		driver.findElement(By.xpath("//img[@title='OpenCart - Features']")).click();

		// Verify Title of the Current Page with Expected home page title
		if (driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution")) {
			System.out.println("Link Passed");
		} else {
			System.out.println("Link Failed");
		}

		driver.close();

	}

}
