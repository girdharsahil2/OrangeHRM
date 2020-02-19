package OrangeHRM_TestCases;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.Assert;
import OrangeHRM_Pages.Homepage;
import OrangeHRM_Pages.LoginPage;
import OrangeHRM_Utility.BaseClass;
import OrangeHRM_Utility.Helper;
import OrangeHRM_Utility.TestDataReader;

public class Login_Valid_test extends BaseClass{
	
	

	public static void Login_Valid() throws IOException{
	
		logger=reports.createTest("Orange HRM Valid Login Test","This is to test the valid login functionality of Orange HRM");
		logger.info("Login Test case started");
		
		TestDataReader testdata = new TestDataReader();
		LoginPage login = new LoginPage(driver);
		
		login.enterusername().sendKeys(testdata.getUsername_login());
		logger.pass("Entered Username");
		
		login.enterPassword().sendKeys(testdata.getPassword_login());
		logger.pass("Entered Password");
		
		login.clickLogin().click();
		logger.pass("clicked on Login button");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Homepage home = new Homepage(driver);
		String text = home.gettext_welcomeadmin().getText();
		System.out.println(text);
		logger.pass("Welcome Admin text is succesfully fetched from DOM and printed on console which is "+text);
		//Assert.assertEquals(text, "Welcome Admin")
		if(text.contentEquals("Welcome Admin")) {
			logger.pass("Test Passed.... Loggedin successfully");
		}
		
		else {
			logger.fail("Login Test failed");
		}
		
		//logger.pass("Login page verified");
		
		//Helper.CaptureScreenshot(driver, "Sucessfully loggedin");
		
	}
	
	
}
