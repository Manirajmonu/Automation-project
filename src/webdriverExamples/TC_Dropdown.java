package webdriverExamples;
import org. openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.Select;

public class TC_Dropdown {
	public static void main (String args[]) throws Exception
	{
		// Test steps 
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		Thread.sleep(4000);
		
		 //Enter into frame
		driver.switchTo().frame("rightMenu");		  
		Select st= new Select(driver.findElement(By.name("loc_code"))); // Select is pre-defined class to select values from drop-down
		//Any of the below select methods can be used based upon requirement. 
		//st.selectByVisibleText("Emp. ID");
		//st.selectByIndex(1); 
		st.selectByValue("0"); // value attribute available in html code 
		Thread.sleep(4000);
		driver.findElement(By.name("loc_name")).sendKeys("3370");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='Search']")).click(); // While using xpath with attribute, do not prefer class attribute type
		Thread.sleep(4000);
		driver.findElement(By.name("chkLocID[]")).click(); // Selecting Checkbox 
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value= 'Delete']")).click();
		Thread.sleep(4000);
		//Exit from frame
		driver.switchTo().defaultContent();     
	
		driver.findElement(By.linkText("Logout")).click(); 
		Thread.sleep(4000);
		System.out.println("Logout completed");
		driver.close();
		
		
	}

}
