package SeleniumPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsVisibilityTest {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Software\\chromedriver_win32-2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//1. isDisplayed() method: applicable for all elements
		driver.get("https://register.freecrm.com/register/");
		boolean b1=driver.findElement(By.name("action")).isDisplayed();
	    System.out.println(b1); //true
	    
	    //2. isEnabled() method: applicable for all elements
	    driver.findElement(By.id("terms")).click(); //--select checkbox
	    boolean b2=driver.findElement(By.name("action")).isEnabled();
	    System.out.println(b2); //true
	    
	    //3. isSelected() method: applicable for checkbox, radiobtn, dropdown
	    driver.findElement(By.id("terms")).click();
	    boolean b3=driver.findElement(By.name("action")).isSelected();
	    System.out.println(b3); //false
	}

}
