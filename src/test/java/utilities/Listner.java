package utilities;


import org.testng.ITestListener;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Listner implements ITestListener {
	

		
		
		   
	    private ExtentReports extent;
	    private ExtentTest test;
	    public  WebDriver driver;

	    @Override
	    public void onStart(ITestContext context) {
	        // Setting up Extent Report
	    	String name =     RandomStringUtils.randomAlphabetic(4);
	    	 String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.").format(new Date());
	        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("janam/"+name+" "+timestamp+".html");
	        htmlReporter.config().setDocumentTitle("Automation Report");
	        htmlReporter.config().setReportName("Test Execution Report");
	        htmlReporter.config().setTheme(Theme.STANDARD);
	         
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	        extent.setSystemInfo("Tester", "Pankaj Bhavate");
	        extent.setSystemInfo("os","window");
	        extent.setSystemInfo("date",timestamp );
	        extent.setSystemInfo("testing level", "functional");
	        extent.setSystemInfo("Type", "Automation");
	        driver = (WebDriver) context.getAttribute("WebDriver");
	    }

	    @Override
	    public void onTestStart(ITestResult result) {
	        test = extent.createTest(result.getName());
	        test.log(Status.INFO, "Test Started: " + result.getName());
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        test.log(Status.PASS, "Test Passed: " + result.getName());
	        Object testObject = result.getInstance();
	        driver = null;

	        try {
	           driver = (WebDriver) testObject.getClass().getField("driver").get(testObject);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	 
	        
	         screenshot s = new screenshot();
	  String screnns=      s.takeScreenshot(driver, result.getName());
	  
		    test.addScreenCaptureFromPath("file://"+screnns);}
	     

	    @Override
	    public void onTestFailure(ITestResult result) {
	        test.log(Status.FAIL, "Test Failed: " + result.getName());
	        test.log(Status.FAIL, result.getThrowable());
	        Object testObject = result.getInstance();
	        driver = null;

	        try {
	           driver = (WebDriver) testObject.getClass().getField("driver").get(testObject);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    if(driver!=null) {
	        
	            screenshot s = new screenshot();
	  String screnns=      s.takeScreenshot(driver, result.getName());

		    test.addScreenCaptureFromPath("file:///"+screnns);}}

		

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        test.log(Status.SKIP, "Test Skipped: " + result.getName());
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        extent.flush();
	    }
	}
	    // Method to Capture Screenshot



