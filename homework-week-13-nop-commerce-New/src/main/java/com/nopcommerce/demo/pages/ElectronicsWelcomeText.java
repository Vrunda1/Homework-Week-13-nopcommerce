package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsWelcomeText extends Utility {
    By registerLink = By.xpath("//button[contains(text(),'Register')]");


    public void clickOnRegister(){
        clickOnElement(registerLink);
    }

}
