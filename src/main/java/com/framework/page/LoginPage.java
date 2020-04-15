package com.framework.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.general.Base;
import com.framework.util.TestUtil;

public class LoginPage extends Base {
	
	TestUtil testUtil = new TestUtil();
	
	
	//Page Factory Login Page
	public LoginPage(){
	PageFactory.initElements(driver, this);
	}
	
	//Xpath
	@FindBy(xpath = "//span[@class='icon icon-xs mdi-chart-bar']")
	WebElement login1 ;
	
	//@FindBy(xpath = "//input[@name='email']")
	@FindBy(xpath = "//input[@id='email']")
	WebElement username;
	
	//@FindBy(xpath = "//input[@placeholder='Password']")
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	
	//@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	@FindBy(xpath =  "//input[@id='submit']")
	WebElement loginusername;
	
	@FindBy(xpath="//div[@class='note note-danger']")
	WebElement incorrectpwd;
	
	
	@FindBy(xpath= "//a[@id='forget-password']")
	WebElement forgotpwd;
	
	
	@FindBy(xpath="//input[@id='emailAddress']")
	WebElement emailaddress;
	
	
	@FindBy(xpath="//input[@id='send']")
	WebElement sendaddress;
	
	@FindBy(xpath = "//div[@class='rms-logo']//a//img")
	WebElement logo;
	
	
	//Method
	
	  public String ValidateLoginPageTitle() 
	  {
	    return driver.getTitle();
	 
	  }
	
	
	
	  public HomePage login(String un,String pwd) throws InterruptedException 
	  { 
		  // login1.click();//For crm page
		  username.sendKeys(un);
		  password.sendKeys(pwd);
		  loginusername.click(); 
		  Thread.sleep(2000);
		  return new HomePage(); 
	  
	  }
	  public void  loginincorrectpwd(String un,String pwd) throws InterruptedException 
	  { 
		   //login1.click();//For crm page
		  username.sendKeys(un);
		  password.sendKeys(pwd);
		  loginusername.click(); 
		
		
	  
	  }
	 
	  public String IncorrectPasswordMessage() {
		  return incorrectpwd.getText();
		  
	  }
	  
	  public void clickhere() throws Exception {
			/*
			 * forgotpwd.click(); emailaddress.click(); sendaddress.click();
			 */
		  testUtil.clickElement(forgotpwd,"ForgotPwd");
		  testUtil.enterText(emailaddress,"David@datzsolutions.com","Reset pwd");
		  testUtil.clickElement(sendaddress,"sendaddress");
		  Thread.sleep(4000);
	    }
	    
	  public boolean validateDatzsolutionLogo() {
		  return logo.isDisplayed();
	  }
	
	}
	
	
	
	  
