package com.EIDSA.testCases.Positive;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.DocumentSummary;

import Base.BaseClassTest;

public class TC_054_DocumentSummary_Positive extends BaseClassTest{
	
	@Test(priority=1)
	public void documentTypeSearchValidation() throws IOException, InterruptedException
	{
		DocumentSummary ds = new DocumentSummary(driver);
		ds.clickDocumentSummary();
		ds.searchDocumentStorageArea("patient");
		ds.search();
		Assert.assertTrue(ds.documentTypeSearchValidation("patient"));
		logger.info("Document type search verification successfully completed");
		Thread.sleep(3000);
		driver.navigate().refresh();		
	}
	
	@Test(priority=2)
	public void documentNameSearchValidation() throws IOException, InterruptedException
	{
		DocumentSummary ds = new DocumentSummary(driver);
		ds.clickDocumentSummary();
		ds.searchDocumentName("EIDSA_STUDY_excel_20230221125358_002.xlsx");
		ds.search();
		Assert.assertTrue(ds.documentNameSearchValidation("EIDSA_STUDY_excel_20230221125358_002.xlsx"));
		logger.info("Document name search verification successfully completed");
		Thread.sleep(3000);
		driver.navigate().refresh();		
	}
	
	@Test(priority=3)
	public void dateSearchValidation() throws IOException, InterruptedException
	{
		DocumentSummary ds = new DocumentSummary(driver);
		ds.clickDocumentSummary();
		ds.searchDocumentName("EIDSA_STUDY_excel_20230221125358_002.xlsx");
		ds.SearchDate("01-05-2023", "02-05-2023");
		ds.search();
		Assert.assertTrue(ds.dateSearchValidation("01/05/2023"));
		logger.info("Date search verification successfully completed");
		Thread.sleep(3000);
		driver.navigate().refresh();		
	}
	
	@Test(priority=4)
	public void setApprover() throws IOException, InterruptedException
	{
		DocumentSummary ds = new DocumentSummary(driver);
		ds.clickDocumentSummary();
		ds.searchDocumentName("EIDSA_STUDY_excel_20230221125358_002.xlsx");
		ds.search();
		ds.ClickApprovals("EIDSA_STUDY_excel_20230221125358_002.xlsx");
		ds.setApprover();
		ds.Alert1();
		logger.info("Approver added successfully");
		driver.navigate().refresh();		
	}
	
	@Test(priority=5)
	public void deleteApprover() throws IOException, InterruptedException
	{
		DocumentSummary ds = new DocumentSummary(driver);
		ds.clickDocumentSummary();
		ds.searchDocumentName("EIDSA_STUDY_excel_20230221125358_002.xlsx");
		ds.search();
		ds.ClickApprovals("EIDSA_STUDY_excel_20230221125358_002.xlsx");
		ds.deleteApprover();
		ds.Alert2();
		ds.closeApprover();
		logger.info("Approver deleted successfully");
		driver.navigate().refresh();		
	}
	
	@Test(priority=6)
	public void historyView() throws IOException, InterruptedException
	{
		DocumentSummary ds = new DocumentSummary(driver);
		ds.clickDocumentSummary();
		ds.searchDocumentName("EIDSA_STUDY_excel_20230221125358_002.xlsx");
		ds.search();
		ds.ClickHistory("EIDSA_STUDY_excel_20230221125358_002.xlsx");
		ds.viewHistory();
		logger.info("Form opened successfully");
		driver.navigate().refresh();		
	}
	
	@Test(priority=7)
	public void historyDownload() throws IOException, InterruptedException
	{
		DocumentSummary ds = new DocumentSummary(driver);
		ds.clickDocumentSummary();
		ds.searchDocumentName("EIDSA_STUDY_excel_20230221125358_002.xlsx");
		ds.search();
		ds.ClickHistory("EIDSA_STUDY_excel_20230221125358_002.xlsx");
		ds.downloadHistory();
		logger.info("Form downloaded successfully");
		driver.navigate().refresh();		
	}
	
	@Test(priority=8)
	public void view() throws IOException, InterruptedException
	{
		DocumentSummary ds = new DocumentSummary(driver);
		ds.clickDocumentSummary();
		ds.searchDocumentName("EIDSA_STUDY_excel_20230221125358_002.xlsx");
		ds.search();
		ds.ClickView("EIDSA_STUDY_excel_20230221125358_002.xlsx");
		logger.info("Form opened successfully");
		driver.navigate().refresh();		
	}
	
	@Test(priority=9)
	public void download() throws IOException, InterruptedException
	{
		DocumentSummary ds = new DocumentSummary(driver);
		ds.clickDocumentSummary();
		ds.searchDocumentName("EIDSA_STUDY_excel_20230221125358_002.xlsx");
		ds.search();
		ds.ClickDownload("EIDSA_STUDY_excel_20230221125358_002.xlsx");
		logger.info("Form downloadad successfully");
		driver.navigate().refresh();		
	}

}
