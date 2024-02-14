package Validations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class validationofbutton {
	
	public WebDriver driver;
	
	@BeforeClass
	public void beforetest() {

//		ChromeOptions options = new ChromeOptions();
////        options.setBrowserVersion("119.0.6045.199");
//        options.setCapability("browserVersion", "119.0.6045.199");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test
	public void Buttonvalidation() {
		
		WebElement button = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		
		WebElement textmessage = driver.findElement(By.xpath("//p[@id='dynamicClickMessage']"));
		
		if(button.isDisplayed() && button.isEnabled()) {
			System.out.println("Name of the Button :- "+button.getText());
			button.click();
			System.out.println("Response message after click button :- "+textmessage.getText());
			
		} else {
			System.out.println("Button is not Displayed and not Enabled");
		}
		
	}
	
	
	@AfterClass
	public void aftertest() {
		
		driver.quit();
	}

}