package Framework.pages;

import Framework.utils.ActionUtils;
import Framework.utils.EnvUtils;
import Framework.utils.LocatorUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LoginPage extends LocatorUtils {

    WebDriver driver = getBaseTestDriver();
    public LoginPage() {

        PageFactory.initElements(driver, this);
    }

    LocatorUtils lu = new LocatorUtils();
    ActionUtils au = new ActionUtils();


    WebElement loginPageHeading = lu.findByXPath("//div[starts-with(@id, '__next')] and contains(@class, 'css-edj3ps')");
    WebElement userNameInput = lu.findById("userName");
    WebElement passwordInput = lu.findByName("password");
    WebElement staySignedIn = lu.findById("staySignIn");
    WebElement loginButton = lu.findElementByTagName("Button");

    public String lpHeading() throws InterruptedException {
        driver.manage().timeouts().wait(5000);
        System.out.println(au.getElementText(loginPageHeading));
        return au.getElementText(loginPageHeading);
    }

    public void enterUserName() {
        au.enterText(userNameInput, EnvUtils.getUsernameForRole("ADMIN"));
    }

    public void enterPassword() {
        au.enterText(passwordInput, EnvUtils.getPasswordForRole("ADMIN"));
    }

    public void selectStaySignedIn(){
        au.clickElement(staySignedIn);
    }
    public void clickLogin(){
        au.clickElement(loginButton);
    }
}
