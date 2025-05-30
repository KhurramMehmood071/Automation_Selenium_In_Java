package LoginTest.Login;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testing_App {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// ******************Launch Browser*****************

		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AKDNdHRC\\Selenium\\Training Sessions\\Session 01\\MavenLoginTest\\Login\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Explicit Wait for 60 Seconds [Specific WebElement]
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Implicit Wait for 60 Seconds [Global use for All WebElement]
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		// **********************Open Browser****************

		try {
			// Navigate to the website
			driver.get("https://www.heavykit.com/");

			// Browser Open in Maximise Window
			driver.manage().window().maximize();

			// Step 1: Locate the shadow host
			WebElement shadowHost = driver.findElement(By.cssSelector("#usercentrics-cmp-ui")); // Adjust selector

			// Step 2: Access the shadow root
			SearchContext shadowRoot = shadowHost.getShadowRoot();

			// Step 3: Locate the button inside the shadow root
			WebElement button = shadowRoot.findElement(By.cssSelector("#accept")); // Adjust CSS selector

			// Step 4: Interact with the button
			button.click();
			System.out.println("Button clicked successfully!");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Locate the dropdown control (the container for the input and arrow)
		WebElement dropdownControl = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".css-y7zb47-control")));

		// Click the dropdown to open it
		dropdownControl.click();
		
		Thread.sleep(1000); // Wait for the dropdown to open

		// Locate the input field by its ID
		WebElement dropdownInput = driver.findElement(
				By.xpath("/html/body/div[1]/main/div[1]/div/div/div[3]/div[1]/div/div/div/div[2]/div[2]/input"));

		// Clear any existing text in the input (optional, in case it's not cleared)
		dropdownInput.clear();

		// Type "Mining" into the input field
		dropdownInput.sendKeys("Mining");

		// Alternatively, if pressing Enter works for selection:
		dropdownInput.sendKeys(Keys.ENTER);

		Thread.sleep(1000);

		// Locate the dropdown control (the container for the input and arrow)
		WebElement dropdownControl1 = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("/html/body/div[1]/main/div[1]/div/div/div[3]/div[2]/div")));

		// Click the dropdown to open it
		dropdownControl1.click();
		
		Thread.sleep(1000); // Wait for the dropdown to open


		// Locate the input field by its ID
		WebElement dropdownInput1 = driver.findElement(
				By.xpath("/html/body/div[1]/main/div[1]/div/div/div[3]/div[2]/div/div/div/div[2]/div[2]/input"));

		// Clear any existing text in the input (optional, in case it's not cleared)
		dropdownInput1.clear();

		// Type "Mining" into the input field
		dropdownInput1.sendKeys("Loader");

		// Alternatively, if pressing Enter works for selection:
		dropdownInput1.sendKeys(Keys.ENTER);

		Thread.sleep(1000);

		// Locate the dropdown control (the container for the input and arrow)
		WebElement dropdownControl2 = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("/html/body/div[1]/main/div[1]/div/div/div[3]/div[3]/div/div")));

		// Click the dropdown to open it
		dropdownControl2.click();
		
		Thread.sleep(1000); // Wait for the dropdown to open


		// Locate the input field by its ID
		WebElement dropdownInput2 = driver.findElement(
				By.xpath("/html/body/div[1]/main/div[1]/div/div/div[3]/div[3]/div/div/div/div[2]/div[2]/input"));

		// Clear any existing text in the input (optional, in case it's not cleared)
		dropdownInput2.clear();

		// Type "Mining" into the input field
		dropdownInput2.sendKeys("liebherr");

		// Alternatively, if pressing Enter works for selection:
		dropdownInput2.sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/div/div/div[3]/button")).click();


		WebElement Link1 = null;
		try {
			Link1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
					"/html/body/div[1]/main/div/div/div[2]/div[2]/div[3]/div[1]/div[4]/div/div[2]/div[1]/div[1]/div/a")));
		} catch (Exception e) {
			System.out.println("ID not found, trying CSS selector...");
			Link1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".css-1q1fnlq input")));
		}

		// Step 1: Scroll to the dropdown input to ensure it's in the viewport
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", Link1);

		// Step 2: Wait for the element to be clickable
		wait.until(ExpectedConditions.elementToBeClickable(Link1));

		// Step 3: Click the dropdown (use JavaScript click as fallback)
		try {
			Link1.click();
		} catch (Exception e) {
			System.out.println("Standard click failed, trying JavaScript click...");
			js.executeScript("arguments[0].click();", Link1);
		}
		
		// Step 1: Scroll to the bottom of the page
     //   JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        // Step 2: Wait for the page to settle after scrolling
        Thread.sleep(1000); // Optional: Replace with explicit wait if needed
        
        driver.findElement(By.xpath("/html/body/div[1]/footer/div/div/div[2]/div/div[3]/a[4]")).click();
        
        Thread.sleep(1000); // Wait for the dropdown to open

        
        driver.quit();

	}

}
