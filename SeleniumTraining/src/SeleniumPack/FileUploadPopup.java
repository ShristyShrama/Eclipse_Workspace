package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FileUploadPopup {
	
	public static void main(String[] args)  // Not Execute
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium_Software\\chromedriver_win32-2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://imagetopdf.com/");
		
		driver.findElement(By.xpath("//*[@id=\"pick-files\"]")).sendKeys("\"C:\\Users\\Shivakar\\Pictures\\Screenshots\\Screenshot (275).png\"");
	}

}
