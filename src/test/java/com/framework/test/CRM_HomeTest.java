package com.framework.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.framework.general.Base;
import com.framework.page.Crm_AcctSettingPage;
import com.framework.page.Crm_HomePage;
import com.framework.page.LoginPage;

public class CRM_HomeTest extends Base
{
	Crm_HomePage homePage;
	LoginPage loginPage;
	Crm_AcctSettingPage ASP;
	
	public CRM_HomeTest() {
		super();
	}
	

	//@BeforeMethod()
	public void setup1() throws InterruptedException
	{
		//setup("Chrome");
		loginPage= new LoginPage();
		//homePage= loginPage.login("zargaranum@gmail.com", "Anum@1234");
		
		
	}
	
	//@Test
	public void account() {
		ASP = homePage.free();
	}
	
	//@Test
	public void VerifyTitle() {
		Assert.assertTrue(homePage.usernameDisplayed());
	}
	
//	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}
}
