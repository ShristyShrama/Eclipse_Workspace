package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Software\\chromedriver_win32-2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		driver.findElement(By.id("email")).sendKeys("shr@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345");
		// driver.findElement(By.id("loginbutton")).click();
		// driver.navigate().refresh();
		// driver.navigate().to("https;//upsconline.nic.in");
		// driver.navigate().back();
		// driver.navigate().forward();
		// driver.close();

	}

}
