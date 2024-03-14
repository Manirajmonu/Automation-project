package webdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class TC_Keyboard_WB {
	
	public static void main (String args[]) throws Exception
	{
		// Test Steps 
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(4000);
		
		//'Keys' class is pre-defined class in Selenium used to perform keyboard action
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN); //ARROW_DOWN - selecting down arrow button from KB.
		Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		driver.close();
		
	}

}
