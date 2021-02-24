package Selenium_Java_Activities;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Activity_11_4 {
	public static void main(String args[]) {	
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 5);

		driver.get("https://www.training-support.net/selenium/tab-opener");
		System.out.println("Title of Parent Window: "+driver.getTitle());
		
		String w1 = driver.getWindowHandle();
		System.out.println("Parent Window Handle is: " + w1);
		
		driver.findElement(By.id("launcher")).click();
		
        Set<String> w2 = driver.getWindowHandles();
    	System.out.println("Open Window handles are: " + w2);
    	
    	for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
    	
    	wait.until(ExpectedConditions.titleIs("Newtab"));
		System.out.println("New Tab Title is: " + driver.getTitle());
    	System.out.println("New Tab heading is: " + driver.findElement(By.cssSelector("div.content:nth-child(2)")).getText());
    	
    	driver.findElement(By.id("actionButton")).click();
    	
    	Set<String> w3 = driver.getWindowHandles();
    	System.out.println("Open Window handles are: " + w3);
    	
    	for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
    	
    	wait.until(ExpectedConditions.titleIs("Newtab2"));
		System.out.println("3rd Tab Title is: " + driver.getTitle());
    	System.out.println("3rd Tab heading is: " + driver.findElement(By.cssSelector("div.content:nth-child(2)")).getText());
    	    	
    	driver.quit();
	}
}
