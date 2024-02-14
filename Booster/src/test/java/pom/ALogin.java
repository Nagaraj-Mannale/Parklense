package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ALogin 
{
	public WebDriver driver;
    public ALogin(WebDriver driver)
	{
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
	}
@FindBy (xpath="//input[@placeholder='Enter Email']")                          WebElement emailTextField;
@FindBy(xpath="//input[@placeholder='Enter Password']")                        WebElement pwdTextField;
@FindBy(xpath="//button[text()='Sign In']")                                    WebElement signInButton;
@FindBy(xpath="(//div[@class='imgholder2']/../following-sibling::div//img)[1]")WebElement signinPageIcon;
@FindBy(xpath="(//div[@class='card'])[1]/../../preceding-sibling::div/h1")     WebElement homePageIcon;

public void MailField(String mail)
{
  emailTextField.sendKeys(mail);
}

public void PasswordField(String pwd)
{
	pwdTextField.sendKeys(pwd);
}
public void SignInButton()
{
	signInButton.click();
}
public boolean SignInPageIcon()
{
	boolean first_icon=signinPageIcon.isDisplayed();
	return first_icon;
}
public boolean HomePageIcon()
{
	boolean sec_icon=homePageIcon.isDisplayed();
	return sec_icon;
}


}

