package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class screensho2 {

	WebDriver driver;
	
	
	public void screen(WebElement  el) throws IOException {
		TakesScreenshot  t = ((TakesScreenshot)el);
	  File  src = 	t.getScreenshotAs(OutputType.FILE);
	  File f =new File("C:\\Users\\DELL\\eclipse-workspace\\InventoryManageSystem\\src\\test\\resources\\config\\pa.png");
	  FileUtils.copyFile(src, f);
	}
}
