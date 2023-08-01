package Utility;

import org.apache.log4j.PropertyConfigurator;

public class Logger {

	public static void getlog1(String ClassName , String Message )
	{
		
	org.apache.log4j.Logger logs = org.apache.log4j.Logger.getLogger("ClassName");
	PropertyConfigurator.configure("log4j.properties");
	logs.info(Message);
	}
}
