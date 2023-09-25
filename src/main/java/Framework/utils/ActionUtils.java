package Framework.utils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionUtils {
    private WebDriver driver;
    private Actions actions;

    public ActionUtils(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
    }

    // Click an element
    public void clickElement(WebElement locator) {
        locator.click();
    }

    // Double-click an element
    public void doubleClickElement(WebElement locator) {
        actions.doubleClick(locator).perform();
    }

    // Right-click (context click) an element
    public void rightClickElement(WebElement locator) {
        actions.contextClick(locator).perform();
    }

    // Hover over an element
    public void hoverOverElement(WebElement locator) {
        actions.moveToElement(locator).perform();
    }

    // Drag and drop an element to another element
    public void dragAndDrop(WebElement sourceLocator, WebElement targetLocator) {
        actions.dragAndDrop(sourceLocator, targetLocator).perform();
    }

    // Scroll to an element
    public void scrollToElement(WebElement locator) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", locator);
    }

    // Scroll to the bottom of the page
    public void scrollToBottom() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    // Scroll to the top of the page
    public void scrollToTop() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
    }

    // Method to enter text into a text input field
    public void enterText(WebElement element, String text) {
        //WebElement element = driver.findElement(locator);
        actions.sendKeys(element, text);
    }

    // Select an option from a dropdown WebElement visible text
    public void selectDropdownOptionWebElementText(WebElement locator, String optionText) {
        Select select = new Select(locator);
        select.selectByVisibleText(optionText);
    }

    // Select an option from a dropdown WebElement index
    public void selectDropdownOptionWebElementIndex(WebElement locator, int index) {
        Select select = new Select(locator);
        select.selectByIndex(index);
    }

    // Select an option from a dropdown WebElement value
    public void selectDropdownOptionWebElementValue(WebElement locator, String value) {
        Select select = new Select(locator);
        select.selectByValue(value);
    }

    // Check if an element is displayed
    public boolean isElementDisplayed(WebElement locator) {
        return locator.isDisplayed();
    }

    // Check if an element is enabled
    public boolean isElementEnabled(WebElement locator) {
        return locator.isEnabled();
    }

    // Get the text of an element
    public String getElementText(WebElement locator) {
        return locator.getText();
    }

    // Get the attribute value of an element
    public String getAttributeValue(WebElement locator, String attributeName) {
        return locator.getAttribute(attributeName);
    }
}
