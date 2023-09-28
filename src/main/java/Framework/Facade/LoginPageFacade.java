package Framework.Facade;

import Framework.base.BaseTest;
import Framework.pages.LoginPage;
import Framework.pages.ProjectListPage;
import Framework.utils.AssertUtils;
import Framework.utils.EnvUtils;
import org.openqa.selenium.WebDriver;

public class LoginPageFacade extends BaseTest {

    WebDriver driver = getBaseTestDriver();
    String testUrl = EnvUtils.getUrlForEnvironment("STAGING");

    public LoginPageFacade() throws InterruptedException {
    }

    LoginPage lp = new LoginPage();
    AssertUtils au = new AssertUtils();

    public void check() throws InterruptedException {
        System.out.println(testUrl);
        au.assertEqual(driver.getTitle(), "dashboard-test.digy4.com/auth/login",
                "Incorrect title encountered in the page.");
        String heading = lp.lpHeading();
        au.assertEqual(heading,"Login","Login Title wrong.");

        lp.enterUserName();
        lp.enterPassword();
        lp.selectStaySignedIn();
        lp.clickLogin();

    }


}
