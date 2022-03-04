package tests;

import org.testng.annotations.Test;
import pages.CartPageObject;
public class CartTests extends LoginTests{

    @Test
    public void addCartTest(){
        LoginTest();
        CartPageObject cartPageObject = new CartPageObject(driver);
        cartPageObject.addBackpack();
        cartPageObject.addFleeceJacket();
        cartPageObject.shoppingCartContainer();
    }
    @Test
    public void removeCartTest(){
        CartPageObject cartPageObject = new CartPageObject(driver);
        cartPageObject.removeBackpack();
    }

   /* @Test
    public void ContinueShopping() throws InterruptedException {
        addCartTest();
        CartPageObject cartPageObject = new CartPageObject(driver);
        cartPageObject.setContinue_shopping();
    }*/

}
