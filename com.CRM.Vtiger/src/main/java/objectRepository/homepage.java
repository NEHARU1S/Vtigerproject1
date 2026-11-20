package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	 
	
	//deceleration 
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement profileelement;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutlink;
	
	@FindBy(xpath="//a[text()='Calendar']")
	private WebElement calanderlink;
	
	@FindBy(xpath = "//a[@href='index.php?module=Accounts&action=index']")
	private WebElement orglink;
	
	@FindBy(xpath = "//a[text()='Leads']")
	private WebElement leadslink;
	
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contactlink;
	
	@FindBy(xpath = "//a[text()='Opportunities']")
	private WebElement Opportunitiestlink;
	
	@FindBy(xpath = "//a[text()='Products']")
	private WebElement Productstlink;
	
	@FindBy(xpath = "//a[text()='Documents']")
	private WebElement Documentstlink;
	
	@FindBy(xpath = "//a[text()='Email']")
	private WebElement Emaillink;
	
	@FindBy(xpath = "//a[text()='Trouble Tickets']")
	private WebElement  Ticketslink;
	
	@FindBy(xpath = "//a[text()='Dashboard']")
	private WebElement  Dashboardlink;
	
	@FindBy(xpath = "//a[text()='More']")
	private WebElement  Morelink;
	
	@FindBy(id = "qccombo")
	private WebElement  Quicceatelink;
	
	
	
	
	
	
	
	
	
	public WebElement getOrglink() {
		return orglink;
	}

	public WebElement getProfileelement() {
		return profileelement;
	}

	public WebElement getSignoutlink() {
		return signoutlink;
	}

	public WebElement getCalanderlink() {
		return calanderlink;
	}

	public void setProfileelement(WebElement profileelement) {
		this.profileelement = profileelement;
	}

	public void setSignoutlink(WebElement signoutlink) {
		this.signoutlink = signoutlink;
	}

	public void setCalanderlink(WebElement calanderlink) {
		this.calanderlink = calanderlink;
	}

	
	
	
	
	//initilazation 
	public homepage(WebDriver d) {
	PageFactory.initElements(d, this);
	
	
	}
	
	
	//utilization
	
	public WebElement getprofileElement() {
		return profileelement;
	}
	
	public WebElement getQuicceatelink() {
		return Quicceatelink;
	}

	public WebElement getDashboardlink() {
		return Dashboardlink;
	}

	public WebElement getMorelink() {
		return Morelink;
	}

	public WebElement getLeadslink() {
		return leadslink;
	}

	public WebElement getContactlink() {
		return contactlink;
	}

	public WebElement getOpportunitiestlink() {
		return Opportunitiestlink;
	}

	public WebElement getProductstlink() {
		return Productstlink;
	}

	public WebElement getDocumentstlink() {
		return Documentstlink;
	}

	public WebElement getEmaillink() {
		return Emaillink;
	}

	public WebElement getTicketslink() {
		return Ticketslink;
	}

	public WebElement getsignoutElement() {
		return signoutlink;
	}
	
	//business logic 
	public void logout(WebDriver d) {
		homepage hp=new homepage(d);
		WebElement element = hp.getprofileElement();
		Actions a=new Actions(d);
		a.moveToElement(element).perform();
		hp.getsignoutElement().click();
	}
}
