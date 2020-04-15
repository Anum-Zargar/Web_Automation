package com.framework.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.general.Base;

public class Crm_HomePage extends Base{
	
	public Crm_HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	//Finding xpath
	@FindBy(xpath ="//span[@class='trial-indicator']//a")
	WebElement Freeaccount;
	
	
	
	@FindBy(xpath="//span[@class='user-display']")
	WebElement username;
	
	
	
	//method
	public Crm_AcctSettingPage free() {
		Freeaccount.click();
		return new Crm_AcctSettingPage();
	}
	
	
	
	
	public boolean usernameDisplayed() 
	{
		return username.isDisplayed();
	}
}
