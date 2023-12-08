package com.swiggy.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.swiggy.locators.ItemPageLocators;
import com.swiggy.utils.HelperClass;

public class ItemPageActions extends HelperClass{
	
	private Actions actions;
		
	
	public ItemPageActions(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void hoverOverSerch () throws InterruptedException {
		Thread.sleep(1000);
		ItemPageLocators.serchIcon(getDriver()).click();
	}
	
	public static void enterItem() throws InterruptedException {
		Thread.sleep(2000);
		ItemPageLocators.placeHolder(getDriver()).sendKeys("Pizza");
		Thread.sleep(2000);
		// pressing keyboard enter key
		Actions actions = new Actions(driver);
		actions. sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(4000);
		
	}
	public static void searchResturant() throws InterruptedException {
		ItemPageLocators.resturant(getDriver()).click();
		Thread.sleep(2000);
		
	}
	public static void selectPizzaHut() throws InterruptedException {
		ItemPageLocators.suggestItem(getDriver()).click();
		Thread.sleep(3000);
	}
	public static void featchSearchIcon() throws InterruptedException {
		ItemPageLocators.searchIcon(getDriver()).click();
		Thread.sleep(2000);		
	}
	public static void orderitem() throws InterruptedException {
		ItemPageLocators.orderMargherita(getDriver()).sendKeys("Margherita");
		Thread.sleep(2000);		
	}
		public static void addingItem() throws InterruptedException {
		ItemPageLocators.addItem1(getDriver()).click();
		Thread.sleep(2000);
		ItemPageLocators.addItem2(getDriver()).click();
		Thread.sleep(2000);
		ItemPageLocators.addItem2(getDriver()).click();
		Thread.sleep(2000);
		ItemPageLocators.addItem4(getDriver()).click();
		Thread.sleep(2000);	
	}
		public static void clickCart() throws InterruptedException {
			ItemPageLocators.cart(getDriver()).click();
			Thread.sleep(2000);		
		}


}
