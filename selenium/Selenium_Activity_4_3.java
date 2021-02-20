package Selenium_Java_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Activity_4_3 {
	public static void main(String args[]) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		
		String t = driver.getTitle();
		System.out.println("Title of the page: "+t);
		
		String th = driver.findElement(By.xpath("//*[@id=\"third-header\"]")).getText();
		System.out.println("Third Header Text: "+th);
		
		WebElement fh = driver.findElement(By.xpath("//h5"));
		String cssValue = fh.getCssValue("color");
		System.out.println("5th Header color is: "+cssValue);
		
		String v = driver.findElement(By.xpath("//button[contains(text(),'Violet')]")).getAttribute("class");
		System.out.println("Class of Violet Button: "+v);
		
		String g = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
		System.out.println("Grey Button Text Text: "+g);
		
		driver.close();
	}
}
