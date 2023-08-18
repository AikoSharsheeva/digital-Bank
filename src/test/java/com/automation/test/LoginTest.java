package com.automation.test;

import com.automation.utils.ConfigReader;
import org.checkerframework.checker.units.qual.C;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    @Test
    public  void verifyUserCanLogin (){
        loginPage.doLogin(ConfigReader.getProperty("login.username"), ConfigReader.getProperty("login.password"));
        homePage.verifyUserOnHomePage();
    }
    @Test
    public  void verifyUserCantLogin (){
        loginPage.doLogin("aiko", "123");
        loginPage.invalidLogin();
    }
    @Test
    public void verifyUserCanLogout(){
        loginPage.doLogin(ConfigReader.getProperty("login.username"), ConfigReader.getProperty("login.password"));
        homePage.verifyUserOnHomePage();
        homePage.clickToUserIconAndLogOut();
        loginPage.userOnLoginPage();
    }

}
