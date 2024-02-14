package PageObjectModule;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ADashboard 
{
	   public WebDriver driver;
		public  ADashboard(WebDriver driver)
		{
			this.driver=driver;
		}
		
//*****************************Get Count*********************************************************
	/*	@FindBy (xpath="//input[@placeholder='Search By Name'] /../following-sibling::div[1]//tbody//tr")  List<WebElement> clientRecordCount;
		@FindBy(xpath ="//input[@placeholder='Search By Name']"
	                       + "/../following-sibling::div[1]/div/div[2]//ul//a[@aria-label='Last']") WebElement lastButton;
		@FindBy(xpath ="//input[@placeholder='Search By Name']"
+ "/../following-sibling::div[1]/div/div[2]//ul//a[@aria-label='Last']/../preceding-sibling::li[2]")WebElement lastPageNumber;
        public void ClickOnLastPageButton()
        {
        	lastButton.click();
        }
        String pageNumber="";
        public void GetLastPageNumber()
        {   
        	lastPageNumber.click();
        	pageNumber=lastPageNumber.getText();
        	
        }
        int a=0;
        public void GetRowCount()
        {
        	a=clientRecordCount.size();
        	 
        }
        public int CalculateWholeRecords() throws InterruptedException
        {
        	ClickOnLastPageButton();
        	Thread.sleep(2000);
        	GetLastPageNumber();
        	Thread.sleep(2000);
        	GetRowCount();
        	int lastPageNumber = Integer.parseInt(pageNumber);
        	int sum=(lastPageNumber-1)*10+a;
        	System.out.println(sum);
            return sum;
        }*/
		//@FindBy(xpath = "//input[@placeholder='Search By Name']")
		//private WebElement searchInput;

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
        
		@FindBy (xpath ="//span[text()=' Dashboard']")                         WebElement dashboard;
		@FindBy (xpath ="(//div[@class='pp-4 ppt-2 mb-2'])[1]/h1")             WebElement prospects;
		@FindBy (xpath ="(//div[@class='pp-4 ppt-2'])[2]/h1")                  WebElement lot;
	    @FindBy (xpath ="(//div[@class='pp-4 ppt-2'])[3]/h1")                  WebElement Stalls;
	    @FindBy (xpath ="(//div[@class='pp-4 ppt-2'])[4]/h1")                  WebElement liveCamera;
	    @FindBy (xpath ="(//div[@class='pp-4 ppt-2'])[5]/h1")                  WebElement downCamera;
	    @FindBy (xpath ="(//div[@class='table-responsive'])[1]/../div/h4[2]/a")WebElement expiryThisMonth;
	    @FindBy (xpath ="(//div[@class='table-responsive'])[3]/../div/h4[2]/a")WebElement lotMaintainance;
	    	    	    
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
