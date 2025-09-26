package project;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class Homepageclass {

	public WebDriver driver;
	
	@FindBy(xpath = "//div[text()=\"51\"]")
	WebElement quantity;
	@FindBy(css = "[viewBox=\"0 0 32 32\"]")
	WebElement create;
    @FindBy(xpath = "//a[text()=\"Customer\"]")
    WebElement custom;
    @FindBy(css = "[placeholder=\"Salutation\"]")
    WebElement salution;
    
    @FindBy(xpath = "//div[text()=\"Mr.\"]")
    WebElement mr;
    
    @FindBy(css = "[placeholder=\"First Name\"]")
    WebElement fname;
    @FindBy(css = "[placeholder=\"Last Name\"]")
    WebElement lname;
    @FindBy(css = "[id=\"ember455\"]")
    WebElement company;
    @FindBy(xpath = "(//input[@type=\"text\"])[7]")
    WebElement email;
    @FindBy(css = "[placeholder=\"Work Phone\"]")
    WebElement workpho;
    @FindBy(css = "[placeholder=\"Mobile\"]")
    WebElement mob;
    @FindBy(xpath = "(//input[@type=\"text\"])[10]")
    WebElement panc;
	@FindBy(css = "[class=\"upload ember-view\"]")
	WebElement upload;
	@FindBy(xpath = "//div[text()=\"Address\"]")
	WebElement address;
	@FindBy(xpath = "//span[text()=\"Select\"]")
	WebElement select;
	@FindBy(xpath = "//li[contains(@class,\"dropdown-item ac-option\")]")    ////li[contains(@class,"dropdown-item ac-option  ")]
	List<WebElement > dropdown;
	@FindBy(css = "[id=\"ember479\"]")		
	WebElement attention;
	@FindBy(css = "[placeholder=\"Street 1\"]")
	WebElement street1;
	@FindBy(css = "[placeholder=\"Street 2\"]")
	WebElement street2;
  @FindBy(css = "[id=\"ember483\"]")
  WebElement city;
	@FindBy(css = "[id=\"ember487\"]")
	WebElement code;
	@FindBy(css = "[id=\"ember486\"]")
	WebElement state;
	@FindBy(xpath = "//div[@class=\"autocomplete-option\"]")
	List<WebElement > stat;
    @FindBy(css = "[type=\"submit\"]")
    WebElement save;
    @FindBy(xpath = "//a[text()=\"Item\"]")
    WebElement item;
    @FindBy(xpath = "//input[@id=\"ember568\"]")
    WebElement itemname;
    @FindBy(css = "[id=\"ember572\"]")
    WebElement unit;
    @FindBy(css = "[class=\"autocomplete-option\"]")
    List<WebElement> units;
    @FindBy(css = "[id=\"ember599\"]")
    WebElement costprice;
	@FindBy(css = "[id=\"ember602\"]")
	WebElement description;
	
	public Homepageclass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void quantity() throws InterruptedException {
		quantity.click();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	public void create() {
		create.click();
	}
	public void customer() {
		custom.click();
	}
	
	public void salu() throws InterruptedException {
		salution.click();
		Thread.sleep(2000);
		mr.click();
	}
	public void fname(String na) {
		fname.sendKeys(na);
	}
	public void lname(String lna) {
		lname.sendKeys(lna);
	}
	
	public void company(String cc) {
		company.sendKeys(cc);
	}
	
	public void emai(String ee) {
		email.sendKeys(ee);
	}
	public void phone(String ph) {
		workpho.sendKeys(ph);
	}
	
	public void mob(String mm) {
		mob.sendKeys(mm);
	}
	
	public void pan(String pa) {
		panc.sendKeys(pa);
	}
	
	public void upload(String m) {                //‪C:\Users\DELL\Documents\email.xlsx
		upload.sendKeys(m);
	
	}
	public void address() {
		address.click();
	}
	
	public void select() {
		select.click();
	}
	
	public void dropdown() {
		dropdown.get(4).click();
	}
	
	public void attention(String at) {
		attention.sendKeys(at);
	}
	
	public void street1(String s) {
		street1.sendKeys(s);
	}
	public void street2(String ss) {
		street2.sendKeys(ss);
	}
	
	public void city(String na) {
		city.sendKeys(na);
	}
	
	public void code(String nn) {
		code.sendKeys(nn);
	}
	public void states() {
		state.click();
		stat.get(2).click();
	}
	
	public void save() throws InterruptedException {
		save.click();
		Thread.sleep(2000);
		
	}
	
	public void item() {
		item.click();
	}
	
	public void item(String na) {
		itemname.sendKeys(na);
	}
	public void unit() {
		unit.click();
		units.get(5).click();
	}
	
	public void costprice(String d) {
		costprice.sendKeys(d);
	}
	
	public void description(String na) {
		description.sendKeys(na);
	}
	
	
	public WebElement quanele() {
	      return quantity;
	}
}













