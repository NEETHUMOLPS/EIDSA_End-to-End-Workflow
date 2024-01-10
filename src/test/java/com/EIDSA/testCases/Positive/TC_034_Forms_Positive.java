package com.EIDSA.testCases.Positive;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.Forms;

import Base.BaseClassTest;

public class TC_034_Forms_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void siteCodeSearch() throws IOException, InterruptedException
	{
		Forms fs = new Forms(driver);
		fs.clickForms();
		fs.searchSiteCode("Demo01");
		fs.ClickSearch();
		Assert.assertTrue(fs.siteCodeSearchValidation("Demo01"));
		logger.info("Site code search functionality verified");		
		driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void subjectIdSearch() throws IOException, InterruptedException
	{
		Forms fs = new Forms(driver);
		fs.clickForms();
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
		Forms fs = new Forms(driver);
		fs.clickForms();
		fs.searchSiteCode("Demo01");
		fs.searchSubId("demo05");
		fs.searchVisitName("11");
		fs.ClickSearch();
		Assert.assertTrue(fs.visitNameSearchValidation("11"));
		logger.info("Visit name search functionality verified");	
		driver.navigate().refresh();
	}
	
	@Test(priority=4)
	public void statusSearch() throws IOException, InterruptedException
	{
		Forms fs = new Forms(driver);
		fs.clickForms();
		fs.searchSiteCode("Demo01");
		fs.searchSubId("demo05");
		fs.searchStat("Verified");
		fs.ClickSearch();
		Assert.assertTrue(fs.statusSearchValidation("Verified"));
		logger.info("Status search functionality verified");	
		driver.navigate().refresh();
	}
	
	@Test(priority=5)
	public void clickView() throws IOException, InterruptedException
	{
		Forms fs = new Forms(driver);
		fs.clickForms();
		fs.searchSiteCode("Demo01");
		fs.searchSubId("demo05");
		fs.ClickSearch();
		fs.view("11");
		logger.info("Form opened");
		driver.navigate().refresh();
	}
	
	@Test(priority=6)
	public void Archive() throws IOException, InterruptedException
	{
		Forms fs = new Forms(driver);
		fs.clickForms();
		fs.clickArchive();
		fs.Alert1();
		logger.info("Form archived");
	}


}
