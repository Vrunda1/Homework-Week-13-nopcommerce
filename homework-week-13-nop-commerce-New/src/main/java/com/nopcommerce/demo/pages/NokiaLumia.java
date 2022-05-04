package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class NokiaLumia extends Utility {
    By nokiaLumiaText = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By nokiaLumiaPrice =By.xpath("//span[@id='price-value-20']");
    By quantity = By.xpath("//input[@aria-label='Enter a quantity']");
    By addtoCart = By.xpath("//button[@id='add-to-cart-button-20']");
    By productAdddText =By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By closeButton = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    By shoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");

    public String verifyNokiaLumia(){
        return getTextFromElement(nokiaLumiaText);
    }
    public String verifyNokiaLumiaPriceText(){
        return getTextFromElement(nokiaLumiaPrice);
    }
    public void clearQuantity(){
        clearElementFromField(quantity);
    }
    public void updateQuantity(String addQunt){
        sendTextToElement(quantity,addQunt);
    }
    public void clickOnAddToCart() {
        clickOnElement(addtoCart);
    }
    public String verifyProductAddedtoCart(){
        return getTextFromElement(productAdddText);
    }
    public void clickOnClose(){
        clickOnElement(closeButton);
    }

    public void clickOnShoppingCart()
    {
        mouseHoverToElementAndClick(shoppingCart);
    }
    public void clickOnGoToCart(){
        clickOnElement(goToCart);
    }
}
