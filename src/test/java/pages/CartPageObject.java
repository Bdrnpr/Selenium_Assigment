package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPageObject extends BasePageObjects{
    public CartPageObject(WebDriver driver){
        this.driver = driver;
    }

    By addToCartSaucelabBackpack = By.id("add-to-cart-sauce-labs-backpack");
    By addToCartSaucelabsFleeceJacket = By.id("add-to-cart-sauce-labs-fleece-jacket");
    By shopping_cart_container = By.id("shopping_cart_container");
    By remove_backpack = By.id("remove-sauce-labs-backpack");
    By continue_shopping = By.id("continue-shopping");
    public void addBackpack(){
        driver.findElement(addToCartSaucelabBackpack).click();
    }
    public void addFleeceJacket(){
        driver.findElement(addToCartSaucelabsFleeceJacket).click();
    }
    public void shoppingCartContainer(){
        driver.findElement(shopping_cart_container).click();
    }
    public void removeBackpack(){
        driver.findElement(remove_backpack).click();
    }
    public void setContinue_shopping(){
        driver.findElement(continue_shopping).click();
    }

}
