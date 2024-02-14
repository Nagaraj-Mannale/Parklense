package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IClientRole 
{
	WebDriver driver;
	 public IClientRole(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
	 }
@FindBy(xpath="(//span[@class='dropdownvalue ng-star-inserted'])[1]")WebElement fClientDrop;
public boolean VerifyFClientDropDown()
{
	boolean verify=fClientDrop.isEnabled();
    return verify;
}
@FindBy(xpath="(//span[@class='dropdownvalue ng-star-inserted'])[2]")WebElement fStatusDrop;
public boolean VerifyStatusDropDown()
{
	boolean verify=fStatusDrop.isEnabled();
    return verify;
}
@FindBy(xpath="//input[@placeholder='Permission Title']")WebElement NpermissionTitle;
public boolean VerifyPermissionTitleField()
{
	boolean verify=NpermissionTitle.isEnabled();
    return verify;
}
public void ClearPermissiontitle()
{
	NpermissionTitle.clear();
    
}
public void EnterPermissiontitle(String title)
{
	NpermissionTitle.sendKeys(title);
    
}
@FindBy(xpath="//input[@type='checkbox']")
List<WebElement> allCheckBoxes;

public boolean verifyAllCheckBox() {
    int count = 0;
    int totalCheckboxes = allCheckBoxes.size();

    for (WebElement checkbox : allCheckBoxes) {
        if (checkbox.isSelected()) {
            count++;
        }
    }

    if (count == totalCheckboxes) {
        System.out.println("All checkboxes are selected");
    } else {
        System.out.println("Not all checkboxes are selected");
    }
	return true;
}


@FindBy(xpath="(//div[@class='sortingicon d-flex flex-column']/img)[2]")WebElement descButton;
public void ClickOnDescButton()
{
	descButton.click();
}


}