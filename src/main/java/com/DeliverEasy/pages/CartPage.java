package com.DeliverEasy.pages;


import org.openqa.selenium.By;

public class CartPage extends BasePage {

    public void clickAddToCart() throws InterruptedException {
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Sugarcane Prawns (3pcs) $10.50 Shrimp, fish, carrots, spring onions, sugarcane, sweet chilli sauce (deep fried).\"]"))
                .click();
    }

    public void clickViewCart() throws InterruptedException {
        driver.findElement(By.xpath("//android.widget.TextView[@text='View cart']")).click();
    }

    public void clickCheckout() throws InterruptedException {
        driver.findElement(By.xpath("//android.view.View[@content-desc='View cart $10.50']")).click();
    }
}
