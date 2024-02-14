package stepDefination;


import org.openqa.selenium.WebDriver;

import PageObjectModule.Login;
import basicCode.Mybrowser;
import io.cucumber.java.en.*;


public class Steplogin  
{
	public WebDriver driver;
    Login lp;
	@Given("the user launch the application")
	public void launch_the_application() 
	{
		lp=new Login(Mybrowser.driver);
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

}

