package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_cscart_megamenu {
	WebDriver driver;
	   public PO_cscart_megamenu(WebDriver driver)
	   {
		   this.driver=driver;
	   }
	   @FindBy(how=How.XPATH,using="//*[@id='tygh_main_container']/div[2]/div/div[2]/div/div/ul/li[3]/a[2]")
		WebElement Electronics;
	   
	   @FindBy(how=How.XPATH,using="//*[@id='tygh_main_container']/div[2]/div/div[2]/div/div/ul/li[4]/a[2]")
		WebElement apparal;
	
	   @FindBy(how=How.XPATH,using="//*[@id='tygh_main_container']/div[2]/div/div[2]/div/div/ul/li[5]/a[2]")
		WebElement SportsandOutdoors;
     
	
	   @FindBy(how=How.XPATH,using="//*[@id='tygh_main_container']/div[2]/div/div[2]/div/div/ul/li[6]/a[2]")
		WebElement OfficeSupplies;
      
	   @FindBy(how=How.XPATH,using="//*[@id='tygh_main_container']/div[2]/div/div[2]/div/div/ul/li[7]/a[2]")
		WebElement videoGames;
	   
     public void Electronics()
     {
     	//WebElement Electronic=driver.findElement(By.xpath("//*[@id='tygh_main_container']/div[2]/div/div[2]/div/div/ul/li[3]/a[2]"));
 		Actions Act=new Actions(driver);
 		Act.moveToElement(Electronics).perform();
     }
     public void Apparal()
     {
     	Actions Act=new Actions(driver);
 		Act.moveToElement(apparal).perform();
     }
	
	    public void sportsandoutdoor()
	    {
	    	Actions Act=new Actions(driver);
 		Act.moveToElement(SportsandOutdoors).perform();
	    }

	    public void ofcsuplier()
	    {
	    	Actions Act=new Actions(driver);
 		Act.moveToElement(OfficeSupplies).perform();
	    }
     
	    public void videogame()
	    {
	    	Actions Act=new Actions(driver);
 		Act.moveToElement(videoGames).perform();
	    }

}
