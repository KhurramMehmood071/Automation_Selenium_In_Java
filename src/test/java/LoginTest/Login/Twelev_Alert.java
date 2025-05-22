package LoginTest.Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twelev_Alert {

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
		driver.get("https://demoqa.com/alerts");

		// Find Alert Button and Perform Click Action
		 driver.findElement(By.xpath("//button[@id='alertButton']")).click();

		// Switch to Alert Window and Accept the Alert
		 driver.switchTo().alert().accept(); // Ok Button is Clicked

		// Find Confirm Alert Button and Perform Click Action
		 driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
 
		// Switch to Confirm Alert Window and Accept the Alert
		 driver.switchTo().alert().accept(); // Ok Button is Clicked
		// driver.switchTo().alert().dismiss(); // Cancel Button is Clicked

		// Find Confirm Alert Button and Perform Click Action
		 driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		 
		// Switch to Prompt Alert Window and Accept the Alert
		 driver.switchTo().alert().sendKeys("Khurram Mehmood"); // Enter Text in Input Field 
		 driver.switchTo().alert().accept(); // Ok Button is Clicked
		// driver.switchTo().alert().dismiss(); // Cancel Button is Clicked

	}

}
