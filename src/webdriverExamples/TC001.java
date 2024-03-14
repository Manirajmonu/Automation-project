package webdriverExamples;

import org.openqa.selenium.WebDriver; //to access Webdriver methods & classes
import org.openqa.selenium.firefox.FirefoxDriver; //to access firefox browser
import org.openqa.selenium.chrome.ChromeDriver; //to access Chrome browser
import org.openqa.selenium.edge.EdgeDriver; //to access Edge browser
import org.openqa.selenium.By; //to access object identifier/element locator methods

public class TC001 {
	public static void main (String args[]) throws Exception
	{
		//Test Steps
		//WebDriver driver1 = new ChromeDriver(); // WebDriver reference object created by taking reference of ChromeDriver Class.
		// WebDriver driver1 = new EdgeDriver(); // WebDriver reference object created by taking reference of EdgeDriver Class
		WebDriver driver1=new FirefoxDriver();
		driver1.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("Application opened");
		Thread.sleep(3000); //wait stmt - pause the execution of the current thread for a specified time in milliseconds.
		driver1.findElement(By.name("txtUserName")).sendKeys("nareshit"); 
		//findelement() method is used to identify the list of web elements within the web page. 
		//sendkeys() method allows to enter the data in the textbox field/editable field
		driver1.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(3000);
		driver1.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("Login completed");
		driver1.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		System.out.println("Testing Excellent");
		driver1.close();
		
	}

}
