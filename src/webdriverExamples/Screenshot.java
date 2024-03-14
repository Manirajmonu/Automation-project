package webdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot 
{	
	public static void main(String args[]) throws Exception
	{
		//Test Steps 
		WebDriver driver = new FirefoxDriver();
		try
		{
			driver.navigate().to("http://183.82.103.245/nareshit/login.php");
			//driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php);
					Thread.sleep(3000);
					driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
					driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
					Thread.sleep(3000);
					driver.findElement(By.name("Submit")).click();
					Thread.sleep(3000);
					System.out.println("Login completed");
				
					//----Mouse-hover
					Actions ac  = new Actions(driver);
					ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
					System.out.println("Mouseover completed");
					Thread.sleep(4000);
					driver.findElement(By.linkText("Add Employee123")).click(); // Execution fails in this line - element name should be "Add Employee"
					//Cursor will come out of the try block and enter into Catch block. 
					System.out.println("cliked on addemp submenu");
					Thread.sleep(4000);
					driver.findElement(By.linkText("Logout")).click();
					Thread.sleep(3000);
					System.out.println("Logout completed");	
		}
		catch(Exception e)
		{
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // OutputType.FILE - Obtain the screenshot into a temporary file 
		    FileUtils.copyFile(f1, new File("D:\\TestResults.png"));  // 
		    //copyfile method copies a file from one location to another
		}
		driver.close();
	};

}
