package LoginTest.Login;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thirteen_Web_Table {

	public static void main(String[] args) {
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
		driver.get("https://testautomationpractice.blogspot.com/");

		// Find First Cell in Web Table and Print First Cell Data
		String CellOne = driver.findElement(By.xpath("//td[normalize-space()='Learn Selenium']")).getText();
		System.out.println("Cell One: " + CellOne);

		// Find Total Rows in Web Table Note tr for Row
		List<WebElement> rowList = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		System.out.println("Total Rows: " + rowList.size()); // Total No of Rows

		// Find Total Columns in Web Table Note th for Column
		List<WebElement> columnList = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
		System.out.println("Total Columns: " + columnList.size()); // Total No of Columns

		// Print Table Cell values
		for (int r = 2; r <= rowList.size(); r++) // Rows
		{
			for (int c = 1; c <= columnList.size(); c++) // Columns
			{
				String data = driver
						.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[" + r + "]/td[" + c + "]"))
						.getText();
				System.out.print("  " + data + "  ");
			}
			System.out.println();
			System.out.println();
		}

	}

}
