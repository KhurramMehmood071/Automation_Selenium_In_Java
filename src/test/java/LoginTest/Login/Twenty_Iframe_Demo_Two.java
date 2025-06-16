package LoginTest.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twenty_Iframe_Demo_Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AKDNdHRC\\Selenium\\Training Sessions\\Session 01\\MavenLoginTest\\Login\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// maximise browser
		driver.manage().window().maximize();
		// open url
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

		// switch to 1st frame
		WebElement iframeElement = driver.findElement(By.name("packageListFrame"));
		driver.switchTo().frame(iframeElement);

		// find web element
		driver.findElement(By.linkText("org.openqa.selenium")).click();

		// switch to main page
		driver.switchTo().defaultContent();// main page

		// swith to 2nd frame
		driver.switchTo().frame(1);
		// find web element "Alert" Link text of 2nd frame
		driver.findElement(By.linkText("Alert")).click();

		// switch to main page
		driver.switchTo().defaultContent();// main page

		// find & print total iframes on web page
		int noOfiframes = driver.findElements(By.tagName("iframe")).size();
		System.out.println("no. of iframes:" + noOfiframes);

	}

}
