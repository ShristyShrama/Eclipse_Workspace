package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Software\\chromedriver_win32-2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");

		// drop box handling

		Select select = new Select(driver.findElement(By.id("gh-cat")));
		select.selectByVisibleText("Books");

	}

}
