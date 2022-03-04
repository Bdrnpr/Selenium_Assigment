package tests;

import org.testng.annotations.Test;
import pages.CartPageObject;
public class CartTests extends LoginTests{
    @Test
    public void addCartTest() throws InterruptedException {
        LoginTest();
        CartPageObject cartPageObject = new CartPageObject(driver);
        cartPageObject.addBackpack();
        cartPageObject.addFleeceJacket();
        Thread.sleep(2000);
        cartPageObject.shoppingCartContainer();
        Thread.sleep(2000);
    }
    @Test
    public void removeCartTest() throws InterruptedException {
        CartPageObject cartPageObject = new CartPageObject(driver);
        Thread.sleep(3000);
        cartPageObject.removeBackpack();
    }
    @Test
    public void ContinueShopping() throws InterruptedException {
        addCartTest();
        CartPageObject cartPageObject = new CartPageObject(driver);
        cartPageObject.setContinue_shopping();
    }

}
