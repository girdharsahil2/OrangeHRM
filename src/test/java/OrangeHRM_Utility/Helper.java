package OrangeHRM_Utility;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentTest;

import OrangeHRM_Pages.Homepage;
import OrangeHRM_Pages.LoginPage;


public class Helper extends BaseClass{

	//public static ExtentTest logger=null;
	static WebDriver driver;

	public static String CaptureScreenshot(WebDriver driver) 
	{

		String screenshotpath = System.getProperty("user.dir")+"/Screenshots/OrangeHRM"+getCurrentDateTime()+".png";
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src, new File(screenshotpath));
		} catch (Exception e) {
			System.out.println("Unable to capture Screenshot"+ e.getMessage());
		}
		return screenshotpath;
	}

	public static String getCurrentDateTime()
	{
		DateFormat CustomFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate = new Date();
		return CustomFormat.format(currentDate);
	}
	
	public static void LoginMethod(WebDriver driver) {
		System.out.println("driver = "+driver);
		LoginPage login = new LoginPage(driver);

		login.enterusername().sendKeys(testdata.getUsername_login());
		logger.pass("Entered Username");

		login.enterPassword().sendKeys(testdata.getPassword_login());
		logger.pass("Entered Password");

		login.clickLogin().click();
		logger.pass("clicked on Login button");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	}
	
	public static void LogoutMethod(WebDriver driver)
	{
		Homepage home = new Homepage(driver);
		home.gettext_welcomeadmin().click();
		home.click_Logoutlink();
	}
	
}
