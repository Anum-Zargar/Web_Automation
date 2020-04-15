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

public class DashBoardPage extends Base{
	
	
	TestUtil testUtil = new TestUtil();
	WaitLib waitLib= new WaitLib();
	

	public DashBoardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='submit']")
	WebElement viewrealtor;
	
	
	@FindBy(xpath="//div[@class='panel-heading']//a[@class='pull-right btn btn-sm btn-default']//span")
	WebElement element;
	
	
	@FindBy(xpath="//div[@id='newListingModal']//button[@class='btn btn-default']")
	WebElement close;
	
	
	@FindBy(xpath = " //li[@class='start']//span[@class='title']")
	WebElement dashBoard;
	
	@FindBy(xpath= "//a[@class='btn btn-info btn-block']")
	WebElement brokerdashboard;
	
	@FindBy(xpath= "//select[@name='r']")
	WebElement realtorName;
	
	public void ScrollDown() throws Exception {
		testUtil.clickElement(dashBoard, " Click on DashBoardPage ");
		/*
		 * Select s = new Select (driver.findElement(By.xpath("//select[@name='r']")));
		 * s.selectByValue("19");
		 */
		testUtil.SelectDropDown(realtorName, "Anum Zargar");
		testUtil.clickElement(viewrealtor, "View Realtor");
		 //JavascriptExecutor js = (JavascriptExecutor) driver;
         //js.executeScript("arguments[0].scrollIntoView();", element);
        // System.out.println(element.getText());
		 ((JavascriptExecutor)driver).executeScript("scroll(0,600)"); 
		 testUtil.clickElement(element, "Click on View Full List");
		 waitLib.explicitWait(driver, 20, element);
         testUtil.clickElement(close, "Close Message");
         //waitLib.explicitWait(driver, 20, close);
	}
	
	public void ScrollDownDashboard() throws Exception {
		testUtil.clickElement(dashBoard, " Click on DashBoardPage ");
		testUtil.SelectDropDown(realtorName, "Anum Zargar");
		testUtil.clickElement(viewrealtor, "View Realtor");
		 waitLib.explicitWait(driver, 200, viewrealtor);
	}
	
	
	public void clickonDashboard() throws Exception {
		testUtil.clickElement(brokerdashboard, "View dashboard");
		Thread.sleep(3000);
	}

}
