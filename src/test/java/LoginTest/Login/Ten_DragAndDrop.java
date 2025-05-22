package LoginTest.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ten_DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AKDNdHRC\\Selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Wait 10 Seconds
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		// Browser Open in Maximise Window
		driver.manage().window().maximize();

		// Open url web demo page
		driver.get("https://demoqa.com/droppable");

		// Find Source Web Element
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']")); // Source Element

		// Find Target Web Element
		WebElement target = driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']")); // Target Element

		// Using Actions Property to Mouse Darg and Drop
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform(); // Drag and Drop action

	}

}
