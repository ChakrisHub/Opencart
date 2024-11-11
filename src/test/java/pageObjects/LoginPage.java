package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id ="input-email")
	WebElement email;
	
	@FindBy(id =  "input-password")
	WebElement password;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginbtn;
	
	public void setEmail(String Email) {
		email.sendKeys(Email);
	}
	
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void ClickLogin() {
		loginbtn.click();
	}

}
