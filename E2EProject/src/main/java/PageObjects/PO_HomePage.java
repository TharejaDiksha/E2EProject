package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.BaseClass;

public class PO_HomePage extends BaseClass{
	
 //public WebDriver driver;
 public  Actions a;
	
//    public PO_HomePage(WebDriver driver) {
//		this.driver= driver;
//		PageFactory.initElements(driver, this);
//	  // a = new Actions(driver);
//	}
	public WebDriver ldriver;  
	public PO_HomePage(WebDriver rdriver)

	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
		}
    

    
@FindBy(xpath= "//a[text()=' Register ']")
WebElement regBut;

@FindBy(xpath= "//input[@id='id_username']")
WebElement username;

@FindBy(xpath= "//input[@id='id_password1']")
WebElement password;

@FindBy(xpath= "//input[@id='id_password2']")
WebElement ConfPassd;

@FindBy(xpath= "//input[@value='Register']")
WebElement regButton;

@FindBy(xpath="//a[text()='Login ']")
WebElement loginbut;

@FindBy(xpath="//a[text()='Sign in']")
WebElement signInBut;

@FindBy(xpath="//div[@class='alert alert-primary']")
WebElement alertMsg;

public void Register() {
	regBut.click();
}
public void username(String Uname) {
	username.sendKeys(Uname);;
}
public void password(String passd) {
	password.sendKeys(passd);
	}
public void ConfPassword(String passd) {
	ConfPassd.sendKeys(passd);;
}
public void Login() {
//	a.moveToElement(loginbut).click().build().perform();
}
public void SignIn() {
	//a.moveToElement(signInBut).click().build().perform();
}
public void AlertMsg() {
	alertMsg.getText();
	System.out.println("Alert Message: "+alertMsg.getText());
}
public void RegButton() {
	regButton.click();
	System.out.println("Reg Button clicked");
}

}
