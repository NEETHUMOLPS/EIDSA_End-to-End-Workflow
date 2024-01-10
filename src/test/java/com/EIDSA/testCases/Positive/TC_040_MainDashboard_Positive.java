package com.EIDSA.testCases.Positive;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.Dashboards;

import Base.BaseClassTest;

public class TC_040_MainDashboard_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void MainDashboard() throws IOException, InterruptedException
	{
		Dashboards ms = new Dashboards(driver);
		ms.clickMainDashboard();
		Thread.sleep(3000);
		if(driver.getCurrentUrl().equals("https://eidsa.dev.datamatica.uk/home"))
		{
			Assert.assertTrue(true);
			logger.info("Page verified");
		}
		else
		{
			captureScreen(driver, "MainDashboard");
			Assert.assertTrue(false);
			logger.info("Page not verified");
		}
	}

}
