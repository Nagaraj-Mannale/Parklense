package basicCode;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonCodes 
{
  WebDriver driver;
  public CommonCodes(WebDriver driver)
  {
	  this.driver= driver;
	  PageFactory.initElements(driver, this);
  }
//******************************************************* All features links  
  @FindBy(xpath = "//a[@class='nav-link nav-link-ref']/../../li")
  List<WebElement> allLinks;
  public void clickOnLinkByText(String feature) 
  {
      for (WebElement link : allLinks) 
      {
          if (link.getText().equalsIgnoreCase(feature)) 
          {
              link.click();
              break;
  }   }   }
  
  @FindBy(xpath="//div[@class='d-flex flex-wrap']//button[2]")WebElement newButton;
  @FindBy(xpath ="//div[@class='page-content']//table/tbody/tr[1]//span[@class='btn-sm-gray3 edit']")  WebElement editbutton; 
  @FindBy (xpath="//input[@placeholder='Search By Name']")				 WebElement searchfield;
	
  public void Newbutton(){
	   newButton.click();}
  
  public void EditButton(){
	   editbutton.click();}
  
  public void SearchField(){
   	   searchfield.click();}
  
  
  
  @FindBy(xpath="//button[text()='Save']")                              WebElement saveButton ;
  @FindBy(xpath="//button[text()='Cancel']")                            WebElement cancelButton ;
  @FindBy (xpath="//button[.=' Delete']")                               WebElement deleteButton;
  @FindBy(xpath="//button[.='OK']")                                     WebElement popupOkButton;
 
  public void DeleteButton(){ 
	   deleteButton.click();
	  popupOkButton.click();}
  
  public void SaveButton(){
       saveButton.click();
    popupOkButton.click();}
  
  public void CancelButton(){
  	cancelButton.click();   }
  
  
  
}
