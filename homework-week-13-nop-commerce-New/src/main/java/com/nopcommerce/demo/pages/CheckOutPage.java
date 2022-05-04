package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {
    By welcomeToStore = By.xpath("//h2[text()='Welcome to our store']");
    By logOutLink = By.xpath("//a[text()='Log out']");
    By checkoutGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");

    public String setWelcomeToStoreText(){
        return getTextFromElement(welcomeToStore);
    }
    public void clickOnLogoutLink(){
        clickOnElement(logOutLink);
    }
    public void clickOnCheckAsGuest(){
        clickOnElement(checkoutGuest);
    }

}
