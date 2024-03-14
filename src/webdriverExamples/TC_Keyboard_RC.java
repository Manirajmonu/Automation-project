package webdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.Robot;   // Package from Java 
import java.awt.event.KeyEvent; // Package from Java 

import org.openqa.selenium.By;

public class TC_Keyboard_RC 
{
	public static void main (String args[]) throws Exception
	{
		//Test Steps 
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(4000);
		
		//Robot class is from java to perform Keyboard action 
		//Keyboard : click : TAB , ENTER
		Robot r = new Robot(); // Creating object for pre-defined Robot class 
		r.keyPress(KeyEvent.VK_TAB); //Pressing on the tab button from keyboard(VK - virtual keyboard)
		r.keyRelease(KeyEvent.VK_TAB); // Releasing from the tab button from keyboard
		Thread.sleep(4000);
		System.out.println("TAB button Pressed");
		r.keyPress(KeyEvent.VK_ENTER); //Pressing on the Enter button from keyboard
		r.keyRelease(KeyEvent.VK_ENTER); // Releasing from the Enter button from keyboard
		Thread.sleep(4000);
		System.out.println("ENTER button Pressed");
		
		System.out.println("Login completed");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		driver.close();
	}

}
