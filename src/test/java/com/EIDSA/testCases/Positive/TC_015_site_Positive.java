package com.EIDSA.testCases.Positive;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.EIDSA.pageObjects.SitePage;
import com.EIDSA.pageObjects.SitePrivilege;
import com.EIDSA.pageObjects.StudyPage;
import com.EIDSA.utilities.XLUtility;

import Base.BaseClassTest;

public class TC_015_site_Positive extends BaseClassTest {

	@Test(priority=1)
	public void siteCreation_sitePrivilege() throws IOException, InterruptedException
	{
		SitePage sp = new SitePage(driver);
		sp.selectStudy("Study - 001");
		sp.clickSite();
		sp.createSite("001","Site - 001");
		sp.siteAlert();
		logger.info("Site created successfully");
		SitePrivilege sp1 = new SitePrivilege(driver);
		sp1.clickSitePrivilege();
		sp1.sitePrivilegeSetting1("Neethu P S");
		sp1.Alert1();
		logger.info("User site privilege updated successfully");	
	}
	
	@Test(priority=2)
	public void searchValidation() throws IOException, InterruptedException
	{	
		SitePage sp = new SitePage(driver);
		sp.clickSite();
		sp.searchSiteCode("001");
		Assert.assertTrue(sp.siteCodeSearchValidation("001"));
		logger.info("Site code search functionality verified");
		sp.searchSiteName("Site - 001");
		Assert.assertTrue(sp.siteNameSearchValidation("Site - 001"));
		logger.info("Site name search functionality verified");
		sp.searchSiteStatus("New");
		Assert.assertTrue(sp.siteStatusSearchValidation("New"));
		logger.info("Site status search functionality verified");	
		driver.navigate().refresh();
	}
	@Test(priority=3)
	public void siteEdit() throws IOException, InterruptedException
	{	
		SitePage sp = new SitePage(driver);
		sp.searchSiteCode("001");
		sp.editSiteIcon("001");
		sp.editSite("Site - 001a");
		sp.editAlert();
		logger.info("Study updated successfully");
	}
	@Test(priority=4)
	public void siteAuditTrail() throws IOException, InterruptedException
	{	
		SitePage sp = new SitePage(driver);
		sp.searchSiteCode("001");
		sp.auditTrail1("001");
		sp.auditTrail2();
		logger.info("Audit trail verified");
	}
	
	@Test(priority=5)
	public void siteActionOpen() throws IOException, InterruptedException
	{	
		SitePage sp = new SitePage(driver);
		sp.siteActionOpen("001");
		logger.info("Site opened");
	}
		
	@Test(priority=6)
	public void siteActionComplete() throws IOException, InterruptedException
	{	
		SitePage sp = new SitePage(driver);
		sp.siteActionComplete("001");
		logger.info("Site completed");
	}
	
	@Test(priority=7)
	public void siteActionTerminate() throws IOException, InterruptedException
	{
		SitePage sp = new SitePage(driver);
		sp.siteActionTerminate("001");
		Thread.sleep(3000);
		logger.info("Site terminated");
	}
	@Test(priority=8)
	public void siteDelete() throws IOException, InterruptedException
	{	
		SitePage sp = new SitePage(driver);
		sp.delSiteIcon("001");
		sp.deleteAlert();
		Thread.sleep(3000);
		logger.info("Site deleted");
		driver.navigate().refresh();
	}
	
	@Test(priority=9)
	public void siteDeleteWithPatient() throws IOException, InterruptedException
	{	
		SitePage sp = new SitePage(driver);
		driver.navigate().refresh();
		sp.searchSiteCode("002");
		sp.delSiteIcon("002");
		sp.deleteSiteWithPatientsAlert();
		logger.info("Site having patients cannot be deleted");
	}
	
	@Test(priority=10)
	public void folderCreation() throws IOException, InterruptedException
	{
		SitePage sp = new SitePage(driver);
		sp.selDoc("002");
		sp.FolderCreation("01");
		sp.folderCreationAlert();		
	}
	
	@Test(priority=11)
	public void folderEdit() throws IOException, InterruptedException
	{
		SitePage sp = new SitePage(driver);
		sp.folderEdit("02");
		sp.folderUpdationAlert();
	}
	
	@Test(priority=12)
	public void uploadDocument() throws IOException, InterruptedException, AWTException
	{
		SitePage sp = new SitePage(driver);
		sp.DocumentUpload();
		sp.documentCreationAlert();
	}
	
	@Test(priority=13)
	public void DocumentNameSearchVerification() throws IOException, InterruptedException, AWTException
	{
		SitePage sp = new SitePage(driver);
		sp.DocumentNameSearch("New.docx");
		sp.selFolder2();
		Assert.assertTrue(sp.DocumentNameSearchValidation("New.docx"));
		logger.info("Document search functionality verified");
		driver.navigate().refresh();
	}
	
	@Test(priority=14)
	public void DocumentDateSearchVerification() throws IOException, InterruptedException, AWTException
	{
		SitePage sp = new SitePage(driver);
		sp.DocumentDateSearch("29-11-2023");
		Assert.assertTrue(sp.DateSearchValidation("29/11/2023"));
		logger.info("Document search functionality verified");
		driver.navigate().refresh();
	}
	
	@Test(priority=15)
	public void DocumentUploadedBySearchVerification() throws IOException, InterruptedException, AWTException
	{
		SitePage sp = new SitePage(driver);
		sp.UploadedBySearch("Neethu P S");
		Assert.assertTrue(sp.UploadedBySearchValidation("Neethu P S"));
		logger.info("Document search functionality verified");
		driver.navigate().refresh();
	}

	@Test(priority=16)
	public void edit_Doc() throws IOException, InterruptedException, AWTException
	{
		SitePage sp = new SitePage(driver);
		sp.edit_Doc("New.docx");
		sp.edit1();
		sp.documentUpdationAlert();
		logger.info("Document edited");
	}
	
	@Test(priority=17)
	public void view_Doc() throws IOException, InterruptedException, AWTException
	{
		SitePage sp = new SitePage(driver);
		sp.view_Doc("New");
		logger.info("Document opened");
		driver.navigate().back();
	}
	
	@Test(priority=18)
	public void setApprover_Doc() throws IOException, InterruptedException, AWTException
	{
		SitePage sp = new SitePage(driver);
		sp.approvals_Doc1("New.docx");
		sp.approvals_Doc2();
		sp.approverAdditionAlert();
		Thread.sleep(2000);
		logger.info("Approver selected");	
	}
	
	@Test(priority=19)
	public void Approver_Removal() throws IOException, InterruptedException, AWTException
	{
		SitePage sp = new SitePage(driver);
		sp.approvals_Doc1("New.docx");
		sp.deleteApprover();
		sp.approverRemovalAlert();	
		sp.closeApproverWindow();
		logger.info("Approver removed");
	}
	
	@Test(priority=20)
	public void Download_Doc() throws IOException, InterruptedException, AWTException
	{
		SitePage sp = new SitePage(driver);
		sp.Download("New");
		logger.info("Downloaded");
	}
	
	@Test(priority=21)
	public void Delete_Doc() throws IOException, InterruptedException, AWTException
	{
		SitePage sp = new SitePage(driver);
		Thread.sleep(2000);
		sp.delete_Doc("New.docx");
		sp.documentDeletionAlert();
		logger.info("Document deleted");
	}
	
	@Test(priority=22)
	public void Delete_Folder() throws IOException, InterruptedException, AWTException
	{
		SitePage sp = new SitePage(driver);
		sp.deleteFolder();
		sp.folderDeletionAlert1();
		logger.info("Deleted");
	}
	
	
	

}
