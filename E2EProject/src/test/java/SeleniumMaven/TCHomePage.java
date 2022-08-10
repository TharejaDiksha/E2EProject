package SeleniumMaven;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import Resources.BaseClass;
import PageObjects.PO_HomePage; 

public class TCHomePage extends BaseClass {
	
	PO_HomePage hp;
	
	@Test(dataProvider="getData")
	public void homepage(String username,String Passwd,String ConPassd) throws IOException {
		hp = new PO_HomePage(driver);
		hp.Register();
		hp.username(username);
		hp.password(Passwd);
		hp.ConfPassword(ConPassd);

		hp.RegButton();
		hp.AlertMsg();
				
	}
	@DataProvider 
	public Object[][] getData() {
		Object[][] data = new Object[3][3];
		// 1st Data
		data[0][0]= "Mathew";
		data[0][1]= "Hello@1";
		data[0][2]= "hello@1";
		
		// 2nd Data
		data[1][0]="Sam";
		data[1][1]="Bye@12";
		data[1][2]="bye@12";
		
		//3rd Data
		data[2][0]="MandySam";
		data[2][1]="Hello@1234+";
		data[2][2]="Hello@1234+";
		
		return data;
	}
	

}
