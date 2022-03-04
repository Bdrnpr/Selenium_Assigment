package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPageObejcts extends BasePageObjects {

    public CheckoutPageObejcts(WebDriver driver){
        this.driver = driver;
    }
    By checkOutButton = By.id("checkout");
    By firstNameTextBox = By.id("first-name");
    By lastNameTextBox = By.id("last-name");
    By zipOrPostalCode = By.id("postal-code");
    By continueButton = By.id("continue");
    By finishButton = By.id("finish");
    By ifSuccessShowThisMessage = By.xpath("//*[@id=\"checkout_complete_container\"]/h2");
    String successfulMessage;


    public void setCheckOutButton(){
        driver.findElement(checkOutButton).click();
    }
    public void setFirstNameTextBox(String text){
        driver.findElement(firstNameTextBox).sendKeys(text);
    }
    public void setLastNameTextBox(String text){
        driver.findElement(lastNameTextBox).sendKeys(text);
    }
    public void setZipOrPostalCode(String text){
        driver.findElement(zipOrPostalCode).sendKeys(text);
    }
    public void setContinueButton(){
        driver.findElement(continueButton).click();
    }
    public void setFinishButton(){
        driver.findElement(finishButton).click();
    }
    public String SuccessfulMessage(){
        successfulMessage = driver.findElement(ifSuccessShowThisMessage).getText();
        return successfulMessage;
    }

}
