package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Utils.ImageUploader;
import Utils.StringOperations;

public class UserCreationPage {
	@FindBy(xpath="//a[text()='New User']")
	public WebElement newUser;
	
	@FindBy(name = "fullname")
	public WebElement fullName;
	
	@FindBy(id = "check_employment_id")
	public WebElement empID;
	
	@FindBy(id = "check_username")
	public WebElement chkUname;
	
	@FindBy(id = "new_password")
	public WebElement newPass;
	
	@FindBy(name = "confirm_password")
	public WebElement cPass;
	
	@FindBy(name = "email")
	public WebElement eMail;
	
	@FindBy(xpath = "//select[@name='locale']")
	public WebElement locale;
	
	@FindBy(xpath = "//select[@name='language']")
	public WebElement language;
	
	@FindBy(name ="phone")
	public WebElement phone;
	
	@FindBy(name ="mobile")
	public WebElement mobile;
	
	@FindBy(name ="skype")
	public WebElement skype;
	
	@FindBy(xpath="//select[@id='user_type']")
	public WebElement userType;
	
	@FindBy(xpath = "//span[@class='fileinput-new']")
	public WebElement chooseProfilepic;
	
	@FindBy(xpath="//select[@class='form-control select_box department select2-hidden-accessible']")
	public WebElement designation;
	
	@FindBy(xpath="//button[text()='Create User']")
	public WebElement btn_create_user;
	
	@FindBy(xpath="//a[@class='text-info'][starts-with(text(),'Paurnami')]")
	public WebElement user_search;
	
	public UserCreationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void navigateToUserCreationPage() {
		newUser.click();
		
	}

	public void enterUserFullName(String name) {
		fullName.sendKeys(name+StringOperations.randomInteger(3));
		
		
		
	}

	public void enterEmployeeID(String eid) {
		empID.sendKeys(eid+StringOperations.randomInteger(3));
		
	}

	public void enterUserName(String usrName) {
		chkUname.clear();
		chkUname.sendKeys(usrName+StringOperations.randomInteger(5));
		
	}

	public void enterPassword(String nPass) {
		newPass.clear();
		newPass.sendKeys(nPass);
		
	}

	public void confirmPassword(String cnfrmPass) {
		cPass.sendKeys(cnfrmPass);
		
	}

	public void enterEmail() {
		eMail.sendKeys("abc"+StringOperations.randomInteger(5)+"@gmail.com");
		
	}

	public void selectLocale(String localeValue) {
		Select localeDropDown = new Select (locale);
		localeDropDown.selectByVisibleText(localeValue);
		
	}

	public void selectLanguage(String lang) {
		Select languageDropDown = new Select (language);
		languageDropDown.selectByVisibleText(lang);
		
	}

	public void enterPhoneNumber(String phno) {
		phone.sendKeys(phno);
		
	}

	public void enterMobileNumber(String mobno) {
		mobile.sendKeys(mobno);
		
	}

	public void enterSkypeID(String skpID) {
		skype.sendKeys(skpID);
		
	}

	public void selectUserType(String userTypeOption) 
	{
		Select userTypeDropDown=new Select(userType);
		userTypeDropDown.selectByVisibleText(userTypeOption);
	}
	
	public void openLink(String linkName,WebDriver driver) {
		String xpath = "//span[text()='"+linkName+"']";
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public void btnClickChooseImage(String filePath) {
		chooseProfilepic.click();
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		ImageUploader.uploadProfileImage(filePath);
	}

	public void selectDesignation(String desigOption) 
	{
		Select DesigDropDown=new Select(designation);
		DesigDropDown.selectByVisibleText(desigOption);
	}

	public void clickCreateUser() {
		btn_create_user.click();
		
	}

	/*public void searchWithNewUser() {
		Assert.assertEquals(user_search.isDisplayed(), true, "Newly created user is not there");
		
		
	}*/
	

	

}
