package OrangeHRM_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

	By WelcomeAdmin_loc = By.id("welcome");
	By Logout_Loc = By.linkText("Logout");
	
	private WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public WebElement gettext_welcomeadmin() {
		return driver.findElement(WelcomeAdmin_loc);
	}
	
	public void click_welcomeadmin() {
		driver.findElement(WelcomeAdmin_loc).click();
	}

	public void click_Logoutlink() {
		driver.findElement(Logout_Loc).click();
	}
}
