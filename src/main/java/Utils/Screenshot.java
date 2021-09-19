package Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
public static void takeScreenshot(WebDriver driver,String filename) {
	TakesScreenshot scrShot =((TakesScreenshot)driver);
	File srcFile=scrShot.getScreenshotAs(OutputType.FILE);
	File destFile = new File(filename);
	try {
		FileUtils.copyFile(srcFile, destFile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
/*
Screenshot
Robot class
Actions class
*/