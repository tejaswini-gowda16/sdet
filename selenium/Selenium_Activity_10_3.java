package Selenium_Java_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Activity_10_3 {
	public static void main(String args[]) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		Actions a = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);

		driver.get("https://training-support.net/selenium/drag-drop");
		System.out.println("Title of the page: "+driver.getTitle());
		
		WebElement ball = driver.findElement(By.id("draggable"));
        WebElement d1 = driver.findElement(By.id("droppable"));
    	WebElement d2 = driver.findElement(By.id("dropzone2"));
		
		a.dragAndDrop(ball, d1).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(d1, "background-color"));
        System.out.println("Ball in dropzone 1");
    	
        a.dragAndDrop(ball, d2).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(d2, "background-color"));
        System.out.println("Ball in dropzone 2");

		driver.close();
	}
}
