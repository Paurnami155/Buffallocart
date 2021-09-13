package LoginTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utils.DriverFactory;

public class LoginTestBase {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("New Tests Begins here");
		driver = DriverFactory.getDriver("edge");
	    driver.get("https://erp.buffalocart.com/login");
		 System.out.println("Succesfully Logged in");
		 
}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
