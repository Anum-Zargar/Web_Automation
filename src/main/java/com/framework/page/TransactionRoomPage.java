package com.framework.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.framework.page.HomePage;
import com.framework.general.Base;
import com.framework.general.WaitLib;
import com.framework.util.TestUtil;

public class TransactionRoomPage extends Base{

	TestUtil testUtil = new TestUtil();
	WaitLib waitLib= new WaitLib();
	

	public TransactionRoomPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='submit']")
	WebElement viewrealtor;
	
	
	
	@FindBy(xpath = "//span[contains(text(),'View Transaction Room')]")
	WebElement viewtransactionroom;
	
	@FindBy(xpath ="//div[@class='page-content']//div[1]//div[1]//div[1]//div[2]//a[2]\r\n")
	WebElement AddReferal;
	
	@FindBy(xpath ="//select[@id='client_id']")
	WebElement selectclient12;
	
	
	@FindBy(xpath ="//button[@class='btn btn-primary']")
	WebElement submitbtn;
	
	@FindBy(xpath="//i[@class='fa fa-chevron-left glyphicon glyphicon-chevron-left']")
	WebElement leftArrow;
	
	
	@FindBy(xpath="//input[@id='referralExpiryDate']")
	WebElement date;
	
	@FindBy(xpath="//input[@id='referral_agreement']")
	 WebElement referaldoc;
	
	@FindBy(xpath="//input[@id='closing_letter_from_lawyer_notary']")
	 WebElement remunerationdoc;
	
	@FindBy(xpath= "//select[@name='r']")
	WebElement realtorName;
	
	String Path_File="C://Users//Anum Zargar//Desktop//Notes_Sel.txt";
	
	
	public RefPage TransactionRoom() throws Exception {
		testUtil.clickElement(viewtransactionroom, "View transaction Room");
		Thread.sleep(3000);
		// waitLib.explicitWait(driver, 20, viewtransactionroom);
		testUtil.SelectDropDown(realtorName, "Anum Zargar");
		testUtil.clickElement(viewrealtor, "View Realtor");
		testUtil.clickElement(AddReferal, "Add a Referal");
		Select s1 = new Select (driver.findElement(By.id("client_id")));
		s1.selectByIndex(4);
		driver.switchTo().activeElement();
        testUtil.clickElement(submitbtn, "Submit button");
         Thread.sleep(3000);
         return new RefPage();
		}
	
	public  void SelectDate(WebDriver driver,WebElement element, String dateVal) throws Exception {
		//String date1 = "20-September-2021";
		//String dateArray[]= date1.split("-");
		//String day=dateArray[0];
		//String month=dateArray[1];
		//String year=dateArray[2];
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
		//WaitLib.implicitWaitforMinutes(driver, 5);
		//Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("scroll(0,600)"); 
		Thread.sleep(5000);
		testUtil.enterText(referaldoc, Path_File, "File Uploaded referal");
		//referaldoc.sendKeys("C://Users//Anum Zargar//Desktop//Notes_Sel.txt");
		//Thread.sleep(6000);
		testUtil.enterText(remunerationdoc, Path_File, "File Uploaded remuneration");
		//remuneration.sendKeys("C://Users//Anum Zargar//Desktop//Notes_Sel.txt");
		//WaitLib.explicitWait(driver, 40, remunerationdoc);
		Thread.sleep(5000);
	}
}