package com.EIDSA.testCases.Positive;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.StudyPage;
import com.EIDSA.utilities.XLUtility;

import Base.BaseClassTest;

public class TC_011_study_Positive extends BaseClassTest {

	@Test(priority=1)
	public void Study_positive() throws IOException, InterruptedException
	{
	
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.createStudy("Study - 006","Clinical Study05","1","NA","Clinical study","1","1","1");
		sp.studyAlert();
		logger.info("Study created successfully");
	}
	@Test(priority=2)
	public void searchStudyIdValidation() throws IOException, InterruptedException
	{
		StudyPage sp = new StudyPage(driver);
		sp.searchStudyId("Study - 006");
		Assert.assertTrue(sp.studySearchValidation("Study - 006"));
		logger.info("Study search functionality verified");
		driver.navigate().refresh();
	}
	
	@Test(priority=3)
	public void searchStatusValidation() throws IOException, InterruptedException
	{
		StudyPage sp = new StudyPage(driver);
		sp.searchStudyStatus("New");
		Assert.assertTrue(sp.studyStatusValidation("New"));
		logger.info("Study status functionality verified");
		driver.navigate().refresh();
	}
	
	@Test(priority=4)
	public void auditTrail_Study() throws IOException, InterruptedException
	{
		StudyPage sp = new StudyPage(driver);
		sp.searchStudyId("Study - 006");
		sp.auditTrail1("Study - 006");
		sp.auditTrail2();
		logger.info("Audit trail verified");
	}
	
	@Test(priority=5)
	public void edit_Study() throws IOException, InterruptedException
	{
		StudyPage sp = new StudyPage(driver);
		sp.editStudyIcon("Study - 006");
		sp.editStudy("NA");
		sp.editAlert();
		logger.info("Study updated successfully");	
	}
	

	@Test(priority=6)
	public void delete_Study() throws IOException, InterruptedException
	{	
		StudyPage sp = new StudyPage(driver);
		sp.searchStudyId("Study - 006");
		sp.delStudyIcon("Study - 006");
		sp.deleteAlert();
		logger.info("Study deleted successfully");		
		driver.navigate().refresh();
	}
	
	@Test(priority=7)
	public void folderCreation() throws IOException, InterruptedException
	{
		StudyPage sp = new StudyPage(driver);
		sp.searchStudyId("Study - 001");
		sp.selDoc("Study - 001");
		sp.FolderCreation("01");
		sp.folderCreationAlert();		
	}
	
	@Test(priority=8)
	public void folderEdit() throws IOException, InterruptedException
	{
		StudyPage sp = new StudyPage(driver);
		sp.folderEdit("02");
		sp.folderUpdationAlert();
	}
	
	@Test(priority=9)
	public void uploadDocument() throws IOException, InterruptedException, AWTException
	{
		StudyPage sp = new StudyPage(driver);
		sp.DocumentUpload();
		sp.documentCreationAlert();
	}
	
	@Test(priority=10)
	public void DocumentNameSearchVerification() throws IOException, InterruptedException, AWTException
	{
		StudyPage sp = new StudyPage(driver);
		sp.DocumentNameSearch("New.docx");
		sp.selFolder2();
		Assert.assertTrue(sp.DocumentNameSearchValidation("New.docx"));
		logger.info("Document search functionality verified");
		driver.navigate().refresh();
	}
	
	@Test(priority=11)
	public void DocumentDateSearchVerification() throws IOException, InterruptedException, AWTException
	{
		StudyPage sp = new StudyPage(driver);
		sp.DocumentDateSearch("24-11-2023");
		Assert.assertTrue(sp.DateSearchValidation("24/11/2023"));
		logger.info("Document search functionality verified");
		driver.navigate().refresh();
	}
	
	@Test(priority=12)
	public void DocumentUploadedBySearchVerification() throws IOException, InterruptedException, AWTException
	{
		StudyPage sp = new StudyPage(driver);
		sp.UploadedBySearch("Neethu P S");
		Assert.assertTrue(sp.UploadedBySearchValidation("Neethu P S"));
		logger.info("Document search functionality verified");
		driver.navigate().refresh();
	}

	@Test(priority=13)
	public void edit_Doc() throws IOException, InterruptedException, AWTException
	{
		StudyPage sp = new StudyPage(driver);
		sp.edit_Doc("New.docx");
		sp.edit1();
		sp.documentUpdationAlert();
		logger.info("Document edited");
	}
	
	@Test(priority=14)
	public void view_Doc() throws IOException, InterruptedException, AWTException
	{
		StudyPage sp = new StudyPage(driver);
		sp.view_Doc("New");
		logger.info("Document opened");
		driver.navigate().back();
	}
	
	@Test(priority=15)
	public void setApprover_Doc() throws IOException, InterruptedException, AWTException
	{
		StudyPage sp = new StudyPage(driver);
		sp.approvals_Doc1("New.docx");
		sp.approvals_Doc2();
		sp.approverAdditionAlert();
		Thread.sleep(2000);
		logger.info("Approver selected");	
	}
	
	@Test(priority=16)
	public void Approver_Removal() throws IOException, InterruptedException, AWTException
	{
		StudyPage sp = new StudyPage(driver);
		sp.approvals_Doc1("New.docx");
		sp.deleteApprover();
		sp.approverRemovalAlert();	
		sp.closeApproverWindow();
		logger.info("Approver removed");
	}
	
	@Test(priority=17)
	public void Download_Doc() throws IOException, InterruptedException, AWTException
	{
		StudyPage sp = new StudyPage(driver);
		sp.Download("New");
		logger.info("Downloaded");
	}
	
	@Test(priority=18)
	public void Delete_Doc() throws IOException, InterruptedException, AWTException
	{
		StudyPage sp = new StudyPage(driver);
		Thread.sleep(2000);
		sp.delete_Doc("New.docx");
		sp.documentDeletionAlert();
		logger.info("Document deleted");
	}
	
	@Test(priority=18)
	public void Delete_Folder() throws IOException, InterruptedException, AWTException
	{
		StudyPage sp = new StudyPage(driver);
		sp.deleteFolder();
		sp.folderDeletionAlert1();
		logger.info("Deleted");
	}
	
	
	

}
