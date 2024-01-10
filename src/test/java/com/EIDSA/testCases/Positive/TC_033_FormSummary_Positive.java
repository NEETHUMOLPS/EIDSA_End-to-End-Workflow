package com.EIDSA.testCases.Positive;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.FormSummary;

import Base.BaseClassTest;

public class TC_033_FormSummary_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void siteCodeSearch() throws IOException, InterruptedException
	{
		FormSummary fs = new FormSummary(driver);
		fs.clickFormSummary();
		fs.searchSiteCode("Demo01");
		fs.ClickSearch();
		Assert.assertTrue(fs.siteCodeSearchValidation("Demo01"));
		logger.info("Site code search functionality verified");		
		driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void subjectIdSearch() throws IOException, InterruptedException
	{
		FormSummary fs = new FormSummary(driver);
		fs.clickFormSummary();
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
		FormSummary fs = new FormSummary(driver);
		fs.clickFormSummary();
		fs.searchSiteCode("Demo01");
		fs.searchSubId("demo05");
		fs.searchVisitName("visit07");
		fs.ClickSearch();
		Assert.assertTrue(fs.visitNameSearchValidation("01"));
		logger.info("Visit name search functionality verified");	
		driver.navigate().refresh();
	}
	
	@Test(priority=4)
	public void statusSearch() throws IOException, InterruptedException
	{
		FormSummary fs = new FormSummary(driver);
		fs.clickFormSummary();
		fs.searchSiteCode("Demo01");
		fs.searchSubId("demo05");
		fs.searchStat("New");
		fs.ClickSearch();
		Assert.assertTrue(fs.statusSearchValidation("New"));
		logger.info("Status search functionality verified");	
		driver.navigate().refresh();
	}
	
	@Test(priority=5)
	public void clickView() throws IOException, InterruptedException
	{
		FormSummary fs = new FormSummary(driver);
		fs.clickFormSummary();
		fs.searchSiteCode("08");
		fs.searchSubId("01");
		fs.ClickSearch();
		fs.view("Visit 2");
		logger.info("Form opened");
		driver.navigate().refresh();
	}
	
	@Test(priority=6)
	public void ViewDocument() throws IOException, InterruptedException
	{
		FormSummary fs = new FormSummary(driver);
		fs.clickFormSummary();
		fs.view("Visit 2");
		fs.viewDocuments();
		logger.info("Document opened");
		driver.navigate().refresh();
		
	}
	
	@Test(priority=7)
	public void DownloadDocument() throws IOException, InterruptedException
	{
		FormSummary fs = new FormSummary(driver);
		fs.clickFormSummary();
		fs.view("Visit 2");
		fs.downloadDocuments();
		logger.info("Document downloaded");
		driver.navigate().refresh();
		
	}
	
	@Test(priority=8)
	public void DeleteDocument() throws IOException, InterruptedException
	{
		FormSummary fs = new FormSummary(driver);
		fs.clickFormSummary();
		fs.view("Visit 2");
		fs.deleteDocuments();
		fs.Alert1();
		logger.info("Document deleted");
		driver.navigate().refresh();		
	}
	
	@Test(priority=9)
	public void downloadPdf() throws IOException, InterruptedException
	{
		FormSummary fs = new FormSummary(driver);
		fs.clickFormSummary();
		fs.view("Visit 2");
		fs.downloadpdf();
		logger.info("PDF downloaded");
		driver.navigate().refresh();		
	}
	
	@Test(priority=10)
	public void formQuery() throws IOException, InterruptedException
	{
		FormSummary fs = new FormSummary(driver);
		fs.clickFormSummary();
		fs.view("Visit 2");
		fs.formQuery("Low");
		fs.Alert2();
		logger.info("Query raised");
		driver.navigate().refresh();		
	}
	
	@Test(priority=11)
	public void viewFormOpenQuery() throws IOException, InterruptedException
	{
		FormSummary fs = new FormSummary(driver);
		fs.clickFormSummary();
		fs.view("Visit 2");
		fs.OpenQueryViewform();
		logger.info("Form opened");
		driver.navigate().refresh();		
	}
	
	@Test(priority=12)
	public void exportPdfOpenQuery() throws IOException, InterruptedException
	{
		FormSummary fs = new FormSummary(driver);
		fs.clickFormSummary();
		fs.view("Visit 2");
		fs.OpenQueryExportPdf();
		logger.info("PDF exported");
		driver.navigate().refresh();		
	}
	
	@Test(priority=13)
	public void OpenQueryReply1() throws IOException, InterruptedException
	{
		FormSummary fs = new FormSummary(driver);
		fs.clickFormSummary();
		fs.view("Visit 2");
		fs.OpenQueryReply();
		fs.Alert3();
		logger.info("Message has sent");
		driver.navigate().refresh();		
	}
	
	@Test(priority=14)
	public void OpenQueryClose1() throws IOException, InterruptedException
	{
		FormSummary fs = new FormSummary(driver);
		fs.clickFormSummary();
		fs.view("Visit 2");
		fs.OpenQueryClose();
		fs.Alert4();
		logger.info("Query closed");
		driver.navigate().refresh();		
	}
	
	@Test(priority=15)
	public void OpenQueryReplyAndClose1() throws IOException, InterruptedException
	{
		FormSummary fs = new FormSummary(driver);
		fs.clickFormSummary();
		fs.view("Visit 2");
		fs.OpenQueryReplyAndClose();
		fs.Alert5();
		logger.info("Replied and closed");
		driver.navigate().refresh();		
	}
	
	@Test(priority=16)
	public void ClosedQuery() throws IOException, InterruptedException
	{
		FormSummary fs = new FormSummary(driver);
		fs.clickFormSummary();
		fs.view("Visit 2");
		fs.closedquery();
		logger.info("Opened closed query");
		driver.navigate().refresh();		
	}
	
	@Test(priority=17)
	public void Verify1() throws IOException, InterruptedException
	{
		FormSummary fs = new FormSummary(driver);
		fs.clickFormSummary();
		fs.view("visit 05");
		fs.verify();
		fs.Alert9();
		logger.info("Verified");
		driver.navigate().refresh();		
	}
	
	@Test(priority=18)
	public void Verify2() throws IOException, InterruptedException
	{
		FormSummary fs = new FormSummary(driver);
		fs.clickFormSummary();
		fs.view("visit 06");
		fs.verify();
		fs.Alert7();
		logger.info("Verified");
		driver.navigate().refresh();		
	}
	
	@Test(priority=19)
	public void Sign1() throws IOException, InterruptedException
	{
		FormSummary fs = new FormSummary(driver);
		fs.clickFormSummary();
		fs.view("Visit 2");
		fs.sign();
		fs.Alert6();
		logger.info("Form Signed");
		driver.navigate().refresh();		
	}
	
	@Test(priority=20)
	public void PageSave2() throws IOException, InterruptedException
	{
		FormSummary fs = new FormSummary(driver);
		fs.clickFormSummary();
		fs.view("visit 03");
		fs.PageSave();
		logger.info("Page saved");
		driver.navigate().refresh();		
	}
	
	@Test(priority=21)
	public void PageQuery() throws IOException, InterruptedException
	{
		FormSummary fs = new FormSummary(driver);
		fs.clickFormSummary();
		fs.view("Visit 2");
		fs.pageQuery("Low");
		fs.Alert2();
		logger.info("Query raised");
		driver.navigate().refresh();		
	}
	
	@Test(priority=22)
	public void Archive() throws IOException, InterruptedException
	{
		FormSummary fs = new FormSummary(driver);
		fs.clickFormSummary();
		fs.view("visit 04");
		fs.archive();
		fs.Alert8();
		logger.info("Archived");
		driver.navigate().refresh();		
	}


}
