package com.nopcommerce.demo.pages;

import com.google.common.base.Verify;
import com.nopcommerce.demo.utility.Utility;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DeskTop extends Utility {
    By pageHeader = By.xpath("//li[@class='inactive']//a[contains(text(),'Desktops ')]");
    By sortMenu = By.xpath("//select[@aria-label='Select product sort order']");
    By priceOrder = By.xpath("//span[@class='price actual-price']");
    By sortAtoZ = By.xpath("//select[@id='products-orderby']");
  //  By addtoCart =By.xpath("//button[@id='add-to-cart-button-1']");
    By buildComputer = By.xpath("//h2[@class='product-title']//a[text()='Build your own computer']");
    By verifyBuildCom =By.xpath("//a[contains(text(),'Build your own computer')]");
//    By ramSelect  = By.xpath("//select[@name='product_attribute_1']");
//    By ramgb = By.xpath("//select[@name='product_attribute_2']");
//    By ram3 = By.xpath("//input[@value='7']");
//    By ram4 = By.xpath("//input[@value='9']");
//    By ram5 = By.xpath("//input[@id='product_attribute_5_10']");
//    By ram6 = By.xpath("//input[@id='product_attribute_5_12']");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-1']");
//    By price = By.xpath("//div[@class='product-price']//span[text()='$1,475.00']");
//    By addingCart =By.xpath("//button[@id='add-to-cart-button-1']");
//    By verifyAddingCart = By.xpath("//h1[text()='Shopping cart']");
//    By closeBtn = By.xpath("//span[@class='close']");
//    By gotoCart = By.xpath("//button[text()='Go to cart']");
//    By verifyShopCart = By.xpath("//h1[text()='Shopping cart']");
//





    public String getPageHeader() {
        return getTextFromElement(pageHeader);

    }
    public void clickOnSortByPrice(){
        selectByVisibleTextFromDropDown(sortMenu,"Price:Low to High");
    }

    public void selectSortByMenu(String sortBy) {
        selectByVisibleTextFromDropDown(sortMenu, sortBy);
    }
    public void selectSortByAToZ(String sortatoz){
        selectByVisibleTextFromDropDown(sortAtoZ,sortatoz);
    }
    public void clickOnBuildYourComputer(){
        clickOnElement(buildComputer);
    }

    public List<WebElement> getAllElementsPrice() {
        return driver.findElements(priceOrder);
    }


    public void selectBuildYourComputer(){
        clickOnElement(buildComputer);
    }
    public String verifyBuildComputer(){
        return getTextFromElement(buildComputer);
    }
    public void getToCart(){
       clickOnElement(addToCart);
   }





    //2.2 ram
//    public void select22Ram() {
//        clickOnElement(ramSelect);
//    }
//    //8 gb
//    public void select8Ram() {
//        clickOnElement(ramgb);
//    }
//    //400gb
//    public void select400Ram() {
//        clickOnElement(ram3);
//    }
//    //vista
//    public void selectvistaRam() {
//        clickOnElement(ram4);
//    }
//    //total commander
//    public void selectComanderRam() {
//        clickOnElement(ram6);
//    }//Microsoft Office [+$50.00]
//    public void selectMS50Ram() {
//        clickOnElement(ram5);
//    }
//    public String verifyComputerPrice(){
//        return getTextFromElement(price);
//    }



    }




