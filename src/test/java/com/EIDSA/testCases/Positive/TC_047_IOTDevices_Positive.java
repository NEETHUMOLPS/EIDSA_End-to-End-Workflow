package com.EIDSA.testCases.Positive;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.IOT;

import Base.BaseClassTest;

public class TC_047_IOTDevices_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void IOTDevices() throws IOException, InterruptedException
	{
		IOT ms = new IOT(driver);
		ms.clickIOTDevices();
		Thread.sleep(3000);
		if(driver.getCurrentUrl().equals("https://eidsa.dev.datamatica.uk/IOTDevices"))
		{
			Assert.assertTrue(true);
			logger.info("Page verified");
		}
		else
		{
			captureScreen(driver, "IOTDevices");
			Assert.assertTrue(false);
			logger.info("Page not verified");
		}
	}


}
