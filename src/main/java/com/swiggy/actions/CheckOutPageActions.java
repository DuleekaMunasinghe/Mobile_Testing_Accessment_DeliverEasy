package com.swiggy.actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.swiggy.locators.CheckOutPageLocators;
import com.swiggy.utils.HelperClass;

public class CheckOutPageActions extends HelperClass {
	
	
	
	public CheckOutPageActions(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static String getMsg() throws InterruptedException {
		Thread.sleep(2000);
		CheckOutPageLocators.HeadingMsg(getDriver());
		String text = CheckOutPageLocators.HeadingMsg(getDriver()).getText();
		return text;
	}

}