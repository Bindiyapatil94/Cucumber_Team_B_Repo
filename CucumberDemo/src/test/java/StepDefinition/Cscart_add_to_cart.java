package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Base_Test.WebDriverManager;
import Base_Test.WebDriverSingletonInstance;
import PO.PO_add_to_cart;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cscart_add_to_cart {
	WebDriverSingletonInstance browserManager = WebDriverSingletonInstance.getInstanceOfWebDriverManager();
	WebDriver driver = browserManager.getDriver();
	PO_add_to_cart po_add_cart= PageFactory.initElements(driver, PO_add_to_cart.class);
	Scenario scn ;
	@Before
	public void SetUp(Scenario s) {
		this.scn = s;
	}
	@Given("As I am user launch  browser {string}")
	public void as_I_am_user_launch_browser(String browser) {
		WebDriverManager.GetDriver(browser);
	}

	@Then("I enter url as {string}")
	public void i_enter_url_as(String url) {
		driver.get(url);
	    
	}

	@When("I enter {string} in top search box")
	public void i_enter_in_top_search_box(String product) 
	{
		po_add_cart.SearchBox(product);
	    
	}

	@When("click on search submit button")
	public void click_on_search_submit_button() 
	{
		po_add_cart.SarchButton();
	}

	@Then("page navigates to product search results")
	public void page_navigates_to_product_search_results() 
	{
	    String title=driver.getTitle();
	    System.out.println(title);
	}

	@Then("product results are displayed")
	public void product_results_are_displayed() {
		System.out.println("Product list is display");
	    
	}

	@When("I click on view button")
	public void i_click_on_view_button() {
		po_add_cart.Quick_view();
	    
	}

	@Then("I click on increment button")
	public void i_click_on_increment_button() {
		po_add_cart.Increase_btn();
	}

	@When("I click add to cart button of product")
	public void i_click_add_to_cart_button_of_product() {
		po_add_cart.Add_To_Cart();
	}

	@Then("my cart is updated with product quantity as {int} and correct total price")
	public void my_cart_is_updated_with_product_quantity_as_and_correct_total_price(Integer int1) {
		po_add_cart.Add_To_My_Cart();
	}


}
