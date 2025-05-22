package LoginTest.Login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eight_RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AKDNdHRC\\Selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Browser Open in Maximise Window
		driver.manage().window().maximize();

		// Open url web demo page
		driver.get("https://demoqa.com/radio-button");

		// Print List Radio Buttons
		List<WebElement> radioButtonList = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("No of Radio Buttons: " + radioButtonList.size());
		driver.close();

	}

}
