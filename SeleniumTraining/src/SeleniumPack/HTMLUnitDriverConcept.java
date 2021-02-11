package SeleniumPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDriverConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Software\\chromedriver_win32-2\\chromedriver.exe");
		// WebDriver driver=new ChromeDriver();
		WebDriver driver = new HtmlUnitDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://classic.freecrm.com/");

		System.out.println("Befor login page url--" + driver.getCurrentUrl());

		driver.findElement(By.name("username")).sendKeys("shramashristy958@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Test123@");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		System.out.println("After login page url--" + driver.getCurrentUrl());
	}

}
