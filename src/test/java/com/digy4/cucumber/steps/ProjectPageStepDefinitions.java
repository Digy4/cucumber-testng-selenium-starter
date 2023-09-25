package com.digy4.cucumber.steps;

import Framework.Facade.ProjectPageFacade;
import com.digy4.java.cucumber.Digy4CucumberSupport;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProjectPageStepDefinitions {
//    @Given("a user visit digy4 website")
//    public void visitDigy4Website() {
//        final WebDriver webDriver = Digy4CucumberSupport.getWebDriver();
//        webDriver.manage().window().maximize();
//        webDriver.get("https://www.digy4.com");
//    }
//
//    @Then("it has the correct title")
//    public void verifyCorrectTitle() {
//        final WebDriver webDriver = Digy4CucumberSupport.getWebDriver();
//        Assert.assertEquals(webDriver.getTitle(), "Home - Digy4",
//                "Incorrect title encountered in the page.");
//    }

    @Given("the user visit project list page")
    public void visitProjectListPage(){
        final WebDriver webDriver = Digy4CucumberSupport.getWebDriver();
        Assert.assertEquals(webDriver.getTitle(), "Home - Digy4",
                "Incorrect title encountered in the page.");
        ProjectPageFacade ppfObj = new ProjectPageFacade(webDriver);
        ppfObj.check();

    }

}
