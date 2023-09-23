package Framework.utils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class ActionUtils {
    private WebDriver driver;
    private Actions actions;

    public ActionUtils(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
    }

    // Click an element
    public void clickElement(By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }

    // Double-click an element
    public void doubleClickElement(By locator) {
        WebElement element = driver.findElement(locator);
        actions.doubleClick(element).perform();
    }

    // Right-click (context click) an element
    public void rightClickElement(By locator) {
        WebElement element = driver.findElement(locator);
        actions.contextClick(element).perform();
    }

    // Hover over an element
    public void hoverOverElement(By locator) {
        WebElement element = driver.findElement(locator);
        actions.moveToElement(element).perform();
    }

    // Drag and drop an element to another element
    public void dragAndDrop(By sourceLocator, By targetLocator) {
        WebElement source = driver.findElement(sourceLocator);
        WebElement target = driver.findElement(targetLocator);
        actions.dragAndDrop(source, target).perform();
    }

    // Scroll to an element
    public void scrollToElement(By locator) {
        WebElement element = driver.findElement(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    // Scroll to the bottom of the page
    public void scrollToBottom() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    // Scroll to the top of the page
    public void scrollToTop() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
    }
}
