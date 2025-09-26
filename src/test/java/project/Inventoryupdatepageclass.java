package project;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Inventoryupdatepageclass {
	
	WebDriver driver;
	
	@FindBy(css = "[placeholder=\"Search in Inventory Adjustments ( / )\"]")
	WebElement search;
	@FindBy(xpath = "//a[text()=\"Inventory Adjustments\"]")
	WebElement inventoryadjust;
	@FindBy(css = "[viewBox=\"0 0 32 32\"]")
	WebElement create;
	@FindBy(xpath = "(//input[@type=\"text\"])[2]")
	WebElement refrencenum;
	@FindBy(css = "[placeholder=\"dd/MM/yyyy\"]")
	WebElement dates;
	@FindBy(xpath = "//th[@class=\"datepicker-switch\"]")
	WebElement   datemonth;
	@FindBy(xpath = "//th[@class=\"prev\"]")
	WebElement next;
	@FindBy(xpath = "//td[text()=\"22\"]")
	WebElement day;
   @FindBy(css = "[class=\"upload ember-view\"]")
   WebElement uploadfile;
   
	public Inventoryupdatepageclass(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	public void create() {
		create.click();
	}
	
	public void inventoryadjust() {
		inventoryadjust.click();
	}
	
	public void refrencenum(String na) {
	  		
		refrencenum.sendKeys(na);
		
	}
	public void dates() {
		dates.click();
	}
	public void monthdate() {
	while(true) {
	
	String w = datemonth.getText();
	 if(w.equals("October 2019")) {
		
		 break;
	 }    
	 next.click();
	}
	day.click();
  
	}
		
	public void uploadfile(String na) {
		uploadfile.sendKeys(na);
	}
	
	public void searchfn(String s) {
		search.sendKeys(s);
	}
	}
	
	

