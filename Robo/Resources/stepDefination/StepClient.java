package stepDefination;

import org.openqa.selenium.WebDriver;

import PageObjectModule.ADashboard;
import PageObjectModule.Client;
import PageObjectModule.Login;
import basicCode.CommonCodes;
import basicCode.Mybrowser;
import io.cucumber.java.en.*;

public class StepClient 
{

CommonCodes cc;
Client ct;
Login lp;
ADashboard db;
Mybrowser mb;

@Given("open the browser enter the url")
public void open_the_browser_enter_the_url() {
   mb.setup();
 
}

@When("login to the application")
public void login_to_the_application() {
    lp=new Login(Mybrowser.driver);
    lp.MailField("devops@active.agency");
    lp.PasswordField("Devops@123");
    lp.SignInButton();
   
}

@When("get dashboard count")
public void get_dashboard_count() {
	   db=new ADashboard(Mybrowser.driver);
       String prospects=db.prospects_count();
}

@When("go to the client page and create one client")
public void go_to_the_client_page_and_create_one_client() {
      
}

@Then("verify the dashboard count")
public void verify_the_dashboard_count() {
      
}

@Then("logout from the application")
public void logout_from_the_application() {
      
}

@When("create a new client and get the name")
public void create_a_new_client_and_get_the_name() {
      
}

@Then("Verify in User home, new and edit page")
public void verify_in_user_home_new_and_edit_page() {
      
}

@Then("Verify in Site home, new and edit page")
public void verify_in_site_home_new_and_edit_page() {
      
}

@Then("Verify in home, new and edit page")
public void verify_in_home_new_and_edit_page() {
      
}

@Then("Verify in Stalls home page")
public void verify_in_stalls_home_page() {
      
}

@Then("Verify in Camera home, new and edit page")
public void verify_in_camera_home_new_and_edit_page() {
      
}

@Then("Verify in Attribute value home, new and edit page")
public void verify_in_attribute_value_home_new_and_edit_page() {
      
}

@Then("Verify in Client-role home, new and edit page")
public void verify_in_client_role_home_new_and_edit_page() {
      
}
}
