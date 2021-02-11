package SeleniumPack;

//import java.io.File;
//import org.apache.commons.io.FileUtils;
///import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	// NOT EXECUTE

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Software\\chromedriver_win32-2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// Use TakesScreenshot method to capture screenshot
		// TakesScreenshot screenshot = (TakesScreenshot)driver;
		// Saving the screenshot in desired location
		// File source = screenshot.getScreenshotAs(OutputType.FILE);
		// Path to the location to save screenshot
		// FileUtils.copyFile(source, new
		// File("C:\\Users\\Shivakar\\eclipse-workspace\\SELENIUM_PACTISE\\src\\selenium_practise_package\\Screen.png"));
		System.out.println("Screenshot is captured");
		driver.quit();

	}

}
