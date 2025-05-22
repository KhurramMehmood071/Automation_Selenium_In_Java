package LoginTest.Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fourteen_Tool_Tip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AKDNdHRC\\Selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Wait 10 Seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(600));

		// Browser Open in Maximise Window
		driver.manage().window().maximize();

		// ToolTip Type# 01 [If 'title' attribute is given in HTML Code]
		
		// Open url web demo page
		driver.get("https://only-testing-blog.blogspot.com/?fname=&lname=");

		// Find Web Element Name input box
		String actualToolTip = driver.findElement(By.xpath("//input[@id='tooltip-1']")).getDomAttribute("title");
		String expectedToolTip = "Enter You name"; //ToolTip Showing in Web Page
		if (actualToolTip.equals(expectedToolTip)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		
		
		// ToolTip Type# 02 [If 'title' attribute is not given in HTML Code]
		// Watch Vieo: https://www.youtube.com/watch?v=fwc_JjkQnQ8
		
		// Open url web demo page
		driver.get("https://demoqa.com/tool-tips");
		
		//Find Web Element Class attribute of ToolTip
		Actions action = new Actions(driver);
		WebElement button = driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		action.moveToElement(button).build().perform();
		Thread.sleep(2000);
		WebElement tooltip = driver.findElement(By.className("tooltip-inner")); // Paused in debugger then you find ToolTip Class Name
		System.out.println(tooltip.getText());
	}

}
