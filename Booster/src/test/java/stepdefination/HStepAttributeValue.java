package stepdefination;
import java.awt.AWTException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import commonComponents.Iterations;
import io.cucumber.java.en.*;
import myBrowsers.Browser;
import pom.GAttribute;
import pom.HAttributeValue;

public class HStepAttributeValue 
{
	WebDriver driver;
    Iterations it;
	HAttributeValue av;
	GAttribute at;
	
	@When("click on attributeValue link")
	public void click_on_attribute_value_link() throws InterruptedException {
	    it=new Iterations(Browser.driver);
	    it.clickOnLinkByText("Settings");
	    it.ClickOnSettingLinksByText("Attribute Values");
	    Thread.sleep(2000);
	}

	@Then("the user is on the AttributeValue home page")
	public void the_user_is_on_the_attribute_value_home_page() {
	   Assert.assertEquals(it.VerifyCurrentPageText(),"Attribute Values");
	}
	
	@Then("select the attributeValue status")
	public void SelctTheAttribute() {
	    Assert.assertEquals(it.VerifyCurrentPageText(), "New Attribute Value");	
	    }

	@Then("user is on the AttributeValue new page")
	public void user_is_on_the_attribute_value_edit_page() {
	    Assert.assertEquals(it.VerifyCurrentPageText(), "New Attribute Value");	
	    }

	@When("select the attribute from drop-down")
	public void select_the_attribute_from_drop_down() {
		 av=new HAttributeValue(Browser.driver);
		av.SelectAttributeDropDown();
	}

	@When("enter the attribute value name")
	public void enter_the_attribute_value_name() {
		 av=new HAttributeValue(Browser.driver);
		av.EnterAttributeValue("Devops");
	}
	//@When("modify the Attribute name")
	public void ModifyAttributeNmae() {
		av=new HAttributeValue(Browser.driver);
	    av.EnterAttributeValue("Devops");
	}

	@When("select the client from drop down")
	public void select_the_client_from_drop_down() throws InterruptedException, AWTException {
		it.KeyBoardOption("scroll");
		av=new HAttributeValue(Browser.driver);
		av.ClickOnClientdrop();
		Thread.sleep(2000);
		av.SelectClientOnNewPage("parklens");
	}

	@Then("the created attribute value should be verified")
	public void the_created_attribute_value_should_be_verified() {
	 Assert.assertEquals(av.VerifyAvName(),"Devops");
	}

	@Then("the edited attribute should be verified")
	public void VerifyingAttributeValueName(){
	 Assert.assertEquals(av.VerifyAvName(),"Devops");
	}

//**********************************************Delete******************************************


}
