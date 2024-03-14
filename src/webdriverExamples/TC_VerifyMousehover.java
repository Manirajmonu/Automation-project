package webdriverExamples;

import org.openqa.selenium.WebDriver;                    //to access Webdriver methods & classes
import org.openqa.selenium.firefox.FirefoxDriver;  //to access browser
import org.openqa.selenium.By;                                  //to access object / element methods
import org.openqa.selenium.interactions.Actions; //to access Actions class to perform keybaord & mouse hover events  

public class TC_VerifyMousehover
{
	//Test Data 
	static String url= "http://183.82.103.245/nareshit/login.php"; //making the variable as static to be accessed into static method
	static String username ="nareshit"; //making the variable as static to be accessed into static method
	static String password = "nareshit"; //making the variable as static to be accessed into static method
	static String pagetitle1 = "OrangeHRM - New Level of HR Management"; //making the variable as static to be accessed into static method
	static String pagetitle2="HRM"; //making the variable as static to be accessed into static method
	
	public static void main(String[] args) throws Exception
	{
	//Test Steps 
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to(url);                                  //Test Data : passing through variable(url)
	Thread.sleep(3000);
	System.out.println("Application Opened");
	
	//Verify Title
	// Actual Result   compare expected result
	if(driver.getTitle().equals(pagetitle1))                   //Test Data : passing through variable(pagetitle1)
	{
		System.out.println("Login Page Title Matched");
	}
	else
	{
		System.out.println("Login Page Title did not match");
		System.out.println("Correct page Title is:" +driver.getTitle());
	}
	
	//driver.findElement(By.name("txtUserName")).sendKeys("nareshit"); // Test Data : Hard Coded
	//driver.findElement(By.name("txtPassword")).sendKeys("nareshit"); // Test Data : Hard Coded
	
	driver.findElement(By.name("txtUserName")).sendKeys(username); //Test Data : passing through Variable(username)
	driver.findElement(By.name("txtPassword")).sendKeys(password); //Test Data : passing through Variable(password)

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
	
	//---Mouse-hover event
	// Action class is a built-in feature for handling keyboard and mouse events.
	Actions ac=new Actions(driver);                            //Parameterized constructor 
	ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform(); 
	//moveToElement(): Move the mouse pointer to the center of the element
	//perform() method is used to perform Mouse-hover action
	Thread.sleep(4000);
	System.out.println("Mousehover completed");
	
	//Click on Sub-menu Add Employee
	driver.findElement(By.linkText("Add Employee")).click(); //linktext is one of the type of element locator used to identify <a> tags
	Thread.sleep(4000);
	System.out.println("Clicked on submenu");
	driver.findElement(By.linkText("Logout"));
	Thread.sleep(3000);
	System.out.println("Logout completed");
	System.out.println("Testing Excellent");
	driver.close();
	}
}