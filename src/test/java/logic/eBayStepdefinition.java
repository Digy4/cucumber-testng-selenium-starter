package logic;
import org.openqa.selenium.WebDriver;
import com.digy4.java.cucumber.Digy4CucumberSupport;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.eBayPages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
public class eBayStepdefinition {
	WebDriver driver;
	String url="https://www.ebay.com/";
	@Given("user selects electronics and navigates to electronics page")
	public void user_selects_electronics_and_navigates_to_electronics_page() throws InterruptedException {
		driver=Digy4CucumberSupport.getWebDriver();
		driver.get(url);
	    eBayPages.setElectronics(driver);
	}
	@And("user selects fashion and navigates to fashion page")
	public void user_selects_fashion_and_navigates_to_fashion_page() throws InterruptedException {
	   eBayPages.setFashion(driver);
	}
	@And("user selects collectible and art and navigates to collectible and ar page")
	public void user_selects_collectible_and_art_and_navigates_to_collectible_and_ar_page() throws InterruptedException {
	    eBayPages.setCollectibleandArts(driver);
	}
	@And("user selects sports and navigates to sports page")
	public void user_selects_sports_and_navigates_to_sports_page() throws InterruptedException {
	    eBayPages.setSports(driver);
	}
	@And("user selects health and beauty and navigates to health and beauty page")
	public void user_selects_health_and_beauty_and_navigates_to_health_and_beauty_page() throws InterruptedException {
		eBayPages.setHealthandBeauty(driver);
	}
	@And("user selects Industrial equipment and navigates to Industrial equipment")
	public void user_selects_industrial_equipment_and_navigates_to_industrial_equipment() throws InterruptedException {
	    eBayPages.setIndustrialquipment(driver);
	}
	@And("user selects Home and Garden and navigates to Home and Garden")
	public void user_selects_home_and_garden_and_navigates_to_home_and_garden() throws InterruptedException {
	    eBayPages.setHomeandGarden(driver);
	}
	@And("user selects deal and navigates to deal page")
	public void user_selects_deal_and_navigates_to_deal_page() throws InterruptedException {
	    eBayPages.setDeals(driver);
	}
	@And("user selects sell and navigates to sell page")
	public void user_selects_sell_and_navigates_to_sell_page() throws InterruptedException {
	     eBayPages.setSell(driver);
	}
	@And("user selects shop by category and navigates to shop by category page")
	public void user_selects_shop_by_category_and_navigates_to_shop_by_category_page() throws InterruptedException {
	    eBayPages.setShopbycategory(driver);
	}
	@When("user searches for Laptop")
	public void user_searches_for_laptop() throws InterruptedException {
	   eBayPages.setSearch(driver);
	}
	@When("clicks on the search icon")
	public void clicks_on_the_search_icon() throws InterruptedException {
	    eBayPages.setSearchicon(driver);
	}
	@Then("search result appears and user applies sort")
	public void search_result_appears_and_user_applies_sort() throws InterruptedException {
	   eBayPages.setSort(driver);
	}

}
