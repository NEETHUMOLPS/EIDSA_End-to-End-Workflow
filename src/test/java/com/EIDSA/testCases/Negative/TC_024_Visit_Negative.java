package com.EIDSA.testCases.Negative;

import java.io.IOException;

import org.testng.annotations.Test;

import com.EIDSA.pageObjects.Visit;

import Base.BaseClassTest;

public class TC_024_Visit_Negative extends BaseClassTest {
	
	@Test(priority=1)
	public void assigningTemplate() throws IOException, InterruptedException
	{
		Visit vp = new Visit(driver);
		vp.selectStudy("Study - 001");
		vp.clickVisit();
		vp.SearchVisitNo("002");
		vp.SearchVisitName("Visit - 002");
		vp.assignTemp("Visit - 002");
		vp.assign();
		vp.AssignAlert1();
		logger.info("Negative test passed");	
		driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void translate() throws IOException, InterruptedException
	{
		Visit vp = new Visit(driver);
		vp.SearchVisitNo("002");
		vp.SearchVisitName("Visit - 002");
		vp.view("Visit - 002");
		vp.Translate();
		/*vp.TransalteAlertNegative();*/
		logger.info("Negative test passed");	
	}

}
