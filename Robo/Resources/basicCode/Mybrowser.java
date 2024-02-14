package basicCode;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Mybrowser 
{
  public static WebDriver driver;
  @Before
  public void setup()
  {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://parklens-admin.tech-active.com/auth");
	  
  }
  @After
  public void close()
  {
	  driver.quit();
  }
}
