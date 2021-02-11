package SeleniumPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Software\\chromedriver_win32\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		String srstitle = "facebooklogin";
		String actualtitle = driver.getTitle();
		System.out.println(driver.getTitle());
		if (srstitle.equals(actualtitle))
			System.out.println("Testcase Pass");
		else
			System.out.println("Testcase Fail");

		System.out.println(driver.getCurrentUrl());
		driver.quit();
		// System.out.println(driver.getPageSource());

	}

}
