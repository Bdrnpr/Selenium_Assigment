package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPageObjects;

public class LoginTests extends BaseTests{
    //
    //Positive Test
    //
    @Test
    public void LoginTest(){
        setUpTest();
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
        loginPageObjects.setTextUserName("standard_user");
        loginPageObjects.setTextPassword("secret_sauce");
        loginPageObjects.ClickLoginButton();
    }

    //
    //Negative Test
    //
    @Test
    public void LoginTestNegative(){
        setUpTest();
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
        loginPageObjects.setTextUserName("standard_user");
        loginPageObjects.setTextPassword("WrongPassword");
        loginPageObjects.ClickLoginButton();
        Assert.assertEquals(loginPageObjects.GetActualErrorMessage(),"Epic sadface: Username and password do not match any user in this service");
    }
}
