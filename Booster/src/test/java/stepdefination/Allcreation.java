package stepdefination;

import commonComponents.Iterations;
import io.cucumber.java.en.*;
import myBrowsers.Browser;
import pom.*;


public class Allcreation
{
	Iterations it;
	BClientPage client;
	CUserPage user;
	DSitePage site;
	ELotPage lot;
	FCameraPage camera;
	
	@When("go to the site")
	public void go_to_the_site() 
	{
    it=new Iterations(Browser.driver); 
    it.clickOnLinkByText("Sites");
	   
	}
   String name;
	@When("create one site with a known client")
	public void create_one_site_with_a_known_client() {
	     it.ClickOnNewButton();
	     site=new DSitePage(Browser.driver);
	     client=new BClientPage(Browser.driver);
	     name=client.FirstRecordClientName();
	     site.SelectClient(name);
	     site.EnterSiteName("NewSiteF26");
	     site.EnterTitleName("SiteF26");
	     
	      
	}

	@Then("verify the created site by applying the client filter")
	public void verify_the_created_site_by_applying_the_client_filter() throws InterruptedException {
	     it.ClientsOnHomePage(name);
	     String name = ("NewSiteF26" == it.GetFirstRecordName())? "NewSiteF26"+"On this name site is created successfully":it.GetFirstRecordName();
	}

	@When("go to the lot page and create one new lot using the recently created site")
	public void go_to_the_lot_page_and_create_one_new_lot_using_the_recently_created_site() {
	     
	      
	}

	@Then("verify in the lot home page by applying Client and site filter")
	public void verify_in_the_lot_home_page_by_applying_client_and_site_filter() {
	     
	      
	}

	@When("go to the camera page and create one camera")
	public void go_to_the_camera_page_and_create_one_camera() {
	     
	      
	}

	@Then("verify in the camera home page")
	public void verify_in_the_camera_home_page() {
	     
	      
	}

	@When("go to the User page")
	public void go_to_the_user_page() {
	     
	      
	}

	@When("create one new user using the recently created site and lot")
	public void create_one_new_user_using_the_recently_created_site_and_lot() {
	     
	      
	}

	@Then("verify in the user home page by applying the client filter")
	public void verify_in_the_user_home_page_by_applying_the_client_filter() {
	     
	      
	}
}
