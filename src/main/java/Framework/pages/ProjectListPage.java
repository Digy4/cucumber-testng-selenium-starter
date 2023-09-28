package Framework.pages;
import Framework.utils.LocatorUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Framework.utils.ActionUtils;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

public class ProjectListPage extends LocatorUtils {

    WebDriver driver = getBaseTestDriver();

    public ProjectListPage() {
        super();
        PageFactory.initElements(driver, this);
    }

    LocatorUtils lu = new LocatorUtils();
    ActionUtils au = new ActionUtils();

//    List<WebElement> plpListElements = lu.findAllByXPath("//p[@class='alert alert-success']");
//    WebElement plpSearchBarInput = lu.findByClassName("chakra-input css-1wzwj5m");
//    WebElement plpSearchButton = lu.findByClassName("chakra-input__right-element css-wss53h");
////    WebElement plpFilterDropDownButton = lu.findByClassName("chakra-icon css-1bfokib");
//    WebElement plpFilterStatus = lu.findByCssSelector("[data-testid=\"status-filter\"]");
//    WebElement plpAddProjectButton = lu.findByClassName("chakra-button css-1q9po21");
    WebElement plpSectionTitle = lu.findByClassName("//*[@id=\"__next\"]/div/div[3]/div/div/div/div/div[1]/div[1]/p");

//    public void clickPlpFilterDropDownButton() {
//        au.clickElement(plpFilterDropDownButton);
//    }

    public String plpTitleText() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        return au.getElementText(plpSectionTitle);
    }
//
//    public void enterPlpSearchBar() {
//        au.enterText(plpSearchBarInput, "lol");
//    }
}
