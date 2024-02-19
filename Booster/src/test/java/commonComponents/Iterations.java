package commonComponents;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class Iterations 
{
	WebDriver driver;
	 
	public Iterations(WebDriver driver) 
	    {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
//*****************************************For picking feature links******************************************
    @FindBy(xpath = "//a[@class='nav-link nav-link-ref']/../../li")
    List<WebElement> allLinks;
    public void clickOnLinkByText(String feature) {
        for (WebElement link : allLinks) {
            if (link.getText().equalsIgnoreCase(feature)) {
                link.click();
                break;
            }
	   }
   }
 //**************************************1.Buttons(S,C,E,Sf,N,R)>KeyboardActions**********************************************
   @FindBy(xpath="//button[text()='Save']")                              WebElement saveButton ;
   @FindBy(xpath="//button[text()='Cancel']")                            WebElement cancelButton ;
   @FindBy (xpath="//button[.=' Delete']")                               WebElement deleteButton;
   @FindBy(xpath="//button[.='OK']")                                     WebElement popupOkButton;
   public void ClickOnDeleteButton() throws AWTException, InterruptedException
   { 
	  deleteButton.click();
	  popupOkButton.click();
   }
   public void SaveButton() throws AWTException, InterruptedException
   {
        saveButton.click();
        popupOkButton.click();
   }
   public void CancelButton() throws AWTException, InterruptedException
   {
   	cancelButton.click();
   }
   
   @FindBy(xpath ="//div[@class='page-content']//table/tbody/tr[1]//span[@class='btn-sm-gray3 edit']")  WebElement editbutton; 
   @FindBy (xpath="//input[@placeholder='Search By Name']")				 WebElement searchField;
   @FindBy(xpath="//div[@class='d-flex flex-wrap']//button[2]")          WebElement newButton;     
  
   
   public void EditICon() 
   { 
	  editbutton.click();
   }
   public void NewButton()
   {
   	newButton.click();
   }
   public void SearchField(String id) throws AWTException, InterruptedException
   {
       searchField.sendKeys(id);
   	   KeyBoardOption("Enter");
   }

   @FindBy(xpath="(//input[@type='radio' and @formcontrolname='radio'])[1]")         WebElement radioActive;   ////For lot its not working
   @FindBy(xpath="(//input[@type='radio' and @formcontrolname='radio'])[2]")         WebElement radioInactive;
   public void ClickOnRadiobutton(int id) 
   {
	   if (id==2)
	   {
		  radioInactive.click();
	   }
	   else
	   {
		   System.out.println("ByDefault Active In Status");
		  
	   }
   }
   public void KeyBoardOption(String a) throws AWTException, InterruptedException {
	    Robot robot = new Robot();
	    if (a.equalsIgnoreCase("scroll")) {
	        robot.keyPress(KeyEvent.VK_DOWN);
	        Thread.sleep(4000);
	        robot.keyRelease(KeyEvent.VK_DOWN);
	     
	    } 
	    else if(a.equalsIgnoreCase("tab")){
	    	 robot.keyPress(KeyEvent.VK_TAB);
	    	 robot.keyRelease(KeyEvent.VK_TAB);
	    }
	    else 
	    {
	        robot.keyPress(KeyEvent.VK_ENTER);
	        Thread.sleep(1000);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	    }   
	    
	}
//*********************************************2.AllDropDowns***********************************************
   @FindBy(xpath="//span[text()=' All Clients']") WebElement ClientDropDownButton;
   @FindBy(xpath="//span[text()=' All Clients']/../../following-sibling::div//li") 
   List<WebElement> clientsInDropDown;
   
   public String GetAndUseToVerifyClient(String clientname)
   {
	   
	   ClientDropDownButton.click();
	   String name="";
	   for(WebElement cname:clientsInDropDown)
	   {
		   if(cname.getText().equalsIgnoreCase(clientname))
		   {
			   name=cname.getText();
			   break;
		   }
	   }
	   return name;
   }
   
   
   
   public void ClientsOnHomePage(String client) throws InterruptedException
   {
	  ClientDropDownButton.click();
	  Thread.sleep(2000);
	  for(WebElement clientName:clientsInDropDown)
	    {
		   if(clientName.getText().equalsIgnoreCase(client))
		   {
			   clientName.click();
			   break;
		   }
	    }
     }
  @FindBy (xpath = "(//select[@formcontrolname='DropdownControl'])[1]") WebElement newPageClientDrop;//Exclude setting page
   public void SelectNewPageClient(String name)
   {
	  Select sel=new Select(newPageClientDrop);
	  sel.selectByVisibleText(name);
  }
   public String GetNewPageClient(String name)
   {
	  Select sel=new Select(newPageClientDrop); 
      WebElement option =sel.getOptions().stream()     // Find the option by its visible text
           .filter(o -> o.getText().equals(name))
           .findFirst()
           .orElse(null);
   
       String optionValue="";                         // Check if the option was found
       if (option != null) {
       
       String optionTextValue = option.getText();   // Get the text and value of the option
       optionValue = option.getAttribute("value");

       System.out.println("Option Text: " + optionTextValue);
       System.out.println("Option Value: " + optionValue);}
    else {
       System.out.println("Option not found");
   }
return optionValue;
}

  
  @FindBy(xpath="//span[text()=' All Status']")WebElement statusDropDown;
  @FindBy(xpath="//div[@class='filter-dropdown']/../div[2]/ul/li") List<WebElement> statusOptions;
 
  public void SelectStatus(String status)
  {
	   statusDropDown.click();
	   for(WebElement a:statusOptions)
	   {
		   if(a.getText().equalsIgnoreCase(status))
		   {
			   a.click();
			   break;
		   }
	   }
  }
  
  @FindBy(xpath="//div[@class='d-flex align-items-center']/select")WebElement nextPageDropDown;
  public void NextPageDropDown(String value)
  {
    Select sel=new Select(nextPageDropDown);
    sel.selectByValue(value);
  }
  
  @FindBy(xpath="//div[@class='d-flex flex-wrap']//button[1]") WebElement resetbutton;
  public void ResetButton()
  {
	   resetbutton.click();
  }
 

  //**********************************************3.First Record components****************************************** 
 
  @FindBy(xpath="//div[@class='table-responsive min-h-300']//tbody/tr")               
   List<WebElement>     featchAllRecords;
    public void featchAllRecordData()
    {
	  
    }
  @FindBy(xpath="//input[@placeholder='Search By Name']/../following-sibling::div[1]//tbody/tr[1]/td[1]")      
   WebElement featchFirstRecordId;//Except client
  
  @FindBy(xpath="//input[@placeholder='Search By Name']/../following-sibling::div[1]//tbody/tr[1]/td[2]")        
   WebElement featchFirstRecordName;   //Except client and attributeValue
  
  public String GetFirstRecordName()
   {
	   String name=featchFirstRecordName.getText();
	   return name;
   }
   public String GetFirstRecordId()
   {
	   String id=featchFirstRecordId.getText();
	   return id;
   }

//***************************************Page Text to verify the current page******************************************************   
   @FindBy(xpath="//div[@class='page-content']//h1")             WebElement pageText;
     public String VerifyCurrentPageText()
     {
   	   String text=pageText.getText();
       return text;
     }
     
     @FindBy(xpath="//p[.='No Records Found']") WebElement verifyDelete;
     public String DeletedRecordtext()
     {
    	 String text=verifyDelete.getText();
    	 return text;
     }
     
//*****************************************Setting page**********************************************************************
     @FindBy(xpath = "//div[@class='container-fluid']/ul/li") List<WebElement> settingLinks;
     public void ClickOnSettingLinksByText(String links){ 
      
     for(WebElement a:settingLinks)
       {
        if(a.getText().equals(links))       
        {
         a.click();
      	 break;
        }
       }}

   
}
