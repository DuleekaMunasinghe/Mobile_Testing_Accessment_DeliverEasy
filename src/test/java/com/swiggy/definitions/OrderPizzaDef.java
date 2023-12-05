package com.swiggy.definitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.AssertJUnit;

import com.swiggy.actions.CheckOutPageActions;
import com.swiggy.actions.ItemPageActions;
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
	
	@And("Redirect to the ItemPage")
	public void redirect_to_the_item_page() throws InterruptedException, IOException {
		System.out.println("Redirecting to the item page...");
		LandingPageActions.selectLocation();

	}
	
	@When("Hover over search icon")
	public void hover_over_search_icon() throws InterruptedException {
		
		ItemPageActions.hoverOverSerch();

	}
	@Then("Enter Item as Pizza and search")
	public void enter_Item_as_Pizza_and_search() throws InterruptedException {
		ItemPageActions.enterItem();

	}
	@When("Search resturant")
	public void search_resturant() throws InterruptedException {
		ItemPageActions.searchResturant();

	}
	@And("Select Pizza Hut")
	public void Select_Pizza_Hut() throws InterruptedException {
		ItemPageActions.selectPizzaHut();

	}
		
	@And("Redirect to orderPage and order Margherita")
	public void redirect_to_orderPage() throws InterruptedException {
		ItemPageActions.featchSearchIcon();
		ItemPageActions.orderitem();
		
	}
	@Then("Add one Margherita to cart")
	public void add_one_Margherita_to_cart() throws InterruptedException {
		ItemPageActions.addingItem();
		
				
	}
	@When("Click on Cart button")
	public void click_on_checkout_button() throws InterruptedException {
		ItemPageActions.clickCart();
		
		
	}
	@Then("Verify Checkout page is loaded correctly")
	public void verify_Checkout_page_is_loaded_correctly() throws InterruptedException {
		CheckOutPageActions.CheckoutTitle(); 

	}
}
