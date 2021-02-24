package Selenium_Java_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Activity_12_2 {
	public static void main(String args[]) {	
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.training-support.net/selenium/nested-iframes");
		System.out.println("Title of the page: "+driver.getTitle());
		
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		System.out.println("Header from Frame 1: "+driver.findElement(By.className("content")).getText());
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		System.out.println("Header from Frame 2: "+driver.findElement(By.className("content")).getText());

		driver.close();
	}
}
