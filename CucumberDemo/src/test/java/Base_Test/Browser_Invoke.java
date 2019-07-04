package Base_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browser_Invoke {
	public static WebDriver driver;
	
public void getBrowser()
{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    // driver.get(propertyfile1.getProperty("ChromeExe"));
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
    driver.get("https://demo.cs-cart.com");
	driver.manage().window().maximize();
	
}
}
	
