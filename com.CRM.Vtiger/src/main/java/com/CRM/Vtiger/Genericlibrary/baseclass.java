package com.CRM.Vtiger.Genericlibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import javax.print.attribute.standard.Fidelity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.module.Browser;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import objectRepository.homepage;
import objectRepository.loginpage;



public class baseclass {
	public static WebDriver d;
	seleniumutility sutil=new seleniumutility();
	fileutility f=new fileutility();

	@BeforeSuite
	public void connectodatabase() {
		Reporter.log("database is connected succefully", true);
		
	}
	
	@Parameters("browser")
	
	@BeforeTest
	public void launchbrower( String Browser) throws IOException {
//		 d=new ChromeDriver();
		if (Browser.equals("chrome")) {
			d=new ChromeDriver();
			
		}  else if (Browser.equals("firefox")) {
			d=new FirefoxDriver();
			
		} else if (Browser.equals("edge")) {
			d=new EdgeDriver();
			
		}  else {
			d=new ChromeDriver();
		}
	
		 
		sutil.maxmizewindow(d);
		sutil.impicitwait(d);
		String URL = f.readdatafromproperty("url");
		sutil.navigateapplication(d, URL);
		Reporter.log("launch browser and navigate to vtiger", true);
		
	}
	
	@BeforeMethod
	public void logintovtiger() throws IOException {
		loginpage lp=new loginpage(d);
		String un = f.readdatafromproperty("username");
		 String pw = f.readdatafromproperty("password");
//		 lp.getusertbx().sendKeys(un);
//		 lp.getpwdtbx().sendKeys(pw);
//		 lp.getlgbt().click();
		 
		 lp.logintovtiger(d, un, pw);
		Reporter.log("logged in succesfully", true);
		
	}
	
	@AfterMethod
	public void logoutfromvtiger() {
//		WebElement address = d.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
//		Actions a=new Actions(d);
//		a.moveToElement(address).perform();
//		d.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
		homepage hp=new homepage(d);
		hp.logout(d);
		Reporter.log("loggout from vtiger", true);
			
	}
	
	@AfterTest
	public void closerbrowser() {
		d.quit();
		Reporter.log("browser closed succesfully ", true);
		
	}
	
	@AfterSuite
	public void disconnectfromdatabase() {
		Reporter.log("disconnect from database", true);
		
	}

}
