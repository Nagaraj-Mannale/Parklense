package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AForgotPassword 
{
		public WebDriver driver;
		public AForgotPassword(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		
		}

	    @FindBy(xpath = "//a[text()='Forgot your password?']/..")
	    public WebElement forgotPasswordLink;

	    @FindBy(xpath = "//div[@class='logindetails pmt-2']/img")
	    public WebElement firstPageTextForVerify;

	    @FindBy(xpath = "//input[@type='text']")
	    public WebElement mailField;

	    @FindBy(xpath = "//button[text()='Reset']")
	    public WebElement resetButton;

	    @FindBy(xpath = "//div[@class='logindetails pmt-2']/img")
	    public WebElement lastPageTextForVerify;

	    @FindBy(xpath = "(//input[@placeholder='Enter at least 8+ characters'])[1]")
	    public WebElement lastPageEmailField;

	    @FindBy(xpath = "//a[text()='Edit']")
	    public WebElement editLink;

	    @FindBy(xpath = "//input[@placeholder='Code sent on registered email ID']")
	    public WebElement enterCode;

	    @FindBy(xpath = "//a[text()='Resend']")
	    public WebElement resendLink;

	    @FindBy(xpath = "(//input[@placeholder='Enter at least 8+ characters'])[2]")
	    public WebElement newPassword;

	    @FindBy(xpath = "(//input[@placeholder='Enter at least 8+ characters'])[3]")
	    public WebElement confirmPassword;

	    @FindBy(xpath = "//button[text()='Change Password']")
	    public WebElement changePasswordButton;

	    public boolean isForgotPasswordLinkEnabled() {
	        return forgotPasswordLink.isEnabled();
	    }

	    public void clickForgotPasswordLink() {
	        forgotPasswordLink.click();
	    }

	    public boolean verifyFirstPage() {
	        return firstPageTextForVerify.isDisplayed();
	    }

	    public void enterMail(String mail) {
	        mailField.sendKeys(mail);
	    }

	    public void clickResetButton() {
	        resetButton.click();
	    }

	    public boolean verifyLastPage() {
	        return lastPageTextForVerify.isDisplayed();
	    }

	    public void clickEditMailLink() {
	        editLink.click();
	    }

	    public String verifyLastMail() {
	        return lastPageEmailField.getText();
	    }

	    public boolean verifyCodeField() {
	        return enterCode.isEnabled();
	    }

	    public void clickResendLink() {
	        resendLink.click();
	    }

	    public boolean verifyNewPasswordField() {
	        return newPassword.isEnabled();
	    }

	    public boolean verifyConfirmPasswordField() {
	        return confirmPassword.isEnabled();
	    }

	    public boolean verifyChangePasswordButton() {
	        return changePasswordButton.isEnabled();
	    }
	}


