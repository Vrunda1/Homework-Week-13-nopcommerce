package com.nopcommerce.demo.homePage;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    HomePage homepage = new HomePage();
    Computers computers = new Computers();
    Electronics electronics = new Electronics();
   Jewelry jewellery = new Jewelry();
    Books books = new Books();
    GiftCards giftCards = new GiftCards();
    DigitalDownload digitalDownload = new DigitalDownload();
    Apparel appreal = new Apparel();

    @Test//1.3
    public void verifyPageNavigation() {



        homepage.selectMenu("Computers");
        Assert.assertEquals(computers.getPageHeader(), "Computers", "Not on Correct Page");

        homepage.selectMenu("Electronics");
        Assert.assertEquals(electronics.getPageHeader(), "Electronics", "Not on Correct Page");

        homepage.selectMenu("Apparel");
        Assert.assertEquals(appreal.getPageHeader(), "Apparel", "Not on Correct Page");

        homepage.selectMenu("Digital downloads");
        Assert.assertEquals(digitalDownload.getPageHeader(), "Digital downloads", "Not on Correct Page");

        homepage.selectMenu("Books");
        Assert.assertEquals(books.getPageHeader(), "Books", "Not on Correct Page");

        homepage.selectMenu("Jewelry");
        Assert.assertEquals(jewellery.getPageheader(), "Jewelry", "Not on Correct Page");

        homepage.selectMenu("Gift Cards");
        Assert.assertEquals(giftCards.getPageHeader(), "Gift Cards", "Not on Correct Page");


    }

}
