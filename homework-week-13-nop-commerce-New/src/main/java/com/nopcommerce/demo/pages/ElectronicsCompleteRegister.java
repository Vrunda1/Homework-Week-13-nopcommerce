package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsCompleteRegister extends Utility {
    By registerSuccess = By.xpath("//div[contains(text(),'Your registration completed')]");
    By continueBtn = By.xpath("//a[contains(text(),'Continue')]");
    By shoppingText = By.xpath("//h1[contains(text(),'Shopping cart')]");

    public String verifyRegistrSuccessText(){
        return getTextFromElement(registerSuccess);
    }
    public void clickOnContinueBtn(){
        clickOnElement(continueBtn);
    }
    public String verifyShoppingText(){
        return getTextFromElement(shoppingText);
    }
}
