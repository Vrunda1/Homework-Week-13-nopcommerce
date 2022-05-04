package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Electronics extends Utility {
    By pageHeader = By.xpath("//h1[contains(text(),'Electronics')]");

    public String getPageHeader(){
        return getTextFromElement(pageHeader);

    }



    }
