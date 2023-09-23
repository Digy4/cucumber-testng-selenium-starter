package Framework.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class BaseTest {
//    protected WebDriver driver;
//
//    @BeforeMethod
//    @Parameters("browser") // Parameterized for browser selection from testng.xml
//    public void beforeMethod(String browser) {
//        // Initialize WebDriver based on the provided browser parameter
//        driver = DriverManager.getDriver(browser);
//
//        // Set implicit wait for element presence
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        // Maximize the browser window (optional)
//        driver.manage().window().maximize();
//
//        // You can add more setup steps here, such as navigating to a base URL.
//    }
//
//    @AfterMethod
//    public void afterMethod() {
//        // Quit the WebDriver instance after each test method
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}
