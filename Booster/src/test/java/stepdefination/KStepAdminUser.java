package stepdefination;

import java.awt.AWTException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import commonComponents.Iterations;
import io.cucumber.java.en.*;
import myBrowsers.Browser;
import pom.KAdminUsers;

public class KStepAdminUser 
{
WebDriver driver;
KAdminUsers au;
Iterations it;
//***************************************Creation**********************************************	
@When("click on Admin-Users link")
public void click_on_admin_users_link() throws InterruptedException  {
    it=new Iterations(Browser.driver);
    it.clickOnLinkByText("settings");
    Thread.sleep(2000);
    it.ClickOnSettingLinksByText("Admin Users");
    Thread.sleep(2000);
}
	@When("enter the Admin-Users Name")
	public void enter_the_admin_users_name() throws InterruptedException {
	au=new KAdminUsers(Browser.driver);
	au.EnterUserName("Anil");
	}

	@When("enter the Admin-Users Mobile number")
	public void enter_the_admin_users_mobile_number() {
	    au.EnterMobileNumber("1234567890");
	}

	@When("enter the Admin-Users Email-id")
	public void enter_the_admin_users_email_id() {
	    au.EnterEmail("Tester@gmail.com");
	}

	@When("select the Admin-role status")
	public void select_the_admin_role_status() {
	    au.SelectRole("ADMIN");
	}

	@When("enter the Admin-Users password")
	public void enter_the_admin_users_password() {
	    au.EnterNewPassword("Tester@123");
	}

	@When("Renter the Admin-Users password")
	public void renter_the_admin_users_password() {
	    au.EnterRetypePassword("Tester@123");
	}

	@When("select the Admin-Users status")
	public void select_the_admin_users_status() {
	    it.ClickOnRadiobutton(2);
	}

	//@When("click on the save button")
	public void click_on_the_save_button() throws AWTException, InterruptedException {
	    au.ClickOnSaveButton();
	    it.KeyBoardOption("scroll");
	}

	@Then("the created Admin-Users should be verified")
	public void the_created_admin_users_should_be_verified() {
	   Assert.assertEquals(it.GetFirstRecordName(),"Anil");
	}
//*******************************************Update*****************************************

	@When("modify the Admin-user details")
	public void modify_the_admin_user_details() throws InterruptedException {
	   au=new KAdminUsers(Browser.driver);
	   au.EnterUserName("Devops");
	}

	@Then("the edited Admin-Users should be verified")
	public void the_edited_admin_users_should_be_verified() {
	   Assert.assertEquals(it.GetFirstRecordName(),"Devops");
	}
//**************************************Deletion***********************************************

}
