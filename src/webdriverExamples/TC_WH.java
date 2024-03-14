package webdriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

import java.util.ArrayList;

public class TC_WH 
{
	public static void main(String args[]) throws Exception
	{
		// Test Steps
		WebDriver driver = new FirefoxDriver();

		// 1st window
		driver.get("file:///D:/multiplewindows.html"); // To access/get html file from local system
		Thread.sleep(3000);

		// 2nd window
		driver.findElement(By.id("btn2")).click();
		Thread.sleep(3000);

		// 3rd window
		driver.findElement(By.id("btn3")).click();
		Thread.sleep(3000);

		// ArrayList is to represent more data dynamically at runtime
		ArrayList<String> arr = new ArrayList<>(driver.getWindowHandles());

		// switch To 1st wind
		driver.switchTo().window(arr.get(0));
		Thread.sleep(3000);
		
		driver.close(); // To close the current browser
		// driver.quit(); // To close all the browsers

	}
}