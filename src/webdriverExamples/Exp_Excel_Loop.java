package webdriverExamples;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class Exp_Excel_Loop 
{
	public static void main(String args[]) throws Exception
	{
		//FileInputStream is a class used to read data from a file in the form of sequence of bytes.
		FileInputStream file1=new FileInputStream("D:\\ExcelRead.xls");
		Workbook wb1=Workbook.getWorkbook(file1);
		Sheet st1= wb1.getSheet(0); 
		//getSheet() method of the Workbook class is to retrieve the desired sheet by specifying the index
		
		int rowcount = st1.getRows(); //Getting row count using getRows() method
		System.out.println("Total Row Count :" +rowcount); // printing the row count 
		
		for(int i = 1; i<rowcount; i++)
		{
			String empid = st1.getCell(0,i).getContents();   //i=1 is  to get contents from 1st column(index starts from 0) of 1st row 
			String ename=st1.getCell(1,i).getContents();   // i=1 is to get contents from 2nd column(column index value = 1) of 1st row 
			String email=st1.getCell(2,1).getContents();    // i=1 is to get contents from 3rd column(column index value = 2) of 1st row
			String phone = st1.getCell(3,i).getContents();  // i=1 is to get contents from 4th column(column index value = 3) of 1st row
			
			System.out.println(empid+"||"+ename+"||"+email+"||"+phone);
		}
	}
}
