package com.DeliverEasy.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BasePage {
    protected static AndroidDriver driver;

    public static void initializeDriver() throws MalformedURLException {
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
