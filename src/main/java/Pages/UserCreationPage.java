package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

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
	
	@FindBy(xpath = "//span[text()='English (United States)']")
	public WebElement locale;
	
	@FindBy(xpath = "//span[text()='English']")
	public WebElement language;
	
	@FindBy(name ="phone")
	public WebElement phone;
	
	@FindBy(name ="mobile")
	public WebElement mobile;
	
	@FindBy(name ="skype")
	public WebElement skype;
	
	@FindBy(id = "user_type")
	public WebElement userType;
	
	
	public void clickNewUserLink() {
		newUser.click();
		
	}

	public void enterUserFullName(String name) {
		fullName.sendKeys(name);
		
	}

	public void enterEmployeeID(String eid) {
		empID.sendKeys(eid);
		
	}

	public void enterUserName(String usrName) {
		chkUname.clear();
		chkUname.sendKeys(usrName);
		
	}

	public void enterPassword(String nPass) {
		newPass.clear();
		newPass.sendKeys(nPass);
		
	}

	public void confirmPassword(String cnfrmPass) {
		cPass.sendKeys(cnfrmPass);
		
	}

	public void enterEmail(String mail) {
		eMail.sendKeys(mail);
		
	}

	public void selectLocale() {
		Select localeDropDown = new Select (locale);
		localeDropDown.selectByVisibleText("English (United States)");
		
	}

	public void selectLanguage() {
		Select languageDropDown = new Select (language);
		languageDropDown.selectByVisibleText("English");
		
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

	public void selectUserType() {
		Select userTypeDropDown = new Select (userType);
		userTypeDropDown.selectByVisibleText("Admin");
		
	}
	
	public void openLink(String linkName,WebDriver driver) {
		String xpath = "//span[text()='"+linkName+"']";
		driver.findElement(By.xpath(xpath)).click();
	}

}
