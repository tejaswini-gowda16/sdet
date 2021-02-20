package Selenium_Java_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Activity_4_1 {

	public static void main(String args[])  {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		
		String t = driver.getTitle();
		System.out.println("Title of the page: "+t);

		WebElement b = driver.findElement(By.xpath("//*[@id=\"about-link\"]"));
				
		b.click();
		driver.close();

	}
}
