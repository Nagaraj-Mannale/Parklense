package stepdefination;

import java.awt.AWTException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import commonComponents.Iterations;
import io.cucumber.java.en.*;
import myBrowsers.Browser;
import pom.FCameraPage;

public class FStepCameraPage 
{
 WebDriver driver;
 Iterations it;
 FCameraPage cp;
	
	
 
	
	@When("they click on the camera link")
	public void they_click_on_the_camera_link() {
	    it=new Iterations(Browser.driver);
	    it.clickOnLinkByText("Camera");
	}
 @When("they click on the camera new button")
	public void they_click_on_the_camera_new_button() {
	    
	    it.ClickOnNewButton();
	}

	@When("they select the lot")
	public void they_select_the_lot() {
	   cp=new FCameraPage(Browser.driver);
		cp.SelectLot("Anil-Lot");
	}

	@When("they enter the camera name")
	public void they_enter_the_camera_name() {
	    cp.EnterCameraName("Tech");
	}

	@When("they select the stalls")
	public void they_select_the_stalls() throws InterruptedException {
	    cp.selectStall(); 
	}

	@When("they Enter the camera url")
	public void they_enter_the_camera_url() {
	    cp.EnterCameraUrl("camera.url");
	}
	@Then("the created Camera should be verified")
	public void the_created_lot_should_be_verified() {
	    Assert.assertEquals(it.GetFirstRecordName(), "Tech");
	}
//**********************CameraUpdate*************************************************************

	@When("modify the camera name")
	public void modify_the_camera_name() throws InterruptedException {
		 cp=new FCameraPage(Browser.driver);
		cp.ClearCameraName();
	 cp.EnterCameraName("active");
	}

	@Then("the updated camera should be verified")
	public void the_updated_camera_should_be_verified() {
	Assert.assertEquals(it.GetFirstRecordName(), "active");
	}
///*************************DeletedCamera***************************************************
	@When("click on the delete camera button")
	public void ClickOnDelete() throws InterruptedException, AWTException {
		 cp=new FCameraPage(Browser.driver);
		 it.KeyBoardOption("scroll");
		 //cp.DeleteCameraName();
		it.ClickOnDeleteButton();
	}
	
	
	
}
