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
import org.openqa.selenium.remote.DesiredCapabilities;

public class Session2_Activity2 {

	AppiumDriver<MobileElement> driver = null;

	@BeforeClass
	public void begining() throws InterruptedException, IOException {

		DesiredCapabilities pixelCapability = new DesiredCapabilities();
		pixelCapability.setCapability("deviceId", "emulator-5554");
		pixelCapability.setCapability("deviceName", "Pixel4Emulator");
		pixelCapability.setCapability("platformName", "Android");
		pixelCapability.setCapability("appPackage", "com.android.calculator2");
		pixelCapability.setCapability("appActivity", "com.android.calculator2.Calculator");

		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), pixelCapability);
		System.out.println("Calculator is open");
	}

	@Test
	public void addition() {

		driver.findElementById("digit_5").click();
		driver.findElementById("op_add").click();
		driver.findElementById("digit_9").click();
		driver.findElementById("eq").click();
		String sum =  driver.findElementById("result").getText();

		System.out.println("5 + 9 = "+sum);
		Assert.assertEquals(sum, "14");
	}

	@Test
	public void subtraction() {

		driver.findElementById("digit_1").click();
		driver.findElementById("digit_0").click();
		driver.findElementById("op_sub").click();
		driver.findElementById("digit_5").click();
		driver.findElementById("eq").click();
		String minus =  driver.findElementById("result").getText();

		System.out.println("10 - 5 = "+minus);
		Assert.assertEquals(minus, "5");
	}
	@Test
	public void multiplication() {
		driver.findElementById("digit_5").click();
		driver.findElementById("op_mul").click();
		driver.findElementById("digit_1").click();
		driver.findElementById("digit_0").click();
		driver.findElementById("digit_0").click();
		driver.findElementById("eq").click();
		String product =  driver.findElementById("result").getText();

		System.out.println("5 X 100 = "+product);

		Assert.assertEquals(product, "500");
	}
	
	@Test
	public void division() {
		driver.findElementById("digit_5").click();
		driver.findElementById("digit_0").click();
		driver.findElementById("op_div").click();
		driver.findElementById("digit_2").click();
		driver.findElementById("eq").click();
		String div =  driver.findElementById("result").getText();

		System.out.println("50 / 2 = "+div);

		Assert.assertEquals(div, "25");
	}
	
	@AfterClass
	public void closing() {
		driver.quit();
	}
}

