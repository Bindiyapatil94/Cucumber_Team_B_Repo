package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Base_Test.Browser_Invoke;



public class PO_Cscart_login{
	
	
	public  PO_Cscart_login(WebDriver driver)
	{
		Browser_Invoke.driver=driver;
	}
	
	 @FindBy(how=How.LINK_TEXT,using="My Account")
		WebElement my_acc_click;
		
		@FindBy(how=How.XPATH,using="//*[@id='account_info_4']/div[2]/a[1]")
		WebElement signin_btn_click;
		
		@FindBy(how=How.ID,using="login_popup4")
		WebElement send_username;

		@FindBy(how=How.ID,using="psw_popup")
		WebElement send_password;
		
		@FindBy(how=How.XPATH,using="//button[@class='ty-btn__login ty-btn__secondary ty-btn']")
		WebElement sign_btn_click1;

		
		public void myaccount()
		{
			my_acc_click.click();
		}
		
		public void signin()
		{
			signin_btn_click.click();
		}

		public void setusername(String username)
		{ 
			
			send_username.clear();
			send_username.sendKeys(username);
			
		}
		
		public void setpassword(String password)
		{
			send_password.clear();
			send_password.sendKeys(password);
			

		}
		
		public void signinbtn1()
		{
			

			sign_btn_click1.click();
		}

}
