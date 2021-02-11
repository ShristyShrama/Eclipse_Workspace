package SeleniumPack;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserPopup {

	// Partial Run

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Software\\chromedriver_win32-2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.webroot.com/services/popuptester1.htm");

		driver.findElement(By.linkText("this link")).click();

		Thread.sleep(10000);

		Set<String> handler = driver.getWindowHandles();

		Iterator<String> it = handler.iterator();

		String parentwindowid = it.next();
		System.out.println("parent window id: " + parentwindowid);

		String childwindowid = it.next();
		System.out.println("child window id: " + childwindowid);

		driver.switchTo().window(childwindowid);
		Thread.sleep(10000);

		System.out.println("Child Window Title: " + driver.getTitle());

		driver.close();

		driver.switchTo().window(parentwindowid);
		Thread.sleep(10000);

		System.out.println("Parent Window Title: " + driver.getTitle());

	}
}
