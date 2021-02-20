package Selenium_Java_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Activity_7_1 {

	public static void main(String[] args)  {
		WebDriver driver = new FirefoxDriver();
				
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		System.out.println("Page Title is: " +driver.getTitle());
		
		WebElement un = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/div/div[1]/input"));
		WebElement pwd = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/div/div[2]/input"));
		
		un.sendKeys("admin");
		pwd.sendKeys("password");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/div/button")).click();
		
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
    	System.out.println("Login message: " + loginMessage);
		
		driver.close();
	}

}
