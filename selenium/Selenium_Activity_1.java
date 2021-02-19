package Selenium_Java_Activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Activity_1 {

	public static void main(String args[]) {
		WebDriver d = new FirefoxDriver();
		d.get("https://www.training-support.net");
		d.close();
	}
}

