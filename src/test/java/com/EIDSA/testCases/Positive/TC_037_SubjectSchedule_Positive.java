package com.EIDSA.testCases.Positive;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.SubjectSchedule;

import Base.BaseClassTest;

public class TC_037_SubjectSchedule_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void siteCodeSearch() throws IOException, InterruptedException
	{
		SubjectSchedule fs = new SubjectSchedule(driver);
		fs.clickSubjectSchedule();
		fs.searchSiteCode("08");
		Thread.sleep(3000);
		fs.searchSubId("02");
		Thread.sleep(3000);
		fs.ClickSearch();
		Thread.sleep(3000);
		Assert.assertTrue(fs.siteCodeSearchValidation("08"));
		Assert.assertTrue(fs.subjectIdSearchValidation("02"));
		logger.info("Site code and Subject Id search functionality verified");		
		driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void visitNameSearch() throws IOException, InterruptedException
	{
		SubjectSchedule fs = new SubjectSchedule(driver);
		fs.clickSubjectSchedule();
		fs.searchSiteCode("08");
		Thread.sleep(3000);
		fs.searchSubId("02");
		Thread.sleep(3000);
		fs.searchVisitName("visit 03");
		fs.ClickSearch();
		Assert.assertTrue(fs.visitNameSearchValidation("03"));
		logger.info("Visit name search functionality verified");		
		driver.navigate().refresh();
	}
	
	@Test(priority=3)
	public void statusSearch() throws IOException, InterruptedException
	{
		SubjectSchedule fs = new SubjectSchedule(driver);
		fs.clickSubjectSchedule();
		fs.searchSiteCode("08");
		Thread.sleep(3000);
		fs.searchSubId("02");
		Thread.sleep(3000);
		fs.searchStatus("Completed");
		fs.ClickSearch();
		Assert.assertTrue(fs.statusSearchValidation("Completed"));
		logger.info("Status search functionality verified");		
		driver.navigate().refresh();
	}
	
	@Test(priority=4)
	public void dateSearch() throws IOException, InterruptedException
	{
		SubjectSchedule fs = new SubjectSchedule(driver);
		fs.clickSubjectSchedule();
		fs.searchSiteCode("08");
		Thread.sleep(3000);
		fs.searchSubId("02");
		Thread.sleep(3000);
		fs.SearchVisitDate("04-05-2023", "04-05-2023");
		fs.ClickSearch();
		fs.dateSearchValidation("04/05/2023");
		Thread.sleep(3000);
		logger.info("Date search validated ");	
	}
	
	@Test(priority=5)
	public void clickView() throws IOException, InterruptedException
	{
		SubjectSchedule fs = new SubjectSchedule(driver);
		fs.clickSubjectSchedule();
		fs.searchSiteCode("08");
		Thread.sleep(3000);
		fs.searchSubId("02");
		Thread.sleep(3000);
		fs.ClickSearch();
		fs.view("visit 05");
		logger.info("Form opened");
	}


}
