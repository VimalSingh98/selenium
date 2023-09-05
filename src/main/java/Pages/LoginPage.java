package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class LoginPage {

  public  WebDriver driver;

    public LoginPage(WebDriver ldriver)
    {
        this.driver=ldriver;
    }

    @FindBy(xpath = "//*[@id=\"html-body\"]/div[2]/header/div/div/div[2]/ul/li[5]/a")
    WebElement buyAMC;

    @FindBy(xpath = "//input[@id='mobile']")
    WebElement phoneNumber;

    @FindBy(xpath = "//button[@id='step-one-submit']")
    WebElement submitButton;

    @FindBy(xpath = "//input[@id='otp']")
    WebElement otpField;

    @FindBy(xpath = "//span[text()='Verify']")
    WebElement submitOTP;


    public void buyAMCEureka() throws InterruptedException {
        buyAMC.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        phoneNumber.sendKeys("6360891555");
        submitButton.click();
        Thread.sleep(6000);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        otpField.sendKeys("123456");
        Thread.sleep(5000);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        submitOTP.click();
    }
}
