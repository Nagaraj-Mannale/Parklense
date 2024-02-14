package myBrowsers;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser 
{
 public static WebDriver driver;
 @Before	
 public void setup()
 {
   WebDriverManager.chromedriver().setup();
   driver=new ChromeDriver();
   driver.get("https://parklens-admin.tech-active.com/");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   
 }
 @After
 public void teardown()
 {
	 driver.quit();
 }
}
