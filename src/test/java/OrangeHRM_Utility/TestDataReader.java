package OrangeHRM_Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class TestDataReader {

	public static Properties prop = null;
	
	public TestDataReader() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("/Users/sahilgirdhar/eclipse-workspace-new/OrangeHRM_AutomationProject/src/test/java/OrangeHRM_Utility/TestData.properties");
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("not able to get data from config file"+e.getStackTrace());
		} 
	
	}
	
	public String getbrowsername() {
		return prop.getProperty("browsername");
	}
	
	public String getURL() {
		return prop.getProperty("url");
	}
	
	public String getUsername_login() {
		return prop.getProperty("username");
	}
	
	public String getPassword_login() {
		return prop.getProperty("password");
	}
	
	public String getSystem_Users_Username_Search() {
		return prop.getProperty("System_Users_Username_Search");
	}
}
