package com.EIDSA.testCases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.EIDSA.pageObjects.DMS;
import com.EIDSA.pageObjects.FillForm;
import com.EIDSA.pageObjects.LoginPage;

import Base.BaseClassTest;

public class TC_024_DMS_Positive extends BaseClassTest {
	
	@Test(priority=1, description = "Create new folder")
	public void FolderCreation() throws IOException, InterruptedException
	{
		DMS dm = new DMS(driver);
		FillForm fp = new FillForm(driver);
		fp.selectStudy1("IDS01");
		dm.DMS();
		dm.documentUpload();
		dm.FolderCreation("01");
		dm.folderCreationAlert();
	}
	
	@Test(priority=2, description = "Edit the folder details")
	public void FolderEdit() throws IOException, InterruptedException
	{
		DMS dm = new DMS(driver);
		dm.folderEdit("02");
		dm.folderUpdationAlert();
	}
	
	@Test(priority=3, description = "Upload the document to the folder")
	public void uploadDocument() throws IOException, InterruptedException, AWTException
	{
		DMS dm = new DMS(driver);
		dm.DocumentUpload();
		dm.documentCreationAlert();
	}
	
	@Test(priority=4, description = "View the uploaded document")
	public void viewDocument() throws IOException, InterruptedException, AWTException
	{
		DMS dm = new DMS(driver);
		dm.documentApproval();
		dm.viewDocument();
	}
	
	@Test(priority=5, description = "Approve the document")
	public void approveDocument() throws IOException, InterruptedException, AWTException
	{
		DMS dm = new DMS(driver);
		LoginPage lp=new LoginPage(driver);
		dm.approveDocument();
		dm.approveDocumentAlert();
		lp.logout();
	}

}
