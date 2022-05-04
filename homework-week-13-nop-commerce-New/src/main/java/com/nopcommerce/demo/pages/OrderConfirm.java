package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class OrderConfirm extends Utility {
    By creditCardText = By.xpath("//span[contains(text(),'Credit Card')]");
    By nextDayText = By.xpath("//li[@class='shipping-method']//span[contains(text(),'Next Day Air')]");
    By secondDayText = By.xpath("//li[@class='shipping-method']//span[contains(text(),'2nd Day Air')]");
    By total = By.xpath("//td[@class='cart-total-right']//span[@class='value-summary']//strong");
    By confirmBtn = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
    By thankYou = By.xpath("//h1[text()='Thank you']");
    By orderSuccessFull = By.xpath("//strong[text()='Your order has been successfully processed!']");
    By continuefinalBtn = By.xpath("//button[@class='button-1 order-completed-continue-button']");

    public String enterCreditText(){
        return getTextFromElement(creditCardText);
    }
    public String setNextDayText(){
        return getTextFromElement(nextDayText);
    }
    public String setSecondDayText(){
        return getTextFromElement(secondDayText);
    }
    public String setTotalText(){
        return getTextFromElement(total);
    }
    public void clickOnConfirm(){
        clickOnElement(confirmBtn);
    }
    public String setThankYouText(){
        return getTextFromElement(thankYou);
    }
    public String setOrderSuccessFullText(){
        return getTextFromElement(orderSuccessFull);
    }
    public void clickOnContinueFinalButton(){
        clickOnElement(continuefinalBtn);
    }
}
