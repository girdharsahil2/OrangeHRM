package OrangeHRM_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Adminpage {

	WebDriver driver;
	
	By UserManagement_LOC = By.xpath("//a[@id='menu_admin_UserManagement']");
	By Users_Loc = By.xpath("//a[@id='menu_admin_viewSystemUsers']");
	By admin_loc=By.xpath("//a[@id='menu_admin_viewAdminModule']");
	By system_users_loc = By.xpath("//div[@class='head']");
	By username_textbox_loc = By.xpath("//input[@name='searchSystemUser[userName]']");
	By EmployeeName_Field_LOC = By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr[2]/td[4]");
	By AddBtn_systemUser_Loc = By.id("btnAdd");
	
	//Below Locators are to locate the elemnets in Job>Job Titles page
	By Job_dropdown_LOC = By.xpath("//*[@id='menu_admin_Job']");
	By JobTitles_LOC = By.xpath("//a[@id='menu_admin_viewJobTitleList']");
	By JobTitles_header_LOC = By.xpath("//div[@class='head']");
	By Addbtn_JobTitles_Loc = By.xpath("//input[@id='btnAdd']");
		
	
	public Adminpage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement get_admin_loc(){
		return driver.findElement(admin_loc);
	}
	public WebElement get_UserManagement_LOC() {
		return driver.findElement(UserManagement_LOC);
	}
	
	public WebElement get_Users_LOC() {
		return driver.findElement(Users_Loc);
	}
	public WebElement get_Systemusers_loc() {
		return driver.findElement(system_users_loc);
	}
	
	public WebElement get_username_textbox_loc() {
		return driver.findElement(username_textbox_loc);
	}
	
	public WebElement get_EmployeeName_Field_LOC() {
		return driver.findElement(EmployeeName_Field_LOC);
	}
	
	public WebElement get_AddBtn_systemUser_Loc() {
		return driver.findElement(AddBtn_systemUser_Loc);
	}
	
	public WebElement get_Job_Dropdown() {
		return driver.findElement(Job_dropdown_LOC);
	}
	
	public WebElement get_JobTitles_LOC() {
		return driver.findElement(JobTitles_LOC);
	}
	
	public WebElement get_JobTitles_header_LOC() {
		return driver.findElement(JobTitles_header_LOC);
	}
	
	public WebElement get_Addbtn_JobTitles_Loc() {
		return driver.findElement(Addbtn_JobTitles_Loc);
	}
}
