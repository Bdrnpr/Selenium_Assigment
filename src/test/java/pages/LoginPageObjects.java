package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginPageObjects extends BasePageObjects{

    public LoginPageObjects(WebDriver driver){
        this.driver = driver;
    }

    By userName = By.id("user-name");
    By password = By.id("password");
    By signin_button = By.id("login-button");
    By ErrorActaulName = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");
    String errorName;

    public void setTextUserName(String text){
        driver.findElement(userName).sendKeys(text);
    }
    public void setTextPassword(String text){
        driver.findElement(password).sendKeys(text);
    }
    public void ClickLoginButton(){
        driver.findElement(signin_button).click();
    }
    public String GetActualErrorMessage(){
        errorName = driver.findElement(ErrorActaulName).getText();
        return errorName;
    }
}
