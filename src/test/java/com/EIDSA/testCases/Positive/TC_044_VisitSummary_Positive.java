package com.EIDSA.testCases.Positive;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.Dashboards;

import Base.BaseClassTest;

public class TC_044_VisitSummary_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void VisitSummary() throws IOException, InterruptedException
	{
		Dashboards ms = new Dashboards(driver);
		ms.clickVisitSummary();
		Thread.sleep(3000);
		if(driver.getCurrentUrl().equals("https://eidsa.dev.datamatica.uk/visitsummary"))
		{
			Assert.assertTrue(true);
			logger.info("Page verified");
		}
		else
		{
			captureScreen(driver, "VisitSummary");
			Assert.assertTrue(false);
			logger.info("Page not verified");
		}
	}



}
