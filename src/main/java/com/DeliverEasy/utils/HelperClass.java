package com.DeliverEasy.utils;

import java.net.MalformedURLException;
import java.net.URL;
//import java.sql.DriverManager;
import java.time.Duration;
//import java.util.List;


//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;


//import java.io.IOException;
//
//import io.appium.java_client.android.AndroidDriver;

public class HelperClass {
	

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


}
