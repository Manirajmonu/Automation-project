package webdriverExamples;

import org.openqa.selenium.WebDriver; //to access Webdriver methods & classes
import org.openqa.selenium.firefox.FirefoxDriver; //to access browser
import org.openqa.selenium.By; //to access object / element methods

public class TC_VerifyTitle 
{
	public static void main(String rgs[]) throws Exception
	{
		 // Test Steps
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php"); // navigate to the URL
		 Thread.sleep(2000);
		 System.out.println("Application opened");
		
		//Verify Login Page Title 
			if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) // Actual Result compared with expected result
			{
			System.out.println("Login Page Title Matched");
			}
			else
			{
				System.out.println("Login Page Title did not match");
				System.out.println(driver.getTitle());
			}
			
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit"); // enter username 
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit"); // enter password 
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click(); // click on Login button 
		Thread.sleep(3000);
		System.out.println("Login completed");
		
		//Verify Home Page Title  
		if(driver.getTitle().equals("HRM"))
		{
			System.out.println("Home Page Title Matched");
		}
		else
		{
			System.out.println("Home Page Title did not Match");
			System.out.println("Correct Home Page Title is: " + driver.getTitle());
		}
		
		driver.findElement(By.linkText("Logout")).click(); // linktext is one of the type of element locator used to identify <a> tags
		Thread.sleep(2500);
		System.out.println("Logout Completed");
		System.out.println("Testing Excellent");
		driver.close();
	}
}