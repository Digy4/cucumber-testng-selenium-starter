package logic;
import org.openqa.selenium.WebDriver;
import com.digy4.java.cucumber.Digy4CucumberSupport;
import io.cucumber.java.en.Given;
import pages.AddtocontactPage;
import utils.ConfigFileReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
public class AddtocontactStepDefinition {
	WebDriver driver;
	 ConfigFileReader CFRF = new ConfigFileReader();
	@Given("user logins")
	public void user_logins() throws InterruptedException {
		driver=Digy4CucumberSupport.getWebDriver();
		driver.manage().window().maximize();
	    driver.get(CFRF.getnewurl());
	    AddtocontactPage.getemail(driver).sendKeys(CFRF.getemail());
	    AddtocontactPage.getpassword1(driver).sendKeys(CFRF.getpassword1());
	    AddtocontactPage.setSignin(driver);
	}
	@And("user clicks on incident management")
	public void user_clicks_on_incident_management() throws InterruptedException {
		 AddtocontactPage.getincidentmanagement(driver);
	}
	@And("user navigates to emergency contact page")
	public void user_navigates_to_emergency_contact_page() throws InterruptedException {
		 AddtocontactPage.getemergencycontact(driver);
	}
	@And("user adds contacts")
	public void user_adds_contacts() throws InterruptedException {
		AddtocontactPage.setaddcontact(driver);
	    AddtocontactPage.getperson(driver).sendKeys(CFRF.getperson());
	    AddtocontactPage.getrole(driver).sendKeys(CFRF.getrole());
	    AddtocontactPage.gettelephone(driver).sendKeys(CFRF.gettelephone());
	    AddtocontactPage.getemail1(driver).sendKeys(CFRF.getemail1());
	    AddtocontactPage.getaddress(driver).sendKeys(CFRF.getaddress());
	}
	@Then("added contact should be saved")
	public void added_contact_should_be_saved() throws InterruptedException {
		 AddtocontactPage.setaddcontact1(driver);
	}
}


