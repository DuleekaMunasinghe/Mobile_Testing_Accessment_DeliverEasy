package com.swiggy.actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.swiggy.locators.CheckOutPageLocators;
import com.swiggy.locators.ItemPageLocators;
import com.swiggy.utils.HelperClass;
import org.testng.Assert;
public class CheckOutPageActions extends HelperClass {
	
//	private WebDriverWait wait;
	
//	public String getMsg() {
//		
//		wait.until(ExpectedConditions.visibilityOf(CheckOutPageLocators.HeadingMsg(getDriver())));
//		String text = CheckOutPageLocators.HeadingMsg(getDriver()).getText();
//		WebElement pageTitleElement = driver.findElement(By.xpath("(//span[@class='_2EQ3T'])[1]"));
//		Assert.assertTrue(pageTitleElement.isDisplayed(), "Checkout page title is not displayed");
//		return text;
//	}
	
	public static void CheckoutTitle() throws InterruptedException {
		//wait.until(ExpectedConditions.visibilityOf(ItemPageLocators.suggestItems(getDriver())));
//		CheckOutPageLocators.CheckoutTitle(getDriver());
//		Assert.assertTrue(CheckoutTitle.isDisplayed(), "Checkout page title is not displayed");
//		Thread.sleep(2000);
		WebElement pageTitleElement = driver.findElement(By.xpath("(//span[@class='_2EQ3T'])[1]"));
        Assert.assertTrue(pageTitleElement.isDisplayed(), "Checkout page title is not displayed");
        Thread.sleep(1000);
	}
	

}
