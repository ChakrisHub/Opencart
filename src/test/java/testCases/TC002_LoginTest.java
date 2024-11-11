package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;

import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {
	
	@Test(groups= {"sanity", "master"})
	public void verify_login() {
		logger.info("*TC002_LoginTest Starting*");
		
		try {
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			
			LoginPage lp = new LoginPage(driver);
			lp.setEmail(p.getProperty("email"));
			lp.setPassword(p.getProperty("password"));
			lp.ClickLogin();
			
			MyAccountPage ma = new MyAccountPage(driver);
			boolean targetmsg = ma.isMyAccountPageExists();
			Assert.assertTrue(targetmsg);
		} catch (Exception e) {
			Assert.fail();
		}
		logger.info("TC002_LoginTest Finished");
		
		
		
	}
	
	
}
