package webdriverExamples;

import org.openqa.selenium.WebDriver;//to access wbedriver methods & classes
import org.openqa.selenium.firefox.FirefoxDriver;//to access browser
import org.openqa.selenium.By;//to acess object / element methods

public class TC_VerifyTestData 
{
	//Test Data 
	static String url= "http://183.82.103.245/nareshit/login.php"; //making the variable as static to be accessed into static method
	static String username ="nareshit"; //making the variable as static to be accessed into static method
	static String password = "nareshit"; //making the variable as static to be accessed into static method
	static String pagetitle1 = "OrangeHRM - New Level of HR Management"; //making the variable as static to be accessed into static method
	static String pagetitle2="HRM"; //making the variable as static to be accessed into static method
	
	public static void main(String[] args) throws Exception
	{
	// Test Steps 
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to(url);                                  //Test Data : passing through variable(url)
	Thread.sleep(3000);                                         //wait stmnt 
	System.out.println("Application Opened");
	
	//Verify Login Page Title 
	// Actual Result compared with expected result
	if(driver.getTitle().equals(pagetitle1))            //Test Data : passing through variable(pagetitle1)
	{
		System.out.println("Login Page Title Matched");
	}
	else
	{
		System.out.println("Login Page Title did not match");
		System.out.println("Correct Login Page title is: " + driver.getTitle());    //To access the pre-defined method getTitle() with the help of object
	}
//	driver.findElement(By.name("txtUserName")).sendKeys("nareshit"); // Test Data : Hard Coded
//	driver.findElement(By.name("txtPassword")).sendKeys("nareshit"); // Test Data : Hard Coded
	
	driver.findElement(By.name("txtUserName")).sendKeys(username); //Test Data : passing through variable
	driver.findElement(By.name("txtPassword")).sendKeys(password); //Test Data : passing through variable
	Thread.sleep(3000);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	System.out.println("Login completed");
	
	//Verify Home Page Title 
	// Actual Result compared with expected result
	if(driver.getTitle().equals(pagetitle2))                     //Test Data : passing through variable(pagetitle2)
	{
		System.out.println("Home Page Title Matched");
	}
	else
	{
		System.out.println("Home Page Title did not Match");
		System.out.println("Correct Home Page title is: " + driver.getTitle());
	}
	
	driver.findElement(By.linkText("Logout")).click();	 //linktext is one of the type of element locator used to identify <a> tags
	System.out.println("Logout completed");
	System.out.println("Testing Excellent");
	driver.close();
	}
}
