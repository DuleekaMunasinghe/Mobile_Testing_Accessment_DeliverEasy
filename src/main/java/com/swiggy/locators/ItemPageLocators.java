package com.swiggy.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.swiggy.utils.HelperClass;

public class ItemPageLocators extends HelperClass {
	
	
	public static WebElement serchIcon (WebDriver driver)
	{
		return driver.findElement(By.xpath("//span[normalize-space()='Search']"));
	}
	
	public static WebElement placeHolder (WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[@placeholder='Search for restaurants and food']]"));
	}
	
	public static WebElement suggestItems (WebDriver driver)
	{
		return driver.findElement(By.xpath("//div[contains(@class,'_3sbqM')]"));
	}
	
	public static WebElement firstItem (WebDriver driver)
	{
		return driver.findElement(By.xpath("(//div[contains(@class,'_1HEuF _3pTZL')])[1]"));
	}
	
}
