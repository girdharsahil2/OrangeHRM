package OrangeHRM_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PIM_Page 
{
	By EmployeeList_Header_LOC = By.xpath("//table[@id='resultTable']//thead");
	By PIM_LOC = By.xpath("//b[contains(text(),'PIM')]");
	By EmployeeList_Btn_LOC = By.xpath("//a[@id='menu_pim_viewEmployeeList']");
	
	public WebDriver driver;
	
	public PIM_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement get_PIM_LOC() {
		return driver.findElement(PIM_LOC);
	}
	
	public WebElement get_EmployeeList_Btn_LOC() {
		return driver.findElement(EmployeeList_Btn_LOC);
	}
	
	public WebElement getEmployeeList_Header_LOC()
	{
		return driver.findElement(EmployeeList_Header_LOC);
	}
}
