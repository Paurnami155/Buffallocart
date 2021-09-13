package HomePageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.HomePage;

public class TitleValidation extends HomePageTestBase{
@Test

public void presentUserLink() {

	HomePage hp = new HomePage(driver);
	String actual = hp.demoLinkName();
	System.out.println(hp.demolink.getText());
	String expected = "demo";
	Assert.assertEquals(actual, expected);
	Actions action = new Actions(driver);
	Action act1 = action.moveToElement(driver.findElement(By.xpath("//span[text()='User']"))).build();
	act1.perform();
	action.moveToElement(driver.findElement(By.xpath("//span[text()='User']"))).click().perform();
	hp.clickDemo();
	System.out.println("Demo Link Test Passed");
}
}
