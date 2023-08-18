package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends BasePage{
    @FindBy(xpath = "//img[@class='user-avatar rounded-circle']")
    WebElement iconBtn;
    @FindBy(xpath = "//a[@class='nav-link'][3]")
    WebElement logOutBtn;
    public void verifyUserOnHomePage(){
        Assert.assertEquals(driver.getCurrentUrl(),"http://18.118.14.155:8080/bank/home");

    }
    public  void clickToUserIconAndLogOut(){
        iconBtn.click();
        logOutBtn.click();
    }

}
