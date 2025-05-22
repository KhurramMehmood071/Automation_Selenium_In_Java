package LoginTest.Login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Five_DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AKDNdHRC\\Selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//Browser Open in Maximise Window 
		driver.manage().window().maximize();

		// Open opencart web demo page
		driver.get("https://practice.expandtesting.com/dropdown");
		
		WebElement element = driver.findElement(By.id("country"));
		
		Select dropdown = new Select(element);
		
		//Select By Visible Text Property
		//dropdown.selectByVisibleText("Japan");
		
		//Select By Value Property
		//dropdown.selectByValue("JP");
		
		//Select By Index Property
		dropdown.selectByIndex(1); //Indexing Start with 0 "Empty Option"
		
		//Dropdown Multiple Selection Statement
		if(dropdown.isMultiple())
		{
			System.out.println("Dropdown is Multiple");
		}
		else
		{
			System.out.println("Dropdown is not Multiple");
		}
		
		//Print all Dropdown Options
		List <WebElement> alldropdownoptions = dropdown.getOptions();
		
		System.out.println("Total Options: " + alldropdownoptions.size()); // Print Size
		
		for(WebElement el :alldropdownoptions)
		{
			System.out.println(el.getText());
		}

	}

}
