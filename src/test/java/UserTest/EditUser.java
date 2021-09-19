package UserTest;

import org.testng.annotations.Test;

import HomePageTest.HomePageTestBase;
import Pages.HomePage;
import Pages.UserCreationPage;
import Pages.UserDeletionPage;
import Pages.UserEditingPage;

public class EditUser extends HomePageTestBase{
@Test
public void editUser() {
	HomePage hp = new HomePage(driver);
	hp.clickUserLink(); //Clicking User Link 
	UserDeletionPage ud = new UserDeletionPage(driver);
	ud.searchUser("Paurnami273");
	UserEditingPage ue = new UserEditingPage(driver);
	ue.clickEditButton();
    ue.editFullName("Paurnami555");
    ue.editEmpID("PT555");
    ue.updateUser();
		
}
}
