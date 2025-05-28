package project;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class property {
	
	
	Properties p;
	
	public property() throws IOException {
		
 FileInputStream f=  new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\InventoryManageSystem\\src\\test\\resources\\config\\customer.properties");
 
   p =new Properties();
  p.load(f);
	}

	
	public String fname() {
	String na =	p.getProperty("fname");
	return na;
	}
	
	public String lname() {
	String la =	p.getProperty("lname");
	return la;
	}
	
	public String companyna() {
	String com =	p.getProperty("companyname");
	return com;
	}
	
	public String email() {
	String email =	p.getProperty("email");
	return email;
	}
	
	public String phone() {
	String ph =	p.getProperty("phone");
	return ph;
	}
	
	public String mob() {
	String mo=	p.getProperty("mobile");
	return mo;
	}
	public String pan() {
	String pa=	p.getProperty("pan");
	return pa;
	}
	
}
