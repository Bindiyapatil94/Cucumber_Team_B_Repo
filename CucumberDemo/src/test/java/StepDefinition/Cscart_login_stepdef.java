package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Base_Test.WebDriverManager;
import Base_Test.WebDriverSingletonInstance;
import PO.PO_Cscart_login;
import PO.PO_cscart_megamenu;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cscart_login_stepdef {
	WebDriverSingletonInstance browserManager = WebDriverSingletonInstance.getInstanceOfWebDriverManager();
	WebDriver driver = browserManager.getDriver();
	PO_Cscart_login po_login=PageFactory.initElements(driver, PO_Cscart_login.class);

	
	Scenario scn ;

	@Before
	public void SetUp(Scenario s) {
		this.scn = s;
	}

	
	@Given("As I am user launch chrome browser with {string}")
	public void as_I_am_user_launch_chrome_browser_with(String browser)
	{
		WebDriverManager.GetDriver(browser);

	}

	@Given("I enter an url {string}")
	public void i_enter_an_url(String url) {
	    driver.get(url);
	}

	@Given("I click on my account")
	public void i_click_on_my_account()
	{
		po_login.myaccount();
	}

	@Given("click on signin")
	public void click_on_signin() {
		po_login.signin();
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String username) {
		po_login.setusername(username);
	}

	@When("I enter password {string}")
	public void i_enter_password(String password) {
		po_login.setpassword(password);
	}

	@When("click on signbtn")
	public void click_on_signbtn() {
		po_login.signinbtn1();
	}

	@Then("I validate the login feature")
	public void i_validate_the_login_feature() {
	   String title= driver.getTitle();
	   System.out.println(title);
	}


}
