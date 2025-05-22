package LoginTest.Login;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sixteen_OpenNew_Window_Tab {

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

		// Open url web demo page and get title page
		driver.get("https://www.google.com/");
		System.out.println("First Page: " + driver.getTitle());
		
		//Open New Tab
	//	driver.switchTo().newWindow(WindowType.TAB); //Switch to new tab
		driver.switchTo().newWindow(WindowType.WINDOW); //Switch to new Window
		driver.get("https://www.facebook.com/"); //Open facebook Page
		System.out.println("Second Tab: " + driver.getTitle()); //Print Page Title
		
		//get window handles of open windows
		Set <String> windowHandles = driver.getWindowHandles(); //All windowhandles save to string variable windowHandles
		List <String> handles = new ArrayList<String>(); //String Array List save to String List variable handles
		handles.addAll(windowHandles);
		
		driver.close();  
		
		driver.switchTo().window(handles.get(0)); // switch to google.com
		System.out.println("First Page: " + driver.getTitle());
	}

}
