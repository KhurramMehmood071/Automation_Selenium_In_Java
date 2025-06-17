package LoginTest.Login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twenty_Six_Date_Picker_Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 31-Mar-2022;

		String expectedDay = "16";
		String expectedMonthYear = "October 2025";
		// String expectedYear = "2022";

		// launch chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AKDNdHRC\\Selenium\\Training Sessions\\Session 01\\MavenLoginTest\\Login\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// maximise browser
		driver.manage().window().maximize();

		// open url
		driver.get("https://www.goibibo.com/");
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/span/span")).click();
		// find date picker webelement to perform click action

		WebElement datepicker = driver.findElement(By.xpath("/html/body/div/div[4]/div/div/div[2]/div[3]/div"));
		datepicker.click();

		while (true) {
			String calenderMonthYear = driver.findElement(By.xpath(
					"/html/body/div/div[4]/div/div/div[2]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/div"))
					.getText();

			if (calenderMonthYear.equals(expectedMonthYear)) {
				List<WebElement> daysList = driver.findElements(By.xpath("//p[@class='fsw__date']"));

				for (WebElement e : daysList) {
					String calenderDay = e.getText();
					if (calenderDay.equals(expectedDay)) {
						e.click();
						break;

					}
				}

				break;
			} else {
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			}
		}

	}

}
