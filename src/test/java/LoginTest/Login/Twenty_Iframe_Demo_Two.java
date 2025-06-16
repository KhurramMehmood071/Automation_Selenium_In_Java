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
		driver.get("https://demo.automationtesting.in/Frames.html");

		// Switch to Second Button Tab
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();

		// switch to 1st frame (Parent Frame)
		WebElement iframeElementOne = driver
				.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[2]/div[2]/iframe"));
		driver.switchTo().frame(iframeElementOne);

		// switch to 2nd frame (Child Frame)
		WebElement iframeElementTwo = driver
				.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(iframeElementTwo);

//		// find web element
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Welcome to Frame");
//
//		// switch to main page
//		driver.switchTo().defaultContent();// main page
//
//		// swith to 2nd frame
//		driver.switchTo().frame(1);
//		// find web element "Alert" Link text of 2nd frame
//		driver.findElement(By.linkText("Alert")).click();
//
//		// switch to main page
//		driver.switchTo().defaultContent();// main page
//
//		// find & print total iframes on web page
//		int noOfiframes = driver.findElements(By.tagName("iframe")).size();
//		System.out.println("no. of iframes:" + noOfiframes);

	}

}
