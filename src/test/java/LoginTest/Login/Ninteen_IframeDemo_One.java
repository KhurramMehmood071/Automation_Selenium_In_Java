package LoginTest.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ninteen_IframeDemo_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AKDNdHRC\\Selenium\\Training Sessions\\Session 01\\MavenLoginTest\\Login\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// maximise browser
		driver.manage().window().maximize();
		// open url
		driver.get("https://www.rediff.com/");

		// switch to iframe moneyiframe
		driver.switchTo().frame("moneyiframe");

		// find web element & print value
		String nseindex = driver.findElement(By.id("nseindex")).getText();

		System.out.println(nseindex);

	}

}
