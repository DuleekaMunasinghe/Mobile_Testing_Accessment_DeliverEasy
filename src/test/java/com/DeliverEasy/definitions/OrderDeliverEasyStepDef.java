package com.DeliverEasy.definitions;


import com.DeliverEasy.pages.BasePage;
import com.DeliverEasy.pages.CartPage;
import com.DeliverEasy.pages.DishPage;
import com.DeliverEasy.pages.LandingPage;
import com.DeliverEasy.pages.RestaurantPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class OrderDeliverEasyStepDef extends BasePage {

    LandingPage landingPage = new LandingPage();
    RestaurantPage restaurantPage = new RestaurantPage();
    DishPage dishPage = new DishPage();
    CartPage cartPage = new CartPage();

    @Given("Navigate to the landing page of DeliverEasy")
    public void navigate_to_the_landing_page_of_DeliverEasy() throws MalformedURLException {
        initializeDriver();
    }

    @When("Enter location as {string}")
    public void enter_location_as(String location) {
        landingPage.enterLocation(location);
    }

    @And("Searching filter apply for restaurants")
    public void searching_filter_apply_for_restaurants() {
        landingPage.applyRestaurantFilter();
    }

    @When("Searching the restaurant {string}")
    public void searching_the_restaurant(String restaurantName) throws InterruptedException {
        restaurantPage.searchRestaurant(restaurantName);
    }

    @Then("Searching the dish {string}")
    public void searching_the_dish(String dishName) throws InterruptedException {
        dishPage.searchDish(dishName);
    }

    @When("Click on Add to cart button")
    public void click_on_Add_to_cart_button() throws InterruptedException {
        cartPage.clickAddToCart();
    }

    @And("Click on view cart button")
    public void click_on_view_cart_button() throws InterruptedException {
        cartPage.clickViewCart();
    }

    @And("Click on Checkout button")
    public void click_on_Checkout_button() throws InterruptedException {
        cartPage.clickCheckout();
    }
}
