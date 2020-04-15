package com.framework.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.framework.general.Base;
import com.framework.page.DashBoardPage;
import com.framework.page.HomePage;
import com.framework.page.LoginPage;
import com.framework.util.TestUtil;

public class DashBoardTest extends Base {

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	DashBoardPage dashBoardPage;
	
	public DashBoardTest() 
	{
			super();
			
	}
		
	
	
	@BeforeMethod()
	public void setup() throws InterruptedException
	{
		initialization();
		loginPage=new LoginPage();
		homePage =new HomePage();
		testUtil = new TestUtil();
		dashBoardPage = new DashBoardPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority = 1)
	public void scroll()
	{
		try {
			dashBoardPage.ScrollDown();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@Test(priority = 2)
	public void clickonBrokerDashboard()
	{
		try {
			dashBoardPage.ScrollDownDashboard();
			dashBoardPage.clickonDashboard();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@AfterMethod()
		public void tearDown(){
			driver.quit();
		}
		
		

}
