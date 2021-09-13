package HomePageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;

public class ValidateUserLinkName extends HomePageTestBase{
@Test
public void validateDemoLink() {
	HomePage hp = new HomePage(driver);
	String actual = hp.demoLinkName();
	System.out.println(hp.demolink.getText());
	String expected = "demo";
	Assert.assertEquals(actual, expected);
	hp.clickDemo();
	System.out.println("Demo Link Test Passed");
	
}
}
