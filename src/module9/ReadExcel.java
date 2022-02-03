package module9;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {
	
	File f;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sh;
	public ReadExcel() throws IOException 
	{
	f = new File("C:\\Users\\ram mohan reddy\\Desktop\\Book3.xlsx");
	
	fis = new FileInputStream(f);
	
	wb = new XSSFWorkbook(fis);

	
	}
	public String getExcelData(int shno, int row , int col)
	{
		sh = wb.getSheetAt(shno);
		String data = sh.getRow(row).getCell(col).getStringCellValue();
		//System.out.println("the sheet name is"+sh.getSheetName());
		System.out.println("the data is"+data);
		return data;
	}
	public int getRowCount(int shno)
	{
		sh = wb.getSheetAt(shno);
		int Rows = sh.getLastRowNum()+1;
		
		System.out.println("The last row num is:"+sh.getLastRowNum()+"The first Row num is:"+sh.getFirstRowNum());
	
		return Rows;
		
	}
	public int getColCount(int shno)
	{
		sh = wb.getSheetAt(shno);
		int Cols = sh.getRow(0).getLastCellNum();
		System.out.println("The last column count is:"+sh.getRow(0).getLastCellNum());
		return Cols;
	}

}
