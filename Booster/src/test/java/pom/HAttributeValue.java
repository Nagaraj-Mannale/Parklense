package pom;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HAttributeValue {
	WebDriver driver;
	public HAttributeValue(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
//*********************AttributeValueCreation**************************	
@FindBy(xpath="//select[@formcontrolname='DropdownControl']")WebElement attributeDropDown;
@FindBy(xpath="//input[@placeholder='Attribute Value Name']")WebElement nameTextField;
@FindBy(xpath="//span[@class='ng-arrow-wrapper']")WebElement attributeValuePageClientDrop;
@FindBy(xpath="//div[@class='ng-dropdown-panel-items scroll-host']/div[2]/div")List<WebElement> attributevaluenewPageClients;  
	
	public void SelectAttributeDropDown()
	{
		Select sel=new Select(attributeDropDown);
		sel.selectByVisibleText("Covered shelter");
	}
	public void scrollForEnter(WebDriver driver, WebElement element)
	   {
	  	 JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("arguments[0].scrollIntoView({behavior: 'auto', block: 'center', inline: 'center'});", element);
	   }
	
	public void EnterAttributeValue(String name)
	{
	    nameTextField.clear();
		nameTextField.sendKeys(name);
	}
	
	public void ClickOnClientdrop()
	{
		attributeValuePageClientDrop.click();
	}
    public void SelectClientOnNewPage(String name)
    {
    	for(WebElement a:attributevaluenewPageClients)
    	{
    		if(a.getText().equalsIgnoreCase(name))
    		{
    			scrollForEnter(driver, a);
    			a.click();
    			break;
    		}
    	}
    }
    @FindBy (xpath="//div[@class='table-responsive']//tbody/tr[1]/td[3]") WebElement avName;
    public String VerifyAvName()
    {
 	   String name=avName.getText();
 	   return name;
    }
    
    
    
    
    
    
//*******************************Deletion*********************************************************************
    @FindBy(xpath="(//button[@class='btn-wide-gray3 mb-3 mb-md-0'])[1]")WebElement deleteButton;
public void ClickOnDeleteButton()
{
	deleteButton.click();
}
}
