package LoginTest.Login;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seven_CaptureBrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AKDNdHRC\\Selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Browser Open in Maximise Window
		driver.manage().window().maximize();

		// Wait 10 Seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open url web demo page
		driver.get("http://www.deadlinkcity.com/");

		// Print Size HyperLinks Options
		List<WebElement> linklist = driver.findElements(By.tagName("a"));

		// Print all HyperLinks Options
		int resCode = 200;// 2xx response Valid Link
		int brokenLinkCount = 0;

		System.out.println("Total Links on Web Page: " + linklist.size()); // Print Size

		for (WebElement element : linklist) {
			String url = element.getDomProperty("href");

			try {
				URL urlLink = new URI(url).toURL();

				HttpURLConnection huc = (HttpURLConnection) urlLink.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();

				resCode = huc.getResponseCode();

				if (resCode >= 400) {
					System.out.println(url + " Broken Link ");
					brokenLinkCount++;
				}
			}

			catch (MalformedURLException e) {

			}

			catch (Exception e) {

			}

		}

		System.out.println("Total Broken Linkns: " + brokenLinkCount);

	}
}
