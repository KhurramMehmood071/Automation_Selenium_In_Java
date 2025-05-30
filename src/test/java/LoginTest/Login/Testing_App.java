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

			// **********************Shadow Host*****************

			// Step 1: Locate the shadow host
			WebElement shadowHost = driver.findElement(By.cssSelector("#usercentrics-cmp-ui")); // Adjust selector

			// Step 2: Access the shadow root
			SearchContext shadowRoot = shadowHost.getShadowRoot();

			// Step 3: Locate the button inside the shadow root
			WebElement button = shadowRoot.findElement(By.cssSelector("#accept")); // Adjust CSS selector

			// Step 4: Interact with the button
			button.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// ********First Dropdown Selection Industry***********

		String First_Dropdown_Option = "Mining"; // Example value, can be changed as needed

		// Locate the dropdown
		WebElement dropdownInput = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".css-y7zb47-control")));

		// Step 2: Click the input field to open the dropdown
		dropdownInput.click();

		// Discount selection based on Patient_Discount value
		switch (First_Dropdown_Option.toLowerCase()) {
		case "construction":
			WebElement constructionOption = wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("/html/body/div[1]/main/div[1]/div/div/div[3]/div[1]/div/div[2]/div/div[1]/div")));
			constructionOption.click();
			break;

		case "mining":
			WebElement mining = wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("/html/body/div[1]/main/div[1]/div/div/div[3]/div[1]/div/div[2]/div/div[2]/div")));
			mining.click();
			break;

		case "qarry & aggregate":
			WebElement qarry = wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("/html/body/div[1]/main/div[1]/div/div/div[3]/div[1]/div/div[2]/div/div[3]/div")));
			qarry.click();
			break;

		case "cranes":
			WebElement cranes = wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("/html/body/div[1]/main/div[1]/div/div/div[3]/div[1]/div/div[2]/div/div[4]/div")));
			cranes.click();
			break;

		case "farming & agriculture":
			WebElement farming = wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("/html/body/div[1]/main/div[1]/div/div/div[3]/div[1]/div/div[2]/div/div[5]/div")));
			farming.click();
			break;

		default:
			System.out.println("Invalid option specified: " + First_Dropdown_Option);
			break;
		}

		Thread.sleep(1000);

		// ********Second Dropdown Selection Sub Category***********

		String Second_Dropdown_Option = "Wheel Loaders"; // Example value, can be changed as needed

		// Locate the dropdown
		WebElement dropdownInput2 = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("/html/body/div[1]/main/div[1]/div/div/div[3]/div[2]/div")));

		// Dropdown Click
		dropdownInput2.click();

		// Discount selection based on Patient_Discount value
		switch (Second_Dropdown_Option.toLowerCase()) {
		case "hydraulic excavators":
			WebElement hydraulicOption = wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("/html/body/div[1]/main/div[1]/div/div/div[3]/div[2]/div/div[2]/div/div[1]/div")));
			hydraulicOption.click();
			break;

		case "loaders":
			WebElement loaders = wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("/html/body/div[1]/main/div[1]/div/div/div[3]/div[2]/div/div[2]/div/div[2]/div")));
			loaders.click();
			break;

		case "mining shovels":
			WebElement shovels = wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("/html/body/div[1]/main/div[1]/div/div/div[3]/div[2]/div/div[2]/div/div[3]/div")));
			shovels.click();
			break;

		case "wheel loaders":
			WebElement wheel = wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("/html/body/div[1]/main/div[1]/div/div/div[3]/div[2]/div/div[2]/div/div[4]/div")));
			wheel.click();
			break;

		default:
			System.out.println("Invalid option specified: " + Second_Dropdown_Option);
			break;
		}
		
		Thread.sleep(1000);

		// ********Third Dropdown Selection Sub Manufacturer***********

		String Third_Dropdown_Option = "Leibherr"; // Example value, can be changed as needed

		// Locate the dropdown
		WebElement dropdownInput3 = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("/html/body/div[1]/main/div[1]/div/div/div[3]/div[3]/div/div")));

		// Dropdown Click
		dropdownInput3.click();

		// Discount selection based on Patient_Discount value
		switch (Third_Dropdown_Option.toLowerCase()) {
		case "leibherr":
			WebElement hydraulicOption = wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("/html/body/div[1]/main/div[1]/div/div/div[3]/div[3]/div/div[2]/div/div/div")));
			hydraulicOption.click();
			break;

		default:
			System.out.println("Invalid option specified: " + Third_Dropdown_Option);
			break;
		}

		Thread.sleep(1000);
		
		// ********Locate Search Button***********

		driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/div/div/div[3]/button")).click();
		
		// *********Click ON Liebherr L 538***********

		WebElement L538 = null;
		try {
			L538 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
					"/html/body/div[1]/main/div/div/div[2]/div[2]/div[3]/div[1]/div[4]/div/div[2]/div[1]/div[1]/div/a")));
		} catch (Exception e) {
			System.out.println("ID not found, trying CSS selector...");
			L538 = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".css-1q1fnlq input")));
		}
		
		Thread.sleep(1000);

		// Step 1: Scroll to the dropdown input to ensure it's in the viewport
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", L538);
		Thread.sleep(2000); // Pause for 2 seconds after scrolling

		// Step 2: Wait for the element to be clickable
		wait.until(ExpectedConditions.elementToBeClickable(L538));

		// Step 3: Click the dropdown (use JavaScript click as fallback)
		try {
			L538.click();
		} catch (Exception e) {
			System.out.println("Standard click failed, trying JavaScript click...");
			js.executeScript("arguments[0].click();", L538);
		}
		
		Thread.sleep(10000);
		
		// *********Slow Scroll to Bottom of Page***********
	
		js.executeScript(
		    "function scrollToBottomSlowly() {" +
		    "  let currentPosition = window.scrollY;" +
		    "  const targetPosition = document.body.scrollHeight - window.innerHeight;" +
		    "  const step = 50;" + // Pixels per step (adjust for speed)
		    "  const delay = 10;" + // Delay in ms (adjust for speed)
		    "  function scrollStep() {" +
		    "    if (currentPosition < targetPosition) {" +
		    "      currentPosition += step;" +
		    "      window.scrollTo(0, currentPosition);" +
		    "      if (currentPosition < targetPosition) {" +
		    "        setTimeout(scrollStep, delay);" +
		    "      }" +
		    "    }" +
		    "  }" +
		    "  scrollStep();" +
		    "}" +
		    "scrollToBottomSlowly();"
		);

		// Wait for scrolling to complete (approximate time based on page height and scroll speed)
		Thread.sleep(3000); // Adjust based on page height or use dynamic wait if needed

		// *********Click on Contact Us***********
		// Locate the "Contact Us" link
		WebElement contactUsLink = wait.until(ExpectedConditions.elementToBeClickable(
		    By.xpath("/html/body/div[1]/footer/div/div/div[2]/div/div[3]/a[4]")
		));

		// Click the "Contact Us" link (use JavaScript click as fallback)
		try {
		    contactUsLink.click();
		} catch (Exception e) {
		    System.out.println("Standard click failed, trying JavaScript click...");
		    js.executeScript("arguments[0].click();", contactUsLink);
		}

		// Wait briefly for navigation to complete (optional, adjust as needed)
		Thread.sleep(1000);

		// Close the browser
		driver.quit();
	}
}
