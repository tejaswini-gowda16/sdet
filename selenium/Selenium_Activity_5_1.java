package Selenium_Java_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Activity_5_1 {
	public static void main(String args[]) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");

		String t = driver.getTitle();
		System.out.println("Title of the page: "+t);

		WebElement cb = driver.findElement(By.name("toggled"));
		System.out.println("isDisplayed result before click: "+cb.isDisplayed());

		WebElement rc = driver.findElement(By.id("toggleCheckbox"));
		rc.click();

		System.out.println("isDisplayed result after click:: "+cb.isDisplayed());

		driver.close();

	}
}
