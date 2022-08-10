package SeleniumMaven;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.PO_PortalPage;
import Resources.BaseClass;



public class TCPortalPage extends BaseClass{
	
	PO_PortalPage pp;
	
	@Test
	public void PortalPage() throws IOException {
		driver.get("https://dsportalapp.herokuapp.com/");
		pp = new PO_PortalPage(driver);
		pp.GetStartedBut();
	System.out.println("Navigated to Home Page2");	
	}
	
	

}
