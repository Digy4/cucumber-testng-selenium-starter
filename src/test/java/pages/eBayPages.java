package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import static utils.CommonStepDefinitions.clickElement;
import static utils.CommonStepDefinitions.sendKeyElement;

public class eBayPages {
	static WebDriver driver;
	static By electronicselement=By.xpath("//li/a[contains(text(),'Electronics')]");
	static By fashionelement=By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a");
	static By collectibleandartselement=By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a");
	static By sportselement=By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[7]/a");
	static By healthandbeautyelement=By.xpath("//*[@id='mainContent']/div[1]/ul/li[8]/a");
	static By industrialquipmentelement=By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[9]/a");
	static By homeandgardenelement=By.xpath("//*[@id='mainContent']/div[1]/ul/li[10]/a");
	static By dealselement=By.xpath("//*[@id='mainContent']/div[1]/ul/li[11]/a");
	static By sellelement=By.xpath("//*[@id='mainContent']/div[1]/ul/li[12]/a");
	static By shopbycategoryelement=By.xpath("//button[@id='gh-shop-a']");
	static By shopbycategory1element=By.xpath("//button[@id='gh-shop-a']");
	static By searchelement=By.xpath("//input[@class='gh-tb ui-autocomplete-input']");
	static By searchiconelement=By.xpath("//input[@class='btn btn-prim gh-spr']");
	static By sortelement=By.xpath("//div[@class='srp-sort srp-sort--filter-evolution']//button[@class='fake-menu-button__button btn btn--secondary']");
	static By secondsortelement=By.xpath("//span[text()='Time: ending soonest']");
	static By sort1element=By.xpath("//div[@class='srp-sort srp-sort--filter-evolution']//button[@class='fake-menu-button__button btn btn--secondary']");
	static By thirdsortelement=By.xpath("//span[text()='Time: newly listed']");
	static By sort2element=By.xpath("//div[@class='srp-sort srp-sort--filter-evolution']//button[@class='fake-menu-button__button btn btn--secondary']");
	static By fourthsortelement=By.xpath("//span[text()='Price + Shipping: lowest first']");
	static By sort3element=By.xpath("//div[@class='srp-sort srp-sort--filter-evolution']//button[@class='fake-menu-button__button btn btn--secondary']");
	static By fifthsortelement=By.xpath("//span[text()='Price + Shipping: highest first']");
	static By sort4element=By.xpath("//div[@class='srp-sort srp-sort--filter-evolution']//button[@class='fake-menu-button__button btn btn--secondary']");
	static By sixthsortelement=By.xpath("//span[text()='Distance: nearest first']");
	//static By element=By.xpath("");
	//static By element=By.xpath("");
	//static By element=By.xpath("");
	//static By element=By.xpath("");
	//static By element=By.xpath("");
	
	
	public eBayPages(WebDriver driver) {
		eBayPages.driver = driver;
	}
	public static void setElectronics(WebDriver driver) throws InterruptedException {
		clickElement(driver, electronicselement, 3000);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long targetHeight = (Long) js.executeScript("return document.body.scrollHeight");
		for(int i = 0; i < targetHeight; i+=100) {
			Thread.sleep(100);
			js.executeScript("window.scrollTo(0, " + i + ")");
		}
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	public static void setFashion(WebDriver driver) throws InterruptedException {
		clickElement(driver, fashionelement, 3000);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long targetHeight = (Long) js.executeScript("return document.body.scrollHeight");
		for(int i = 0; i < targetHeight; i+=100) {
			Thread.sleep(100);
			js.executeScript("window.scrollTo(0, " + i + ")");
		}
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	public static void setCollectibleandArts(WebDriver driver) throws InterruptedException {
		clickElement(driver, collectibleandartselement, 3000);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long targetHeight = (Long) js.executeScript("return document.body.scrollHeight");
		for(int i = 0; i < targetHeight; i+=100) {
			Thread.sleep(100);
			js.executeScript("window.scrollTo(0, " + i + ")");
		}
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	public static void setSports(WebDriver driver) throws InterruptedException {
		clickElement(driver, sportselement,3000);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long targetHeight = (Long) js.executeScript("return document.body.scrollHeight");
		for(int i = 0; i < targetHeight; i+=100) {
			Thread.sleep(100);
			js.executeScript("window.scrollTo(0, " + i + ")");
		}
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	public static void setHealthandBeauty(WebDriver driver) throws InterruptedException {
		clickElement(driver, healthandbeautyelement, 3000);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long targetHeight = (Long) js.executeScript("return document.body.scrollHeight");
		for(int i = 0; i < targetHeight; i+=100) {
			Thread.sleep(100);
			js.executeScript("window.scrollTo(0, " + i + ")");
		}
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	public static void setIndustrialquipment(WebDriver driver) throws InterruptedException {
		clickElement(driver, industrialquipmentelement, 3000);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long targetHeight = (Long) js.executeScript("return document.body.scrollHeight");
		for(int i = 0; i < targetHeight; i+=100) {
			Thread.sleep(100);
			js.executeScript("window.scrollTo(0, " + i + ")");
		}
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	public static void setHomeandGarden(WebDriver driver) throws InterruptedException {
		clickElement(driver, homeandgardenelement, 3000);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long targetHeight = (Long) js.executeScript("return document.body.scrollHeight");
		for(int i = 0; i < targetHeight; i+=100) {
			Thread.sleep(100);
			js.executeScript("window.scrollTo(0, " + i + ")");
		}
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	public static void setDeals(WebDriver driver) throws InterruptedException {
		clickElement(driver, dealselement, 3000);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long targetHeight = (Long) js.executeScript("return document.body.scrollHeight");
		for(int i = 0; i < targetHeight; i+=100) {
			Thread.sleep(100);
			js.executeScript("window.scrollTo(0, " + i + ")");
		}
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	public static void setSell(WebDriver driver) throws InterruptedException {
		clickElement(driver, sellelement, 3000);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long targetHeight = (Long) js.executeScript("return document.body.scrollHeight");
		for(int i = 0; i < targetHeight; i+=100) {
			Thread.sleep(100);
			js.executeScript("window.scrollTo(0, " + i + ")");
		}
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	public static void setShopbycategory(WebDriver driver) throws InterruptedException {
		clickElement(driver, shopbycategoryelement, 3000);
		Thread.sleep(3000);
		clickElement(driver, shopbycategory1element, 3000);
		Thread.sleep(3000);
	}
	public static void setSearch(WebDriver driver) throws InterruptedException {
		sendKeyElement(driver, searchelement,"laptop", 3000);
		Thread.sleep(3000);
	}
	public static void setSearchicon(WebDriver driver) throws InterruptedException {
		clickElement(driver, searchiconelement, 3000);
		Thread.sleep(3000);
	}
	public static void setSort(WebDriver driver) throws InterruptedException {
		clickElement(driver, sortelement, 3000);
		Thread.sleep(3000);
		clickElement(driver, secondsortelement, 3000);
		Thread.sleep(3000);
		clickElement(driver, sort1element, 3000);
		Thread.sleep(3000);
		clickElement(driver, thirdsortelement, 3000);
		Thread.sleep(3000);
		clickElement(driver, sort2element, 3000);
		Thread.sleep(3000);
		clickElement(driver, fourthsortelement, 3000);
		Thread.sleep(3000);
		clickElement(driver, sort3element, 3000);
		Thread.sleep(3000);
		clickElement(driver, fifthsortelement, 3000);
		Thread.sleep(3000);
		clickElement(driver, sort4element, 3000);
		Thread.sleep(3000);
		clickElement(driver, sixthsortelement, 3000);
		Thread.sleep(3000);
	}
	
}
