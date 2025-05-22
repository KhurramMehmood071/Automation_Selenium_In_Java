package LoginTest.Login;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fifteen_Capture_Screen {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AKDNdHRC\\Selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Wait 10 Seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(600));

		// Browser Open in Maximise Window
		driver.manage().window().maximize();

		// Open url web demo page
		driver.get("https://only-testing-blog.blogspot.com/?fname=&lname=");

// 		// Capture Full Page ScreenShot
//		// Step#01: Convert Webdriver Object to TakesScreenshot Interface
//
//		TakesScreenshot screenshot = ((TakesScreenshot) driver);
//
//		// Step#02: Call getScreenshotAs method to create image file
//
//		// Source File
//		File scr = screenshot.getScreenshotAs(OutputType.FILE);
//		// Destination File
//		File dest = new File(
//				"C:\\Users\\AKDNdHRC\\Selenium\\Training Sessions\\Session 01\\MavenLoginTest\\Login\\Screenshot\\fullpage.png");
//
//		/*
//		 * Step#03: After Add Dependency (Apache Commons-io) in pom.xml file then Copy
//		 * image file to destination
//		 */
//		FileUtils.copyFile(scr, dest);

//		// Capture Section of a Web Page ScreenShot
//		// Step#01: Convert Webdriver Object to TakesScreenshot Interface
//
//		WebElement section = driver.findElement(By.xpath("//a[@title='Test Image To Verify Tooltip']//img"));
//
//		// Step#02: Call getScreenshotAs method to create image file
//
//		// Source File
//		File scr = section.getScreenshotAs(OutputType.FILE);
//		// Destination File
//		File dest = new File(
//				"C:\\Users\\AKDNdHRC\\Selenium\\Training Sessions\\Session 01\\MavenLoginTest\\Login\\Screenshot\\section.png");
//
//		/*
//		 * Step#03: After Add Dependency (Apache Commons-io) in pom.xml file then Copy
//		 * image file to destination
//		 */
//
//		FileUtils.copyFile(scr, dest);
		
		// Capture Web Element of a Web Page ScreenShot
				// Step#01: Convert Webdriver Object to TakesScreenshot Interface

				WebElement webelement = driver.findElement(By.xpath("//form[contains(text(),'First name:')]//input[@id='submitButton']"));

				// Step#02: Call getScreenshotAs method to create image file

				// Source File
				File scr = webelement.getScreenshotAs(OutputType.FILE);
				// Destination File
				File dest = new File(
						"C:\\Users\\AKDNdHRC\\Selenium\\Training Sessions\\Session 01\\MavenLoginTest\\Login\\Screenshot\\WebElement.png");

				/*
				 * Step#03: After Add Dependency (Apache Commons-io) in pom.xml file then Copy
				 * image file to destination
				 */

				FileUtils.copyFile(scr, dest);

	}

}