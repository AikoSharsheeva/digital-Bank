package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage {
    @FindBy(id = "username")
    WebElement usernameInput;
    @FindBy(id = "password")
    WebElement passwordInput;
    @FindBy(id = "submit")
    WebElement submitBtn;
    @FindBy(xpath = "//div[@class='sufee-alert alert with-close alert-danger alert-dismissible fade show']")
    WebElement errorMessage;

    public void doLogin(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        submitBtn.click();

    }
    public  void  invalidLogin(){
        Assert.assertTrue(errorMessage.isDisplayed());
    }
    public void userOnLoginPage(){
        Assert.assertEquals(driver.getCurrentUrl(),"http://18.118.14.155:8080/bank/login?logout");
    }

}
