package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By shoppingCart = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By quantity = By.xpath("//input[contains(@id, 'itemquantity')]");
    By updateCart = By.xpath("//button[text()='Update shopping cart']");
    By total = By.className("product-subtotal");
    By termsOfService = By.id("termsofservice");
    By checkoutBtn = By.id("checkout");
    By quantityValue = By.xpath("//span[contains(text(),'(2)')]");
    By totalPrice = By.xpath("//span[contains(text(),'$2,950.00')]");
    By clearElement =(By.xpath("//input[@class='qty-input']"));

    public String verifyShoppingCartText() {
        return getTextFromElement(shoppingCart);
    }
    public void clearQuntity(){
        clearElementFromField(clearElement);
    }

    public void changeQuantity(String numbers) {
        sendTextToElement(clearElement,numbers);
    }
    public void clickOnUpdataCart(){
        clickOnElement(updateCart);
    }

    public String verifyTotal(){
       return getTextFromElement(total);
    }
    public void clickOnTermsOfService(){
        clickOnElement(termsOfService);
    }
    public void clickOnCheckout(){
        clickOnElement(checkoutBtn);
    }
    public String verifyQuantityValue() {
        return getTextFromElement(quantityValue);
    }
    public String verifyTotalPriceValue(){
        return getTextFromElement(totalPrice);
    }

    }
