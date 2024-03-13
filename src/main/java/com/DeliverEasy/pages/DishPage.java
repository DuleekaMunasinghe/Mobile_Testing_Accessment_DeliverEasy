package com.DeliverEasy.pages;


import org.openqa.selenium.By;

import com.DeliverEasy.Utils.scrollUpText;

import java.time.Duration;

public class DishPage extends BasePage {

    public void searchDish(String dishName) throws InterruptedException {
    	scrollUpText.scrollTillElement(dishName, driver);
        driver.findElement(By.xpath("//android.widget.TextView[@text='" + dishName + "']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
