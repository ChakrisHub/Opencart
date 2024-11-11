package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {

	
	
	@Test(groups= {"regression", "master"})
	public void account_registration() {
		logger.info("*** TC001_AccountRegistrationTest Started ***");
		try {
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			logger.info("*clicked on myaccount*");
			hp.clickRegister();
			logger.info("*clicked on register*");
			
			AccountRegistrationPage arp = new AccountRegistrationPage(driver);
			logger.info("Providing Customer Details");
			arp.setFirstname(randomeString().toUpperCase());
			arp.setLastName(randomeString().toUpperCase());
			arp.setEmail(randomeString()+"@gmail.com");
			arp.setTelephone(randomeNumber());
			String password = randomeAlphaNumberic();
			arp.setPassword(password);
			arp.confirmpassword(password);
			arp.Privacypolicy();
			arp.clickContinue();
			logger.info("validating expected message");
			String validationtxt = arp.getconfirmationMessage();
			if (validationtxt.equals("Your Account Has Been Created!")) {
				Assert.assertTrue(true);
			}
			else {
				logger.error("Test Failed...");
				Assert.assertTrue(false);
			}
		} catch (Exception e) {
			
			Assert.fail();
		}
		
		logger.info("*** TC001_AccountRegistrationTest Finished ***");	
	}
	
	
		
	}

