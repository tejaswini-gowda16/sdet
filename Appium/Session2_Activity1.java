package Appium_Activities;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Session2_Activity1 {

	WebDriverWait wait;
	AppiumDriver<MobileElement> driver = null;

	@Test
	public void GoogleTrainingSupport() throws InterruptedException, IOException {

		DesiredCapabilities pixelCapability = new DesiredCapabilities();
		pixelCapability.setCapability("deviceId", "emulator-5554");
		pixelCapability.setCapability("deviceName", "Pixel4Emulator");
		pixelCapability.setCapability("platformName", "Android");
		pixelCapability.setCapability("appPackage", "com.android.chrome");
		pixelCapability.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		pixelCapability.setCapability("noReset", true);

		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), pixelCapability);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.training-support.net/");
				
		String title = driver.findElementByXPath("//android.view.View[@text='Training Support']").getText();
		System.out.println("Title on Homepage: " + title);
		
		//Scroll About Us into view
		driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector()).scrollIntoView(text(\"About Us\"))")).click();

		//driver.findElementByXPath("//android.view.View[@text='About Us']").click();
		
		String title2 = driver.findElementByXPath("//android.view.View[@text='About Us']").getText();
		System.out.println("Title on next page: " + title2);

		Assert.assertEquals(title, "Training Support");
		Assert.assertEquals(title2, "About Us");
	}

	@AfterTest
	public void closing() {
		driver.quit();
	}
}

