package Selenium_Java_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Activity_6_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get("https://training-support.net/selenium/ajax");

		String t = driver.getTitle();
		System.out.println("Title of the page: "+t);
  
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/button")).click();
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
		
        String at = driver.findElement(By.id("ajax-content")).getText();
    	System.out.println(at);
	
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
	
        String lt = driver.findElement(By.id("ajax-content")).getText();
        System.out.println(lt);
		
		driver.close();

	}

}
