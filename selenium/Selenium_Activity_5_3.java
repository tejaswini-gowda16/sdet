package Selenium_Java_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Activity_5_3 {
	public static void main(String args[]) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");

		String t = driver.getTitle();
		System.out.println("Title of the page: "+t);

		WebElement dt = driver.findElement(By.xpath("//input[@type='text']"));
		
		WebElement dtb = driver.findElement(By.id("toggleInput"));
		System.out.println("isDisplayed result before click: "+dt.isEnabled());

		dtb.click();

		System.out.println("isDisplayed result after click:: "+dt.isEnabled());

		driver.close();
	}

}

