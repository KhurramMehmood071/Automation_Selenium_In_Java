package LoginTest.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class Seventeen_JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Launch chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AKDNdHRC\\Selenium\\Training Sessions\\Session 01\\MavenLoginTest\\Login\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// maximise browser
		driver.manage().window().maximize();

		// open url
		driver.get("http://uitestingplayground.com/textinput");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// 1. Enter text in search box using JavaScript**********
		// enter text in search box
		js.executeScript("document.getElementById('newButtonName').value='My Button';");

		// 2. Click on button using JavaScript**********
		// click on find button
		WebElement element = driver.findElement(By.xpath("//button[@id='updatingButton']"));
		js.executeScript("arguments[0].click();", element);

		// Java Script Utility Class Define in
		// (LoginTest.Login.Eighteen_JavaScriptUtility)
		Eighteen_JavaScriptUtility.drawBorder(element, driver);
		System.out.println(Eighteen_JavaScriptUtility.getTitleByJavaScript(driver));

		Thread.sleep(4000); // wait for 2 seconds

		// 3.Refresh browser using JavaScript**********
		// refresh browser
		js.executeScript("history.go(0)");

		// 4. Get Domain, Title, URL using JavaScript**********
		// get domain name
		// String domain = js.executeScript("return document.domain;").toString();
		// System.out.println("Domain:" + domain);

		// get title name
		// String title = js.executeScript("return document.title;").toString();
		// System.out.println("Title:" + title);

		// get url name
		// String url = js.executeScript("return document.URL;").toString();
		// System.out.println("URL:" + url);

		// 5. Draw border around web element using JavaScript**********
		// draw broder around web element
		// js.executeScript("arguments[0].style.border = '3px solid red';", element);

		// 6. Zoom in and Zoom out web page using JavaScript**********
		// zoom 50%
		// js.executeScript("document.body.style.zoom='50%'");

		// 7. Return height and width of web page using JavaScript**********
		// Return height and width of web page
		// System.out.println(js.executeScript("return
		// window.innerHeight;").toString());
		// System.out.println(js.executeScript("return window.innerWidth;").toString());

		// 8. Scroll web page using JavaScript**********
		// scroll vertically till the end
		// js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		// scroll vertically page up
		// js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

		// 9. Generate alert using JavaScript**********
		// js.executeScript("alert('This is my alert message.');");

		// 10. Redirect to another page using JavaScript**********
		// js.executeScript("window.location = 'http://www.google.com'");

		// 11. Flash web element using JavaScript**********
		// flash
		// String bgcolor = element.getCssValue("backgroundColor");
		// for (int i = 0; i < 20; i++)
		// {
		// js.executeScript("arguments[0].style.backgroundColor ='#000000'",
		// element);//black
		//
		// try {
		// Thread.sleep(80);//20 ms
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// js.executeScript("arguments[0].style.backgroundColor = '" + bgcolor + "'",
		// element);
		//
		// try {
		// Thread.sleep(80);//20 ms
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		//
//		 }

	}

}
