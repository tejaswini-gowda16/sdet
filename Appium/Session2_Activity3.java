package Appium_Activities;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Session2_Activity3 {
	WebDriverWait wait;
	AppiumDriver<MobileElement> driver = null;

	@BeforeClass
	public void begining() throws InterruptedException, IOException {

		DesiredCapabilities pixelCapability = new DesiredCapabilities();
		pixelCapability.setCapability("deviceId", "emulator-5554");
		pixelCapability.setCapability("deviceName", "Pixel4Emulator");
		pixelCapability.setCapability("platformName", "Android");
		pixelCapability.setCapability("appPackage", "com.android.contacts");
		pixelCapability.setCapability("appActivity", ".activities.PeopleActivity");

		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), pixelCapability);
	}

	@Test
	public void contact() {

		driver.findElementByAccessibilityId("Create new contact").click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		driver.findElementByXPath("//android.widget.EditText[@text='First name']").sendKeys("Tej");
		driver.findElementByXPath("//android.widget.EditText[@text='Last name']").sendKeys("SN");
		driver.findElementByXPath("//android.widget.EditText[@text='Phone']").sendKeys("9090909090");

		driver.findElementById("editor_menu_save_button").click();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
        MobileElement savedContact = driver.findElementById("toolbar_parent");
    	Assert.assertTrue(savedContact.isDisplayed());
	
        String contactName = driver.findElementById("large_title").getText();
	    Assert.assertEquals(contactName, "Tej SN");
	}
	
	@AfterClass
	public void closing() {
		driver.quit();
	}
}

