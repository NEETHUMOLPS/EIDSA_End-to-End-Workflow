package com.EIDSA.testCases.Positive;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.Dashboards;

import Base.BaseClassTest;

public class TC_041_NurseDashboard_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void NurseDashboard() throws IOException, InterruptedException
	{
		Dashboards ms = new Dashboards(driver);
		ms.clickNurseDashboard();
		Thread.sleep(3000);
		if(driver.getCurrentUrl().equals("https://eidsa.dev.datamatica.uk/nursesummary"))
		{
			Assert.assertTrue(true);
			logger.info("Page verified");
		}
		else
		{
			captureScreen(driver, "NurseDashboard");
			Assert.assertTrue(false);
			logger.info("Page not verified");
		}
	}


}
