package LMS_in_TestNG_Fw;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class LMS_TNG_Activity3 {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {

		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms/");
	}

	@Test
	public void TestAct3() {

		WebElement infobox = driver.findElement(By.xpath("//div[2]/h3"));

		String h = infobox.getText();
		System.out.println("Title of the first info box: "+h);

		Assert.assertEquals("Actionable Training", h);
		driver.close();
	}

	@AfterClass
	public void afterClass() {
		System.out.println("End of LMS_TNG_Activity3");
	}
}
