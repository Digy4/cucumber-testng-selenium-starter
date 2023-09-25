package Framework.utils;
import Framework.base.DriverManager;
import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import java.util.List;

public class LocatorUtils extends DriverManager{

    WebDriver driver;
//    DriverManager driverManager = new DriverManager();

    public LocatorUtils(WebDriver browser) {
        this.driver =  browser;
    }

    public WebElement findById(String id) {
        return driver.findElement(By.id(id));
    }

    public WebElement findByName(String name) {
        return driver.findElement(By.name(name));
    }

    public WebElement findByXPath(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement findByCssSelector(String cssSelector) {
        return driver.findElement(By.cssSelector(cssSelector));
    }

    public WebElement findByLinkText(String linkText) {
        return driver.findElement(By.linkText(linkText));
    }

    public WebElement findByPartialLinkText(String partialLinkText) {
        return driver.findElement(By.partialLinkText(partialLinkText));
    }

    public WebElement findByClassName(String className) {
        return driver.findElement(By.className(className));
    }

    public List<WebElement> findAllById(String id) {
        return driver.findElements(By.id(id));
    }

    public List<WebElement> findAllByName(String name) {
        return driver.findElements(By.name(name));
    }

    public List<WebElement> findAllByXPath(String xpath) {
        return driver.findElements(By.xpath(xpath));
    }

    public List<WebElement> findAllByCssSelector(String cssSelector) {
        return driver.findElements(By.cssSelector(cssSelector));
    }

    public List<WebElement> findAllByLinkText(String linkText) {
        return driver.findElements(By.linkText(linkText));
    }

    public List<WebElement> findAllByPartialLinkText(String partialLinkText) {
        return driver.findElements(By.partialLinkText(partialLinkText));
    }

    public List<WebElement> findAllByClassName(String className) {
        return driver.findElements(By.className(className));
    }
}
