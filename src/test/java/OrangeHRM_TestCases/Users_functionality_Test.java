package OrangeHRM_TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import OrangeHRM_Pages.Adminpage;

import OrangeHRM_Utility.BaseClass;
import OrangeHRM_Utility.Helper;

public class Users_functionality_Test extends BaseClass{

	public Adminpage admin=null;

	@Test
	public void userspage_navigation_test() throws Exception 
	{
		logger=reports.createTest("Orange HRM User Functionality Test","This is to test the Users functionality of Orange HRM");
		logger.info("Orange HRM User Functionality Test case started");

		Helper.LoginMethod(driver);
		
		Actions action = new Actions(driver);
		System.out.println("Failing here2");
		Thread.sleep(3000);
		admin = new Adminpage(driver);
		action.moveToElement(admin.get_admin_loc()).perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.moveToElement(admin.get_UserManagement_LOC()).perform();
		System.out.println("Failing here3");
		Thread.sleep(3000);
		action.moveToElement(admin.get_Users_LOC()).click().perform();
		Thread.sleep(3000);
		


	}



}
