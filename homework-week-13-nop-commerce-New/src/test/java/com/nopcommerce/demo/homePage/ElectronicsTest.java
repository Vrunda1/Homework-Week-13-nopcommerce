package com.nopcommerce.demo.homePage;

import com.google.common.base.Verify;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import javafx.scene.control.Tab;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.interactions.Mouse;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {

    HomePage homePage = new HomePage();
    CellPhone cellPhone = new CellPhone();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    NokiaLumia nokiaLumia = new NokiaLumia();
    ElectronicsShoppingCart electronicsShoppingCart = new ElectronicsShoppingCart();
    ElectronicsWelcomeText electronicsWelcomeText = new ElectronicsWelcomeText();
    ElectronicsRegister electronicsRegister = new ElectronicsRegister();
    ElectronicsCompleteRegister electronicsCompleteRegister = new ElectronicsCompleteRegister();
    BillingPage billingPage = new BillingPage();
    ShippingTypePage shippingTypePage = new ShippingTypePage();
    PaymentType paymentType = new PaymentType();
    PaymentDetails paymentDetails = new PaymentDetails();
    OrderConfirm orderConfirm = new OrderConfirm();
    CheckOutPage checkOutPage = new CheckOutPage();

    @Test
    public void textVerified() {
        homePage.mouseHoverElectronics();//    1.1 Mouse Hover on “Electronics” Tab
        homePage.mouseHoverAndClickOnCellPhones();//1.2 Mouse Hover on “Cell phones” and click
        //1.3 Verify the text “Cell phones”
        Assert.assertEquals(cellPhone.CellPhoneText(), "Cell phones", "Cannot navigate to page");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        homePage.mouseHoverElectronics();
        homePage.mouseHoverAndClickOnCellPhones();
        Thread.sleep(1000);
        Assert.assertEquals(cellPhone.CellPhoneText(), "Cell phones", "Cannot navigate to page");
        cellPhone.clickOnListTab();
        Thread.sleep(2000);

        cellPhone.clickOnNokiaTab();
        Assert.assertEquals(nokiaLumia.verifyNokiaLumia(), "Nokia Lumia 1020", "Cannot verify text");
        Assert.assertEquals(nokiaLumia.verifyNokiaLumiaPriceText(), "$349.00", "Price is incorrect");
        Thread.sleep(2000);
        nokiaLumia.clearQuantity();
        nokiaLumia.updateQuantity("2");
        nokiaLumia.clickOnAddToCart();
        Assert.assertEquals(nokiaLumia.verifyProductAddedtoCart(), "The product has been added to your shopping cart", "Cannot verify");
        nokiaLumia.clickOnClose();
        nokiaLumia.clickOnShoppingCart();
        nokiaLumia.clickOnGoToCart();
        Assert.assertEquals(electronicsShoppingCart.verifyshoppingCartText(), "Shopping cart", "NOt verified");
        Assert.assertEquals(electronicsShoppingCart.verifyToatal(), "$698.00", "Total is not correct");
        electronicsShoppingCart.clickOnTerms();
        electronicsShoppingCart.clickOnCheckOut();
        Thread.sleep(2000);
        Assert.assertEquals(electronicsShoppingCart.verifyWelcomeText(), "Welcome, Please Sign In!", "Not verified");
        electronicsWelcomeText.clickOnRegister();
        Assert.assertEquals(electronicsRegister.verifyRegisterText(), "Register", "Not Registered");
        Thread.sleep(2000);
        electronicsRegister.enterFirstName("Rose1");
        electronicsRegister.enterLastName("Smith");
        electronicsRegister.enterEmail("rose1223@gmail.com");
        electronicsRegister.enterPassword("abc123");
        electronicsRegister.enterConfirmPW("abc123");
        electronicsRegister.clickOnRegisterBtn();
        Assert.assertEquals(electronicsCompleteRegister.verifyRegistrSuccessText(), "Your registration completed", "Registration is failed");
        electronicsCompleteRegister.clickOnContinueBtn();
        Assert.assertEquals(electronicsCompleteRegister.verifyShoppingText(), "Shopping cart", "Not navigate to page");
        electronicsShoppingCart.clickOnTerms();
        electronicsShoppingCart.clickOnCheckOut();
        billingPage.setFirstName("Rose");
        billingPage.setLastName("Smith");
        billingPage.setEmail("john1@gail.com");
        billingPage.selectCountry("India");
        billingPage.enterCity("Paris");
        billingPage.enterAddress("10 b street");
        billingPage.enterZipCode("3512");
        billingPage.enterPhoneNumbers("0778912344");
        billingPage.clickOnContinuebox();
        shippingTypePage.clickOn2ndDayAir();
        shippingTypePage.clickOnContinuenNextDayAir();
        paymentType.clickOnCreditCard();
        paymentType.clickOnCreditCardContinue();
        paymentDetails.selectCreditCardFromDropDown("Visa");
        paymentDetails.entercardHolderName("Rose Smith");
        paymentDetails.entercreditCardNumber("4111111111111111");
        paymentDetails.enterExpireMonth("08");
        paymentDetails.entrExpireYear("2026");
        paymentDetails.enterCvvNumber("101");
        paymentDetails.clickOnContinuePaymentButton();
        Assert.assertEquals(orderConfirm.enterCreditText(), "Credit Car", "Cannot navigate to page");
        Assert.assertEquals(orderConfirm.setSecondDayText(), "2nd Day Air", "Cannot navigate to page");
        Assert.assertEquals(orderConfirm.setTotalText(), "$698.00", "Cannot navigate to page");
        orderConfirm.clickOnConfirm();
        Assert.assertEquals(orderConfirm.setThankYouText(), "Thank you", "Cannot navigate to page");
        Assert.assertEquals(orderConfirm.setOrderSuccessFullText(), "Your order has been successfully processed!", "Cannot navigate to page");
        orderConfirm.clickOnContinueFinalButton();
        Assert.assertEquals(checkOutPage.setWelcomeToStoreText(), "Welcome to our store", "Cannot navigate to page");
        checkOutPage.clickOnLogoutLink();
        Assert.assertEquals(baseUrl, "https://demo.nopcommerce.com/", "Cannot navigate to page");

    }
}
