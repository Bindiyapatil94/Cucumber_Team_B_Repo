package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



import Base_Test.WebDriverManager;
import Base_Test.WebDriverSingletonInstance;
import PO.PO_cscart_megamenu;
import PO.Po_cscart_search;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cscart_search_stepdef {
	WebDriverSingletonInstance browserManager = WebDriverSingletonInstance.getInstanceOfWebDriverManager();
	WebDriver driver = browserManager.getDriver();
	
	Po_cscart_search po_search=PageFactory.initElements(driver,  Po_cscart_search.class);

	Scenario scn ;

	@Before
	public void setup(Scenario s)
	{
		this.scn=s;
	}

   @Given("As I am user lauch url in \"([a-zA-Z]{1,})\"")
	public void as_I_am_user_lauch_url_in(String browser) {
	
		WebDriverManager.GetDriver(browser);

	}

	@When("I navigate to url {string}")
	public void i_navigate_to_url(String url)
	{
		driver.get(url);
		scn.write("Navigated to URL: " + url);
	   
	}

	@When("I validate the page title")
	public void i_validate_the_page_title() {

		String exp_title=driver.getTitle();
		String act_title="Shopping Cart Software & Ecommerce Software Solutions by CS-Cart";
		Assert.assertEquals( act_title, exp_title);
	    
	}

	@When("I enter product as \"([a-zA-Z]{1,})\"")
	public void i_enter_product_as(String product) {
     po_search.search(product);
	    
	}

	@When("then hit enter button of search box")
	public void then_hit_enter_button_of_search_box() 
	{

		po_search.click();
	    
	}

	@Then("validate displayed product")
	public void validate_displayed_product() 
	{

		WebElement product_name=driver.findElement(By.xpath("//form[@name='product_form_217']"));
		String act_title=product_name.getText();
		String exp_title="ASUS CP6230";
		Assert.assertEquals(act_title, exp_title);
	   
	}
	@Then("close the browser")
	public void close_the_browser() {
	   driver.close();
	}
	



}
