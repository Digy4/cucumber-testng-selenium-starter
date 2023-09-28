package Framework.pages;

import Framework.utils.LocatorUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends LocatorUtils {

    WebDriver driver = getBaseTestDriver();

    public HomePage() {
        super();
        PageFactory.initElements(driver, this);
    }




}
