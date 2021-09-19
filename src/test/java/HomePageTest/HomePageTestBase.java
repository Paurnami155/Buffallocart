package HomePageTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Pages.LoginPage;
import Utils.DriverFactory;
import Utils.Screenshot;

public class HomePageTestBase {
	protected WebDriver driver;

	@BeforeMethod
	//@Parameters({"Browser"})
	public void beforeMethod() {
		System.out.println("New Tests Begins here");
		driver = DriverFactory.getDriver("chrome");
        driver = DriverFactory.setImplicitlyWait(10, driver);
		driver.get("https://erp.buffalocart.com/login");
		driver.manage().window().maximize();
		System.out.println("Succesfully Logged in");
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName("admin");
		lp.enterPassword("123456");
		//lp.takeScrnShot(driver);
		lp.clickLogin();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
