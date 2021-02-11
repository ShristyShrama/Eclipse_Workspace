package SeleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Software\\chromedriver_win32-2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		List<WebElement> allList = driver.findElements(By.tagName("a"));
		System.out.println(allList.size());

		for (WebElement link : allList) {
			System.out.println(link.getAttribute("href"));
			System.out.println(link.getText());
		}

	}

}
