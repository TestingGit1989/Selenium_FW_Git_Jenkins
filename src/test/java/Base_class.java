import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class {
	
	public static WebDriver driver;
	public static Properties prop;

	
	@BeforeMethod
	public void loadprop() throws IOException 
	{
		
	
		prop  = new Properties();
		File file = new File("C:\\Selenium_Script\\eclipse-workspace\\PL_FW\\src\\main\\resources\\Object.properties");
		FileReader read = new FileReader(file);
		prop.load(read);
		int current_browser = Integer.valueOf(prop.getProperty("Select_Browser"));
		
		switch (current_browser) {
		case 1:
	
			
			System.setProperty("webdriver.chrome.driver","C:\\Selenium_Script\\exe\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));
			
			break;

		default:
		{
			System.out.println("Select Option");
		}
			break;
		}
	}
	

}
