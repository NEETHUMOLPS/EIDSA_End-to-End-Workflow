package com.EIDSA.testCases.Positive;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.FormsInReview;

import Base.BaseClassTest;

public class TC_035_FormsInReview_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void siteCodeSearch() throws IOException, InterruptedException
	{
		FormsInReview fs = new FormsInReview(driver);
		fs.clickFormsInReview();
		fs.searchSiteCode("Demo01");
		fs.ClickSearch();
		Assert.assertTrue(fs.siteCodeSearchValidation("Demo01"));
		logger.info("Site code search functionality verified");		
		driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void subjectIdSearch() throws IOException, InterruptedException
	{
		FormsInReview fs = new FormsInReview(driver);
		fs.clickFormsInReview();
		fs.searchSiteCode("Demo01");
		fs.searchSubId("demo05");
		fs.ClickSearch();
		Assert.assertTrue(fs.subjectIdSearchValidation("demo05"));
		logger.info("Subject Id search functionality verified");	
		driver.navigate().refresh();
	}
	
	@Test(priority=3)
	public void VisitNameSearch() throws IOException, InterruptedException
	{
		FormsInReview fs = new FormsInReview(driver);
		fs.clickFormsInReview();
		fs.searchSiteCode("Demo01");
		fs.searchSubId("demo05");
		fs.searchVisitName("04");
		fs.ClickSearch();
		Assert.assertTrue(fs.visitNameSearchValidation("04"));
		logger.info("Visit name search functionality verified");	
		driver.navigate().refresh();
	}
	
	
	@Test(priority=4)
	public void clickView() throws IOException, InterruptedException
	{
		FormsInReview fs = new FormsInReview(driver);
		fs.clickFormsInReview();
		fs.searchSiteCode("Demo01");
		fs.searchSubId("demo05");
		fs.ClickSearch();
		fs.view("04");
		logger.info("Form opened");
	}

}
