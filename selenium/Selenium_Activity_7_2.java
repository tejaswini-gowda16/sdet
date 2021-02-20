package Selenium_Java_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Activity_7_2 {

	public static void main(String[] args)  {
		WebDriver driver = new FirefoxDriver();
				
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		System.out.println("Page Title is: " +driver.getTitle());
		
		WebElement un = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[1]/input"));
		WebElement pwd = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[2]/input"));
		WebElement cpwd = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[3]/input"));
		WebElement e = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[4]/input"));
		
		un.sendKeys("Tejaswini");
		pwd.sendKeys("password");
		cpwd.sendKeys("password");
		e.sendKeys("tsn@gmail.com");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/button")).click();
		
        String signup = driver.findElement(By.id("action-confirmation")).getText();
    	System.out.println("Sign Up message: " + signup);
		
		driver.close();
	}

}
