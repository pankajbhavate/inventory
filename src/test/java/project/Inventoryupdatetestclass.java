package project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class Inventoryupdatetestclass extends Baseclass {
	
	
	
	
	
	public Inventoryupdatetestclass() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void inventoryupdate() {
		
		Inventoryupdatepageclass p = new Inventoryupdatepageclass(driver);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		p.create();
		p.inventoryadjust();
		p.refrencenum("rd22234");

		p.dates();
		p.monthdate();
		p.uploadfile("C:\\Users\\DELL\\Documents\\pank.log");  //‪C:\Users\DELL\Documents\pank.log
	}

}
