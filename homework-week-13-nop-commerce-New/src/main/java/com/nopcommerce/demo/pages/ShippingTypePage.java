package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShippingTypePage extends Utility {
    By nextDayAirBtn = By.xpath("//input[@value='Next Day Air___Shipping.FixedByWeightByTotal']");
    By continueNextDayAir = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By new2ndDayAirBtn = By.xpath("//input[@value='2nd Day Air___Shipping.FixedByWeightByTotal']");

    public void clickOnNextDayAir(){
        clickOnElement(new2ndDayAirBtn);
    }
    public void clickOn2ndDayAir(){
        clickOnElement(new2ndDayAirBtn);
    }

    public void clickOnContinuenNextDayAir(){
        clickOnElement(continueNextDayAir);
    }


}
