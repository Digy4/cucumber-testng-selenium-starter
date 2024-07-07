package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class AddtocontactPage {
	static WebDriver driver;
	static By emailelement=By.xpath("//input[@placeholder='Email Address']");
	static By passwordelement=By.xpath("//input[@placeholder='Password']");
	static By signinelement=By.xpath("//div[@class='float-right']//button[@type='submit']");
	static By incidentmanagementelement=By.xpath("//p[normalize-space()='Incident Management']");
	static By emergencycontactelement=By.xpath("//a[normalize-space()='Emergency Contacts']");
	static By addcontactelement=By.xpath("//button[@name='addEmContact']");
	static By personelement=By.xpath("//*[@id='addEmContactModal']/div/div/form/div[1]/div[1]/div[1]/div/input");
	static By roleelement=By.xpath("//*[@id='addEmContactModal']/div/div/form/div[1]/div[1]/div[2]/div/input");
	static By telephoneelement=By.xpath("//*[@id='addEmContactModal']/div/div/form/div[1]/div[2]/div[1]/div/input");
	static By email1element=By.xpath("//*[@id='addEmContactModal']/div/div/form/div[1]/div[2]/div[2]/div/input");
	static By addresselement=By.xpath("//*[@id='addEmContactModal']/div/div/form/div[1]/div[3]/div/div/input");
	static By addcontact1element=By.xpath("//*[@id='addEmContactModal']/div/div/form/div[2]/button[1]");
	//static By element=By.xpath("");
	
	public AddtocontactPage(WebDriver driver) {
		AddtocontactPage.driver = driver;
	}
	public static WebElement getemail(WebDriver driver) throws InterruptedException {
		Thread.sleep(4000);
		WebElement email=driver.findElement(emailelement);
		return email;
	}
	public static WebElement getpassword1(WebDriver driver) throws InterruptedException {
		Thread.sleep(4000);
		WebElement password=driver.findElement(passwordelement);
		return password;
	}
	public static void setSignin(WebDriver driver) throws InterruptedException {
		Thread.sleep(4000);
	    WebElement signin=driver.findElement(signinelement);
		signin.click();
		Thread.sleep(4000);
	}
	
	public static void getincidentmanagement(WebDriver driver) throws InterruptedException {
		Thread.sleep(4000);
		WebElement incidentmanagement=driver.findElement(incidentmanagementelement);
		incidentmanagement.click();
		Thread.sleep(4000);
	}
	public static void getemergencycontact(WebDriver driver) throws InterruptedException {
		Thread.sleep(4000);
		WebElement emergencycontact=driver.findElement(emergencycontactelement);
		emergencycontact.click();
		Thread.sleep(4000);
	}
	public static void setaddcontact(WebDriver driver) throws InterruptedException {
		Thread.sleep(4000);
	    WebElement addcontact=driver.findElement(addcontactelement);
	    addcontact.click();
		Thread.sleep(4000);
	}
	public static WebElement getperson(WebDriver driver) throws InterruptedException {
		Thread.sleep(4000);
		WebElement person=driver.findElement(personelement);
		return person;
	}
	public static WebElement getrole(WebDriver driver) throws InterruptedException {
		Thread.sleep(4000);
		WebElement role=driver.findElement(roleelement);
		return role;
	}
	public static WebElement gettelephone(WebDriver driver) throws InterruptedException {
		Thread.sleep(4000);
		WebElement telephone=driver.findElement(telephoneelement);
		return telephone;
	}
	public static WebElement getemail1(WebDriver driver) throws InterruptedException {
		Thread.sleep(4000);
		WebElement email1=driver.findElement(email1element);
		return email1;
	}
	public static WebElement getaddress(WebDriver driver) throws InterruptedException {
		Thread.sleep(4000);
		WebElement address=driver.findElement(addresselement);
		return address;
	}
	public static void setaddcontact1(WebDriver driver) throws InterruptedException {
		Thread.sleep(4000);
	    WebElement addcontact1=driver.findElement(addcontact1element);
	    addcontact1.click();
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long targetHeight = (Long) js.executeScript("return document.body.scrollHeight");
		for(int i = 0; i < targetHeight; i+=100) {
			Thread.sleep(100);
			js.executeScript("window.scrollTo(0, " + i + ")");
		}
	}
}

