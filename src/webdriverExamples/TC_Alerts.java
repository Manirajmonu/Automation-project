package webdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;

public class TC_Alerts {

	public static void main(String args[]) throws Exception
	{
		//Test Steps 
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		Thread.sleep(4000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
		
		//Creating object for pre-defined Alert class & informing Selenium to switch to the alert pop-up
		Alert a =driver.switchTo().alert();  
		System.out.println("Text from password alert pop-up: " +a.getText()); // Retrieve and print text from alert pop-up.
		a.accept();                                        // click on Ok button from alert pop-up.
		
		Thread.sleep(3000);
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
		System.out.println("Login completed");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		driver.close();
	}
}
