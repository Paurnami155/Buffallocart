package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSexecuter {
	public static void scrolltoElement(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
//		 js.executeScript("arguments[0].click();", button);
	}
	
	public static void ClickElement(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].click();", element);
//	 js.executeScript("alert('Welcome to SELENIUM ALERT');");
	

}
}
