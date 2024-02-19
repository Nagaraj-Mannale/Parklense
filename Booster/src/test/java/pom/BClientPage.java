package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BClientPage 
{
public WebDriver driver;
	
	public BClientPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

//************************************************************CreationOfClient*************************************************************	
	@FindBy(xpath="//input[@placeholder='Client Name']")                 WebElement clientName;
    @FindBy(xpath="//input[@placeholder='Mobile']")                      WebElement clientMobile;
    @FindBy(xpath="//input[@placeholder='Email']")                       WebElement clientEmail;
    @FindBy(xpath="//input[@placeholder='Address 1']")                   WebElement clientAdress1;
    @FindBy(xpath="//input[@placeholder='Address 2']")                   WebElement adress2;
    @FindBy(xpath="//input[@placeholder='Address 3']")                   WebElement adress3;
    @FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[1]")   WebElement clientCountryDrop;
    @FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[2]")   WebElement clientStateDrop;
    @FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[3]")   WebElement clientCityDrop;
    @FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[4]")   WebElement clientTypeDrop;
    
    @FindBy(xpath="//input[@placeholder='Search By Name']/../following-sibling::div[1]//tbody/tr[1]/td[3]")        
    WebElement clientFirstRecordName;
    @FindBy(xpath="input[@placeholder='Search By Name']/../following-sibling::div[1]//tbody/tr[1]/td[2]") WebElement ClientFirstRecordID;
    @FindBy(xpath="(//button[@class='input-group-text'])[1]")            WebElement clientStartDate;
    @FindBy(xpath="(//button[@class='input-group-text'])[2]")            WebElement clientEndDate;
   
    @FindBy(xpath="//div[@class='ngb-dp-month']//div[@role='gridcell']")  List<WebElement> datesLink;
    @FindBy(xpath="//select[@title='Select month']")      WebElement monthDropdown;
    @FindBy(xpath="//select[@title='Select year']")       WebElement yearDropDown;
    @FindBy(xpath="//div[@class='btn-light']")       List<WebElement> days_dropdown;
   
    public void selectDate(String year, String month, String date, int startORend) 
    {
      	WebElement dateField = (startORend == 1) ? clientStartDate : clientEndDate;
        dateField.click();
        
 		Select years=new Select(yearDropDown);
 		Select months=new Select(monthDropdown);
 		years.selectByVisibleText(year);
 		months.selectByVisibleText(month);
 		for(WebElement a:datesLink)
 		{
 			if(a.getText().equals(date))
 			{
 				a.click();
 				break;
 			}
 		}

 	}
   public String FirstRecordClientName()
   {
	   String name=clientFirstRecordName.getText();
	   return name;
   }
   public String FirstRecordClientId()
   {
	   String id=ClientFirstRecordID.getText();
	   return id;
   }
    public void EnterClientName(String Name)
    {
    	clientName.sendKeys(Name);
    }
    public void EnterClientMobileNumber(String number)
    {
    	clientMobile.sendKeys(number);
    }
    public void EnterClientEMail(String emailid)
    {
    	clientEmail.sendKeys(emailid);
    }
    public void EnterClientadress(String adress)
    {
    	clientAdress1.sendKeys(adress);
    }
    public void SelectCountry()
    {
    	Select sel=new Select(clientCountryDrop);
    	sel.selectByValue("1");
    }
    public void SelectState(String value)
    {
    	Select sel=new Select(clientStateDrop);
    	sel.selectByValue(value);
    
    }
    public void SelectCity(String city)
    {
    	Select sel=new Select(clientCityDrop);
    	sel.selectByVisibleText(city);
    	
    }
    public void SelectClientType(String type)
    {
    	Select sel=new Select(clientTypeDrop);
    	sel.selectByValue(type);
    }
//*******************************************************ClientUpdation*************************************************************************
   
    public void EditClientName(String name) throws InterruptedException
    {
    	Thread.sleep(2000);
        clientName.clear();
        Thread.sleep(2000);
        clientName.sendKeys(name);
    }
    public void EditClientAdress(String adress)
    {
    	clientAdress1.clear();
    	clientAdress1.sendKeys(adress);
    }
    public void EditClientMail(String mail)
    {
    	clientEmail.clear();
    	clientEmail.sendKeys(mail);
    }
    
    public void EditClientMobileField(String mobNumber) throws InterruptedException
     {
    	Thread.sleep(2000);
    	clientMobile.clear();
         Thread.sleep(2000);
         clientMobile.sendKeys(mobNumber);
     }
    
//******************************************************CLientHomePage*************************************************************************    
    @FindBy(xpath="(//div[@class='filter-dropdown'])[1]")                         WebElement client_filter;
	@FindBy(xpath="(//div[@class='filter-dropdown'])[1]/..//div[2]//input")       WebElement client_search_field;
	@FindBy(xpath="((//div[@class='filter-dropdown'])[1]/..//div[2]//span)[1]")   WebElement alltype;
	@FindBy(xpath="((//div[@class='filter-dropdown'])[1]/..//div[2]//span)[2]")   WebElement pilot_client;
	@FindBy(xpath="((//div[@class='filter-dropdown'])[1]/..//div[2]//span)[3]")   WebElement live_client;
	@FindBy(xpath="(//div[@class='filter-dropdown'])[2]")                         WebElement status_filter;
	@FindBy(xpath="//div[@data-popper-placement='bottom-start']//input")          WebElement status_search_field;
	@FindBy(xpath="(//div[@data-popper-placement='bottom-start']//span)[1]")      WebElement status_All;
	@FindBy(xpath="(//div[@data-popper-placement='bottom-start']//span)[1]")      WebElement status_active;
	@FindBy(xpath="(//div[@data-popper-placement='bottom-start']//span)[1]")      WebElement status_in_active;
    @FindBy(xpath="//select[@class='form-select form-select ms-2 me-2']")         WebElement page_drop_down;

    @FindBy(xpath="(//div[@class='table-responsive']//tbody/tr/td[8])[1]")            WebElement client_filter_by_Status;
 
    @FindBy(xpath="((//div[@class='table-responsive']//tbody/tr/td[9])[1]//div)[2]/span/img") WebElement clientFirstKebabIcon;

  
   public void client_search_field()
	{
	 client_search_field.click();	
	}
   public void SelectStatus()
	{
		status_filter.click();
	}
   public void SelectPagination()
   {
	   page_drop_down.click();
   }
   
   public void StatusSearchField(String status)
	{
		status_search_field.sendKeys(status);
	}
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
