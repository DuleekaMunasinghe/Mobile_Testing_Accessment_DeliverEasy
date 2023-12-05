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
		return driver.findElement(By.xpath("//input[@placeholder='Search for restaurants and food']"));
	}
	
	public static WebElement resturant (WebDriver driver)
	{
		return driver.findElement(By.xpath("//span[contains(text(),'Restaurants')]"));
	}
	
	public static WebElement suggestItem (WebDriver driver)
	{
		return driver.findElement(By.xpath("//div[contains(text(),'Pizza Hut')]"));
	}
	
	public static WebElement searchIcon (WebDriver driver)
	{
		return driver.findElement(By.xpath("//span[@class='icon-magnifier']"));
	}
	public static WebElement orderMargherita (WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[@placeholder='Search in Pizza Hut']"));
	}
	
	public static WebElement addItem1 (WebDriver driver)
	{
		return driver.findElement(By.xpath("(//div[@class='_1RPOp'][normalize-space()='ADD'])[1]"));
	}
	
	public static WebElement addItem2 (WebDriver driver)
	{
		return driver.findElement(By.xpath("//span[contains(normalize-space(),'Continue')]"));
	}
	
//	public static WebElement addItem3 (WebDriver driver)
//	{
//		return driver.findElement(By.xpath("//span[contains(normalize-space(),'Continue')]"));
//	}
	
	public static WebElement addItem4 (WebDriver driver)
	{
		return driver.findElement(By.xpath("//span[contains(normalize-space(),'Add Item')]"));
	}
	
	public static WebElement cart (WebDriver driver)
	{
		return driver.findElement(By.xpath("//span[normalize-space()='Cart']"));
	}
	
}
