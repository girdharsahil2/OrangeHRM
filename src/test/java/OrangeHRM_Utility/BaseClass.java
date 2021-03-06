package OrangeHRM_Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import OrangeHRM_Pages.Homepage;

public class BaseClass {

	public static WebDriver driver = null;
	public static TestDataReader testdata = null;
	public static ExtentReports reports= null;
	public static ExtentTest logger=null;
	//public static Homepage home =null;
	//public static Actions action =null;

	@BeforeSuite
	public void setupsuite() 
	{
		testdata = new TestDataReader();
		ExtentHtmlReporter html = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/"+Helper.getCurrentDateTime()+"OHRM_reports.html"));
		reports = new ExtentReports();
		reports.attachReporter(html);
		//home = new Homepage(driver);
		//action = new Actions(null);
	}

	@BeforeClass
	public void Setuptest() 
	{
		driver = browserfactorynew.startapplication(driver,testdata.getbrowsername(), testdata.getURL());
	}


	@AfterClass
	public void teardowntest() 
	{
		browserfactorynew.quitBrowser(driver);
	}

	@AfterMethod
	public void teardownmethod(ITestResult result) throws Throwable
	{
		if (result.getStatus()==ITestResult.SUCCESS)
		{
			logger.pass("Test Passed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.CaptureScreenshot(driver)).build());

		}

		else if(result.getStatus()==ITestResult.FAILURE) {
			logger.fail("Test Failed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.CaptureScreenshot(driver)).build());
		}
		reports.flush();
	}

}
