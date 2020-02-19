package OrangeHRM_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver=null;
	
	By username_textbox_loc = By.id("txtUsername");
	By password_textbox_loc = By.id("txtPassword");
	By login_loc = By.id("btnLogin");
	By loginScreen_headingLoc = By.id("logInPanelHeading");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement enterusername() {
		return driver.findElement(username_textbox_loc);
	}
	public WebElement enterPassword() {
		return driver.findElement(password_textbox_loc);
	}
	public WebElement clickLogin() {
		return driver.findElement(login_loc);
	}
	
	public WebElement loginScreen_heading() {
		return driver.findElement(loginScreen_headingLoc);
	}
	
}