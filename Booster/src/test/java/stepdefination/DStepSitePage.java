package stepdefination;



import java.awt.AWTException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import commonComponents.Iterations;
import io.cucumber.java.en.*;

import myBrowsers.Browser;
import pom.DSitePage;

public class DStepSitePage {

	WebDriver driver;
	DSitePage sp;
	Iterations it;
	CStepUser cs;
   
	@When("they click on the site link")
	public void they_click_on_the_site_link(){
		it=new Iterations(Browser.driver);
		it.clickOnLinkByText("Sites");           }
	String id;
	@When("select one particular site and click on edit icon")
	public void ClickOnParticularSiteEditIcon()
	{
		it=new Iterations(Browser.driver); 
		id=it.GetFirstRecordId();
	 it.EditICon();	
	}
	@Then("the user on the site page")
	public void the_user_on_the_site_page() {
	   Assert.assertEquals(it.VerifyCurrentPageText(),"Sites");
	}

	@Then("the user is on the site new page")
	public void the_user_is_on_the_site_new_page() {
	  Assert.assertEquals(it.VerifyCurrentPageText(),"New Site");
	}

	@When("they enter site name into the site text field")
	public void they_enter_site_name_into_the_site_text_field() {
		sp=new DSitePage(Browser.driver);
	    sp.EnterSiteName("active");
	}

	@When("they enter site title into the site title text field")
	public void they_enter_site_title_into_the_site_title_text_field() {
	    sp.EnterTitleName("tech");
	}
	
	@Then("Verify for the created site")
	public void VerifyForCreatedSite(){
	   Assert.assertEquals(it.GetFirstRecordName(),"active");
	}
	
//**********************************Update*****************************************

	@Then("the user on the edit site page")
	public void the_user_on_the_edit_site_page() {
		Assert.assertEquals(it.VerifyCurrentPageText(),"Edit Site");
	}

	@When("they update the site name")
	public void they_update_the_site_name() throws InterruptedException {
		sp=new DSitePage(Browser.driver);
		sp.ClearSiteName();
	    sp.EnterSiteName("Devops");
	}

	@Then("verify if the site has been updated")
	public void verify_is_the_client_site_is_get_upadted() throws AWTException, InterruptedException
	{
		
		Assert.assertEquals(it.GetFirstRecordName(), "Devops");
	}
	@Then("the deleted site record should be verified")
	public void the_deleted_site_should_be_verified() throws InterruptedException, AWTException {
		    it.SearchField(id);
		    Thread.sleep(3000);
		    Assert.assertEquals("No Records Found", it.DeletedRecordtext());
	    
	}
}
