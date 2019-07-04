package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_add_to_cart {
WebDriver driver;
	
	public PO_add_to_cart(WebDriver dr)
	{
		driver=dr;
	}

	@FindBy(how = How.ID,using = "search_input")
	WebElement Enter_Search_Box;
	
	@FindBy(how = How.XPATH,using = "//button[@title='Search']")
	WebElement Click_On_Search_Btn;

	@FindBy(how=How.XPATH,using="//a[@class='ty-btn ty-btn__secondary ty-btn__big cm-dialog-opener cm-dialog-auto-size' and @data-ca-view-id='217']")
	private WebElement QuickView;
    
	@FindBy(how=How.XPATH,using="//a[@class='cm-increase ty-value-changer__increase']")
	private WebElement Click_Increase_Btn;


	@FindBy(how=How.XPATH,using="//button[@id='button_cart_ajax217']")
	private WebElement Add_to_Cart_Btn;

	
	@FindBy(how=How.XPATH,using="//*[@id=\"sw_dropdown_8\"]/a/i")
		WebElement Click_On_My_Cart;
	
	public void SearchBox(String p)
	{
		Enter_Search_Box.sendKeys(p);
	}
	
	public void SarchButton()
	{
		Click_On_Search_Btn.click();
	}
	
	public void Quick_view()
	{
		Actions Act=new Actions(driver);
		Act.moveToElement( QuickView).perform();
		QuickView.click();
	}
	public void Increase_btn()
	{
		Click_Increase_Btn.click();
	}
	
	public void Add_To_Cart()
	{
		Add_to_Cart_Btn.click();
	}
	
	public void Add_To_My_Cart()
	{
		Click_On_My_Cart.click();
	}
}


