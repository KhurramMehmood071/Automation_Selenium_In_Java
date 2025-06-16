package LoginTest.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twenty_Two_Ver_Hori_Scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AKDNdHRC\\Selenium\\Training Sessions\\Session 01\\MavenLoginTest\\Login\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// maximise browser
		driver.manage().window().maximize();

		// open url
		driver.get("https://www.alexflueras.ro/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Scroll vertically down by 500 pixels
		// js.executeScript("window.scrollBy(0,1000)");

		// scroll till visibilty of web element
		// WebElement element = driver.findElement(By.linkText("BMI Calculator"));
		// js.executeScript("arguments[0].scrollIntoView();",element );

		// To scroll down the web page at the bottom of the page
		// js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		// Horizontal scroll on the web page
		WebElement Element = driver.findElement(By.xpath("/html/body/main/div/div/div[16]/a"));
		js.executeScript("arguments[0].scrollIntoView();", Element);

	}

}
