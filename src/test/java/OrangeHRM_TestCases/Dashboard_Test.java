package OrangeHRM_TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import OrangeHRM_Pages.Dashboardpage;
import OrangeHRM_Utility.BaseClass;
import OrangeHRM_Utility.Helper;

public class Dashboard_Test extends BaseClass
{
	Dashboardpage dashboard; 
	
	@Test(priority = 1)
	public void DashBoard_page_validation() 
	{
		logger=reports.createTest("Orange HRM DashBoard Page Validation Test","This is to test the Job titles functionality of Orange HRM");
		logger.info("Orange HRM DashBoard Page Validation Test Case started");
		
		Helper.LoginMethod(driver);
		
		dashboard = new Dashboardpage(driver);
		String dbtext = dashboard.getDashboardloc().getText();
		System.out.println("The title of the page is" +dbtext);
		
	}	
}
