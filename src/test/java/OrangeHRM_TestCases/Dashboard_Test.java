package OrangeHRM_TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import OrangeHRM_Pages.Dashboardpage;
import OrangeHRM_Utility.BaseClass;
import OrangeHRM_Utility.Helper;

public class Dashboard_Test extends BaseClass{

	Dashboardpage dashboard = new Dashboardpage(driver);
	
	@Test
	public void DashBoard_page_validation() 
	{
		Helper.LoginMethod(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String dbtext = dashboard.getDashboardloc().getText();
		System.out.println("The title of the page is" +dbtext);
	
	}
	
	
}
