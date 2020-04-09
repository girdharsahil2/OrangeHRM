package OrangeHRM_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddUser_UserPage 
{
	By UserRole_Admin_Loc = By.id("systemUser_userType");
	By EmployeeName_TextBox_Loc = By.id("systemUser_employeeName_empName");
	
	WebDriver driver;
	
	public AddUser_UserPage (WebDriver driver) {
		this.driver=driver;
	}
	
	
	public WebElement get_UserRole_Admin_Loc() {
		return driver.findElement(UserRole_Admin_Loc);
	}
	
	public WebElement get_EmployeeName_TextBox_Loc() {
		return driver.findElement(EmployeeName_TextBox_Loc);
	}
}
