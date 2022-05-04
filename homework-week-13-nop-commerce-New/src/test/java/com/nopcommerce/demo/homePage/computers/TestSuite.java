package com.nopcommerce.demo.homePage.computers;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSuite extends TestBase {
    Computers computers = new Computers();
    HomePage homePage = new HomePage();
    DeskTop deskTop = new DeskTop();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    BillingPage billingPage = new BillingPage();
    ShippingTypePage shippingPage = new ShippingTypePage();
    PaymentType paymentType = new PaymentType();
    PaymentDetails paymentDetails = new PaymentDetails();
    OrderConfirm orderConfirm = new OrderConfirm();
    CheckOutPage checkOutPage = new CheckOutPage();

    @Test
    public void testName() throws InterruptedException {

        computers.clickToComputer();
        computers.clickToDesktop();
        //String expected = "Price:Low to High";

        List<WebElement> originalgList = deskTop.getAllElementsPrice();
        List<Double> expectedList = new ArrayList<>();
        for (WebElement test : originalgList) {
            String s1 = test.getText();
            String s2 = s1.substring(1).replace(",", "");
            Double price = Double.valueOf(s2);
            expectedList.add(price);
        }
        Collections.sort(expectedList);
        System.out.println(expectedList);

        Thread.sleep(1000);
        deskTop.selectSortByMenu("Price: Low to High");
        Thread.sleep(2000);
        List<WebElement> afetrsort = deskTop.getAllElementsPrice();
        List actualList = new ArrayList();
        for (WebElement data : afetrsort) {
            String s1 = data.getText();
            String s2 = s1.substring(1).replace(",", "");
            Double price = Double.valueOf(s2);
            actualList.add(price);
        }
        System.out.println(actualList);
        Assert.assertEquals(actualList, expectedList, "Not in correct order");

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        computers.clickToComputer();
        computers.clickToDesktop();
        deskTop.selectSortByAToZ("Name: A to Z");
        Thread.sleep(2000);
        deskTop.clickOnBuildYourComputer();
        Thread.sleep(2000);
        buildYourOwnComputer.selectProcessor1("2.2 GHz Intel Pentium Dual-Core E2200");
        Thread.sleep(2000);
        buildYourOwnComputer.selectRam1("8GB [+$60.00]");
        Thread.sleep(2000);
        buildYourOwnComputer.selectHdd();
        buildYourOwnComputer.selectOperatingSystem();
        buildYourOwnComputer.selectSoftware();
        Thread.sleep(2000);
        Assert.assertEquals(buildYourOwnComputer.verifyPrice(), "$1,475.00", "not navigate to page");
        buildYourOwnComputer.clickOnAddToCart();
        Assert.assertEquals(buildYourOwnComputer.shoppingCartAlert(), "The product has been added to your shopping cart");
        buildYourOwnComputer.closeMessageAlert();
        buildYourOwnComputer.clickOnShoppingCart();
        buildYourOwnComputer.clickOnGoToCart();
        shoppingCartPage.clearQuntity();
        shoppingCartPage.changeQuantity("2");
        shoppingCartPage.clickOnUpdataCart();
        Thread.sleep(2000);
        Assert.assertEquals(shoppingCartPage.verifyTotalPriceValue(), "$2,950.00");
        shoppingCartPage.clickOnTermsOfService();
        shoppingCartPage.clickOnCheckout();
        checkOutPage.clickOnCheckAsGuest();
        billingPage.setFirstName("Dummy");
        billingPage.setLastName("Test");
        billingPage.setEmail("testing123@yahoo.com");
        billingPage.selectCountry("India");
        billingPage.enterCity("Ahmedabad");
        billingPage.enterAddress("10,Street");
        billingPage.enterZipCode("3812");
        billingPage.enterZipCode("101");
        billingPage.enterPhoneNumbers("0778456120");
        billingPage.clickOnContinuebox();
        shippingPage.clickOnNextDayAir();
        shippingPage.clickOnContinuenNextDayAir();
        paymentType.clickOnCreditCard();
        paymentType.clickOnCreditCardContinue();
        paymentDetails.selectCreditCardFromDropDown("Master card");
        paymentDetails.entercardHolderName("John");
        paymentDetails.entercreditCardNumber("5555555555554444");
        paymentDetails.enterExpireMonth("05");
        paymentDetails.entrExpireYear("2024");
        paymentDetails.enterCvvNumber("701");
        paymentDetails.clickOnContinuePaymentButton();
        Assert.assertEquals(orderConfirm.enterCreditText(), "Credit Card", "Cannot navigate to page");
        Assert.assertEquals(orderConfirm.setTotalText(), "$2,950.00", "Cannot navigate to page");
        orderConfirm.clickOnConfirm();
        Assert.assertEquals(orderConfirm.setThankYouText(), "Thank you", "Not navigate to page");
        Assert.assertEquals(orderConfirm.setOrderSuccessFullText(), "Your order has been successfully processed!", "Cannot navigate to page");
        orderConfirm.clickOnContinueFinalButton();
        Assert.assertEquals(checkOutPage.setWelcomeToStoreText(), "Welcome to our store", "Cannot navigate to pag");

    }
}