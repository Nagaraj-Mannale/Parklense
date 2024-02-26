package stepdefination;

import java.awt.AWTException;

import org.junit.Assert;


import commonComponents.Iterations;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myBrowsers.Browser;
import pom.ADashboard;
import pom.ALogin;
import pom.BClientPage;
import pom.HAttributeValue;

public class BStepClientPage 
{
	ALogin lp;
	BClientPage cb;
	Iterations it;
	ADashboard ad; 
	HAttributeValue av;
	
	 @When("they log in to their account")
	    public void logInToAccount() throws InterruptedException 
	    {
	        lp=new ALogin(Browser.driver);
	        lp.MailField("devops@active.agency");
	        lp.PasswordField("Devops@12345");
	        lp.SignInButton();
	        Thread.sleep(2000);/////take a look
	        
	    }
	 
	 @When("they click on the Client link")
	    public void clickOnClientLink() throws InterruptedException 
	    {
	    	it=new Iterations(Browser.driver);
	    	it.clickOnLinkByText("Clients");
	    	Thread.sleep(2000);
	       
	    }
	 @When("they click on the new button")
		public void ClickOnNewButton()  
		{
		it=new Iterations(Browser.driver);	
		 it.ClickOnNewButton();
		}
	 
	 @Then("the user on the new client page")
	    public void VerifyNewClientClientPage() 
	    {
	    	Assert.assertEquals(it.VerifyCurrentPageText(),"New Client");

	     }
	 @When("they enter  Name into the client name text field")
		public void EnterClientNameIntoThefield() {
		   cb=new BClientPage(Browser.driver);
		   cb.EnterClientName("Gyale");
		}

		@When("they enter mobile number into the mobile number text field")
		public void EnterMobileNumberIntoThefield() {
		  cb.EnterClientMobileNumber("1234567890");
		}

		@When("they enter email into the email text field")
		public void EnterEmailIntoThefield() {
			cb.EnterClientEMail("tester@gmail.com");
		}

		@When("they enter client adress into the address text field")
		public void EnterAdressIntoThefield() {
		cb.EnterClientadress("bangalore");
		}

		@When("they select Country from the country dropdown")
		public void SelectCountryFromDropDown() {
		cb.SelectCountry();
		}

		@When("they select State from the state dropdown")
		public void SelectStateFromDropDown() {
		cb.SelectState("1");
		}

		@When("they select City from the city dropdown")
		public void SelectCityFromDropDown() {
		    cb.SelectCity("HYDERABAD");
		}

		@When("they select client type from the client type dropdown")
		public void SelectClientTypeFromDropDown() {
		cb.SelectClientType("Pilot");
		}
		@When("they select the client start date and end date")
		public void SelectCLientDate() throws InterruptedException {
			cb.selectDate("2024","Oct","12",1);
			Thread.sleep(5000);
			cb.selectDate("2024", "Oct","12",2);
//****************************************datePicker***********************************************			
//			it=new Iterations(Browser.driver);
//			cb.ClickOnClientStartDate();
//		    it.DatePicker("2023/Oct/01");
//		     cb.ClickOnClientEndDate();
//		     it.DatePicker("2023/Oct/21")
//*************************************************************************************************
		}

		@When("they select Status from the client status dropdown")
		public void SelectStatusOfCLient()  {
			
			it.ClickOnRadiobutton(1);
		}
		
		@When("click on the save button")
		public void ClickOntheSaveButton() throws AWTException, InterruptedException  
		{
			it=new Iterations(Browser.driver);
		    it.SaveButton();
		    Thread.sleep(2000);
		
		}
		@Then("the created client should be displayed on the client page")
		public void the_created_client_should_be_displayed_on_the_client_page() {
		Assert.assertEquals(cb.FirstRecordClientName(),"ClientB");
		} 
//*********************************Updating**************************	 

		@When("select one perticular client record and click on edit icon")
		public void ClickOnClientEditbutton()  
		{
			
			it.EditICon();
		}
	 
		@When("they update the client name")
		public void update_the_client_name() throws InterruptedException {
			cb=new BClientPage(Browser.driver);
			cb.EditClientName("ClientC");
			
		}
		@When("they update the mobile number")
		public void update_the_mobile_number() throws InterruptedException {
		    cb.EditClientMobileField("1234567880");
		}
		@When("they update the email")
		public void update_the_email() {
		   cb.EditClientMail("devops@gmail.com");
		}
		
		@Then("verify is the client get upadted")
		public void verify_is_the_client_get_upadted() {
		    Assert.assertEquals(cb.FirstRecordClientName(),"ClientC");
		}
//------------------------------------------------EndTOEnd----------------------------------------------------------------	 
		String count;
		@When("get the dashboard count")
		public void GetInitialProspectCount() {
		     
			ad=new ADashboard(Browser.driver);
		    count=ad.prospects_count();
		}

		@When("go to the client page and create one client")
		public void go_to_the_client_page_and_create_one_client() throws InterruptedException, AWTException {
			clickOnClientLink();
			ClickOnNewButton();
			EnterClientNameIntoThefield();
			EnterMobileNumberIntoThefield();
			EnterEmailIntoThefield();
			EnterAdressIntoThefield();
			SelectCountryFromDropDown();
			SelectStateFromDropDown();
			SelectCityFromDropDown();
			SelectClientTypeFromDropDown();
			SelectCLientDate();
			SelectStatusOfCLient();
			ClickOntheSaveButton();
		}
		
        String currentCount;
		@Then("verify the dashboard count")
		public void verify_the_dashboard_count() {
			it=new Iterations(Browser.driver);
	    	it.clickOnLinkByText("Dashboard");
	    	
		     currentCount=ad.prospects_count();
		     int countInt = Integer.parseInt(count);
		     int currentInt = Integer.parseInt(currentCount);
		     System.out.println(currentInt);
		        
		     System.out.println(currentInt);
		     Assert.assertEquals("Dashboard count does not match", countInt, currentInt);
		}
		String clientName;
		String clientId;
		@When("get one recently created client ID")
		public void featchOneclientIdAndNameOfclientFromclientHomepage()
		{
			
			it=new Iterations(Browser.driver);
	    	it.clickOnLinkByText("Clients");
	    	cb=new BClientPage(Browser.driver);
			clientName=cb.FirstRecordClientName();
			clientId=cb.FirstRecordClientId();
			
		}
		@Then("verify in User home, New and Edit page")
		public void verify_in_user_home_new_and_edit_page() {
			it.clickOnLinkByText("Users");
			String name=it.GetNamefromHomepageClientDropdown(clientName);
			Assert.assertEquals("client is not available",clientName,name);
			
			it.ClickOnNewButton();
			String id=it.GetNewPageClient(clientName);
			int NewId=Integer.parseInt(id);
			int HomeId=Integer.parseInt(clientId);
			System.out.println("New Page ID :-"+NewId+"Home page id:-"+HomeId);
	    	Assert.assertEquals("Id is not matching", NewId, HomeId);
	    	it.CancelButton();
	    	
	    	it.EditICon();
	    	String Editid=it.GetNewPageClient(clientName);
		    int editPageId=Integer.parseInt(Editid);
		    System.out.println(editPageId);
		    Assert.assertEquals("Id is not matching", editPageId, HomeId);
		    it.CancelButton();
		     
		}

		@Then("verify in Site home, New and Edit page")
		public void verify_in_site_home_new_and_edit_page() {
			it.clickOnLinkByText("Sites");
			String name=it.GetNamefromHomepageClientDropdown(clientName);
			Assert.assertEquals("client is not available",clientName,name);
			
			it.ClickOnNewButton();
			String id=it.GetNewPageClient(clientName);
			int NewId=Integer.parseInt(id);
			int HomeId=Integer.parseInt(clientId);
			System.out.println("Site New Page client ID :-"+NewId+" Home page client id:-"+HomeId);
	    	Assert.assertEquals("Id is not matching", NewId, HomeId);
	    	it.CancelButton();
	    	
	    	it.EditICon();
	    	String Editid=it.GetNewPageClient(clientName);
		    int editPageId=Integer.parseInt(Editid);
		    System.out.println("Site Edit page client Id:-"+editPageId);
		    Assert.assertEquals("Id is not matching", editPageId, HomeId);
		    it.CancelButton();
		     
		}
		

		@Then("verify in Lot home and New page")
		public void verify_in_home_new_and_edit_page() {
			it.clickOnLinkByText("Lots");
			String name=it.GetNamefromHomepageClientDropdown(clientName);
			Assert.assertEquals("client is not available",clientName,name);
			
			it.ClickOnNewButton();
			String id=it.GetNewPageClient(clientName);
			int NewId=Integer.parseInt(id);
			int HomeId=Integer.parseInt(clientId);
			System.out.println("Lot New Page client ID :-"+NewId+" Home page client id:-"+HomeId);
	    	Assert.assertEquals("Id is not matching", NewId, HomeId);
	    	it.CancelButton();
	    	
	    	
		     
		}

		@Then("verify in Stalls home page")
		public void verify_in_stalls_home_page() {
			it.clickOnLinkByText("Lots");
			String name=it.GetNamefromHomepageClientDropdown(clientName);
			Assert.assertEquals("client is not available",clientName,name);
			
			it.ClickOnNewButton();
			String id=it.GetNewPageClient(clientName);
			int NewId=Integer.parseInt(id);
			int HomeId=Integer.parseInt(clientId);
			System.out.println("Stalls New Page client ID :-"+NewId+" Home page client id:-"+HomeId);
	    	Assert.assertEquals("Id is not matching", NewId, HomeId);
	    	it.CancelButton();
		     
		}

		@Then("verify in Camera home and New page")
		public void verify_in_camera_home_new_and_edit_page() 
		{
			it.clickOnLinkByText("Camera");
			String name=it.GetNamefromHomepageClientDropdown(clientName);
			Assert.assertEquals("client is not available",clientName,name);
			
			it.ClickOnNewButton();
			String id=it.GetNewPageClient(clientName);
			int NewId=Integer.parseInt(id);
			int HomeId=Integer.parseInt(clientId);
			System.out.println("Camera New Page client ID :-"+NewId+" Home page client id:-"+HomeId);
	    	Assert.assertEquals("Id is not matching", NewId, HomeId);
	    	it.CancelButton();
		     
		}

		@Then("verify in Attribute value home, New and Edit page")
		public void verify_in_attribute_value_home_new_and_edit_page() {
			it.clickOnLinkByText("Settings");
			it.ClickOnSettingLinksByText("Attribute Values");
			
			String name=it.GetNamefromHomepageClientDropdown(clientName);
			Assert.assertEquals("client is not available",clientName,name);
			
			it.ClickOnNewButton();
			av=new HAttributeValue(Browser.driver);
			String id=av.getIdByLabelText(clientName);
			System.out.println(id);
			System.out.println("null");
			int NewId=Integer.parseInt(id);
			int HomeId=Integer.parseInt(clientId);
			System.out.println("Lot New Page client ID :-"+NewId+" Home page client id:-"+HomeId);
	    	Assert.assertEquals("Id is not matching", NewId, HomeId);
	    	it.CancelButton();
		     
	    	it.EditICon();
	    	String Editid=it.GetNewPageClient(clientName);
		    int editPageId=Integer.parseInt(Editid);
		    System.out.println("AttributeValue Edit page client Id:-"+editPageId);
		    Assert.assertEquals("Id is not matching", editPageId, HomeId);
		    it.CancelButton();
		}

		@Then("verify in Client-role home, New and Edit page")
		public void verify_in_client_role_home_new_and_edit_page() 
		{
			it.clickOnLinkByText("Settings");
			it.ClickOnSettingLinksByText("Client Roles");
			String name=it.GetNamefromHomepageClientDropdown(clientName);
			Assert.assertEquals("client is not available",clientName,name);
			
			it.ClickOnNewButton();
			String id=it.GetNewPageClient(clientName);
			int NewId=Integer.parseInt(id);
			int HomeId=Integer.parseInt(clientId);
			System.out.println("ClientRole New Page client ID :-"+NewId+" Home page client id:-"+HomeId);
	    	Assert.assertEquals("Id is not matching", NewId, HomeId);
	    	it.CancelButton(); 
		     
		}

		@Then("logout from the application")
		public void logout_from_the_application() 
		{
		     
		     
		} 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
