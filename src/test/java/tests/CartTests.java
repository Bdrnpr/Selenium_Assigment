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
        cartPageObject.shoppingCartContainer();
        Thread.sleep(4500);
    }
    @Test
    public void removeCartTest() throws InterruptedException {
        addCartTest();
        CartPageObject cartPageObject = new CartPageObject(driver);
        cartPageObject.removeBackpack();
        Thread.sleep(3000);
    }
    @Test
    public void ContinueShopping() throws InterruptedException {
        addCartTest();
        CartPageObject cartPageObject = new CartPageObject(driver);
        cartPageObject.setContinue_shopping();
        Thread.sleep(3000);
    }

}
