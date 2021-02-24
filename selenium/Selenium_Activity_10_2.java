package Selenium_Java_Activities;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Selenium_Activity_10_2 {
	public static void main(String args[]) throws InterruptedException, HeadlessException, UnsupportedFlavorException, IOException {

		WebDriver driver = new FirefoxDriver();
		Actions a = new Actions(driver);

		driver.get("https://www.training-support.net/selenium/input-events");
		System.out.println("Title of the page: "+driver.getTitle());

		a.sendKeys("T").build().perform();
		WebElement key = driver.findElement(By.id("keyPressed"));
		System.out.println("Pressed key is: " +key.getText());
		
        a.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        
        //Get and paste data copied in console
        String data =(String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
        System.out.println(data);
		driver.close();
	}
}
