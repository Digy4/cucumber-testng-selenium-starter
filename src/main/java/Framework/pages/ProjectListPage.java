package Framework.pages;
import Framework.utils.LocatorUtils;
import com.sun.tools.javac.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Framework.utils.ActionUtils;
public class ProjectListPage extends LocatorUtils {

    String browser;
    public ProjectListPage(String browser) {
        super(browser);
        this.browser = browser;
    }
    private LocatorUtils lu = new LocatorUtils(browser);
    private ActionUtils au = new ActionUtils();

    List<WebElement> plpListElements = (List<WebElement>) lu.findAllByClassName("css-tdnrhj");
    WebElement plpSearchBar = lu.findByClassName("chakra-input__group css-4302v8");
    WebElement plpSearchButton = lu.findByClassName("chakra-input__right-element css-wss53h");
    WebElement plpFilterDropDownButton = lu.findByClassName("chakra-icon css-1bfokib");
    WebElement plpFilterStatus = lu.findByCssSelector("[data-testid=\"status-filter\"]");
    WebElement plpAddProjectButton = lu.findByClassName("chakra-button css-1q9po21");
    WebElement plpSectionTitle = lu.findByClassName("chakra-text css-nohbb");

    public void clickPlpFilterDropDownButton(){
        au.clickElement(plpFilterDropDownButton);
    }

    public String plpTitleText(){
        return au.getElementText(plpSectionTitle);
    }


    public void enterPlpSearchBar(){
        au.enterText(plpSearchBar,"lol");
        A
    }

}
