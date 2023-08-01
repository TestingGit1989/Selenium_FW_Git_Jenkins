package POM;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Utility.ReadExcel;
import jxl.JXLException;
import jxl.read.biff.BiffException;


@Test
public class TC_001 extends Base_class {
public void getlogin() throws IOException, JXLException
{
	PgaeObjectModel.login(driver, prop,ReadExcel.readData(0, 1, 0) , ReadExcel.readData(1, 1, 0));
	Utility.Logger.getlog1("TC_001", "Successfully login");
	System.out.println("Login done by us");
}
}
