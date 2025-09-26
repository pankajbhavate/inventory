package project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Inventoryupdatetestclass extends Baseclass {
	
	
	
	
	
	public Inventoryupdatetestclass() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(dataProvider = "k")
	public void inventoryupdate(String m, String k, String d, String dd) {
		
		Inventoryupdatepageclass p = new Inventoryupdatepageclass(driver);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		p.create();
		p.inventoryadjust();
		p.refrencenum(m);
        p.searchfn(m);
	//	p.dates();
	//	p.monthdate();
		p.uploadfile("C:\\Users\\DELL\\Documents\\pank.log");  //‪C:\Users\DELL\Documents\pank.log
	//	p.uploadfile(k);
	}

	
	@DataProvider(name = "k", indices = {0,2})
	public Object[][] tt() {
		Object o[][] = new Object[1][4];
		o[0][0] = "5000040";
		o[0][1] = "dkkd";
		o[0][2]= "aman";
		o[0][3] = "raj";       
		return o;
	}
	
	
}
