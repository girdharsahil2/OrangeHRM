package OrangeHRM_Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners_OrangeHRM implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test Started : Name = "+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed: Name = "+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed: Name = "+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped: Name = "+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
}
