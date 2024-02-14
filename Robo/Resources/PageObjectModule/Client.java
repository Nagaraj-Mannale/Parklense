package PageObjectModule;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Client 
{
	public WebDriver driver;
	public Client(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@placeholder='Client Name']")                 WebElement clientName;
    @FindBy(xpath="//input[@placeholder='Mobile']")                      WebElement clientMobile;
    @FindBy(xpath="//input[@placeholder='Email']")                       WebElement clientEmail;
    @FindBy(xpath="//input[@placeholder='Address 1']")                   WebElement clientAdress1;
    
    public void EnterClientName(String Name){
    	      clientName.sendKeys(Name);    }
    
    public void EnterClientMobileNumber(String number){
    	clientMobile.sendKeys(number);                }
    
    public void EnterClientEMail(String emailid){
    	clientEmail.sendKeys(emailid);          }
    
    public void EnterClientadress(String adress)
    {
    	clientAdress1.sendKeys(adress);
    }
    
    @FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[1]")   WebElement clientCountryDrop;
    @FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[2]")   WebElement clientStateDrop;
    @FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[3]")   WebElement clientCityDrop;
    @FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[4]")   WebElement clientTypeDrop;
    
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
    @FindBy(xpath="(//button[@class='input-group-text'])[1]")            WebElement clientStartDate;
    @FindBy(xpath="(//button[@class='input-group-text'])[2]")            WebElement clientEndDate;
    @FindBy(xpath="//div[@class='ngb-dp-month']//div[@role='gridcell']")  List<WebElement> datesLink;
    @FindBy(xpath="//select[@title='Select month']")                     WebElement monthDropdown;
    @FindBy(xpath="//select[@title='Select year']")                      WebElement yearDropDown;
    
    public void datefield(String year, String month,String date, int startORend)
    {
    	WebElement datefield=(startORend==1)? clientStartDate : clientEndDate;
    	datefield.click();
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
 	}	}   }
    
    
}
