/*
 * package com.framework.test;
 * 
 * import org.testng.annotations.AfterMethod; import
 * org.testng.annotations.BeforeMethod; import org.testng.annotations.Test;
 * 
 * import com.framework.general.Base; import com.framework.page.Crm_ContactPage;
 * import com.framework.page.Crm_HomePage; import com.framework.page.LoginPage;
 * 
 * public class Crm_contactPage extends Base{ Crm_ContactPage contactsPage;
 * LoginPage loginPage; Crm_HomePage homePage;
 * 
 * public Crm_contactPage() { super(); }
 * 
 * 
 * // @BeforeMethod() //public void setup1() throws InterruptedException {
 * setup("Chrome"); // loginPage= new // LoginPage(); // contactsPage=new
 * Crm_ContactPage(); // homePage = loginPage.login("zargaranum@gmail.com",
 * "Anum@1234");
 * 
 * 
 * 
 * 
 * //@Test(priority=1) public void ContactsClick() throws InterruptedException {
 * contactsPage.Contact(); try { contactsPage.ClickName(); } catch (Exception e)
 * { // TODO Auto-generated catch block e.printStackTrace(); }
 * Thread.sleep(10000);
 * 
 * }
 * 
 * //@Test(priority=2) public void Nameclickable() throws InterruptedException {
 * Thread.sleep(10000); contactsPage.ClickName(); }
 * 
 * //@AfterMethod() public void tearDown() { driver.quit(); }
 * 
 * 
 * }
 */