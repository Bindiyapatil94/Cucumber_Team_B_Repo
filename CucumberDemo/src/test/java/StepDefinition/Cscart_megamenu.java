package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import Base_Test.WebDriverManager;
import Base_Test.WebDriverSingletonInstance;
import PO.PO_cscart_megamenu;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Cscart_megamenu {
	WebDriverSingletonInstance browserManager = WebDriverSingletonInstance.getInstanceOfWebDriverManager();
	WebDriver driver = browserManager.getDriver();
	PO_cscart_megamenu po_megamenu=PageFactory.initElements(driver, PO_cscart_megamenu.class);

	
	Scenario scn ;

	@Before
	public void SetUp(Scenario s) {
		this.scn = s;
	}
	
	@Given("As I am user launch url  in {string}")
	public void as_I_am_user_launch_url_in(String browser) {
		
		WebDriverManager.GetDriver(browser);
	}

	@Given("navigate to url {string}")
	public void navigate_to_ur(String url) {
		//PO_cscart_megamenu po_megamenu=PageFactory.initElements(driver, PO_cscart_megamenu.class);

		driver.get(url);
	}

	@When("I enter url  it will show home page")
	public void i_enter_url_it_will_show_home_page() {
	String title=driver.getTitle();
	System.out.println(title);
	}

	@When("As I perform mouse over action on megamenu")
	public void as_I_perform_mouse_over_action_on_megamenu() {
		po_megamenu.Electronics();
		po_megamenu.Apparal();
		po_megamenu.sportsandoutdoor();
		po_megamenu.ofcsuplier();
		po_megamenu.videogame();
	}



}
