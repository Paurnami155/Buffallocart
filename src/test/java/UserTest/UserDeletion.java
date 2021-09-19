package UserTest;

import org.testng.annotations.Test;

import HomePageTest.HomePageTestBase;
import Pages.HomePage;
import Pages.UserCreationPage;
import Pages.UserDeletionPage;

public class UserDeletion extends HomePageTestBase{
	@Test
	public void deleteUser() {
		HomePage hp = new HomePage(driver);
		hp.clickUserLink(); //Clicking User Link 
		UserDeletionPage ud = new UserDeletionPage(driver);
		ud.searchUser("Paurnami914");
		ud.deleteUser();
		ud.searchUser("Paurnami914");
		ud.validateUserDeletionTest();
		
	}
}
