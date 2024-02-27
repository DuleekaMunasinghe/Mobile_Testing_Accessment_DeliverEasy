package com.DeliverEasy.definitions;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.AssertJUnit;

import com.DeliverEasy.Driver.scrollUpText;
import com.DeliverEasy.utils.HelperClass;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class OrderChickenSkewersDef {
	
	AndroidDriver driver;
	@Given("Navigate to the landing page of DeliverEasy")
	
	public void navigate_to_the_landing_page_of_swiggy() throws MalformedURLException {
		
		@SuppressWarnings({ "deprecation", "unused" })
		URL url = new URL("http://localhost:4723/wd/hub");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "10");
		capabilities.setCapability("appActivity", "nz.co.delivereasy.MainActivity");
		capabilities.setCapability("appPackage", "nz.co.delivereasy");

		driver = new AndroidDriver(url, capabilities);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getSessionId());
//		Assert.assertTrue(pageTitle.equals("Order food online from India's best food delivery service. Order from restaurants near you")); 
	}
	
	@When("Enter location as {string}")
	public void enter_location_as(String string) throws IOException {
		//Enter location
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"address\"]")).sendKeys("11 Percy Kinsman Cresent");
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"address\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"11 Percy Kinsman CrescentRiverstone Terraces, Upper Hutt\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		LandingPageActions.enterLocation(string);
	}
	
	@And("Searching filter apply for restaurents")
	public void searching_filter_apply_for_restaurents() throws InterruptedException, IOException {
		System.out.println("Searching filter apply for restaurents...");
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Restaurant\"]")).click();
//		LandingPageActions.selectLocation();

	}
	
	@When("Searching the restaurent {string}")
	public void searching_the_restaurent(String string) throws InterruptedException {
		List<WebElement> APIDemoList = driver.findElements(By.xpath("//android.widget.TextView"));
		scrollUpText lib = new scrollUpText();
		lib.scrollTillElement("Aroy Thai (Upper Hutt)", driver);
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Aroy Thai (Upper Hutt)\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		System.out.println("++++++++++++++++++++");
//		ItemPageActions.hoverOverSerch();

	}
	@Then("Searching the dish {string}")
	public void searching_the_dish(String string) throws InterruptedException {
		List<WebElement> APIDemoList1 = driver.findElements(By.xpath("//android.widget.TextView"));
		scrollUpText lib1 = new scrollUpText();
		lib1.scrollTillElement("Chicken Skewers (4pcs)", driver);
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Chicken Skewers (4pcs)\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		ItemPageActions.enterItem();

	}
	@When("Click on Add to cart button")
	public void click_on_Add_to_cart_button() throws InterruptedException {
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Prawn Spring Rolls (5pcs)\"]")).click();
	}
//		ItemPageActions.searchResturant();

//	}
//	
	@And("Click on view cart button")
	public void click_on_view_cart_button() throws InterruptedException {
		driver.findElement(By.xpath("//android.widget.TextView[@text='grated vegetables, glass noodles, sweet chilli sauce (deep fried)']")).click();
//		ItemPageActions.selectPizzaHut();

	}
		
	@And("Click on Checkout button")
	public void click_on_Checkout_button() throws InterruptedException {
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"View cart\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"View cart\"]")).click();
//		ItemPageActions.featchSearchIcon();
//		ItemPageActions.orderitem();
		
	}
//	@Then("Add one Margherita to cart")
//	public void add_one_Margherita_to_cart() throws InterruptedException {
//		ItemPageActions.addingItem();
//		
//				
//	}
//	@When("Click on Cart button")
//	public void click_on_checkout_button() throws InterruptedException {
//		ItemPageActions.clickCart();
//			
//	}
//			
//	@Then("Verify Checkout page is loaded correctly")
//	public void verify_Checkout_page_is_loaded_correctly() throws InterruptedException {
//		String expectedErrMsg = "SECURE CHECKOUT";
//		String actualErrMsg = CheckOutPageActions.getMsg();
//		Assert.assertEquals(actualErrMsg, expectedErrMsg); 
//
//	}
}
