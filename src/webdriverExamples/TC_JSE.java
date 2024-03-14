package webdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class TC_JSE {
	public static void main(String args[]) throws Exception
	{
		//Test Steps
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		
		//using javascriptExecuter to click on login button
		WebElement element1=driver.findElement(By.name("Submit"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", element1); // arguments[0] - '0' means true. '1' means false(wont allow to login)
		Thread.sleep(3000);
	    System.out.println("Login completed");
	 
	    // using javascriptExecuter to click on logout button 
	    WebElement element2 = driver.findElement(By.linkText("Logout"));
	    JavascriptExecutor executor2 = (JavascriptExecutor)driver;
	    executor2.executeScript("arguments[1].click();", element2);  // arguments[0] - '0' means true. '1' means false(wont allow to logout)
	    Thread.sleep(3000);
	    System.out.println("Logout completed");
	    
	    driver.close();
		
	}

}
