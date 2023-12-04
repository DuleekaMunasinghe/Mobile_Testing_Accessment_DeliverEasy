package com.swiggy.definitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.AssertJUnit;

import com.swiggy.actions.LandingPageActions;
import com.swiggy.utils.HelperClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class OrderPizzaDef extends HelperClass {
	
	
	@Given("Navigate to the landing page of Swiggy {string}")
	public void navigate_to_the_landing_page_of_swiggy(String url) {
		//Navigate to site
		HelperClass.openPage(url);
		//Verify the navigation
		Assert.assertTrue(getDriver().getTitle().equals("Order food online from India's best food delivery service. Order from restaurants near you")); 
	}
	
	@When("Enter location as {string}")
	public void enter_location_as(String string) throws IOException {
		//Enter location
		LandingPageActions.enterLocation(string);
	}
	
	@When("Redirect to the ItemPage")
	public void redirect_to_the_item_page() throws InterruptedException {
		System.out.println("Redirecting to the item page...");
		driver.findElement(By.xpath("//span[normalize-space()='Mumbai, Maharashtra, India']")).click();
		// Verify Item page
		String title = driver.getTitle();
		System.out.println("Item Page Title::" + title);
		AssertJUnit.assertEquals("Order food online from India's best food delivery service. Order from restaurants near you", title);
		Thread.sleep(3000);
	}
	
	@When("Hover over search icon")
	public void hover_over_search_icon() throws InterruptedException {
		driver.findElement(By.xpath("//span[normalize-space()='Search']")).click();
		Thread.sleep(2000);
	}
	@Then("Enter Item as Pizza and search")
	public void enter_Item_as_Pizza_and_search() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Search for restaurants and food']")).sendKeys("Pizza");
		Thread.sleep(2000);
		// pressing enter key of the keyboard
		Actions actions = new Actions(driver);
		actions. sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(4000);
	}
	@When("Search resturant and select Pizza Hut")
	public void search_resturant_and_select_first_restaurant() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Restaurants')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Pizza Hut')]")).click();
		Thread.sleep(2000);
	}
	@And("Redirect to orderPage and order Margherita")
	public void redirect_to_orderPage() throws InterruptedException {
		driver.findElement(By.xpath("//span[@class='icon-magnifier']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search in Pizza Hut']")).sendKeys("Margherita");
		Thread.sleep(2000);
	}
	@Then("Add one Margherita to cart")
	public void add_one_Margherita_to_cart() throws InterruptedException {
		driver.findElement(By.xpath("(//div[@class='_1RPOp'][normalize-space()='ADD'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(normalize-space(),'Continue')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(normalize-space(),'Continue')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(normalize-space(),'Add Item')]")).click();
		Thread.sleep(2000);
		//double click action
//		Actions act = new Actions(driver);
//		WebElement ele = driver.findElement(By.xpath("(//span[@class='_1W_TH'])[1]"));
//		act.doubleClick(ele).perform();
//		Thread.sleep(2000);
			
	}
	@When("Click on Cart button")
	public void click_on_checkout_button() throws InterruptedException {
		driver.findElement(By.xpath("//span[normalize-space()='Cart']")).click();
		Thread.sleep(5000);
		//mouse is moving to cart button
//		WebElement elem = driver.findElement(By.xpath("//a[contains(@href,'/checkout')]"));
//		Actions builder = new Actions(driver);
//		builder.moveToElement(elem).perform();
//		Thread.sleep(3000);
		
	}
	@Then("Verify Checkout page is loaded correctly")
	public void verify_Checkout_page_is_loaded_correctly() {
		WebElement pageTitleElement = driver.findElement(By.xpath("(//span[@class='_2EQ3T'])[1]"));
        Assert.assertTrue(pageTitleElement.isDisplayed(), "Checkout page title is not displayed");
	}
}
		
//	    items items = new items();
//		// Write code here that turns the phrase above into concrete actions
//	    items.hoverOverSerch();
//	}
//	
//	@When("Enter Item as {string}")
//	public void enter_item_as(String string) {
//	    items items = new items();
//		// Write code here that turns the phrase above into concrete actions
//		items.enterItem(string);
//		items.searchItem();
//	}
//	
//	@Then("Select first location from suggested location in suggestion-box")
//	public void select_first_location_from_suggested_location_in_suggestion_box() throws IOException {
//		//Select location
//		LandingPageActions.selectLocation();
//	}
	
	//@When("Redirect to the ItemPage")
	//public void redirect_to_the_item_page() {
	//	Add logic here

//}
//	@When("Hover over search icon")
//	public void hover_over_search_icon() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("Enter Item as {string}")
//	public void enter_item_as(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("Select first suggested Item in pizza cateogory")
//	public void select_first_suggested_item_in_pizza_cateogory() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("Search resturant and select first restaurant")
//	public void search_resturant_and_select_first_restaurant() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("Redirect to orderPage")
//	public void redirect_to_order_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("Add first item to cart")
//	public void add_first_item_to_cart() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("Click on checkout button")
//	public void click_on_checkout_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@Then("Order a pizza suscessfully")
//	public void order_a_pizza_suscessfully() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}


