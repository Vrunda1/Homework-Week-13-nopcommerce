package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class PaymentType extends Utility {
    By creditCard = By.xpath("//input[@value='Payments.Manual']");
    By creditCardNext = By.xpath("//button[@onclick='PaymentMethod.save()']");

    public void clickOnCreditCard(){
        clickOnElement(creditCard);
    }

    public void clickOnCreditCardContinue(){
        clickOnElement(creditCardNext);
    }


}
