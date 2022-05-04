package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BillingPage extends Utility {
    By firstName = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastName = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By emailField = By.xpath("//input[@id='BillingNewAddress_Email']");
    By countryDropMenu = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By city = By.xpath("//input[@id='BillingNewAddress_City']");
    By billAddress = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By zipCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phone = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueBtn = By.xpath("//div[@id='billing-buttons-container']//button[@class='button-1 new-address-next-step-button']");

    public void setFirstName(String fname){
        sendTextToElement(firstName, fname);
    }
    public void setLastName(String lname){
        sendTextToElement(lastName, lname);
    }
    public void setEmail(String email){
        sendTextToElement(emailField, email);
    }
    public void selectCountry(String country){
        selectByVisibleTextFromDropDown(countryDropMenu, country);
    }
    public void enterCity(String city1){
        sendTextToElement(city, city1);
    }
    public void enterAddress(String address){
        sendTextToElement(billAddress, address);
    }
    public void enterZipCode(String zip){
        sendTextToElement(zipCode, zip);
    }
    public void enterPhoneNumbers(String code){
        sendTextToElement(phone, code);
    }
    public void clickOnContinuebox(){
        clickOnElement(continueBtn);
    }

}
