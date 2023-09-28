package Framework.Facade;
import Framework.pages.ProjectListPage;
import Framework.utils.AssertUtils;
import Framework.utils.EnvUtils;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
//import com.digy4.java.cucumber.Digy4CucumberSupport;

public class ProjectPageFacade extends ProjectListPage{

    WebDriver driver = getBaseTestDriver();
    String testUrl = EnvUtils.getUrlForEnvironment("STAGING");

    public ProjectPageFacade(){}

    ProjectListPage plp = new ProjectListPage();
    AssertUtils au = new AssertUtils();
    public void check(){
        driver.get(testUrl);
        String title = plp.plpTitleText();
        au.assertEqual(title,"Project List","Project List Page Section heading Incorrect.");
        //plp.clickPlpFilterDropDownButton();
        //au.assertTrue("Error:!!!");
    }

}
