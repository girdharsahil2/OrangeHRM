package OrangeHRM_TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import OrangeHRM_Pages.AddUser_UserPage;
import OrangeHRM_Pages.Adminpage;
import OrangeHRM_Utility.BaseClass;
import OrangeHRM_Utility.Helper;

public class Admin_Users_Test extends BaseClass{

	Adminpage admin;
	Actions action;
	AddUser_UserPage adduser;

	@Test(priority = 1)
	public void userspage_navigation_test() throws Exception 
	{
		logger=reports.createTest("Orange HRM User Functionality Test","This is to test the Users functionality of Orange HRM");
		logger.info("Orange HRM User Functionality Test case started");

		Helper.LoginMethod(driver);
		
		action = new Actions(driver);
		
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		admin = new Adminpage(driver);
		action.moveToElement(admin.get_admin_loc()).perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.moveToElement(admin.get_UserManagement_LOC()).perform();
		
		Thread.sleep(3000);
		action.moveToElement(admin.get_Users_LOC()).click().perform();
		Thread.sleep(3000);
		
		String Users_page_text = admin.get_Systemusers_loc().getText();
		System.out.println(Users_page_text);
		AssertJUnit.assertEquals(Users_page_text, "System Users");
		
		System.out.println("Navigated to correct page");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority = 2)
	public void Search_System_User() 
	{
		admin.get_username_textbox_loc().sendKeys(testdata.getSystem_Users_Username_Search());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String Employee_Name = admin.get_EmployeeName_Field_LOC().getText();
		System.out.println(Employee_Name);
		AssertJUnit.assertEquals(Employee_Name, "Fiona Grace");
		System.out.println("tested");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority = 3)
	public void AddNew_SystemUser()
	{
		action = new Actions(driver);
		action.moveToElement(admin.get_AddBtn_systemUser_Loc()).click().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Selecting User Role
		adduser = new AddUser_UserPage(driver);
		Select UserRole = new Select(adduser.get_UserRole_Admin_Loc());
		UserRole.selectByVisibleText("Admin");
		
		//Enter Employee name
		adduser.get_EmployeeName_TextBox_Loc().sendKeys("Hevric Blade");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}

	

}
