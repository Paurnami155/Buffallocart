package Pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserDeletionPage {
public UserDeletionPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//input[@class='form-control input-sm']")
WebElement user_search_column;

@FindBy(xpath="//a[@class='btn btn-danger btn-xs'][@title='Click to Delete ']")
WebElement btn_delete_user;
@FindBy(xpath="//button[text()='Proceed Anyway!']")
WebElement btn_proceed_user_deletion;
@FindBy(xpath="//td[text()='No matching records found']")
WebElement user_deletion_assert;

public void searchUser(String user_name) {
	user_search_column.sendKeys(user_name);
}

public void deleteUser() {
	btn_delete_user.click();
	btn_proceed_user_deletion.click();
	
}
public void validateUserDeletionTest() {
	String actual_text = user_deletion_assert.getText();
	String expected_text = "No matching records found";
	Assert.assertEquals(actual_text, expected_text, "User deletion Test Failed");
	System.out.println("User Deletion Test Passed !!!!");
}
}
