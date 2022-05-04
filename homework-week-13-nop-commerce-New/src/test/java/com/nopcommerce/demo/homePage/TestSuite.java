package com.nopcommerce.demo.homePage;

import com.nopcommerce.demo.pages.Computers;
import com.nopcommerce.demo.pages.DeskTop;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class TestSuite extends TestBase {
    HomePage homePage = new HomePage();
    DeskTop deskTop = new DeskTop();
    Computers computers = new  Computers();

    @Test
    public void testName(){
        homePage.selectMenu("Computers");
       computers.clickToDesktop();
    }}
