package SeleniumPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Software\\chromedriver_win32-2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Java");
        //driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Java"); 
		//driver.findElement(By.xpath("//input[@size='50']")).sendKeys("Java");
		//driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Java");
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//1.contains()
		//driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("Java");
		
	    //2.starts-with()
		//driver.findElement(By.xpath("//input[starts-with(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("Java");
	
		//3.ends-with()--not work
		//driver.findElement(By.xpath("//input[ends-with(@id,'-ac')]")).sendKeys("Java");
		
		//custom xpath for links
		driver.findElement(By.xpath("//a[contains(text(),'Sell')]")).click();


	}

}
