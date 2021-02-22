package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity7 {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/login-form");
	}

	@DataProvider(name="credentials")
	public static Object[][] creds(){
		Object[][] o = new Object[][] {{"admin","password"},{"admin1","password1"},{"admin2","password2"}};
		return o;
	}
	
	@Test(dataProvider="credentials")
	public void login(String un, String pwd) {
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}
	
	@AfterClass
	public void afterClass() {
		driver.close();
	}
}

