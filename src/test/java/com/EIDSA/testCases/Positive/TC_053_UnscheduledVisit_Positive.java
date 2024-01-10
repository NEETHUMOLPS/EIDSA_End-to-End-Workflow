package com.EIDSA.testCases.Positive;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.UnscheduledVisit;

import Base.BaseClassTest;

public class TC_053_UnscheduledVisit_Positive extends BaseClassTest{
	
	@Test(priority=1)
	public void SubIdSearchValidation() throws IOException, InterruptedException
	{
		UnscheduledVisit uv = new UnscheduledVisit(driver);
		uv.clickUnscheduledVisit();
		uv.searchSubjectId("demo05");
		uv.search();
		Assert.assertTrue(uv.subjectIdSearchValidation("demo05"));
		logger.info("Subject id search verification successfully completed");
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
	
	
	@Test(priority=2)
	public void StatusSearchValidation() throws IOException, InterruptedException
	{
		UnscheduledVisit uv = new UnscheduledVisit(driver);
		uv.clickUnscheduledVisit();
		uv.searchSubjectId("demo05");
		uv.searchStatus("Completed");
		uv.search();
		Assert.assertTrue(uv.statusSearchValidation("Completed"));
		logger.info("Status search verification successfully completed");
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
	
	@Test(priority=3)
	public void DateSearchValidation() throws IOException, InterruptedException
	{
		UnscheduledVisit uv = new UnscheduledVisit(driver);
		uv.clickUnscheduledVisit();
		uv.searchSubjectId("demo05");
		uv.SearchVisitDate("27-04-2023", "28-04-2023");
		uv.search();
		Assert.assertTrue(uv.dateSearchValidation("27/04/2023"));
		logger.info("Date search verification successfully completed");
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
	
	@Test(priority=4)
	public void view() throws IOException, InterruptedException
	{
		UnscheduledVisit uv = new UnscheduledVisit(driver);
		uv.clickUnscheduledVisit();
		uv.searchSubjectId("demo05");
		uv.search();
		uv.view("6");
		logger.info("Form opened");
	}

}
