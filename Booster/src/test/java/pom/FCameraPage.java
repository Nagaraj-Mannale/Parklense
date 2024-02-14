package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class FCameraPage 
{
	WebDriver driver;
	public FCameraPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
//********************************************************CameraHomePage****************************************************************************	
	@FindBy(xpath="(//div[@class='dropdown-toggle'])[1]")                                  WebElement homeClientDrop;
	@FindBy(xpath="(//div[@class='dropdown-toggle'])[2]")							   	   WebElement Site_drop;
	@FindBy(xpath="(//div[@class='dropdown-toggle'])[3]")							   	   WebElement Lot_drop;
	@FindBy(xpath="(//div[@class='dropdown-toggle'])[4]")							   	   WebElement Status_drop;
    @FindBy (xpath="//select[@class='form-select form-select ms-2 me-2']") 	               WebElement page_drop;
//*******************************************************CameraCreation****************************************************************************
    @FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[1]")                	   WebElement clientDrop;
	@FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[2]")			      	   WebElement siteDrop;
	@FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[3]")                     WebElement lotDrop ;
	@FindBy(xpath="//input[@placeholder='Enter Camera Name']")                             WebElement cameraName ;
	@FindBy(xpath="//input[@aria-autocomplete='list']")                                    WebElement stallsDrop ;
	@FindBy(xpath="//input[@placeholder='Enter the Camera Access URL']")                   WebElement cameraUrl ;
	@FindBy(xpath="//input[@id='item-0']")WebElement selectStalls;
	@FindBy(xpath="(//button[@class='btn-wide-gray3 mb-3 mb-md-0'])[1]")                   WebElement deleteButton; 

	public void SelectClient(String name)
	{
		Select sel=new Select(clientDrop);
	    sel.selectByVisibleText(name);
	}
	public void SelectSite(String name)
	{
		Select sel=new Select(siteDrop);
	    sel.selectByVisibleText(name);
	}
	public void SelectLot(String name)
	{
		Select sel=new Select(lotDrop);
	    sel.selectByVisibleText(name);
	}
	public void EnterCameraName(String name)
	{
		cameraName.sendKeys(name);
	}
	public void selectStall() throws InterruptedException
	{
		stallsDrop.click();
		Thread.sleep(2000);
		selectStalls.click();
	}
	public void EnterCameraUrl(String name)
	{
		cameraUrl.sendKeys(name);
	}
//*********************************Update*********************************************
	public void ClearCameraName() throws InterruptedException
	{
		Thread.sleep(4000);
		cameraName.clear();
	}
	
public void DeleteCameraName() throws InterruptedException
{
	deleteButton.click();

}
}
