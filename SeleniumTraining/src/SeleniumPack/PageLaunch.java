package SeleniumPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLaunch {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Software\\chromedriver_win32-2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		

	}

}
