package project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class invoicetestclass extends Baseclass{
	
	Invoicespageclass p;
	public invoicetestclass() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(priority = 1)
	public void invoice() {
		  p = new Invoicespageclass(driver);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		p.create();
		p.invoice();
		p.customer();
		p.order("449");
	//	p.saleperson(); 
	//	p.shipcharge("44");
		
	}
	
	@Test (priority = 0)
	public void  report() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		p = new Invoicespageclass(driver);
		 p.report();
		 Thread.sleep(2000);
		 p.salebycustom();
		 p.calendar();
		 p.month();
		 p.year();
		 p.day();
		 Thread.sleep(2000);
	}

}
