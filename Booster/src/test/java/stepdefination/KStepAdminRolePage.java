package stepdefination;

import java.awt.AWTException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import commonComponents.Iterations;
import io.cucumber.java.en.*;

import myBrowsers.Browser;
import pom.HAttributeValue;
import pom.SAdminRole;
import pom.IClientRole;

public class KStepAdminRolePage 
{
    WebDriver driver;
    SAdminRole ar;
    Iterations it;
    IClientRole cr;
    HAttributeValue av;
//*********************************Created*******************************************************	
	@When("click on Admin-roles link")
	public void click_on_admin_roles_link() throws InterruptedException {
	    it=new Iterations(Browser.driver);
	    it.clickOnLinkByText("settings");
	    it.ClickOnSettingLinksByText("Admin Roles");
	    Thread.sleep(2000);
	}

	@Then("the user is on the admin-role home page")
	public void the_user_is_on_the_admin_role_home_page() {
	   Assert.assertEquals(it.VerifyCurrentPageText(),"Admin Roles");
	}

	@Then("user is on the Admin-role new page")
	public void user_is_on_the_admin_role_new_page() {
		Assert.assertEquals(it.VerifyCurrentPageText(),"Add Admin Roles");
	}
	
   @When("enter the admin-role title")
	public void enter_the_admin_role_title() throws InterruptedException, AWTException {
	   ar=new SAdminRole(Browser.driver);
		ar.EnterPermissionTitle("Enterpriner");
        it.KeyBoardOption("tab"); 
		it.KeyBoardOption("scroll");
		Thread.sleep(1000);
		
	}
  

	@Then("the created admin-role should be verified")
	public void the_created_admin_role_should_be_verified() throws InterruptedException {
		Thread.sleep(4000); 
	    cr=new IClientRole(Browser.driver);
	    cr.ClickOnDescButton();
	    it=new Iterations(Browser.driver);
		Assert.assertEquals(it.GetFirstRecordName(),"Enterpriner");
	}
	//******************************************************************Update***********************************************************************
	@When("they select a specific admin-role and click on the edit button")
	public void they_select_a_specific_client_role_and_click_on_the_edit_button() throws InterruptedException, AWTException {
		cr=new IClientRole(Browser.driver);
		cr.ClickOnDescButton();
		it.EditICon();
		Thread.sleep(3000);
		it.KeyBoardOption("scroll");
	}

	@Then("the edited role should be verified")
	  	public void the_edited_lot_should_be_verified() throws InterruptedException {
		Thread.sleep(2000);
		cr.ClickOnDescButton();	
		Assert.assertEquals(it.GetFirstRecordName(), "amaz"); 
	  	}
	
//**********************************************AdminDelete******************************************	
	//@When("click on the Admin role delete button")
	public void ClickOnDeleteButton() throws AWTException, InterruptedException {
	   av=new HAttributeValue(Browser.driver);
	   ar=new SAdminRole(Browser.driver);
	   it.KeyBoardOption("scroll");
	   av.ClickOnDeleteButton();
		it=new Iterations(Browser.driver);
	   
	}
	@Then("the deleted admin-role should be verified")
  	public void VerifyAdminRole() {
		cr.ClickOnDescButton();
  		Assert.assertNotEquals(it.GetFirstRecordName(), "amaz"); 
  	}
	
	
}
