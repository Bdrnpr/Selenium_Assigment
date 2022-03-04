package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckoutPageObejcts;

public class CheckoutTests extends CartTests{

    @Test
    public void CheckOutTests() throws InterruptedException {
        addCartTest();
        CheckoutPageObejcts checkoutPageObejcts = new CheckoutPageObejcts(driver);
        checkoutPageObejcts.setCheckOutButton();
        checkoutPageObejcts.setFirstNameTextBox("bedran");
        checkoutPageObejcts.setLastNameTextBox("piro");
        checkoutPageObejcts.setZipOrPostalCode("123");
        checkoutPageObejcts.setContinueButton();
        checkoutPageObejcts.setFinishButton();
        Assert.assertEquals(checkoutPageObejcts.SuccessfulMessage(),"THANK YOU FOR YOUR ORDER");
    }

}
