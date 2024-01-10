package com.EIDSA.testCases.Negative;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.EIDSA.pageObjects.LoginPage;
import com.EIDSA.utilities.XLUtility;
import Base.BaseClass;

public class TC_002_loginTest_Negative extends BaseClass{

	@Test(priority=1)
	public void loginWithInvalidEmailAndPassword() throws InterruptedException
	{
		logger.info("URL is opened");
		LoginPage lp=new LoginPage(driver);
		lp.login("Neethumol", "neethumolp@datamatica.u", "Neethu4");
		Thread.sleep(1000);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(lp.ErrorMsg1(), "Invalid username or password.");
		softAssert.assertAll();
        logger.info("Negative test passed");
	}	

	@Test(priority=2)
	public void loginWithInvalidUsername() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.clearUsername();
		lp.clearEmail();
		lp.clearPassword();
		lp.login("Neethumolp", "neethumolp@datamatica.uk", "Neethu4");
		Thread.sleep(1000);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(lp.ErrorMsg2(), "The username is not associated with this account.");
		softAssert.assertAll();
        logger.info("Negative test passed");
        lp.clearLoginCredentials();
	}
	
	@Test(priority=3)
	public void loginWithBlankEmail() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.clearUsername();
		lp.clearEmail();
		lp.clearPassword();
		lp.login("Neethumol", "", "Neethu4");
		Thread.sleep(1000);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(lp.ErrorMsg4(), "The email field is required");
		softAssert.assertAll();
        logger.info("Negative test passed");
        lp.clearLoginCredentials();
	}
	
	@Test(priority=4)
	public void loginWithBlankPassword() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.clearUsername();
		lp.clearEmail();
		lp.clearPassword();
		lp.login("Neethumol", "neethumolp@datamatica.uk", "");
		Thread.sleep(1000);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(lp.ErrorMsg5(), "The password field is required");
		softAssert.assertAll();
        logger.info("Negative test passed");
        lp.clearLoginCredentials();
	}
	
	@Test(priority=5)
	public void loginWithBlankUsername() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.clearUsername();
		lp.clearEmail();
		lp.clearPassword();
		lp.login("", "neethumolp@datamatica.uk", "Neethu4");
		Thread.sleep(1000);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(lp.ErrorMsg3(), "The username field is required");
		softAssert.assertAll();
		 lp.clearLoginCredentials();
	}
	
	
}