package com.CRM.Vtiger.Genericlibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class seleniumutility {
	
	public void maxmizewindow(WebDriver d) {
		d.manage().window().maximize();
	}
	
	public void impicitwait(WebDriver d) {
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void navigateapplication(WebDriver d,String url) {
		d.get(url);
		
	}
	
	public void closebrowser(WebDriver d) {
		d.quit();
	}
	
	public void selectoptionfromdropdownContainsVisibleText(WebElement address,String text) {
		Select s=new Select(address);
		s.selectByContainsVisibleText(text);	
	}
	
	public void selectselectoptionfromdropdownvisibletext(WebElement address1,String text2) {
		Select s=new Select(address1);
		s.selectByVisibleText(text2);
		
	}
	
	public void selectselectoptionfromdropdowntValue(WebElement address2,String text1) { 
		Select s=new Select(address2);
		s.selectByValue(text1);
	}
	
	public void selectselectoptionfromdropdowntIndex(WebElement address3,int number) {
		Select s=new Select(address3);
		s.selectByIndex(number);
	}
}
