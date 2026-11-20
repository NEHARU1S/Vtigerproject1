package com.CRM.Vtiger.orgisationtests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.CRM.Vtiger.Genericlibrary.baseclass;
import com.CRM.Vtiger.Genericlibrary.fileutility;
import com.CRM.Vtiger.Genericlibrary.listnerimplementation;
import com.CRM.Vtiger.Genericlibrary.seleniumutility;

import objectRepository.homepage;
import objectRepository.originization;

@Listeners(listnerimplementation.class)
public class delete extends baseclass {
	@Test
	public void clickorg() throws EncryptedDocumentException, IOException {
		homepage hp=new homepage(d);
		hp.getOrglink().click();
		
		originization op=new originization(d);
		op.getPlusicon().click();
		
		
		fileutility f=new fileutility();
		String name = f.readdatafromexcelstring("OriginizationSheet", 2, 1);
		op.getOrgname().sendKeys(name);
		
		String name1 = f.readdatafromexcelstring("OriginizationSheet", 2, 2);
		op.getMailaddress().sendKeys(name1);
		
		
//		  WebElement address = op.getRatingaddress();
//		
//		Select s=new Select(address);
//		s.selectByIndex(1);
//		
//	 WebElement Iaddress = op.getIndustrydrop();
//	 Select s1=new Select(Iaddress);
//		s1.selectByIndex(1);
//		
//		WebElement Taddress = op.getTypedrop();
//		Select s2=new Select(Taddress);
//		s2.selectByIndex(1);
		
		WebElement address = op.getRatingaddress();
		seleniumutility s=new seleniumutility();
		s.selectoptionfromdropdownContainsVisibleText(address, "Active");
		
		
		WebElement Iaddress = op.getIndustrydrop();
		s.selectoptionfromdropdownContainsVisibleText(Iaddress, "Education");
		
		
		WebElement Taddress = op.getTypedrop();
		s.selectoptionfromdropdownContainsVisibleText(Taddress, "Customer");
		
		
		String billingaddress = f.readdatafromexcelstring("OriginizationSheet", 2, 3);
	    op.getBillingaddress().sendKeys(billingaddress);
	    
	    String shippingaddress = f.readdatafromexcelstring("OriginizationSheet", 2, 4);
	    op.getShippingaddress().sendKeys(shippingaddress);
	    
	    
	    String billingcity = f.readdatafromexcelstring("OriginizationSheet", 2, 5);
	    op.getBillingcity().sendKeys(billingcity);
	    
	    String shippingcity = f.readdatafromexcelstring("OriginizationSheet", 2, 6);
	    op.getShippingcity().sendKeys(shippingcity);
	    
	    
	    String billingstate = f.readdatafromexcelstring("OriginizationSheet", 2, 7);
	    op.getBillingstate().sendKeys(billingstate);
	    
	    String shippingstate = f.readdatafromexcelstring("OriginizationSheet", 2, 8);
	    op.getShippingstate().sendKeys(shippingstate);
	    
	    
	    String billingcountry = f.readdatafromexcelstring("OriginizationSheet", 2, 9);
	    op.getBillingcountry().sendKeys(billingcountry);
	    
	    String shippingcountry = f.readdatafromexcelstring("OriginizationSheet", 2, 10);
	    op.getShippingcountry().sendKeys(shippingcountry);
	    
	    
	    
	    String desc = f.readdatafromexcelstring("OriginizationSheet", 2, 11);
	    op.getDesc().sendKeys(desc);
	    
	    op.getCanclebutton().click();
//	    op.getSavebutton().click();
	    
	    
	    
	    
	    
	    
	    
	}
	

	@Test
	public void clickorg1() throws EncryptedDocumentException, IOException {
		homepage hp=new homepage(d);
		hp.getOrglink().click();
		
		originization op=new originization(d);
		op.getPlusicon().click();
		
		
		fileutility f=new fileutility();
		String name = f.readdatafromexcelstring("OriginizationSheet", 2, 1);
		op.getOrgname().sendKeys(name);
		
		String name1 = f.readdatafromexcelstring("OriginizationSheet", 2, 2);
		op.getMailaddress().sendKeys(name1);
		
		
//		  WebElement address = op.getRatingaddress();
//		
//		Select s=new Select(address);
//		s.selectByIndex(1);
//		
//	 WebElement Iaddress = op.getIndustrydrop();
//	 Select s1=new Select(Iaddress);
//		s1.selectByIndex(1);
//		
//		WebElement Taddress = op.getTypedrop();
//		Select s2=new Select(Taddress);
//		s2.selectByIndex(1);
		
		WebElement address = op.getRatingaddress();
		seleniumutility s=new seleniumutility();
		s.selectoptionfromdropdownContainsVisibleText(address, "Active");
		
		
		WebElement Iaddress = op.getIndustrydrop();
		s.selectoptionfromdropdownContainsVisibleText(Iaddress, "Education");
		
		
		WebElement Taddress = op.getTypedrop();
		s.selectoptionfromdropdownContainsVisibleText(Taddress, "Customer");
		
		
		String billingaddress = f.readdatafromexcelstring("OriginizationSheet", 2, 3);
	    op.getBillingaddress().sendKeys(billingaddress);
	    
	    String shippingaddress = f.readdatafromexcelstring("OriginizationSheet", 2, 4);
	    op.getShippingaddress().sendKeys(shippingaddress);
	    
	    
	    String billingcity = f.readdatafromexcelstring("OriginizationSheet", 2, 5);
	    op.getBillingcity().sendKeys(billingcity);
	    
	    String shippingcity = f.readdatafromexcelstring("OriginizationSheet", 2, 6);
	    op.getShippingcity().sendKeys(shippingcity);
	    
	    
	    String billingstate = f.readdatafromexcelstring("OriginizationSheet", 2, 7);
	    op.getBillingstate().sendKeys(billingstate);
	    
	    String shippingstate = f.readdatafromexcelstring("OriginizationSheet", 2, 8);
	    op.getShippingstate().sendKeys(shippingstate);
	    
	    
	    String billingcountry = f.readdatafromexcelstring("OriginizationSheet", 2, 9);
	    op.getBillingcountry().sendKeys(billingcountry);
	    
	    String shippingcountry = f.readdatafromexcelstring("OriginizationSheet", 2, 10);
	    op.getShippingcountry().sendKeys(shippingcountry);
	    
	    
	    
	    String desc = f.readdatafromexcelstring("OriginizationSheet", 2, 11);
	    op.getDesc().sendKeys(desc);
	    
	    op.getCanclebutton().click();
//	    op.getSavebutton().click();
	    
	    
}

}
