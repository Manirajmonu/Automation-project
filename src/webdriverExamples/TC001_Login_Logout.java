package webdriverExamples;

import org.openqa.selenium.WebDriver; //reference to WebDriver interface to access webdriver methods & classes

import org.openqa.selenium.firefox.FirefoxDriver; //to access Firefox browser
import org.openqa.selenium.chrome.ChromeDriver; // to access Chrome browser
import org.openqa.selenium.edge.EdgeDriver;// to access Edge browser

import org.openqa.selenium.By; //to access object Identifier/ elements locator methods(8 types)

public class TC001_Login_Logout
{
	public static void main(String args[]) throws Exception
	{
		 /*WebDriver is an interface available in Selenium jar files. 
		'driver1' is WebDriver reference object created by taking reference of the class FireFoxDriver.  
		 FireFoxDriver is a class already existing in Selenium.*/
	  WebDriver driver1 = new FirefoxDriver();  
		  //WebDriver driver1 = new ChromeDriver(); // WebDriver reference object created by taking reference of ChromeDriver Class.
		 //WebDriver driver1 = new EdgeDriver(); // WebDriver reference object created by taking reference of EdgeDriver Class
	 driver1.navigate().to("http://183.82.103.245/nareshit/login.php"); // calling pre-defined method 'navigate().to(URL)'
	 Thread.sleep(3000); // wait stmnt - pause the execution of the current thread for a specified time in milliseconds.
	 driver1.close(); // calling pre-defined close() method using  reference object 'driver1'. (to close the browser)
	}
}
