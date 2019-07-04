package PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Base_Test.WebDriverSingletonInstance;



public class Po_cscart_search {
	WebDriverSingletonInstance driver;
	
	@FindBy(how=How.ID,using="search_input")
	WebElement search1;
	
	@FindBy(how=How.XPATH,using="//button[@title='Search']")
	WebElement searchclick;
	
	public void search(String arg)
	{
		search1.sendKeys(arg);
	}
	public void click()
	{
		searchclick.click();
	}

}
