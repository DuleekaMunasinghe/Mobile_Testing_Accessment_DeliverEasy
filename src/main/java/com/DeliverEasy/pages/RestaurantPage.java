package com.DeliverEasy.pages;

import org.openqa.selenium.By;

import com.DeliverEasy.Utils.scrollUpText;

import java.time.Duration;

public class RestaurantPage extends BasePage {

    public void searchRestaurant(String restaurantName) throws InterruptedException {
        scrollUpText.scrollTillElement(restaurantName, driver);
        driver.findElement(By.xpath("//android.widget.TextView[@text='" + restaurantName + "']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        System.out.println("++++++++++++++++++++");
    }
}
