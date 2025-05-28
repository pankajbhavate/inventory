package project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	
 public	WebDriver driver;
	String fname;
	String lname;
	String phone;
	String  pan;
	String company;
	String mobile;
	String email;
	
	public Baseclass() throws IOException {
		property p =new property();
        fname=	p.fname();
        lname = p.lname();
        phone =p.phone();
        company = p.companyna();
        email =  p.email();
        mobile=     p.mob();
            pan =    p.pan();
	}
	
	@BeforeClass(alwaysRun = true)
	public void set() {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.zoho.com/in/inventory/inventory-software-demo/#/home/inventory-dashboard");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
	}
	
	
	@AfterClass
	public void teardown() {
		//driver.close();
	}

}
