package ConfigData;

import dataProvider.configReader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class BaseClass {

    public WebDriver driver;
    configReader config;

    @BeforeSuite
    public void readData() throws IOException {
        config = new configReader();
    }

    @BeforeClass

    public void intiateBrowser() {
        driver = Config.openBrowser(driver, config.getBrowser(), config.getURL());
    }


    @AfterClass

    public void quitBrowser() {
        Config.closeBrowser(driver);
    }

    //@AfterMethod
    // will write take screen-shoot related code

}
