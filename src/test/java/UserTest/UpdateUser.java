package UserTest;

import org.testng.annotations.Test;

import HomePageTest.HomePageTestBase;
import Pages.HomePage;
import Pages.UserDeletionPage;
import Pages.UserEditingPage;

public class UpdateUser extends HomePageTestBase{
	@Test
	public void updateUser() {
		HomePage hp = new HomePage(driver);
		hp.clickUserLink();
		UserDeletionPage ud = new UserDeletionPage(driver);
		ud.searchUser("Paurnami555");
		UserEditingPage ue = new UserEditingPage(driver);
		ue.clickNameLink();
		driver.manage().window().maximize();
		ue.clickUpdateLink();
		System.out.println("---------");
		ue.enterJoiningDate(driver);
		ue.enterDateOfBirth("1992-05-15");
		ue.enterFatherName("Father");
		ue.enterMotherName("Mother");
		ue.enterPassport("TF5-JKU");
		ue.enterPresentAddress("TFTRTTT");
		ue.clickUpdateButton();
		System.out.println("---------");
	}

}
