package Selenium_Java_Activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Activity_9_2 {
	public static void main(String args[]) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/selects");
		WebElement ms = driver.findElement(By.id("multi-select"));
		Select list = new Select(ms);

		list.selectByVisibleText("Javascript"); 
		list.selectByValue("node");
		list.selectByIndex(4);
		list.selectByIndex(5);
		list.selectByIndex(6);
		list.deselectByValue("node");
		list.deselectByIndex(7); 
		
		System.out.println("First selected option is: " +list.getFirstSelectedOption().getText());
        
        List<WebElement> selectedOptions = list.getAllSelectedOptions();
    	
        for(WebElement selectedOption : selectedOptions) {
            System.out.println("Selected option: " + selectedOption.getText());
        }

		list.deselectAll();
		
		driver.close();

	}
}
