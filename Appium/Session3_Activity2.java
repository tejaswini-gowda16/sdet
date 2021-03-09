package Appium_Activities;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Session3_Activity2 {

	WebDriverWait wait;
	AppiumDriver<MobileElement> driver = null;

	@Test
	public void lazyLoad() throws InterruptedException, IOException {

		DesiredCapabilities pixelCapability = new DesiredCapabilities();
		pixelCapability.setCapability("deviceId", "emulator-5554");
		pixelCapability.setCapability("deviceName", "Pixel4Emulator");
		pixelCapability.setCapability("platformName", "Android");
		pixelCapability.setCapability("appPackage", "com.android.chrome");
		pixelCapability.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		pixelCapability.setCapability("noReset", true);

		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), pixelCapability);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.training-support.net/selenium/lazy-loading");
		
		List<MobileElement> viewImages = driver.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");
	    System.out.println("Number of image shown before scroll: " + viewImages.size());
			
		driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollTextIntoView(\"helen\")"));
	
        List<MobileElement> allImages = driver.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");
	    System.out.println("Number of image shown scrolling all the way till helen: " + allImages.size());

	}

	@AfterTest
	public void closing() {
		driver.quit();
	}
}

