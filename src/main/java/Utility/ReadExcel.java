package Utility;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel {
	
	public static String readData(int col , int row , int sheet) throws BiffException, IOException
	{
		File file  = new File("C:\\Users\\hmishra2\\Desktop\\Data.xls");
		Workbook wk = Workbook.getWorkbook(file);
		Sheet sheet1 = wk.getSheet(sheet);
		Cell getcell = sheet1.getCell(col, row);
		
		return getcell.getContents();
	}

}
