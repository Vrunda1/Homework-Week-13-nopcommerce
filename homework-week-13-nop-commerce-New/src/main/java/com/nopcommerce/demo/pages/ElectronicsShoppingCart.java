package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsShoppingCart extends Utility {
    By shoppingCartText = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By quantity = By.xpath("//input[@class='qty-input']']");
    By totalAmount = By.xpath("//td[@class='subtotal']");
    By termsAndCondition = By.xpath("//input[@id='termsofservice']");
    By checkOutBtn = By.xpath("//button[@id='checkout']");
    By welcomeText = By.xpath("//h1[text()='Welcome, Please Sign In!']");

    public String verifyshoppingCartText(){
        return getTextFromElement(shoppingCartText);
    }
    public void clearQuantityBox(){
        clearElementFromField(quantity);
    }
    public void updateQuantityBox(String quant){
        sendTextToElement(quantity,quant);
    }
    public String verifyToatal(){
        return getTextFromElement(totalAmount);
    }
    public void clickOnTerms(){
        clickOnElement(termsAndCondition);
    }
    public void clickOnCheckOut(){
        clickOnElement(checkOutBtn);

    }
    public String verifyWelcomeText(){
        return getTextFromElement(welcomeText);
    }
}
