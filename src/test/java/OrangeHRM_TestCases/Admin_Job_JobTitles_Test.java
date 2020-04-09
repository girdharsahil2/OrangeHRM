package OrangeHRM_TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import OrangeHRM_Pages.Adminpage;
import OrangeHRM_Utility.BaseClass;
import OrangeHRM_Utility.Helper;

public class Admin_Job_JobTitles_Test extends BaseClass
{
	Adminpage admin;
	Actions action;
	
	@Test
	public void Job_JobTitles_Navigation()
	{
		logger=reports.createTest("Orange HRM Job Titles Functionality Test","This is to test the Job titles functionality of Orange HRM");
		logger.info("Orange HRM Job Titles Functionality Test case started");
		
		Helper.LoginMethod(driver);
		
		admin = new Adminpage(driver);
		action = new Actions(driver);
		
		//Hover over the admin tab
		action.moveToElement(admin.get_admin_loc()).perform();
		
		//Hover over job dropdown tab
		action.moveToElement(admin.get_Job_Dropdown()).perform();
		
		//click on JobTitles tab
		action.moveToElement(admin.get_JobTitles_LOC()).click().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Validating page title using assertion
		AssertJUnit.assertEquals("Job Titles", admin.get_JobTitles_header_LOC().getText());
		System.out.println("Test Passed");
		
		//Clicking on Add button
		admin.get_Addbtn_JobTitles_Loc().click();
		
		
	}
	
	
	
}
