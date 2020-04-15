package com.framework.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.framework.general.Base;
import com.framework.page.Crm_HomePage;
import com.framework.page.HomePage;
import com.framework.page.LoginPage;

public class LoginTest extends Base {
	
	LoginPage loginPage;
	HomePage homePage;

	
	public LoginTest() {
		super();
	}
	
	
	@BeforeMethod()
	public void setup()
	{
		initialization();
		loginPage = new LoginPage();
		
	}
	
	/*
	 * // @Test(priority=1) public void validateTitle() { String
	 * title=loginPage.ValidateLoginPageTitle();
	 * Assert.assertEquals(title,"Cogmento CRM and Business Cloud Solutions"); }
	 */
	//@Test(priority=1)
	public void login() throws InterruptedException 
	{
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		//homePage= loginPage.login("zargaranum@gmail.com", "Anum@1234");
		
		
	}
	
	//@Test(priority=2)
	public void loginincorrectpassword() throws InterruptedException 
	{
		 loginPage.loginincorrectpwd(prop.getProperty("username"), prop.getProperty("incorrectpwd"));
		 Assert.assertEquals("The email and password you entered don't match.", loginPage.IncorrectPasswordMessage());
		
		
	}
	
//	@Test(priority=3)
	public void forgottenpassword() throws Exception 
	{
		
		 loginPage.clickhere();
		
	}
	
	
	//@Test(priority=4)
	public void validatelogo() throws Exception 
	{
		
		boolean flag= loginPage.validateDatzsolutionLogo();
		Assert.assertTrue(flag);
		 
		
	}
	
	
	//@Test(priority=5)
		public void validatetitle() throws Exception 
		{
			
			String title = loginPage.ValidateLoginPageTitle();
			Assert.assertEquals(title, "Renanza Realty Inc");
			 
			
		}
//@AfterMethod()
	public void tearDown() {
		driver.quit();
	}
}
