package project;

import static org.testng.Assert.assertEquals;



import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import utilities.excel;
import utilities.screensho2;

public class Hometestclass extends Baseclass {
	
	
	Homepageclass h;
	public Hometestclass() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
    
	@Test(priority = 0)
	public void customer() throws InterruptedException, IOException {
		 h = new Homepageclass(driver);
       driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
   	WebElement el =	h.quanele();
	screensho2 s = new screensho2();
	  s.screen(el);
		h.quantity();
		h.create();
		h.customer(); 
		h.salu();
		h.fname(fname);
		h.lname(lname);
		h.company(company);
		h.emai(email);
		h.phone(phone);             //‪C:\Users\DELL\Documents\email.xlsx
		h.mob(mobile);
		h.pan(pan);
		h.upload("C:\\Users\\DELL\\Documents\\email.xlsx");
	String url =	driver.getCurrentUrl();
	System.out.println(url);        
	assertEquals(url, "https://www.zoho.com/in/inventory/inventory-software-demo/#/home/inventory-dashboard");}
	
	@Test(dataProvider = "data",priority = 1)
	public void address(String att, String stret1,String stret2,String city, String cod) throws InterruptedException {
		h =new Homepageclass(driver);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
	   h.address();
	   h.select();
	   h.dropdown();
	   h.attention(att);
	   h.street1(stret1);
	   h.street2(stret2);
	   h.city(city);
	   h.code(cod);
	   h.states();
	   h.save();
	   
	   
	}
	
	@Test(dataProvider = "da",priority = 2)
	public void item(String na, String co, String f) {
	  h = new Homepageclass(driver);
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  h.create();
	  h.item();
	  h.item(na);
	  h.unit();
	  h.costprice(co);
	  h.description(f);
	}
	
    @DataProvider(name = "data")
	public String[][] data() throws IOException {
		 //‪C:\Users\DELL\Documents\pan.xlsx
		excel e = new excel("C:\\Users\\DELL\\Documents\\dd.xlsx");
	int row =	e.getrowcount("Sheet1");
	                        // ‪C:\Users\DELL\Documents\dd.xlsx
	  int col =          e.cellcount("Sheet1", 1);      
	  String ob [][] = new String[row][col];
	  for(int r=1;r<=row;r++) {
		  for(int j=0;j<col;j++) {
		ob[r-1][j]=	      e.getceldata("Sheet1", r,j);
		  
		  }}     
		return ob;	  
	}
 
    
    @DataProvider(name = "da")
    public String[][] te() throws IOException {
    	excel e = new excel("C:\\Users\\DELL\\Documents\\pa.xlsx");
    	int row =	e.getrowcount("Sheet1");
    	                        // ‪C:\Users\DELL\Documents\dd.xlsx
    	  int col =          e.cellcount("Sheet1", 1);      
    	  String ob [][] = new String[row][col];
    	  for(int r=1;r<=row;r++) {
    		  for(int j=0;j<col;j++) {
    		ob[r-1][j]=	      e.getceldata("Sheet1", r,j);
    		  
    		  }}     
    		return ob;	  
    	          
                           
    }
} 
