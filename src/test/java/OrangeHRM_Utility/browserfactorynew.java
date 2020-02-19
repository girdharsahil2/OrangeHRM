package OrangeHRM_Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserfactorynew {

	
	
	public static WebDriver startapplication(WebDriver driver, String browsername, String url) {

		String projectpath=System.getProperty("user.dir");
		
		if(browsername.equalsIgnoreCase("chrome")){
			
			//setting Chrome browser
			System.setProperty("webdriver.chrome.driver", projectpath+"/Drivers/ChromeDriver/chromedriver");
			driver = new ChromeDriver();
		}
		
		else if(browsername.equalsIgnoreCase("firefox")) {
			
			//setting FireFox browser
			System.setProperty("webdriver.firefox.driver", projectpath+"/Drivers/GeckoDriver/geckodriver");
			driver = new FirefoxDriver();
			
		}
		
		else {
			System.out.println("We Dont support this browser");
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
	
	public static void quitBrowser(WebDriver driver) {
		//driver.close();
		driver.quit();
	}
	
	
}
