package LoginTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import DataProvider.MyDataProvider;
import Pages.LoginPage;

public class LoginMultipleUsers extends LoginTestBase{

	@Test(dataProvider = "DP1",dataProviderClass = MyDataProvider.class)
	public void loginSuccess(String uname,String pass) {
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName(uname);
		lp.enterPassword(pass);
		lp.clickLogin();
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Codecarrots"));
		
	}
}

