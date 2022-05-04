package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CellPhone extends Utility {
    By cellPhoneText = By.xpath("//h1[contains(text(),'Cell phones')]");
    By listTabLink = By.xpath("//a[@class='viewmode-icon list']");
    By nokiaLumiaLink = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/h2[1]/a[1]");

    public String CellPhoneText(){
        return getTextFromElement(cellPhoneText);
    }
    public void clickOnListTab()
    {
        clickOnElement(listTabLink);
    }
    public void clickOnNokiaTab()
    {
        clickOnElement(nokiaLumiaLink);
    }

}
