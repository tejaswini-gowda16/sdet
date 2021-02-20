package Selenium_Java_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Selenium_Activity_6_1 {

	public static void main(String args[]) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get("https://www.training-support.net/selenium/dynamic-controls");

		String t = driver.getTitle();
		System.out.println("Title of the page: "+t);
  
		WebElement checkbox = driver.findElement(By.id("dynamicCheckbox"));
		
		driver.findElement(By.id("toggleCheckbox")).click();
		wait.until(ExpectedConditions.invisibilityOf(checkbox));
		
		driver.findElement(By.id("toggleCheckbox")).click();
		wait.until(ExpectedConditions.visibilityOf(checkbox));
		
		driver.close();
	}
	
}
