package com.DeliverEasy.pages;

import org.openqa.selenium.By;

public class LandingPage extends BasePage {

    public void enterLocation(String location) {
        driver.findElement(By.xpath("//android.widget.EditText")).sendKeys(location);
        driver.hideKeyboard();
        driver.findElement(By.xpath("//android.widget.EditText")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='11 Percy Kinsman CrescentRiverstone Terraces, Upper Hutt']"))
                .click();
    }

    public void applyRestaurantFilter() {
        System.out.println("Searching filter apply for restaurants...");
        driver.findElement(By.xpath("//android.widget.TextView[@text='Restaurant']")).click();
    }
}
