package LoginTest.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class One_FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Web Browser Configuration on Eclipse: Navigate to Browser Page, Capture Page
		// Title, Url, Source

		// 1. Launch Chrome Web Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AKDNdHRC\\Selenium\\chromedriver-win64\\chromedriver.exe");

		// 2. Cr eate Chrome Web Browser Object
		WebDriver driver = new ChromeDriver();

		// Browser Open in Maximise Window
		driver.manage().window().maximize();

		// 3. Launch Google Web Page
		driver.navigate().to("http:\\www.google.com");

		// 4. Capture title of webpage and print
		String title = driver.getTitle();
		System.out.println("Page Title : " + title);

		// 5. Capture url of the webpage
		System.out.println("URL : " + driver.getCurrentUrl());

		// 6. Capture page Source
		System.out.println("Page Source : " + driver.getPageSource());
		driver.close();

	}

}
