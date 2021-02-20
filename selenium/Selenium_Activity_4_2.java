package Selenium_Java_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Activity_4_2 {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		String t = driver.getTitle();
		WebElement fn = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		WebElement ln = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
		WebElement e = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		WebElement c = driver.findElement(By.xpath("//*[@id=\"number\"]"));
		WebElement m = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[5]/textarea"));
		WebElement b = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[6]/div[1]/input"));
		fn.sendKeys("Tejaswini");
		ln.sendKeys("Gowda");
		e.sendKeys("tsn@gmail.com");
		c.sendKeys("9790000288");
		m.sendKeys("Selnium Testing");
		System.out.println("Title of the page: "+t);
		b.click();
		Thread.sleep(1000);
		driver.close();
	}
}
