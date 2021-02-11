package SeleniumPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Software\\chromedriver_win32-2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://classic.freecrm.com/");

		driver.findElement(By.name("username")).sendKeys("shramashristy958@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Test123@");

		// WebElement loginBtn =
		// driver.findElement(By.xpath("//input[@type='submit']"));
		/*
		 * flash(loginBtn, driver); // --highlight element drawBorder(loginBtn, driver);
		 * // --draw border // generateAlert(driver,"There is a bug"); //--create alert
		 * box clickElementByJS(loginBtn, driver); // --clicking element by jsexecutor
		 * directly
		 * 
		 * // page refresh: // 1.direct using selenium driver.navigate().refresh(); //
		 * 2.using jsexecutor refreshBrowserByJS(driver);
		 */

		// System.out.println(getTitleByJS(driver)); //--gettitle by js
		System.out.println(getPageInnerText(driver));
		// srollPageDown(driver);
		WebElement privacylink = driver.findElement(By.linkText("Privacy Policy"));
		scrollIntoView(privacylink, driver);

	}

	public static void flash(WebElement element, WebDriver driver) {
		// JavascriptExecutor js=((JavascriptExecutor)driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 10; i++) {
			changecolor("rgb(0,200,0)", element, driver);
			changecolor(bgcolor, element, driver);
		}
	}

	public static void changecolor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor='" + color + "' ", element);

		try {
			Thread.sleep(20);
		} catch (Throwable e) {
		}
	}

	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}

	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + "')");
	}

	public static void clickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click()", element);
	}

	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go[0]");
	}

	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}

	public static String getPageInnerText(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String pagetext = js.executeScript("return document.documentElement.innerText;").toString();
		return pagetext;
	}

	public static void srollPageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	public static void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

}
