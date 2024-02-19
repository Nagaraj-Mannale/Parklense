package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ADashboard 
{
	   public WebDriver driver;
		public  ADashboard(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath = "//input[@placeholder='Search By Name']/../following-sibling::div[1]/div/div[2]//ul//a[@aria-label='Last']")
		private WebElement lastButton;

		@FindBy(xpath = "//input[@placeholder='Search By Name']/../following-sibling::div[1]/div/div[2]//ul//a[@aria-label='Last']/../preceding-sibling::li[2]")
		private WebElement lastPageNumber;

		public void clickOnLastPageButton() {
		    lastButton.click();
		}

		public void getLastPageNumber() throws InterruptedException {
			 lastButton.click();
			 Thread.sleep(2000);
			lastPageNumber.click();
		    System.out.println(lastPageNumber.getText());
		}

		public void getRowCount() {
		    List<WebElement> clientRecordCount = driver.findElements(By.xpath("//input[@placeholder='Search By Name'] /../following-sibling::div[1]//tbody//tr"));
		   
		    System.out.println(clientRecordCount.size());
		}

//		//public int calculateWholeRecords() throws InterruptedException {
//			String lastPage = getLastPageNumber();
//		    int a = getRowCount();
//		    
//		    
//		    // Parse the last page number as an integer
//		    int lastPageNumber = Integer.parseInt(lastPage);
//		    
//		    // Calculate the total count of records
//		    int totalCount = (lastPageNumber - 1) * 10 + a;
//		    System.out.println(totalCount);
//		    return totalCount;
//		}
        
		@FindBy (xpath ="//span[text()=' Dashboard']")                                WebElement dashboard;
		@FindBy (xpath ="//h3[text()='Prospects']/../following-sibling::div/h1")      WebElement prospects;
		@FindBy (xpath ="//h3[text()='Lots']/../following-sibling::div/h1")           WebElement lot;
	    @FindBy (xpath ="//h3[text()='Stalls']/../following-sibling::div/h1")         WebElement Stalls;
	    @FindBy (xpath ="//h3[text()='Live Cameras']/../following-sibling::div/h1")   WebElement liveCamera;
	    @FindBy (xpath ="//h3[text()='Down Cameras']/../following-sibling::div/h1")   WebElement downCamera;
	    @FindBy (xpath ="(//div[@class='table-responsive'])[1]/../div/h4[2]/a")       WebElement expiryThisMonth;
	    @FindBy (xpath ="(//div[@class='table-responsive'])[3]/../div/h4[2]/a")       WebElement lotMaintainance;
	    	    	    
	  	    public String prospects_count()
	    {
	    	 String total = prospects.getText();
	    	 return total;
	    }
	    public String LotCount()
	    {
	    	String active_lot=lot.getText();
	    	return active_lot;
	    }
	    public String StallsCount()
	    {
	    String stalls=Stalls.getText();
	    return stalls;
	    }
	    public String LiveCamera()
	    {
	    	String Lcameras=liveCamera.getText();
	    	return Lcameras;
	    }
	    public String DownCamera()
	    {
	    	String Dcameras=downCamera.getText();
	    	return Dcameras;
	    }
	    public void ClickOnClientViewLink()
	    {
	    	expiryThisMonth.click();
	    }
	    public void ClickOnMainatainanceLotsLink()
	    {
	    	lotMaintainance.click();
	    }
}
