package Selenium_Java_Activities;

//import java.time.Duration;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Activity_12_3 {
	public static void main(String args[]) {	
		WebDriver driver = new FirefoxDriver();
		//Actions a = new Actions(driver);

		driver.get("https://www.training-support.net/selenium/popups");
		System.out.println("Title of the page: "+driver.getTitle());
		
		WebElement b = driver.findElement(By.xpath("//div/div[2]/div[2]/button"));
		//a.moveToElement(b).pause(Duration.ofSeconds(1)).build().perform();
		System.out.println("Tooltip Text: "+b.getAttribute("data-tooltip"));
		
		b.click();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//div[2]/div/div/button")).click();

		System.out.println("Message after Logging in: "+driver.findElement(By.xpath("//*[@id=\"action-confirmation\"]")).getText());
		
		driver.close();
	}
}
