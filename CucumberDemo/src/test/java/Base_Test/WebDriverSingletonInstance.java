package Base_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverSingletonInstance {
	private static WebDriverSingletonInstance instanceOfSingletonClass=null;
	private WebDriver driver;
	
	//Private Constructor
	private WebDriverSingletonInstance() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	//To create instance of Class
	public static WebDriverSingletonInstance getInstanceOfWebDriverManager() {
		
		if(instanceOfSingletonClass==null) {
			instanceOfSingletonClass = new WebDriverSingletonInstance();
		}
		return instanceOfSingletonClass;
	}
	
	//to get Driver
	public  WebDriver getDriver() {
		if (driver==null) {
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		return driver;
	}
	
	
	public void CloseDriver() {
		if (!(driver==null)) {
			driver.quit();
			driver = null;
			
		}
	}

}
