package LMS_in_TestNG_Fw;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class LMS_TNG_Activity5 {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {

		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms/");
	}

	@Test
	public void TestAct5() {
		WebElement myaccount = driver.findElement(By.xpath("//div[3]/div/nav/div/ul/li[5]/a"));
		myaccount.click();

		String t = driver.getTitle();
		System.out.println("My Account Page Title: "+t);
		Assert.assertEquals("My Account – Alchemy LMS", t);
	}

	@AfterClass
	public void afterClass() {
		driver.close();
		System.out.println("End of LMS_TNG_Activity5");
	}
}
