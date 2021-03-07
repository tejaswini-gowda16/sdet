package Appium_Activities;

import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Session1_Activity2 {
	
	AppiumDriver<MobileElement> driver = null;
	
	@Test
	public void calculate() throws InterruptedException, IOException {
		
		DesiredCapabilities pixelCapability = new DesiredCapabilities();
		pixelCapability.setCapability("deviceId", "emulator-5554");
		pixelCapability.setCapability("deviceName", "Pixel4Emulator");
		pixelCapability.setCapability("platformName", "Android");
		pixelCapability.setCapability("appPackage", "com.android.calculator2");
		pixelCapability.setCapability("appActivity", "com.android.calculator2.Calculator");
				
		
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), pixelCapability);
			System.out.println("Calculator is open");
			//Multiplication of 50*2
			
			driver.findElementById("digit_5").click();
			driver.findElementById("digit_0").click();
			driver.findElementById("op_mul").click();
			driver.findElementById("digit_2").click();
			driver.findElementById("eq").click();
			String product =  driver.findElementById("result").getText();
			
			System.out.println("50X2="+product);
			
			Assert.assertEquals(product, "100");
			
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
		
	   driver.quit();
	}
}

