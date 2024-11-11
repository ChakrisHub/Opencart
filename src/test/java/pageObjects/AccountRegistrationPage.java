package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "input-firstname")
	WebElement firstname;
	
	@FindBy(id = "input-lastname")
	WebElement lastname;
	
	@FindBy(id = "input-email")
	WebElement email;
	
	@FindBy(id = "input-telephone")
	WebElement telephone;
	
	@FindBy(id = "input-password")
	WebElement password;
	
	@FindBy(id = "input-confirm")
	WebElement passwordConfirm;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement checkbox;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement continuebtn;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement confirmationtxt;
	
	
	public void setFirstname(String fname) {
		firstname.sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		lastname.sendKeys(lname);
	}
	
	public void setEmail(String Email) {
		email.sendKeys(Email);
	}
	
	public void setTelephone(String Telephone) {
		telephone.sendKeys(Telephone);
	}
	
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void confirmpassword(String Confirmpwd) {
		passwordConfirm.sendKeys(Confirmpwd);
	}
	
	public void Privacypolicy() {
		checkbox.click();
	}
	
	
	public void clickContinue() {
		continuebtn.click();
	}
	
	public String  getconfirmationMessage() {
		try {
			return (confirmationtxt.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}
	}

}
