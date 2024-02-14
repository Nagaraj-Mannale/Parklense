package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CUserPage {

	 WebDriver driver;
		public CUserPage(WebDriver driver)
		{
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		}
//*******************************************************UserCreation*********************************************************************************	
		    
		    @FindBy(xpath="(//input[@placeholder='Enter Name'])[1]")                          WebElement newUserName;
		    @FindBy(xpath="//input[@placeholder='Enter User Name']")                          WebElement newUserNickName;
		    @FindBy(xpath="//input[@placeholder='Mobile']")                                   WebElement newUserMobile;
		    @FindBy(xpath="//input[@placeholder='Email']")                                    WebElement newUserEmail; 
		   
		    public void EnterNewUserName(String name) throws InterruptedException
		    {   
		    	newUserName.sendKeys(name);
		    }
		    public void EnterUserNickName(String name)
		    {
		    	newUserNickName.sendKeys(name);
		    }
		    public void EnterUserMobileNumber(String Number)
		    {
		    	newUserMobile.sendKeys(Number);
		    }
		    public void EnterUserMailID(String mail)
		    {
		    	newUserEmail.sendKeys(mail);
		    }
		
	        @FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[2]")                      WebElement userRole;
	       	@FindBy(xpath="//div[@class='ng-select-container']/span")                               WebElement selectLot;
	        @FindBy(xpath="//input[@id='item-1']")                                                  WebElement firstCheckBox;
	        @FindBy(xpath="//input[@placeholder='Password']")                                       WebElement newPassword;
	        @FindBy(xpath="//input[@placeholder='Retype Password']")                                WebElement retypePassword;
	        public void SelectUserRole()
	        {
	        	
	        	Select sel=new Select(userRole);
	        	sel.selectByVisibleText("MANAGER");
	        }
	        public void SelectUserLot() throws InterruptedException
	        {
	        	
	        	selectLot.click();
	        	Thread.sleep(2000);
	        	firstCheckBox.click();
	        }
	       
	        public void EnterUserNewPassword(String password)
		    {
	        	newPassword.sendKeys(password);
		    }
		    public void EnterRetypePasswordIntoRetypePasswordField(String password)
		    {
		    	retypePassword.sendKeys(password);
		    }
//****************************************************UpdateUser************************************************************
		    public void ClearExistingName() throws InterruptedException
		    {
		    	Thread.sleep(2000);
		    	newUserName.clear();
		    }
		    public void ClearExistingUserNickName()
		    {
		    	newUserNickName.clear();
		    }
		    public void ClearExistingMobileNumber()
		    {
		    	newUserMobile.clear();
		    }
		    public void ClearExistingUserMailID()
		    {
		    	newUserEmail.clear();
		    }
}
