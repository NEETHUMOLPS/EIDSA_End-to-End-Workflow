package com.EIDSA.testCases.Positive;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.Dashboards;

import Base.BaseClassTest;

public class TC_043_SiteSummary_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void SiteSummary() throws IOException, InterruptedException
	{
		Dashboards ms = new Dashboards(driver);
		ms.clickSiteSummary();
		Thread.sleep(3000);
		if(driver.getCurrentUrl().equals("https://eidsa.dev.datamatica.uk/sitesummary"))
		{
			Assert.assertTrue(true);
			logger.info("Page verified");
		}
		else
		{
			captureScreen(driver, "SiteSummary");
			Assert.assertTrue(false);
			logger.info("Page not verified");
		}
	}


}
