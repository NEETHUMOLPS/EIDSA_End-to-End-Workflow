package com.EIDSA.testCases.Positive;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.DocumentApproval;
import com.EIDSA.pageObjects.DocumentSummary;

import Base.BaseClassTest;

public class TC_067_DocumentApproval_Positive extends BaseClassTest{
	
	@Test(priority=1)
	public void documentNameSearchValidation() throws IOException, InterruptedException
	{
		DocumentApproval ds = new DocumentApproval(driver);
		ds.clickDocumentApproval();
		ds.searchDocumentName("EIDSA.docx");
		ds.search();
		Assert.assertTrue(ds.documentNameSearchValidation("EIDSA.docx"));
		logger.info("Document name search verification successfully completed");
		Thread.sleep(3000);
		driver.navigate().refresh();				
	}
	
	@Test(priority=2)
	public void documentDateSearchValidation() throws IOException, InterruptedException
	{
		DocumentApproval ds = new DocumentApproval(driver);
		ds.clickDocumentApproval();
		ds.SearchDate("27-09-2022", "27-09-2022");
		ds.search();
		Assert.assertTrue(ds.dateSearchValidation("27/09/2022"));
		logger.info("Date search verification successfully completed");
		Thread.sleep(3000);
		driver.navigate().refresh();				
	}
	
	@Test(priority=3)
	public void Approver() throws IOException, InterruptedException
	{
		DocumentApproval ds = new DocumentApproval(driver);
		ds.clickDocumentApproval();
		ds.searchDocumentName("EIDSA.docx");
		ds.search();
		Thread.sleep(3000);
		ds.ClickApprovals("EIDSA.docx");
		logger.info("Approver window opened");
		driver.navigate().refresh();		
	}
	
	@Test(priority=4)
	public void View() throws IOException, InterruptedException
	{
		DocumentApproval ds = new DocumentApproval(driver);
		ds.clickDocumentApproval();
		ds.searchDocumentName("EIDSA.docx");
		ds.search();
		Thread.sleep(3000);
		ds.ClickView("EIDSA.docx");
		logger.info("Form opened");
		driver.navigate().refresh();		
	}
	
	@Test(priority=5)
	public void Download() throws IOException, InterruptedException
	{
		DocumentApproval ds = new DocumentApproval(driver);
		ds.clickDocumentApproval();
		ds.searchDocumentName("EIDSA.docx");
		ds.search();
		Thread.sleep(3000);
		ds.ClickDownload("EIDSA.docx");
		logger.info("Downloaded");
		driver.navigate().refresh();		
	}

}
