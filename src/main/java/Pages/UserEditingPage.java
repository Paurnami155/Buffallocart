package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserEditingPage {
	public UserEditingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[@class='fa fa-pencil-square-o']")
	WebElement edit_icon;
	
	@FindBy(name = "fullname")
	public WebElement fullName;
	
	@FindBy(id = "check_employment_id")
	public WebElement empID;
	
	@FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
	public WebElement btn_update_user;
	
	@FindBy(xpath="//a[@class='text-info']")
	public WebElement link_user_update;
	
	@FindBy(xpath="//div[@class='pull-right'][1]/span/a[text()='Update']")
	public WebElement link_update;
	
	@FindBy(xpath="//input[@name='joining_date']")
	public WebElement date_joining;
	
	@FindBy(name="date_of_birth")
	public WebElement date_of_birth;
	
	@FindBy(name="father_name")
	public WebElement father_name;
	
	@FindBy(name = "mother_name")
	public WebElement mother_name;
	
	@FindBy(name = "passport")
	public WebElement passport;
	
	@FindBy(name = "present_address")
	public WebElement present_addr;
	
	@FindBy(xpath="//button[@class='btn btn-primary'][text()='Update']")
	public WebElement btn_update;

	public void clickEditButton() {
		edit_icon.click();
		
	}

	public void editFullName(String name) {
		fullName.clear();
		fullName.sendKeys(name);
		
	}

	public void editEmpID(String emp_id) {
		empID.clear();
		empID.sendKeys(emp_id);
		
	}
	
	public void updateUser() {
		btn_update_user.click();
	}

	public void clickNameLink() {
		link_user_update.click();	
		
	}

	public void clickUpdateLink() {
		link_update.click();
		
	}

	public void enterJoiningDate(WebDriver driver) {
		date_joining.click();
		Actions action = new Actions(driver);
		WebElement joining_date = driver.findElement(By.xpath("//div[@class='datepicker-days']/table/tbody/tr/td[@class='day'][text()='1']"));
	    action.moveToElement(joining_date).click().perform();
		
	}

	public void enterDateOfBirth(String dob) {
		date_of_birth.click();
		date_of_birth.sendKeys(dob);
		
		
	}

	public void enterFatherName(String fathername) {
		father_name.sendKeys(fathername);
		
	}

	public void enterMotherName(String mothername) {
		mother_name.sendKeys(mothername);
		
	}

	public void enterPassport(String passprt) {
		passport.sendKeys(passprt);
		
	}

	public void enterPresentAddress(String address) {
		present_addr.sendKeys(address);
		
	}

	public void clickUpdateButton() {
		btn_update.click();
		
	}
}
