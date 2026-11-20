package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	//deceleration
	@FindBy(name="user_name")
	private WebElement usertbx;
	
	@FindBy(name="user_password")
	private WebElement pwdtbx;
	
	@FindBy(id= "submitButton")
	private WebElement lgbt;
	
	
	//initilizatation 
	public loginpage(WebDriver d) {
	PageFactory.initElements(d, this);
	

}
	
	//utilization 
	public WebElement getusertbx() {
		return usertbx;
	}
	
	public WebElement getpwdtbx() {
		return pwdtbx;
		
	}
	
	public WebElement getlgbt() {
		return lgbt;
	}
	
	
	//business logic
	public void logintovtiger(WebDriver d,String un,String pw) {
		loginpage lp=new loginpage(d);
		lp.getusertbx().sendKeys(un);
		lp.getpwdtbx().sendKeys(pw);
		lp.getlgbt().click();
		
	}
}
