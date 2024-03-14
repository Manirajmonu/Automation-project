package webdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class TC_WT 
{
	public static void main(String args[]) throws Exception
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/WebTable.html");
		
		//Count
		int row = driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr")).size(); //Total row count 
		int col = driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[1]/td")).size(); // Total column count 
		int row_col= driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size(); // Total(Row*Col) count
		System.out.println("Row Count: " +row);
		System.out.println("Col Count: " +col);
		System.out.println("Row & Col Count: " +row_col);
		
		// Data -- Cell
		String celldata=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[2]/td[2]")).getText(); 
		System.out.println(celldata);  // Printing data from the first col. of row1.  
		
		//Data -- Table 
		for(int i=1; i<=row; i++)
		{
			String data=driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
			System.out.println(data); // Printing each row data 
			Thread.sleep(3000);
		}
		driver.quit(); // Closing all the browser window	
	}
}