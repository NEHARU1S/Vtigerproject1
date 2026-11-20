package com.CRM.Vtiger.Genericlibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class listnerimplementation  extends baseclass implements ITestListener{
	ExtentReports report;
	ExtentTest test;
	javautility j=new javautility();
	@Override
	public void onTestStart(ITestResult result) {
		String testname = result.getName();
		test=report.createTest(testname);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String namesuccess = result.getName();
		test.log(Status.PASS,namesuccess+"test script pass"  );
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		String name = result.getName();
		TakesScreenshot t=(TakesScreenshot)d;
		File src = t.getScreenshotAs(OutputType.FILE);
		
		 j=new javautility();
		String dateandtimestamp = j.getdateandtime("dd-MM-yyyy hh-mm-ss");
		
		
	   File dest = new File("./screenshots/"+name+dateandtimestamp+".png");
	   try {
		Files.copy(src, dest);
		
		test.addScreenCaptureFromPath(dest.getAbsolutePath(),name+"failure screenshot");
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   test.log(Status.PASS,name+"test script fail"  );
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name	=result.getName();
		test.log(Status.SKIP, "test script skip");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		String datetime = j.getdateandtime("dd-MM-yy hh-mm-ss");
		ExtentSparkReporter rp=new ExtentSparkReporter("./ExtentReport/report"+datetime+".html");
		
		rp.config().setDocumentTitle("vtigerorginization");
		rp.config().setReportName("execution detials");
		rp.config().setTheme(Theme.DARK);
		report=new ExtentReports();
		report.attachReporter(rp);
		
		report.setSystemInfo(" url ", "http://localhost:8888/");
		report.setSystemInfo("OS", "windos");
		report.setSystemInfo("browser", "edge");
		report.setSystemInfo("testenginer", "gowda");
	}

	@Override
	public void onFinish(ITestContext context) {
	
		report.flush();
	}
	

}
