package OrangeHRM_TestCases;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import OrangeHRM_Pages.Adminpage;

import OrangeHRM_Utility.BaseClass;
import OrangeHRM_Utility.Helper;

public class Users_functionality_Test extends BaseClass{

	//Adminpage admin=null;

	@Test
	public void userspage_navigation_test() 
	{
		logger=reports.createTest("Orange HRM User Functionality Test","This is to test the Users functionality of Orange HRM");
		logger.info("Orange HRM User Functionality Test case started");

		Helper.LoginMethod(driver);
		
		System.out.println("Failing here1");
		Actions action = new Actions(driver);
		System.out.println("Failing here2");
		Adminpage admin = new Adminpage(driver);
		action.moveToElement(admin.get_UserManagement_LOC()).perform();
		System.out.println("Failing here3");
		action.moveToElement(admin.get_Users_LOC()).click().perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}



}
