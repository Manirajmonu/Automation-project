package webdriverExamples;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class Exp_Excel {
	
	public static void main(String args[]) throws Exception
	{
		//FileInputStream is a class used to read data from a file in the form of sequence of bytes.
		FileInputStream file1=new FileInputStream("D:\\ExcelRead.xls");
		Workbook wb1=Workbook.getWorkbook(file1); //A workbook is a class that contains multiple spreadsheets.
		
		Sheet st1= wb1.getSheet(0); //Sheet is a class represents a single sheet
		//getSheet() method of the Workbook class is to retrieve the desired sheet by specifying the index
		
		int row = 3; //initialized variable for 3rd row
		String empid = st1.getCell(0, row).getContents(); // to get contents from 1st column(index starts from 0) of 3rd row 
		String empname=st1.getCell(1, row).getContents();
		String email= st1.getCell(2, row).getContents();
		String phone = st1.getCell(3, row).getContents();
		
		System.out.println(empid+"||"+ empname + "||"+ email+"||"+phone);
		
	}

}
