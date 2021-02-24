package Selenium_Java_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Activity_12_1 {
	public static void main(String args[]) {	
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.training-support.net/selenium/iframes");
		System.out.println("Title of the page: "+driver.getTitle());
		
		driver.switchTo().frame(0);
		System.out.println("Button Text from Frame 1: "+driver.findElement(By.id("actionButton")).getText());
		System.out.println("Button Colour from Frame 1: "+driver.findElement(By.id("actionButton")).getCssValue("color"));
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		System.out.println("Button Text from Frame 2: "+driver.findElement(By.id("actionButton")).getText());
		System.out.println("Button Colour from Frame 2: "+driver.findElement(By.id("actionButton")).getCssValue("color"));

		driver.close();
	}
}
