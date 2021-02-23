package Selenium_Java_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class Selenium_Activity_9_1 {
	public static void main(String args[]) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/selects");
		WebElement dd = driver.findElement(By.id("single-select"));
		Select list = new Select(dd);

		list.selectByVisibleText("Option 2");
		list.selectByIndex(3);
		list.selectByValue("4");

		List<WebElement> options = list.getOptions();
		for(WebElement option : options) {
			System.out.println("Option: " + option.getText());
		}

		driver.close();

	}
}
