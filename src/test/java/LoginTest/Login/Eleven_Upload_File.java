package LoginTest.Login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Eleven_Upload_File {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AKDNdHRC\\Selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Wait 10 Seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		// Browser Open in Maximise Window
		driver.manage().window().maximize();

		// Open url web demo page
		driver.get("https://demoqa.com/upload-download");
		
		//Find Web Element Choose File and Upload using SendKeys() Method  [[[Note]]] --> In HTML type="file" is Mandatory Other wise sendKeys() Method is not Working.
		//driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\AKDNdHRC\\Downloads\\KE Bill\\gasbill_1721116515_202412_20250106102410.pdf");
		
		//Find Web Element Choose File Button and Perform Click by moveToElement() Method
		WebElement ChooseFile =  driver.findElement(By.xpath("//input[@id='uploadFile']"));
	
		//Click Action
		Actions act = new Actions(driver);
		act.moveToElement(ChooseFile).click().perform();
		
		//Initialise Robot Variable
		Robot rb = new Robot();
		 rb.delay(2000);
		
		//Copy File to Clip Board
		StringSelection ss = new StringSelection("C:\\Users\\AKDNdHRC\\Downloads\\KE Bill\\gasbill_1721116515_202412_20250106102410.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//Perform Control + V action to Paste File
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER); 

	}

}
