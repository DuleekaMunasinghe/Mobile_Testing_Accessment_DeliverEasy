package com.swiggy.Driver;

import org.testng.annotations.Test;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

import com.swiggy.actions.CheckOutPageActions;
import com.swiggy.actions.ItemPageActions;
import com.swiggy.actions.LandingPageActions;
//import com.swiggy.actions.PlaceOrderActions;

public class driver extends Tools {
	protected static DesiredCapabilities cap;
	protected static LandingPageActions landingPage;
	protected static ItemPageActions items;
//	protected static PlaceOrderActions placeOrder;
	protected static CheckOutPageActions checkOut;
  @Test
  public void init() throws MalformedURLException {
	  cap =  new DesiredCapabilities();
		
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WIN11);
		//cap.chrome();
		driver = new RemoteWebDriver(new URL("http://192.168.1.6:4444/wd/hub"),cap);
		//driver = new ChromeDriver();
		landingPage = new LandingPageActions(driver);
		items = new ItemPageActions(driver);
//		placeOrder = new PlaceOrderActions(driver);
		checkOut = new CheckOutPageActions(driver);
  }
}
