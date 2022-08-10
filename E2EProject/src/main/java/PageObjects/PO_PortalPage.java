package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.BaseClass;

public class PO_PortalPage extends BaseClass {
//	 public WebDriver driver;
//	 
//	public PO_PortalPage(WebDriver driver) {
//		this.driver= driver;
//		PageFactory.initElements(driver, this);
//	}
	
	public WebDriver ldriver;


	public PO_PortalPage(WebDriver rdriver)

	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
		}

	@FindBy(xpath="//button[text()='Get Started']")
	WebElement getStartedBut;
	
	
	public void GetStartedBut() {
		getStartedBut.click();
		
	}
}
