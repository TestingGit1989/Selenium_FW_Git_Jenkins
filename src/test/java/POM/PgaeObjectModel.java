package POM;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Logger;

public class PgaeObjectModel {
	
	public static void login(WebDriver driver, Properties prop, String uname , String Pwd)
	{
		
		WebElement ENteruname = driver.findElement(By.id(prop.getProperty("Username")));
		ENteruname.sendKeys(uname);
		Logger.getlog1("PgaeObjectModel", "Enter username");
		WebElement ENterpwd = driver.findElement(By.id(prop.getProperty("password")));
		ENterpwd.sendKeys(Pwd);
		Logger.getlog1("PgaeObjectModel", "Enter pwd");
		WebElement clicksubmit = driver.findElement(By.id(prop.getProperty("Enter")));
		clicksubmit.click();;
		Logger.getlog1("PgaeObjectModel", "Login");
		
	}

}
