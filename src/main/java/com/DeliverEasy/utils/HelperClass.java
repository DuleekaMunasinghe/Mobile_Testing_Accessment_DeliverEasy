package com.DeliverEasy.utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;




public class HelperClass {
	
//	public static HelperClass helperClass;
//	static AndroidDriver driver;
	public static void setUpDriver() throws MalformedURLException {
		AndroidDriver driver;
		@SuppressWarnings({ "deprecation", "unused" })
		URL url = new URL("http://localhost:4723/wd/hub");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "10");
		capabilities.setCapability("appActivity", "nz.co.delivereasy.MainActivity");
		capabilities.setCapability("appPackage", "nz.co.delivereasy");

		driver = new AndroidDriver(url, capabilities);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getSessionId());
	}
	
//	public static void EnterLocation() {
////		AndroidDriver driver;
//		driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"address\"]")).sendKeys("11 Percy Kinsman Cresent");
//		driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"address\"]")).click();
//		driver.findElement(By.xpath("//android.widget.TextView[@text=\"11 Percy Kinsman CrescentRiverstone Terraces, Upper Hutt\"]")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	}
	
//	public static void tearDown() {
//		AndroidDriver driver = null;
//		if (driver != null) {
//			driver.quit();
//		}
//		helperClass = null;
//	}


}
