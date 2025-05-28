package project;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Invoicespageclass {
	
	WebDriver driver;
	
	@FindBy(css = "[viewBox=\"0 0 32 32\"]")
	WebElement create;
	@FindBy(css = "[id=\"ember67\"]")
	WebElement invoice;
	@FindBy(css = "[class=\"placeholder-text me-0\"]")
	WebElement customer;
	@FindBy(xpath = "//span[@class=\"text-ellipsis \"]")
  List<WebElement >  customrdropdown;
	@FindBy(css = "[id=\"ember300\"]")
	WebElement ordernum;
	@FindBy(xpath = "//span[text()=\"Select or Add Salesperson\"]")
	WebElement saleperson;
   @FindBy(xpath = "//a[text()=\"Reports\"]")
   WebElement report;
   
	@FindBy(xpath = "//li[contains(@class,\"dropdown-item ac-option  inactive \")]")
	List<WebElement > salepersonlist;
	@FindBy(css = "[id=\"ember362]")
	WebElement shipingcharge;
	
	@FindBy(xpath = "//span[text()=\"Sales by Customer\"]")
	WebElement salebycustom;
	@FindBy(xpath = "//span[text()=\"This Month\"]")
	WebElement calendar;
	@FindBy(xpath = "//select[@class=\"monthselect\"]")
	WebElement month;
	@FindBy(xpath = "//select[@class=\"yearselect\"]")
	WebElement year;
	@FindBy(xpath = "//td[text()=\"7\"]")
	WebElement day;
	
	public Invoicespageclass(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	public void create() {
		create.click();
	}

	public void invoice() {
		invoice.click();
	}
	public void customer() {
	     customer.click();
	     customrdropdown.get(4).click();
		
	}
	public void order(String nu) {
		ordernum.sendKeys(nu);
	}
	
	public void saleperson() {	
		saleperson.click();
		
		salepersonlist.get(2).click();
	}
	public void shipcharge(String ma) {
		shipingcharge.sendKeys(ma);
	}
	
	public void report() {
		report.click();
	}
	public void salebycustom() {
		salebycustom.click();
	}
	
	public void calendar() {
		calendar.click();
	}
	
	public void month() {
		Select s = new Select(month);
		s.selectByVisibleText("Feb");
	}
	
	public void year() {
	   Select s= new Select(year);
	   s.selectByVisibleText("2019");
			   
	}
	public void day() {
		day.click();
	}
	
}

