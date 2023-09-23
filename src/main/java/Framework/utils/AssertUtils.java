package Framework.utils;
import org.testng.Assert;

public class AssertUtils {

    // Assert that two strings are equal
    public void assertEqual(String actual, String expected, String message) {
        Assert.assertEquals(actual, expected, message);
    }

    // Assert that two strings are not equal
    public void assertNotEqual(String actual, String expected, String message) {
        Assert.assertNotEquals(actual, expected, message);
    }

    // Assert that a condition is true
    public void assertTrue(boolean condition, String message) {
        Assert.assertTrue(condition, message);
    }

    // Assert that a condition is false
    public void assertFalse(boolean condition, String message) {
        Assert.assertFalse(condition, message);
    }

    // Assert that an element is displayed
    public void assertElementDisplayed(boolean isDisplayed, String message) {
        assertTrue(isDisplayed, message);
    }

    // Assert that an element is not displayed
    public void assertElementNotDisplayed(boolean isDisplayed, String message) {
        assertFalse(isDisplayed, message);
    }

    // Assert that a page title matches the expected title
    public void assertPageTitle(String actualTitle, String expectedTitle, String message) {
        assertEqual(actualTitle, expectedTitle, message);
    }
}
