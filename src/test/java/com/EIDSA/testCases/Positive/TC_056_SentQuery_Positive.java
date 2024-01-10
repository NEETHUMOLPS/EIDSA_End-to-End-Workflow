package com.EIDSA.testCases.Positive;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.EIDSA.pageObjects.SentQuery;
import Base.BaseClassTest;

public class TC_056_SentQuery_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void QueryIdSearch() throws IOException, InterruptedException
	{
		SentQuery sq = new SentQuery(driver);
		sq.clickAllQueries1();
		sq.clickQueryId("QRT-252630");
		sq.clickSearch();
		Assert.assertTrue(sq.QueryIdSearchValidation("QRT-252630"));
		logger.info("Query id search functionality verified");		
		driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void siteCodeSearch() throws IOException, InterruptedException
	{
		SentQuery sq = new SentQuery(driver);
		sq.clickAllQueries1();
		sq.clickSiteCode("Demo01");
		sq.clickSearch();
		Assert.assertTrue(sq.SiteCodeSearchValidation("Demo01"));
		logger.info("Site code search functionality verified");		
		driver.navigate().refresh();
	}
	
	@Test(priority=3)
	public void subjectIdSearch() throws IOException, InterruptedException
	{
		SentQuery sq = new SentQuery(driver);
		sq.clickAllQueries1();
		sq.clickSubjectId("demo05");
		sq.clickSearch();
		Assert.assertTrue(sq.SubjectIdSearchValidation("demo05"));
		logger.info("Subject id search functionality verified");		
		driver.navigate().refresh();
	}
	
	@Test(priority=4)
	public void queryStatusSearch() throws IOException, InterruptedException
	{
		SentQuery sq = new SentQuery(driver);
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
		SentQuery sq = new SentQuery(driver);
		sq.clickAllQueries1();
		sq.view("QRT-252630");
		logger.info("Form opened");		
	}

}
