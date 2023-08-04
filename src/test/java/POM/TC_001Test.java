package POM;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Utility.ReadExcel;
import jxl.JXLException;
import jxl.read.biff.BiffException;



public class TC_001Test extends Base_class {
	
	@Test
public void getlogin() throws IOException, JXLException
{
	PgaeObjectModel.login(driver, prop,ReadExcel.readData(0, 1, 0) , ReadExcel.readData(1, 1, 0));
	Utility.Logger.getlog1("TC_001", "Successfully login");
	System.out.println("Login done by us");
}
	@Test
	public void getlogin1() throws IOException, JXLException
	{
		PgaeObjectModel.login(driver, prop,ReadExcel.readData(0, 1, 0) , ReadExcel.readData(1, 1, 0));
		Utility.Logger.getlog1("TC_001", "Successfully login");
		System.out.println("Login done by us");
	}
	@Test
	public void getlogin2() throws IOException, JXLException
	{
		PgaeObjectModel.login(driver, prop,ReadExcel.readData(0, 1, 0) , ReadExcel.readData(1, 1, 0));
		Utility.Logger.getlog1("TC_001", "Successfully login");
		System.out.println("Login done by us");
	}
	@Test
	public void getlogin3() throws IOException, JXLException
	{
		PgaeObjectModel.login(driver, prop,ReadExcel.readData(0, 1, 0) , ReadExcel.readData(1, 1, 0));
		Utility.Logger.getlog1("TC_001", "Successfully login");
		System.out.println("Login done by us");
	}
}
