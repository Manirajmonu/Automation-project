package webdriverExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel_Read_Write {

	public static void main(String args[]) throws Exception
	{
		//FileInputStream is a class used to read data from a file in the form of sequence of bytes.
		FileInputStream fis = new FileInputStream("D:\\ExcelReadWrite.xlsx");
		XSSFWorkbook workbook1 = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = workbook1.getSheet("test");
		
		System.out.println("Name of the sheet: " +sheet1.getSheetName());
		System.out.println("Number of Rows: " +sheet1.getLastRowNum());
		System.out.println("Before updating Cell Data :"+sheet1.getRow(2).getCell(1));
		
		// Write the data to excel file
		//getRow() - Retrieve the row number
		//getCell() - Retrieve the data value from grid
		XSSFCell cell1 = sheet1.getRow(2).getCell(1); 
		cell1.setCellValue("test123"); // setCellValue - used to add data in the cell
		fis.close();
		
		//FileOutputStream is a class used for writing streams of raw bytes.
		FileOutputStream fileOut1=new FileOutputStream("D:\\\\ExcelReadWrite.xlsx");
		workbook1.write(fileOut1);
		System.out.println("Updated data after write is done: " + cell1.getStringCellValue());
		fileOut1.close();
	}
}
