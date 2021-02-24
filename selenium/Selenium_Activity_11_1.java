package Selenium_Java_Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Activity_11_1 {
	public static void main(String args[]) 
	{	
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("Title of the page: "+driver.getTitle());
		
		driver.findElement(By.id("simple")).click();
		Alert sAlert = driver.switchTo().alert();
		System.out.println("Simple Alert Message: "+sAlert.getText());
		sAlert.accept();

		driver.close();
	}
}
