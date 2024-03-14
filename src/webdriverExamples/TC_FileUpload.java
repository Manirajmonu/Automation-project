package webdriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_FileUpload {

	public static void main(String[] args) throws Exception
	{
		//Test steps
		WebDriver driver = new FirefoxDriver();
	    driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	    driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	    driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	    driver.findElement(By.name("Submit")).click();
	    System.out.println("Login completed");
	    Thread.sleep(4000);
	    
	  //click on add button 
	    driver.switchTo().frame("rightMenu"); // Enter into frame 
	    driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.name("txtEmpFirstName")).sendKeys("selenium");
	    driver.findElement(By.name("txtEmpLastName")).sendKeys("Maniraj");

	    //File Upload
	    WebElement element1 = driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
	    element1.sendKeys("D:\\istockphoto.jpg");
	     Thread.sleep(5000);
        System.out.println("File uploaded successfully");
        
        driver.findElement(By.id("btnEdit")).click();
        Thread.sleep(5000);
        System.out.println("New employee added");
        driver.switchTo().defaultContent(); // Exit from frame 
       
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(3000);
        System.out.println("Logout completed");
        driver.close();
        
	    
	}

}
