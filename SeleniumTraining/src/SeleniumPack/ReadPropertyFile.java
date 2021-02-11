package SeleniumPack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropertyFile {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(
				"F:\\Eclipse_Workspace\\SeleniumTraining\\src\\SeleniumPack\\config.properties");
		prop.load(ip);

		System.out.println(prop.getProperty("name")); //--taking data from config file
		System.out.println(prop.getProperty("age"));  //--taking data from config file

		String URL = prop.getProperty("url"); //--taking data from config file
		System.out.println(URL);  

		String browsername = prop.getProperty("browser"); //--taking data from config file
		System.out.println(browsername); 

		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"F:\\Selenium_Software\\chromedriver_win32-2\\chromedriver.exe");
		    driver = new ChromeDriver();
			driver.get(URL); //--not run
		}

		/*
		 * else if (browsername.equals("ff")) {
		 * System.setProperty("webdriver.chrome.driver",
		 * "F:\\Selenium_Software\\chromedriver_win32-2\\geckodriver.exe"); driver=new
		 * FireFoxDriver(); } else if (browsername.equals("InternetXp")) {
		 * System.setProperty("webdriver.chrome.driver",
		 * "F:\\Selenium_Software\\chromedriver_win32-2\\internetexploer.exe"); driver=new
		 * InternetExploerDriver(); }
		 */

	}

}
