package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import myBrowsers.Browser;
import pom.ALogin;

public class StepLogin  
{
	public WebDriver driver;
	public ALogin lp;
	@Given("the user launch the application")
	public void launch_the_application() 
	{
		lp=new ALogin(Browser.driver);
	}

	@When("the user enters a valid email ID into the email ID field")
	public void EnterMail()
	{
		
		lp.MailField("devops@active.agency");
	   
	}
	@When("the user enters a valid password into the password text field")
	public void EnterPassword()
	{
		lp.PasswordField("Devops@12345");
	   
	}
	@When("clicks on the login button")
	public void ClickOnLoginButton() 
	{
	lp.SignInButton();
	}

	@Then("the user is on the dashboard home page")
	public void verify_application_home_page() 
	{
	   Assert.assertEquals(true, lp.HomePageIcon()); 
	}
	@And("they exit from the browser")
	public void LogoutFromAccount()
	{
		System.out.println("Iam quiet");
	}
	@When("the user enters an incorrect email ID into the email ID field")
	public void UserEnterTheInvalidMailIntoUserText_field() 
	{
	lp.MailField("nagarj@123");
	}

	@When("User enters a valid password into the password text field")
	public void user_enter_the_valid_password_into_password_text_field() 
	{
	lp.PasswordField("devops@12345");
	}

	@Then("the user is on sign-in page")
	public void VerifySignInPage() 
	{
	   Assert.assertEquals(true,lp.SignInPageIcon());
	}

	@When("User enters a valid email into the user text field")
	public void user_enter_the_valid_mail_into_user_text_field() 
	{
	 lp.MailField("nagaraj@active.agency");   
	}

	@When("the user enters an incorrect password into the password text field")
	public void user_enter_the_invvalid_password_into_password_text_field() 
	{
	   lp.PasswordField("12345678");
	}

	@When("the user keeps the email ID field empty")
	public void user_keep_the_empty_mail_text_field() 
	{
	    
	}

	@When("the user keeps the password text field empty")
	public void user_keep_the_empty_password_text_field() 
	{
		
	}
	

}

