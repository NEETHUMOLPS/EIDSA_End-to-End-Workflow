package com.EIDSA.testCases.Positive;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.AllQueries;

import Base.BaseClassTest;

public class TC_058_AllQuery_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void QueryIdSearch() throws IOException, InterruptedException
	{
		AllQueries sq = new AllQueries(driver);
		sq.clickAllQueries1();
		sq.clickQueryId("QRT-489762");
		sq.clickSearch();
		Assert.assertTrue(sq.QueryIdSearchValidation("QRT-489762"));
		logger.info("Query id search functionality verified");		
		driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void siteCodeSearch() throws IOException, InterruptedException
	{
		AllQueries sq = new AllQueries(driver);
		sq.clickAllQueries1();
		sq.clickSiteCode("06");
		sq.clickSearch();
		Assert.assertTrue(sq.SiteCodeSearchValidation("06"));
		logger.info("Site code search functionality verified");		
		driver.navigate().refresh();
	}
	
	@Test(priority=3)
	public void subjectIdSearch() throws IOException, InterruptedException
	{
		AllQueries sq = new AllQueries(driver);
		sq.clickAllQueries1();
		sq.clickSubjectId("Trail 001");
		sq.clickSearch();
		Assert.assertTrue(sq.SubjectIdSearchValidation("Trail 001"));
		logger.info("Subject id search functionality verified");		
		driver.navigate().refresh();
	}
	
	@Test(priority=4)
	public void queryStatusSearch() throws IOException, InterruptedException
	{
		AllQueries sq = new AllQueries(driver);
		sq.clickAllQueries1();
		sq.clickQueryStatus("Closed");
		sq.clickSearch();
		Assert.assertTrue(sq.QueryStatusSearchValidation("Closed"));
		logger.info("Query status search functionality verified");		
		driver.navigate().refresh();
	}
	
	@Test(priority=5)
	public void View() throws IOException, InterruptedException
	{
		AllQueries sq = new AllQueries(driver);
		sq.clickAllQueries1();
		sq.view("QRT-489762");
		logger.info("Form opened");		
	}
}
