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
	UserCreationPage up = new UserCreationPage(driver);
	up.navigateToUserCreationPage();  //Clicking New User Link
	
	up.enterUserFullName("Paurnami");
	
	up.enterEmployeeID("RT");
	up.enterUserName("Pournami");
	up.enterPassword("123456");
	up.confirmPassword("123456");
	up.enterEmail();
	up.selectLocale("English (United States)");
	up.selectLanguage("English");
	up.enterPhoneNumber("1234567890");
	up.enterMobileNumber("6754654323");
	up.enterSkypeID("66545");
	up.btnClickChooseImage("C:\\Testfile.png");
	up.selectUserType("Staff");
	up.selectDesignation("Manager");
	up.clickCreateUser();
	//up.searchWithNewUser();
}
}
