package webdriverExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import static org.testng.Assert.assertEquals;


public class TC_DragDrop {
	
	public static void main(String args[]) throws Exception
	{
	       System.out.println("===");
	       WebDriver driver = new FirefoxDriver();
	       driver.navigate().to("https://jqueryui.com/droppable");
	       Thread.sleep(4000);
	      
	       //Verify Title : stop execution in case of condition is failed
	       assertEquals(driver.getTitle(),"Droppable | jQuery UI");
	       System.out.println("Title matched");
	 
	       driver.switchTo().frame(0);        //Frame Entry
	       Actions ac = new Actions(driver);
	       ac.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
	       System.out.println("drag & Drop");
	       Thread.sleep(4000);
	       driver.switchTo().defaultContent();         //Frame Exit
	
	       driver.quit();	

	}
}
