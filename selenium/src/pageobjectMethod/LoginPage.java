package pageobjectMethod;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	// to avoid StaleReferenceException
	@FindBy(name="username")private WebElement UsernameTB;
	@FindBy(name="pwd")private WebElement PasswordTB;
	@FindBy(id="loginButton")private WebElement LoginButton;
	@FindBy(id="keepLoggedInCheckBox")private WebElement LoggedInCheckbox;
	@FindBy(xpath="//a[.='Actimind Inc.']")private WebElement ActiMindLink;
	@FindBy(id="licenseLink")private WebElement LicenseLink;
	//
	public WebElement getUsernameTB() {
		return UsernameTB;
	}
	public WebElement getPasswordTB() {
		return PasswordTB;
	}
	public WebElement getLoginButton() {
		return LoginButton;
	}
	public WebElement getLoggedInCheckbox() {
		return LoggedInCheckbox;
	}
	public WebElement getActiMindLink() {
		return ActiMindLink;
	}
	public WebElement getLicenseLink() {
		return LicenseLink;
	}

	//operational method
	public void actiTimeValidLogin(String validUsername,String validPassword ) throws InterruptedException {
		UsernameTB.sendKeys(validUsername);
		Thread.sleep(2000);
		PasswordTB.sendKeys(validPassword);
		Thread.sleep(2000);
		LoginButton.click();
	}
	public void actiTimeInvalidLogin(String  invalidUsername, String invalidPassword) throws InterruptedException
	{
		UsernameTB.sendKeys(invalidUsername);
		Thread.sleep(2000);
		PasswordTB.sendKeys(invalidPassword);
		Thread.sleep(2000);
		LoginButton.click();

	}
}
