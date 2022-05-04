package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsRegister extends Utility {
    By verifyRegister =By.xpath("//h1[contains(text(),'Register')]");
    By firstName = By.xpath("//input[@id='FirstName']");
    By secondName = By.xpath("//input[@id='LastName']");
    By email=By.xpath("//input[@id='Email']");
    By password = By.xpath("//input[@id='Password']");
    By confirmPW = By.xpath("//input[@id='ConfirmPassword']");
    By registerBtn = By.xpath("//button[@id='register-button']");

    public String verifyRegisterText(){
        return getTextFromElement(verifyRegister);
    }
    public void enterFirstName(String  fname){
        sendTextToElement(firstName,fname);
    }
    public void enterLastName(String  lname){
        sendTextToElement(secondName,lname);
    }
    public void enterEmail(String  mail){
        sendTextToElement(email,mail);
    }
    public void enterPassword(String  pw){
        sendTextToElement(password,pw);
    }
    public void enterConfirmPW(String  confirmPassword){
        sendTextToElement(confirmPW,confirmPassword);
    }
    public void clickOnRegisterBtn(){
        clickOnElement(registerBtn);
    }

}
