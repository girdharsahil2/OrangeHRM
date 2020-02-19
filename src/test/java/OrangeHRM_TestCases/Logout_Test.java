package OrangeHRM_TestCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import OrangeHRM_Pages.Homepage;
import OrangeHRM_Pages.LoginPage;
import OrangeHRM_Utility.BaseClass;

public class Logout_Test extends BaseClass {

	@Test
	public void Logout_valid() throws Exception {
		
		logger=reports.createTest("Orange HRM logout test");
		logger.info("Logout test case started");
		
		Login_Valid_test.Login_Valid();
		logger.pass("Succesfully loggedin");
		
		Homepage home = new Homepage(driver);
		home.click_welcomeadmin();
		logger.pass("Clicked on Welcome Admin Link");
		
		home.click_Logoutlink();
		logger.pass("clicked on logout link");
		//Helper.CaptureScreenshot(driver, "Logout_Screenshot");
		
		LoginPage login = new LoginPage(driver);
		String logout = login.loginScreen_heading().getText();
		
		
		if (logout.contentEquals("LOGIN Panel")) {
			logger.pass("Logout test pass");
		}
		
		else {
			logger.fail("Logout test failed");
		}
	}
	
}
