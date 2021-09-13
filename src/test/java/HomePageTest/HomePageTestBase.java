package HomePageTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Pages.LoginPage;
import Utils.DriverFactory;

public class HomePageTestBase {
	WebDriver driver;

	@BeforeMethod
	@Parameters({"Browser"})
	public void beforeMethod(String browserName) {
		System.out.println("New Tests Begins here");
		driver = DriverFactory.getDriver(browserName);
        driver = DriverFactory.setImplicitlyWait(10, driver);
		driver.get("https://erp.buffalocart.com/login");
		System.out.println("Succesfully Logged in");
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName("admin");
		lp.enterPassword("123456");
		lp.clickLogin();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
