package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class KAdminUsers 
{
	
	WebDriver driver;
	public KAdminUsers(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
//***********************************************Creation***************************************************	
  @FindBy(xpath="//input[@placeholder='Enter full name']")WebElement userName;
  @FindBy(xpath="//input[@placeholder='Mobile']")WebElement mobileNumber;
  @FindBy(xpath="//input[@placeholder='Email']")WebElement email;
  @FindBy(xpath="//select[@formcontrolname='DropdownControl']")WebElement roleDrop;
  
 public void EnterUserName(String name) throws InterruptedException
 {
	 Thread.sleep(2000);
	 userName.clear();
	 userName.sendKeys(name);
 }
 public void EnterMobileNumber(String number)
 {
	 mobileNumber.clear();
	 mobileNumber.sendKeys(number);
 }
 public void EnterEmail(String Email)
 {
	 email.clear();
	 email.sendKeys(Email);
 }
 public void SelectRole(String role)
 {
	 Select sel=new Select(roleDrop);
	 sel.selectByVisibleText(role);
 }
 @FindBy(xpath="//input[@placeholder='Password']")WebElement newPassword;
 @FindBy(xpath="//input[@placeholder='Enter at least 8+ characters']")WebElement retypePassword;
 @FindBy(xpath="//button[.='Save']")WebElement saveButton;
 @FindBy(xpath="//button[@class='btn-wide-gray3 mb-3 mb-md-0']")WebElement deleteButton;
 public void EnterNewPassword(String password)
 {
	 newPassword.clear();
	 newPassword.sendKeys(password);
 }
 public void EnterRetypePassword(String password)
 {
	 retypePassword.clear();
	 retypePassword.sendKeys(password);
 }
 public void ClickOnSaveButton()
 {
	 saveButton.click();
 }
 public void ClickOnDeleteButton()
 {
	 deleteButton.click();
 }
  
  
@FindBy(xpath="//div[@class='table-responsive']//tbody//tr[1]/td[1]")WebElement firstRecordId;
public String GetFirstRecordID()
{
	String id=firstRecordId.getText();
	return id;
}
//  @FindBy(xpath="")WebElement;
//  @FindBy(xpath="")WebElement;
//  @FindBy(xpath="")WebElement;
//  @FindBy(xpath="")WebElement;
}
