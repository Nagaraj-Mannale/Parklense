package stepdefination;

import java.awt.AWTException;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import commonComponents.Iterations;
import io.cucumber.java.en.*;
import myBrowsers.Browser;
import pom.ELotPage;

public class EStepLotPage {
   WebDriver driver;
   ELotPage lp;
   Iterations it;
	
//**********************************************LotCreation****************************************************	
	@When("they click on the lot link")
	public void they_click_on_the_lot_links() {
	    it=new Iterations(Browser.driver);
	    it.clickOnLinkByText("Lots");
	}

	@When("they select the client")
	public void they_select_the_client() {
	    lp=new ELotPage(Browser.driver);
	    lp.Selectclient("Anil-Client");
	}

	@When("they select the site")
	public void they_select_the_site() {
	    lp.Selectsite("Anil-Site");
	}

	@When("they enter the lot name")
	public void they_enter_the_lot_name() {
	  lp.EnterLotName("LotA");
	}

	@When("they enter the lot title")
	public void they_enter_the_lot_title() {
	    lp.EnterLotTitle("lot");
	}

	@When("they enter the parking duration")
	public void they_enter_the_parking_duration() throws AWTException, InterruptedException {
	    lp.EnterParkingDuration("65");
	  
	}

	@When("they upload the overlay")
	public void they_upload_the_overlay() throws AWTException, InterruptedException  
	{
	    it.KeyBoardOption("scroll");
		lp.uploadLotOverlayImage("/home/active35/Downloads/ac-gayst (6).png");
	}

	@When("they select the lots location")
	public void they_select_the_lots_location() {
	    lp.SelectLotLocation(2);
	}
	@When("they select the lots status")
	public void they_select_the_lots_status() {
	    lp.SelectLotStatus(1);
	}
	@Then("the created lot should be verified")
	public void the_created_lot_should_be_verified() {
	    Assert.assertEquals(it.GetFirstRecordName(), "LotA");
	}
//***********************************************LotUpdate*****************************************************

	@When("modify the lot name")   
	public void modify_the_lot_name() throws InterruptedException {
		 lp=new ELotPage(Browser.driver);
		lp.ClearLotName();
	   lp.EnterLotName("testerLot");
	}
	
	@When("they enter the all coordinates")   
	public void EnterTheAllCoordinates() throws InterruptedException, AWTException {
		lp.EnterlotCoordinates("13", "14");
		Thread.sleep(2000);
		lp.EnterOverlayCoordinates("13,14", "14,15");
		    it.KeyBoardOption("scroll");
	}
	
	@Then("the edited Lot should be verified")
	public void the_edited_lot_should_be_verified() {
		Assert.assertEquals(it.GetFirstRecordName(), "testerLot"); 
	}
//**********************************************Delete*********************************************
	@When("click on the lot delete button")
	public void LotDeleting() throws AWTException, InterruptedException {
		it.KeyBoardOption("scroll");
		it.ClickOnDeleteButton();
	    
	}

	
	
	
}
