package com.framework.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.framework.general.Base;
import com.framework.general.WaitLib;
import com.framework.page.DashBoardPage;
import com.framework.page.HomePage;
import com.framework.page.LoginPage;
import com.framework.page.RefPage;
import com.framework.page.TransactionRoomPage;
import com.framework.util.TestUtil;

public class TransactionRoomTest extends Base {
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	TransactionRoomPage transactionRoomPage;
	RefPage  refPage;
	
	public TransactionRoomTest() 
	{
			super();
			
	}
		
	
	
	//@BeforeMethod()
	public void setup() throws InterruptedException
	{
		initialization();
		loginPage=new LoginPage();
		homePage =new HomePage();
		testUtil = new TestUtil();
		transactionRoomPage=new TransactionRoomPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	//@Test(priority=1)
	public void AddReferal() throws Exception {
		refPage= transactionRoomPage.TransactionRoom();
		
		
	}
	//@Test(priority=2)
	public void SelectDatebyJs() throws Exception {
		refPage= transactionRoomPage.TransactionRoom();
		String dateVal="28-10-2021";
		WebElement date =driver.findElement(By.xpath("//input[@id='referralExpiryDate']"));
		transactionRoomPage.SelectDate(driver, date, dateVal);
		
	}
	
	
//	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}
}
