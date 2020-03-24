package OrangeHRM_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboardpage {

	WebDriver driver = null;
	By Dashboard_text_loc = By.xpath("//div[@class='head']");
	
	public Dashboardpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getDashboardloc() 
	{
		return driver.findElement(Dashboard_text_loc);
	}
	
}
