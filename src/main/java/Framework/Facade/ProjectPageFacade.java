package Framework.Facade;
import Framework.pages.ProjectListPage;
import Framework.utils.AssertUtils;
import org.openqa.selenium.WebDriver;

public class ProjectPageFacade {

    ProjectListPage plp = new ProjectListPage();
    AssertUtils au = new AssertUtils();
    public void check(WebDriver driver){
        plp.clickPlpFilterDropDownButton();
//        au.assertTrue("Error:!!!");
    }

}
