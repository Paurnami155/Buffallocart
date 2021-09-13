package HomePageTest;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.UserCreationPage;

public class NewUserCreation extends HomePageTestBase{
@Test
public void createNewUser() {
	HomePage hp = new HomePage(driver);
	hp.clickUserLink(); //Clicking User Link 
	UserCreationPage up = new UserCreationPage();
	up.clickNewUserLink();  //Clicking New User Link
	
	up.enterUserFullName("Robert");
	up.enterEmployeeID("RT12345");
	up.enterUserName("Rob");
	up.enterPassword("123456");
	up.confirmPassword("123456");
	up.enterEmail("paaru155@gmail.com");
	up.selectLocale();
	up.selectLanguage();
	up.enterPhoneNumber("1234567890");
	up.enterMobileNumber("6754654323");
	up.enterSkypeID("66545");
	up.selectUserType();
}
}
