package com.framework.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.framework.general.Base;
import com.framework.general.WaitLib;
import com.framework.util.TestUtil;

public class HomePage extends Base {
	
		
		TestUtil testUtil = new TestUtil();
		WaitLib waitLib=new WaitLib();
		
		

		public HomePage()
		{
			PageFactory.initElements(driver, this);
		}
	
	
		@FindBy(xpath ="//select[@name='r']")
		 WebElement realtorname;
		
		@FindBy (xpath = "//a[@class='navbar-brand']//span")
			WebElement nameonpage;
		
		@FindBy(xpath = "//input[@name='submit']")
		WebElement viewrealtor;
		
		
		
		@FindBy(xpath = "//span[contains(text(),'View Transaction Room')]")
		WebElement viewtransactionroom;
		
		

		@FindBy(xpath = "//a[contains(text(),'Add Client')]")
		WebElement addClient;
		

		@FindBy(xpath = "//input[@id='firstname']")
		WebElement firstname;
		

		@FindBy(xpath = "//input[@id='lastname']")
		WebElement lastname;
		
		@FindBy(xpath = "//input[@id='phone_home']")
		WebElement phoneNumber;

		@FindBy(xpath = "//input[@id='address']")
		WebElement address;
		
		
		@FindBy(xpath = "//input[@id='city']")
		WebElement city;
		
		@FindBy(xpath = "//input[@id='province']")
		WebElement province;
		
		@FindBy(xpath = "//input[@id='pcode']")
		WebElement pcode;
		
		@FindBy(xpath = "//input[@id='email_welcome']")
		WebElement welcomemail;
		
		
		@FindBy(xpath = "//input[@id='add']")
		WebElement save;
		
		@FindBy(xpath ="//div[@class='note note-success']")
		WebElement clientaddedmessage;
		
		
		
		public String verifyHomePageTitle()
		{
			return driver.getTitle();
		}
		
		
		public boolean verifyCorrectUserName()
		{
			return nameonpage.isDisplayed();
		}
		
		public void selectrealtorname() throws Exception {
		Select s = new Select (driver.findElement(By.xpath("//select[@name='r']")));
		s.selectByValue("21");
		testUtil.clickElement(viewrealtor, "View Realtor");
		testUtil.clickElement(viewtransactionroom, "View transaction Room");
		testUtil.clickElement(addClient, "Add a Client");
		testUtil.enterText(firstname, "Anum", "Enter Firstname");
		testUtil.enterText(lastname, "Zargar","Enter a lastname");
		testUtil.enterText(phoneNumber, "12344","Enter a phonenumber");
		testUtil.enterText(address, "Ytrre","Enter address");
		testUtil.enterText(city, "Assee" ,"Enter city");
		testUtil.enterText(province,"ON", "ENter Provimce s");
		testUtil.enterText(pcode,"LioPPP" ,"Enter pcode");
		testUtil.clickElement(welcomemail, "Welcome Email");
		testUtil.clickElement(save, "Save a Client");
		
		
		}
		
		public void AddClient(String fname,String ltname,String phno,WebElement address,WebElement city,WebElement province,WebElement pcode) throws Exception
		{
			testUtil.enterText(firstname, "fname", "Enter Firstname");
			testUtil.enterText(lastname, "ltname","Enter a lastname");
			testUtil.enterText(phoneNumber, "phno","Enter a phonenumber");
			testUtil.enterText(address, "address","Enter address");
			testUtil.enterText(city, "city" ,"Enter city");
			testUtil.enterText(province,"province", "ENter Provimce s");
			testUtil.enterText(pcode,"pcode" ,"Enter pcode");
			testUtil.clickElement(welcomemail, "Welcome Email");
			testUtil.clickElement(save, "Save a Client");
		}
		
		public void scrollPageDown() throws InterruptedException 
		{  
			
			 ((JavascriptExecutor)driver).executeScript("scroll(0,600)"); 
			 Thread.sleep(5000);
			 
		}
		
		
}