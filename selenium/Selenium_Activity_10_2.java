package Selenium_Java_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Activity_10_2 {
	public static void main(String args[]) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		Actions a = new Actions(driver);

		driver.get("https://www.training-support.net/selenium/input-events");
		System.out.println("Title of the page: "+driver.getTitle());

		a.sendKeys("T").build().perform();
		WebElement key = driver.findElement(By.id("keyPressed"));
		System.out.println("Pressed key is: " +key.getText());
		
        a.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        a.keyDown(Keys.CONTROL).sendKeys("p").build().perform();

        System.out.println("Pasted key is: " +key.getText());
        
		driver.close();
	}
}
