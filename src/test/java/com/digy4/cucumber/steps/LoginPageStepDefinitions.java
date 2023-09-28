package com.digy4.cucumber.steps;

import Framework.Facade.LoginPageFacade;
import Framework.utils.EnvUtils;
import Framework.Facade.ProjectPageFacade;
import Framework.base.BaseTest;
import com.digy4.java.cucumber.Digy4CucumberSupport;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPageStepDefinitions {

    WebDriver webDriver = Digy4CucumberSupport.getWebDriver();

//    @Given("a user visit digy4 website")
//    public void visitDigy4Website() {
//        final WebDriver webDriver = Digy4CucumberSupport.getWebDriver();
//        webDriver.manage().window().maximize();
//        new BaseTest(webDriver);
////        webDriver.get("https://www.digy4.com");
//    }
//
//    @Then("it has the correct title")
//    public void verifyCorrectTitle() {
//        final WebDriver webDriver = Digy4CucumberSupport.getWebDriver();
//        Assert.assertEquals(webDriver.getTitle(), "Home - Digy4",
//                "Incorrect title encountered in the page.");
//
//    }

    @Given("The user lands on login page")
    public void visitLoginPage(){
        System.out.println(webDriver);
        webDriver.manage().window().maximize();
        new BaseTest(webDriver);
        webDriver.get(EnvUtils.getUrlForEnvironment("STAGING"));
//        Assert.assertEquals(webDriver.getTitle(), "https://dashboard-test.digy4.com/auth/login",
//                "Incorrect title encountered in the page.");
    }

    @And("enters credentials")
    public void enters_credentials() throws InterruptedException {
        LoginPageFacade lpfObj = new LoginPageFacade();
        lpfObj.check();
    }

//    @Then("should be able to log into dashboard.")
//    public void the_user_should_be_able_to_log_into_dashboard(){
//        throw new io.cucumber.java.PendingException();
//    }
}
