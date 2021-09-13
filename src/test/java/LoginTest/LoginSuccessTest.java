package LoginTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;


public class LoginSuccessTest extends LoginTestBase{

	@Test
	public void loginSuccess() {
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName("admin");
		lp.enterPassword("123456");
		lp.clickLogin();
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Codecarrots"));
		
	}
}
