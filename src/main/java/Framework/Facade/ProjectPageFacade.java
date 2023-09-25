package Framework.Facade;
import Framework.pages.ProjectListPage;
import Framework.utils.AssertUtils;
import org.openqa.selenium.WebDriver;

public class ProjectPageFacade {

    WebDriver driver;

    public ProjectPageFacade(WebDriver driver){
        this.driver = driver;
    }

    ProjectListPage plp = new ProjectListPage(driver);
    AssertUtils au = new AssertUtils();
    public void check(){
        String title = plp.plpTitleText();
        au.assertEqual(title,"Project List","Project List Page Section heading Incorrect.");

        //plp.clickPlpFilterDropDownButton();
        //au.assertTrue("Error:!!!");
    }

}
