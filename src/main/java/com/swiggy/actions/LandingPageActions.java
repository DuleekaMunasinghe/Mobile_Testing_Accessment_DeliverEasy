package com.swiggy.actions;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.swiggy.locators.LandingPageLocators;
import com.swiggy.utils.HelperClass;

public class LandingPageActions extends HelperClass {

	public LandingPageActions(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	//Enter location in the search box
	public static void enterLocation(String city) throws IOException {
		//Wait until location box visible
		waitForVisibilityOfElement(By.id("location"),Duration.ofSeconds(10));
		//Enter location
		LandingPageLocators.locationBox(getDriver()).sendKeys(city);
	}

		public static void selectLocation() throws IOException, InterruptedException {
		System.out.println("Redirecting to the item page...");
		waitForVisibilityOfElement(By.xpath("//span[contains(@class ,'_2W-T9')]"),Duration.ofSeconds(20));
		LandingPageLocators.locationSuggestion(getDriver()).click();
		Thread.sleep(3000);
	}



}
