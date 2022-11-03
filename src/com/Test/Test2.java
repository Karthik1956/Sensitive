package com.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.oops.inheritance.OHRM.AdminPage;
import com.oops.inheritance.OHRM.CommonProperties;
import com.oops.inheritance.OHRM.LoginPage;
import com.oops.inheritance.OHRM.PIMPage;
import com.oops.inheritance.OHRM.TestBase;

public class Test2 extends TestBase{
	
	Test2() {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void setUp() {
		openBrowser();
	}
	@AfterMethod
	public void close() {
		closeBrowser();
		//close browser
		
	}
	 
	@Test
	private void HappyPath() {
		
		
		
		LoginPage LP= new LoginPage();
		//enter login data
		LP.enterUsername("KicK");
		LP.enterPassword();
		LP.clickLogin();
		
		//verify PIM page
		PIMPage PP=new PIMPage();
		PP.Label();
		
		//verify Admin page
		AdminPage AP=new AdminPage();
		AP.label();
		//Logout
		CommonProperties CP=new CommonProperties();
		CP.clickProfile();
		CP.clickLogout();
		
	}
	
	@Test
	private void scenario2() {
		//enter invalid data 
				LoginPage LP= new LoginPage();
				//enter login data
				LP.enterUsername("NOPE l");
				LP.enterPassword();
				LP.clickLogin();
				
				
				///verify error message
		
	}

}
