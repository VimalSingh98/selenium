package ConfigData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Config {

    public WebDriver driver;
    public static WebDriver openBrowser(WebDriver driver, String browser, String URL)
    {
        if(browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","/Users/vimalsingh/Documents/Software/chromedriver-mac-arm64/chromedriver");
            driver = new ChromeDriver();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        }

        else if(browser.equalsIgnoreCase("safari"))
        {
            System.setProperty("webdriver.safari.driver","user/java/bin");
            driver = new ChromeDriver();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        }
        else
        {
            System.out.println("Driver not able to found");
        }

        driver.get(URL);
        driver.manage().window().maximize();

        return driver;
    }

    public static void closeBrowser(WebDriver driver)
    {
        driver.quit();
    }
}

