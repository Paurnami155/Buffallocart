package LoginTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginFailureTest extends LoginTestBase {
@Test
public void loginTest() {
	LoginPage lp = new LoginPage(driver);
	lp.enterUserName("admin");
	lp.enterPassword("admin");
	lp.clickLogin();
	Assert.assertFalse(driver.getTitle().equalsIgnoreCase("Codecarrots"));
}
}
