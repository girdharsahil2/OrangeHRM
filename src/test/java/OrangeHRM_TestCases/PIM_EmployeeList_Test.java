package OrangeHRM_TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import OrangeHRM_Pages.Adminpage;
import OrangeHRM_Pages.PIM_Page;
import OrangeHRM_Utility.BaseClass;
import OrangeHRM_Utility.Helper;

public class PIM_EmployeeList_Test extends BaseClass
{
	PIM_Page page_obj=null;
	Actions action;
	Adminpage admin=null;
	
	@Test(priority = 1)
	public void ValidateEmployeeList()
	{
		Helper.LoginMethod(driver);
		action = new Actions(driver);
		admin = new Adminpage(driver);
		page_obj = new PIM_Page(driver);
		
		action.moveToElement(page_obj.get_PIM_LOC()).perform();
		action.moveToElement(page_obj.get_EmployeeList_Btn_LOC()).click().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebDriverWait wait = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(page_obj.getEmployeeList_Header_LOC()));
		
		AssertJUnit.assertTrue(page_obj.getEmployeeList_Header_LOC().isDisplayed());
		
	}
	
	
}
