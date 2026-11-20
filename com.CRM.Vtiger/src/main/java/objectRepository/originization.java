package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class originization {
	
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement plusicon;
	
	@FindBy(name = "accountname")
	private WebElement orgname;
	
	@FindBy(xpath = "//td[text()='Email ']/following-sibling::td/child::input")
	private WebElement mailaddress;
	
	@FindBy(name = "rating")
	private WebElement ratingaddress;
	
	@FindBy(name = "industry")
	private WebElement industrydrop;
	
	@FindBy(name = "accounttype")
	private WebElement typedrop;
	
	@FindBy(name = "bill_street")
	private WebElement billingaddress;
	
	@FindBy(name = "ship_street")
	private WebElement shippingaddress;
	
	@FindBy(name = "bill_city")
	private WebElement billingcity;
	
	@FindBy(name = "ship_city")
	private WebElement shippingcity;
	
	@FindBy(name = "bill_state")
	private WebElement billingstate;
	
	@FindBy(name = "ship_state")
	private WebElement shippingstate;
	
	@FindBy(name = "bill_country")
	private WebElement billingcountry;
	
	@FindBy(name = "ship_country")
	private WebElement shippingcountry;
	
	@FindBy(name = "description")
	private WebElement desc;
	
	@FindBy(name = "button")
	private WebElement savebutton;
	
	@FindBy(xpath ="//input[@title='Cancel [Alt+X]']")
	private WebElement canclebutton;
	
	
	
	//initilization
	public originization(WebDriver d) {
		PageFactory.initElements(d, this);
		
	}
	
	//utilization 

	public WebElement getPlusicon() {
		return plusicon;
	}

	public WebElement getOrgname() {
		return orgname;
	}

	public WebElement getMailaddress() {
		return mailaddress;
	}

	public WebElement getRatingaddress() {
		return ratingaddress;
	}

	public WebElement getIndustrydrop() {
		return industrydrop;
	}

	public WebElement getTypedrop() {
		return typedrop;
	}

	public WebElement getBillingaddress() {
		return billingaddress;
	}

	public WebElement getShippingaddress() {
		return shippingaddress;
	}

	public WebElement getBillingcity() {
		return billingcity;
	}

	public WebElement getShippingcity() {
		return shippingcity;
	}

	public WebElement getBillingstate() {
		return billingstate;
	}

	public WebElement getShippingstate() {
		return shippingstate;
	}

	public WebElement getBillingcountry() {
		return billingcountry;
	}

	public WebElement getShippingcountry() {
		return shippingcountry;
	}

	public WebElement getDesc() {
		return desc;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}

	public WebElement getCanclebutton() {
		return canclebutton;
	}
	
	
	

}
