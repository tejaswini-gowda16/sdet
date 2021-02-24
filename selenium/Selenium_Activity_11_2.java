package Selenium_Java_Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Activity_11_2 {
	public static void main(String args[]) {	
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("Title of the page: "+driver.getTitle());

		WebElement confirm = driver.findElement(By.id("confirm"));
		confirm.click();
		Alert cAlert = driver.switchTo().alert();
		System.out.println("Confirmation Alert Message: "+cAlert.getText());
		cAlert.accept();

		confirm.click();
		Alert cAlert2 = driver.switchTo().alert();
		cAlert2.dismiss();

		driver.close();
	}
}
