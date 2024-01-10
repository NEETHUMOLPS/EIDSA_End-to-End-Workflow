package com.EIDSA.testCases.Positive;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.EIDSA.pageObjects.ForgotPassword;
import Base.BaseClass;

public class TC_002_forgotPasswordOrUsername_Positive extends BaseClass{
	@Test(priority=1)
	public void forgotPassword() throws IOException, InterruptedException
	{
		ForgotPassword fp = new ForgotPassword(driver);
		fp.clickForgotPassword_ForgotUsername();
		fp.setEmail("neethumolp@datamatica.uk");
		fp.clickSubmit();
		fp.Alert1();
	}	
	
	@Test(priority=2)
	public void forgotUsername() throws IOException, InterruptedException
	{
		ForgotPassword fp = new ForgotPassword(driver);
		fp.clickForgotPassword_ForgotUsername();
		fp.clickUsername();
		fp.setEmail("neethumolp@datamatica.uk");
		fp.clickSubmit();
		fp.Alert2();
	}
	
}