package com.framework.test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.framework.util.TestUtil;
import com.framework.general.Base;
import com.framework.page.Crm_HomePage;
import com.framework.page.HomePage;
import com.framework.page.LoginPage;

public class HomePageTest extends Base{
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	String sheetName = "client details";

	
     public HomePageTest() {
		super();
	} 
	
	
//	@BeforeMethod()
	public void setup() throws InterruptedException
	{
		initialization();
		loginPage=new LoginPage();
		homePage =new HomePage();
		testUtil = new TestUtil();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	//@DataProvider//Testing for excel data
	public Object[][] getClientTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	//@Test(priority=1 , dataProvider="getCRMTestData")
	public void login(String fname,String ltname,String phno,WebElement address,WebElement city,WebElement province,WebElement pcode) throws Exception 
	{
		
		//homePage= loginPage.login("zargaranum@gmail.com", "Anum@1234");
		homePage.selectrealtorname();
		homePage.AddClient(fname, ltname, phno, address, city, province, pcode);
	
		
	}
	
//	@Test(priority=1)
	public void login() throws Exception 
	{
		
		//homePage= loginPage.login("zargaranum@gmail.com", "Anum@1234");
		homePage.selectrealtorname();
		
		
	}
//	@Test(priority=2)
	
	public void verifyTitleHomePage()
	{
		String homePagetitle =homePage.verifyHomePageTitle();
	   Assert.assertEquals(homePagetitle, "Broker Dashboard","Home page title not matched");
	}
	
	//@Test(priority=3)
	public void verifyUserNameTest(){
		//testUtil.switchToFrame();
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}
	
	//@Test(priority=4)
	public void scroll() throws InterruptedException {
		homePage.scrollPageDown();
	}
	
	//@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	

	
}
