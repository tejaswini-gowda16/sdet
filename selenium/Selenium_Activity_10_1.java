package Selenium_Java_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Activity_10_1 {
	
	public static void main(String args[]) {

		WebDriver driver = new FirefoxDriver();
		Actions a = new Actions(driver);
		
		driver.get("https://www.training-support.net/selenium/input-events");
		System.out.println("Title of the page: "+driver.getTitle());
		
		WebElement square = driver.findElement(By.id("wrapD3Cube"));
		square.click();	
		System.out.println("Text after Left Click: "+driver.findElement(By.className("active")).getText());
		
		a.doubleClick().perform();
		System.out.println("Text after Double Click: "+driver.findElement(By.className("active")).getText());
		
		a.contextClick(square).perform();
		System.out.println("Text after Right Click: "+driver.findElement(By.className("active")).getText());
		
		driver.close();

	}

}
