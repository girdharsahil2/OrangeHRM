package OrangeHRM_TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import OrangeHRM_Pages.Homepage;
import OrangeHRM_Utility.BaseClass;
import OrangeHRM_Utility.Helper;


public class Logout_Test extends BaseClass{

	@Test
	public void Logout_OrangeCRM_Test()
	{
		logger=reports.createTest("Orange HRM Logout Test","This is to test the Logout functionality of Orange HRM");
		logger.info("LOrange HRM Logout Test case started");
		Helper.LoginMethod(driver);
		Helper.LogoutMethod(driver);
		
	}

}
