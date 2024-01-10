package com.EIDSA.testCases.Negative;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.EIDSA.pageObjects.ForgotPassword;

import Base.BaseClass;

public class TC_004_forgotPassword_Negative extends BaseClass{
	@Test(priority=1)
	public void forgotPassword_Negative1() throws IOException, InterruptedException
	{
		logger.info("URL is opened");
		ForgotPassword fp = new ForgotPassword(driver);
		fp.clickForgotPassword_ForgotUsername();
		logger.info("Clicked on Forgot Password");
		fp.clickEmail();
		fp.setEmail("neethumolps@datamatica.uk");
		fp.clickSubmit();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("No user found"));
		alert.accept();
		logger.info("Negative test passed");	      
	}

	public void forgotPassword_Negative2() throws IOException, InterruptedException
	{
		logger.info("URL is opened");
		ForgotPassword fp = new ForgotPassword(driver);
		fp.clickForgotPassword_ForgotUsername();
		logger.info("Clicked on Forgot Password");
		fp.clickEmail();
		fp.setEmail("neethumolps@datamatica.uk");
		fp.clickSubmit();
		Thread.sleep(3000);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(fp.ErrorMsg(), "Please enter a valid email address.");
		softAssert.assertAll();
        logger.info("Negative test passed");
	}

}