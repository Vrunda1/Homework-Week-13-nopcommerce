package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utility {
    By buildYourComputer1 = By.xpath("//h2[@class='product-title']//a[text()='Build your own computer']");
    //  By verifyBuildComp =By.xpath("//h2[@class='product-title']//a[text()='Build your own computer']");
    By processor1 = By.xpath("//select[@name='product_attribute_1']");
    By memory1 = By.xpath("//select[@name='product_attribute_2']");
    By hdd1 = By.xpath("//input[@value='7']");
    By operatingSystem = By.xpath("//input[@value='9']");

    By software = By.xpath("//input[@id='product_attribute_5_12']");
    By price = By.xpath("//div[@class='product-price']//span[text()='$1,475.00']");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-1']");
    By message = By.xpath("//p[text()='The product has been added to your ']");
    By closeMessage = By.xpath("//span[@title='Close']");
    By shoppingCart = By.xpath("//a[@class='ico-cart']");
    By goToCart = By.xpath("//button[text()='Go to cart']");


    public String buildYourComputerText1() {
        return getTextFromElement(buildYourComputer1);

    }

    public void selectProcessor1(String anyProce) {
        selectByVisibleTextFromDropDown(processor1, anyProce);
    }

    public void selectRam1(String ram) {
        selectByVisibleTextFromDropDown(memory1, ram);
    }

    public void selectHdd() {
        clickOnElement(hdd1);
    }

    public void selectOperatingSystem() {
        clickOnElement(operatingSystem);
    }

    public void selectSoftware() {
        clickOnElement(software);
    }

    public String verifyPrice() {
        return getTextFromElement(price);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    public String shoppingCartAlert() {
        return getTextFromElement(message);
    }

    public void closeMessageAlert() {
        clickOnElement(closeMessage);
    }

    public void clickOnShoppingCart() throws InterruptedException {
        mouseHoverToElementAndClick(shoppingCart);
    }

    public void clickOnGoToCart() {
        clickOnElement(goToCart);
    }

}
