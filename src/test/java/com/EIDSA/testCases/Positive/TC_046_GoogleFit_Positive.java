package com.EIDSA.testCases.Positive;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.IOT;

import Base.BaseClassTest;

public class TC_046_GoogleFit_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void GoogleFit() throws IOException, InterruptedException
	{
		IOT ms = new IOT(driver);
		ms.clickGoogleFit();
		Thread.sleep(3000);
		if(driver.getCurrentUrl().equals("https://eidsa.dev.datamatica.uk/googlefitscreen"))
		{
			Assert.assertTrue(true);
			logger.info("Page verified");
		}
		else
		{
			captureScreen(driver, "GoogleFit");
			Assert.assertTrue(false);
			logger.info("Page not verified");
		}
	}


}
