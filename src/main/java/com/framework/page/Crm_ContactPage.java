package com.framework.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.general.Base;

public class Crm_ContactPage extends Base{
	
	
	public Crm_ContactPage() {
	PageFactory.initElements(driver,this);
	}
	
	
	//xpath
	@FindBy(xpath = "//div[@id='main-nav']//a[3]//span[1]")
	WebElement contacts;
	
	@FindBy(xpath = "//button[text()[normalize-space()='New']]")
	WebElement New;
	
	//method
	
	public void Contact() {
		contacts.click();
		
	}


	public void ClickName() {
		New.click();
	}
}
