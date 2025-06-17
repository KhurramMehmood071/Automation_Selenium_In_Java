package LoginTest.Login;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Twenty_Five_Date_Picker_Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 08-July-2022;
		
		String expectedDay = "20";
		String expectedMonthYear = "June 2027";

		// launch chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AKDNdHRC\\Selenium\\Training Sessions\\Session 01\\MavenLoginTest\\Login\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// maximise browser
		driver.manage().window().maximize();

		// open url
		driver.get("https://www.redbus.in");

		// find date picker webelement to perform click action

		WebElement datepicker = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div[3]/div[1]"));
		datepicker.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='monthYear___2b924f']")));

		while (true) {
			String calenderMonthYear = driver.findElement(By.xpath("//p[@class='monthYear___2b924f']")).getText();

			if (calenderMonthYear.equals(expectedMonthYear)) {
				driver.findElement(By.xpath("//span[normalize-space()='"+ expectedDay +"']")).click();

				break;
			} else {
				driver.findElement(By.xpath("//i[@class='icon icon-arrow arrow___2dd861 right___841620 ']")).click();
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
