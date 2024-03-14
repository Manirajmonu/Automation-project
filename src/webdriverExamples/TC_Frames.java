package webdriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class TC_Frames {

	public static void main(String args[]) throws Exception
	{
		//Test Steps
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		Thread.sleep(5000);                     //increase the thread  timing to check if the Add button not clicking issue is resolved  
	
		driver.switchTo().frame("rightMenu");			//Enter into frame using 'id'
		
		//Xpath with multiple attribute is used to check if the Add button not clicking issue is resolved
		driver.findElement(By.xpath("//input [@value='Add'][@type ='button' ]")).click();  //click on Add button 
		Thread.sleep(4000);
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Maniraj");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("selenium");
		Thread.sleep(4000);
		driver.findElement(By.id("btnEdit")).click(); // click on save button 
		Thread.sleep(4000);
		System.out.println("New employee added");
		
		driver.switchTo().defaultContent();  				//Exit from frame
		
		driver.findElement(By.linkText("Logout")).click();  
		Thread.sleep(4000);
		System.out.println("Logout completed");
		System.out.println("Testing Excellent");
		driver.close();
	}
}
