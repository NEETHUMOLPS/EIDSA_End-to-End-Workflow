package com.EIDSA.testCases.Positive;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.GeneralQuery;

import Base.BaseClassTest;

public class TC_059_GeneralQuery_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void GeneralQuery() throws IOException, InterruptedException
	{
		GeneralQuery gq = new GeneralQuery(driver);
		gq.clickGeneralQueries();
		gq.GeneralQueryCreation("Low");
		gq.Alert1();
		logger.info("Query generated");
	}
	
	@Test(priority=2)
	public void QueryIdSearch() throws IOException, InterruptedException
	{
		GeneralQuery gq = new GeneralQuery(driver);
		gq.clickGeneral();
		gq.clickQueryId("QRT-464970");
		gq.clickSearch();
		Assert.assertTrue(gq.QueryIdSearchValidation("QRT-464970"));
		logger.info("Query id search functionality verified");		
		driver.navigate().refresh();
	}
	
	@Test(priority=3)
	public void QuerySubjectSearch() throws IOException, InterruptedException
	{
		GeneralQuery gq = new GeneralQuery(driver);
		gq.clickGeneral();
		gq.clickQuerySubject("Subject");
		gq.clickSearch();
		Assert.assertTrue(gq.QuerySubjectSearchValidation("Subject"));
		logger.info("Query subject search functionality verified");		
		driver.navigate().refresh();
	}
	
	@Test(priority=4)
	public void QueryStatusSearch() throws IOException, InterruptedException
	{
		GeneralQuery gq = new GeneralQuery(driver);
		gq.clickGeneral();
		gq.clickQueryStatus("Open");
		gq.clickSearch();
		Assert.assertTrue(gq.QueryStatusSearchValidation("Open"));
		logger.info("Query status search functionality verified");		
		driver.navigate().refresh();
	}
	
	@Test(priority=5)
	public void View() throws IOException, InterruptedException
	{
		GeneralQuery gq = new GeneralQuery(driver);
		gq.clickGeneral();
		gq.view("QRT-464970");
		logger.info("Query opened");		
		driver.navigate().refresh();
	}

}
