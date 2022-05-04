package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class PaymentDetails extends Utility {
    By selectCreditCard = By.xpath("//select[@id='CreditCardType']");
    By cardHolderName = By.xpath("//input[@id='CardholderName']");
    By cardNum = By.xpath("//input[@id='CardNumber']");
    By expireMonth = By.xpath("//select[@id='ExpireMonth']");
    By expireYear = By.xpath("//select[@id='ExpireYear']");
    By cvvNum = By.xpath("//input[@id='CardCode']");
    By continuePayment = By.xpath("//button[@class='button-1 payment-info-next-step-button']");

    public void selectCreditCardFromDropDown(String menu){
        selectByVisibleTextFromDropDown(selectCreditCard,menu);
    }
    public void entercardHolderName(String nameOnCard){
        sendTextToElement(cardHolderName,nameOnCard);
    }
    public void entercreditCardNumber(String cardNumber){
        sendTextToElement(cardNum,cardNumber);
    }
    public void enterExpireMonth(String month){
        selectByVisibleTextFromDropDown(expireMonth, month);
    }
    public void entrExpireYear(String year){
        selectByVisibleTextFromDropDown(expireYear, year);
    }
    public void enterCvvNumber(String cvvNo){
        sendTextToElement(cvvNum,cvvNo);
    }
    public void clickOnContinuePaymentButton(){
        clickOnElement(continuePayment);
    }

}
