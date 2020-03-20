package OrangeHRM_TestCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import OrangeHRM_Pages.Homepage;
import OrangeHRM_Utility.BaseClass;
import OrangeHRM_Utility.Helper;

@Listeners(OrangeHRM_Utility.Listners_OrangeHRM.class)
public class Login_Valid_Test extends BaseClass{

	//LoginPage login =null;

	@Test
	public void Login_Valid() throws Throwable
	{

		logger=reports.createTest("Orange HRM Valid Login Test","This is to test the valid login functionality of Orange HRM");
		logger.info("Login Test case started");

		Helper.LoginMethod(driver);
		Thread.sleep(5000);
		
		Homepage home = new Homepage(driver);
		String text = home.get_Dashboard_loc().getText();
		System.out.println(text);
		
		logger.pass("Welcome Admin text is succesfully fetched from DOM and printed on console which is "+text);

		if(home.get_Dashboard_loc().isDisplayed()) {
			logger.pass("Test Passed.... Loggedin successfully");
		}

		else {
			Assert.fail("Login Test failed");
		}
	}
}
