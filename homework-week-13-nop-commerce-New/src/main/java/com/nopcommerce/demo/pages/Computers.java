package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Computers extends Utility {
    By pageHeader = By.xpath("//h1[contains(text(),'Computers')]");
    By desktopLink = By.xpath("//li[@class='inactive']//a[contains(text(),'Desktops ')]");
    By computer = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");





    public String getPageHeader(){
        return getTextFromElement(pageHeader);

    }
    public void clickToDesktop(){
        clickOnElement(desktopLink);
    }
    public void clickToComputer(){
        clickOnElement(computer);
    }

}
