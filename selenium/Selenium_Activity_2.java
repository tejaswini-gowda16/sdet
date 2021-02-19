package Selenium_Java_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Activity_2 {

	public static void main(String args[]) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String t = driver.getTitle();
		WebElement b1 = driver.findElement(By.id("about-link"));
		WebElement b2 = driver.findElement(By.className("green"));
		WebElement b3 = driver.findElement(By.cssSelector("a.ui"));
		WebElement b4 = driver.findElement(By.linkText("About Us"));
		String b5 = b1.getText();
		String b6 = b2.getText();
		String b7 = b3.getText();
		String b8 = b4.getText();
		System.out.println("Title of the page: "+t);
	    System.out.println(b1);
	    System.out.println("Text from id locator: "+ b5);
	    System.out.println(b2);
	    System.out.println("Text from class locator: "+ b6);
	    System.out.println(b3);
	    System.out.println("Text from id cssSe locator: "+ b7);
	    System.out.println(b4);
	    System.out.println("Text from linkText locator: "+ b8);
	    driver.close();
	}
}
