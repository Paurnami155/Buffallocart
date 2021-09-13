package LoginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class UsernameValidationTest extends LoginTestBase {
	
	@Test
	public void usernamePresent() {
		 LoginPage lp = new LoginPage(driver);
		Assert.assertTrue(lp.username.isDisplayed());
	}

}
