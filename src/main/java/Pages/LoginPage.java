package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class LoginPage {
	public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this)	;	
			}
	@FindBy(name="user_name")
	public WebElement username;
	@FindBy(name="password")
	public WebElement password;
	@FindBy(xpath="//button[text()='Sign in ']")
	public WebElement signin;

	public void enterUserName(String uname) {
		username.sendKeys(uname);
		
	}
	public void enterPassword(String pass) {
		password.sendKeys(pass);
		
	}
	public void clickLogin() {
		signin.click();
		
	}


	}

