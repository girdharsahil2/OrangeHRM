package OrangeHRM_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Adminpage {

	By UserManagement_LOC = By.xpath("//a[@id='menu_admin_UserManagement']");
	By Users_Loc = By.xpath("//a[@id='menu_admin_viewSystemUsers']");
	By admin_loc=By.xpath("//a[@id='menu_admin_viewAdminModule']");
	
	public WebDriver driver;
	
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
	
	
}
