package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DSitePage 
{
	WebDriver driver;
	public DSitePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
//************************************************************HomePage******************************************	
	@FindBy (xpath="(//div[@class='dropdown-toggle'])[1]")                            WebElement Client_drop_down;
	@FindBy (xpath="(//div[@class='dropdown-toggle'])[2]")							  WebElement Status_drop_down;
    @FindBy (xpath="//button[@class='btn-i-gray3 btn-icon-text commangap-3']")        WebElement Reset_button;
    @FindBy (xpath="//select[@class='form-select form-select ms-2 me-2']")            WebElement page_drop_down;

    public void ClientDropDown()
    {
    	Client_drop_down.click();
    }
    public void StatusDropDown()
    {
    	Status_drop_down.click();
    }
//	*********************************************Creation*******************************************************
    @FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[1]")                WebElement clientDropDown;
    @FindBy(xpath="(//input[@placeholder='Enter full name'])[1]")                     WebElement siteName;  
    @FindBy(xpath="//input[@placeholder='Enter Site Title']")                         WebElement titleName; 
    @FindBy(xpath="//div[@class='ng2-tag-input ng-tns-c102-1 bootstrap']")            WebElement lotName;
   
    public void SelectClient(String name)
    {
    Select sel=new Select(clientDropDown);
    sel.selectByVisibleText(name);
    }
    public void EnterSiteName(String name)
    {
    	siteName.sendKeys(name);
    }
    public void EnterTitleName(String name)
    {
    	titleName.sendKeys(name);
    }
    public String VerifyAssignedLot()
    {
    	String name=lotName.getText();
    	return name;
    }
//****************************************Update**************************************    
    public void ClearSiteName() throws InterruptedException
    {
    	Thread.sleep(4000);
    	siteName.clear();
    }
    public void ClearTitle()
    {
    	titleName.clear();
    }
    



}
