package com.Eureka.Test;

import ConfigData.BaseClass;
import ConfigData.Config;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.sonatype.plexus.components.sec.dispatcher.model.ConfigProperty;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseClass
{

    @Test

    public void testLogin() throws InterruptedException {
        LoginPage buyAMC= PageFactory.initElements(driver, LoginPage.class);
        buyAMC.buyAMCEureka();
    }
}
