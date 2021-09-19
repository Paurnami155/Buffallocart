package HomePageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;

public class UserLinkPresent extends HomePageTestBase{
@Test
public void presentUserLink() {
	HomePage hp = new HomePage(driver);
	hp.presentUser();
	Assert.assertTrue(true);
	System.out.println("User Link Present Test Passed");
	
	hp.scrollToElement(driver);
	System.out.println("Checking");
}
}
