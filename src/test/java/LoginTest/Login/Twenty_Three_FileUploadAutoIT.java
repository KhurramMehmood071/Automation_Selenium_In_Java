package LoginTest.Login;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Twenty_Three_FileUploadAutoIT {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Launch chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AKDNdHRC\\Selenium\\Training Sessions\\Session 01\\MavenLoginTest\\Login\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// maximise browser
		driver.manage().window().maximize();

		// open url
		driver.get("https://qa-automation-practice.netlify.app/file-upload.html");

		// find choose file web element
		WebElement button = driver.findElement(By.id("file_upload"));

		Actions act = new Actions(driver);
		act.moveToElement(button).click().perform();

		//
		try {
			Runtime.getRuntime().exec(
					"C://Users//AKDNdHRC//Selenium//Training Sessions//Session 01//MavenLoginTest//AutoIT//AutoIT_FileUpload.exe"
							+ " " + "C:\\Users\\AKDNdHRC\\Downloads\\Exp_Letter.docx");
		} catch (IOException e) {

			e.printStackTrace();
		}

		Thread.sleep(3000); // wait for 2 seconds

		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/button")).click();
	}

}
