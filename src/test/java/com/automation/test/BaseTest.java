package com.automation.test;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest  {
    LoginPage loginPage;
    HomePage homePage;
    @BeforeMethod
    public void setUp(){
        ConfigReader.initProperties();
        DriverUtils.createDriver();
        loginPage = new LoginPage();
        homePage=new HomePage();
    }
    @AfterMethod
    public  void cleanUp(){
        DriverUtils.getDriver().quit();
    }

}
