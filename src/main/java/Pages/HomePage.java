package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utils.JSexecuter;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[@class='dropdown user user-menu']/a/span")
	public WebElement demolink;

	@FindBy(xpath = "//span[text()='User']")
	public WebElement userLink;
	
	@FindBy(xpath ="//h3[text()='Expense Report']")
    public WebElement scroll;
	
	public String demoLinkName() {
		return demolink.getText();

	}

	public void clickDemo() {
		demolink.click();

	}

	public void presentUser() {
		userLink.isDisplayed();

	}

	public void clickUserLink() {
		userLink.click();

	}

	public void scrollToElement(WebDriver driver) {
		JSexecuter.scrolltoElement(driver, scroll);
		JSexecuter.ClickElement(driver, scroll);
		}
		
	}
	
	


