package stepdefination;



import java.awt.AWTException;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;

import commonComponents.Iterations;
import io.cucumber.java.en.*;

import myBrowsers.Browser;
import pom.FCameraPage;
import pom.GAttribute;


public class GStepAttributePage 
{
   WebDriver driver;
   Iterations it;	
   GAttribute at;	
   FCameraPage cp;
	
//********************************Creation******************************************************	
	@When("they click on the setting page")
	public void they_click_on_the_setting_page() throws InterruptedException 
	{
	   it=new Iterations(Browser.driver);
			   it.clickOnLinkByText("settings");
			   Thread.sleep(2000);
	}

	@Then("the user is on the Attribute home page")
	public void the_user_is_on_the_attribute_home_page() {
	   Assert.assertEquals(it.VerifyCurrentPageText(), "Attributes");
	}

	@Then("user is on the Attribute new page")
	public void user_is_on_the_attribute_edit_page() {
	    Assert.assertEquals(it.VerifyCurrentPageText(), "New Attributes");
	}

	@When("enter the attribute name")
	public void enter_the_attribute_name() {
		at=new GAttribute(Browser.driver);
		at.EnterName("Devops");
	}

	@When("Verify the description text field")
	public void enter_the_description() {
	   
	}

	@When("select the attribute status")
	public void select_the_attribute_s_status() throws InterruptedException {
	   //it.Radiobutton(); 
	}

	
	@Then("the created attribute should be verified")
	public void the_created_attribute_should_be_verified() {
	    Assert.assertEquals(it.GetFirstRecordName(), "Devops");
	}
//*********************************Update**********************************************************
	@When("modify the Attribute name")
	public void modify_the_name() {
		at=new GAttribute(Browser.driver);
		at.CleratExistText();
		at.EnterName("Tester");
	}
	

	@Then("the Updated attribute should be verified")
	public void the_edited_attribute_should_be_verified() {
		Assert.assertEquals(it.GetFirstRecordName(),"Tester");
	}
//**********************************Deletion********************************************************
	@When("click on the attribute delete button")
	public void DeleteButton() throws InterruptedException, AWTException{
		it=new Iterations(Browser.driver);
		it.KeyBoardOption("scroll");
		it.ClickOnDeleteButton();
	}

	}

