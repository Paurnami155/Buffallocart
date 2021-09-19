package FileManagerTest;

import org.testng.annotations.Test;

import HomePageTest.HomePageTestBase;
import Pages.FileManagerPage;

public class CreateNewFolder extends HomePageTestBase {
	@Test
	public void createFolder() {
		FileManagerPage fp = new FileManagerPage(driver);
		fp.clickFileManagerLink();
		fp.clickNewFolderOption();
		//fp.enterFolderName();
		System.out.println("7777777");
	}
}
