
package com.EIDSA.testCases.Positive;

import java.awt.AWTException;
import java.io.IOException;

import com.EIDSA.pageObjects.SitePage;
import com.EIDSA.pageObjects.SubjectPage;
import com.EIDSA.utilities.XLUtility;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseClassTest;

public class TC_017_Subject_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void siteCreation() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.selectStudy("Study - 001");
		sp.createSubject("002","Subject - 007","30-11-2023");
		sp.subjectAlert();
		logger.info("Subject created successfully");
	}

	@Test(priority=2)
	public void searchValidation() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.searchSiteCode("002");
		Assert.assertTrue(sp.siteCodeSearchValidation("002"));
		logger.info("Site code search functionality verified");
		sp.searchSubjectId("Subject - 007");
		Assert.assertTrue(sp.subIdeSearchValidation("Subject - 007"));
		logger.info("Subject Id search functionality verified");
		sp.searchStatus("New");
		Assert.assertTrue(sp.statusSearchValidation("New"));
		logger.info("Status search functionality verified");	
		driver.navigate().refresh();
	}
	
	@Test(priority=3)
	public void SubjectEdit() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.searchSubjectId("Subject - 007");
		sp.editSubject("Subject - 007");
		sp.editSub("NA");
		sp.subjectEditAlert();
		logger.info("Subject updated successfully");
	}
	
	@Test(priority=4)
	public void auditTrail() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.searchSubjectId("Subject - 007");
		sp.auditTrail("Subject - 007");
		sp.auditTrail();
		logger.info("Audit trail verified successfully");	
	}
	
	@Test(priority=5)
	public void schedule() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.scheduleSubject("Subject - 007");
		sp.scheduleAlert();
		logger.info("Schedule created successfully");	
	}
	
	@Test(priority=6)
	public void withdrawPatient() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.searchSubjectId("Subject - 007");
		sp.withdrawnSubject("Subject - 007");
		sp.subjectWithdrawAlert();
		logger.info("Subject withdrew successfully");
		driver.navigate().refresh();
	}
	
	@Test(priority=6)
	public void delete() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.createSubject("002","Subject - 008","30-11-2023");
		sp.subjectAlert();
		sp.searchSubjectId("Subject - 008");
		sp.delSubject("Subject - 008");
		sp.subjectDelAlert();
		logger.info("Subject deleted successfully");
		driver.navigate().refresh();
	}
	
	/*@Test(priority=8)
	public void completePatient() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.createSubject("002","Subject - 004","30-11-2023");
		sp.subjectAlert();
		sp.searchSubjectId("Subject - 004");
		sp.completeSubject("Subject - 004");
		sp.subjectCompleteAlert();
		logger.info("Subject completed successfully");	
		driver.navigate().refresh();
	}*/
	
	@Test(priority=9)
	public void folderCreation() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.searchSubjectId("002");
		sp.selDoc("002");
		sp.FolderCreation("01");
		sp.folderCreationAlert();		
	}
	
	@Test(priority=10)
	public void folderEdit() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.folderEdit("02");
		sp.folderUpdationAlert();
	}
	
	@Test(priority=11)
	public void uploadDocument() throws IOException, InterruptedException, AWTException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.DocumentUpload();
		sp.documentCreationAlert();
	}
	
	@Test(priority=12)
	public void DocumentNameSearchVerification() throws IOException, InterruptedException, AWTException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.DocumentNameSearch("New.docx");
		sp.selFolder2();
		Assert.assertTrue(sp.DocumentNameSearchValidation("New.docx"));
		logger.info("Document search functionality verified");
		driver.navigate().refresh();
	}
	
	@Test(priority=13)
	public void DocumentDateSearchVerification() throws IOException, InterruptedException, AWTException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.DocumentDateSearch("30-11-2023");
		Assert.assertTrue(sp.DateSearchValidation("30/11/2023"));
		logger.info("Document search functionality verified");
		driver.navigate().refresh();
	}
	
	@Test(priority=14)
	public void DocumentUploadedBySearchVerification() throws IOException, InterruptedException, AWTException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.UploadedBySearch("Neethu P S");
		Assert.assertTrue(sp.UploadedBySearchValidation("Neethu P S"));
		logger.info("Document search functionality verified");
		driver.navigate().refresh();
	}

	@Test(priority=15)
	public void edit_Doc() throws IOException, InterruptedException, AWTException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.edit_Doc("New.docx");
		sp.edit1();
		sp.documentUpdationAlert();
		logger.info("Document edited");
	}
	
	@Test(priority=16)
	public void view_Doc() throws IOException, InterruptedException, AWTException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.view_Doc("New");
		logger.info("Document opened");
		driver.navigate().back();
	}
	
	@Test(priority=17)
	public void setApprover_Doc() throws IOException, InterruptedException, AWTException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.approvals_Doc1("New.docx");
		sp.approvals_Doc2();
		sp.approverAdditionAlert();
		Thread.sleep(2000);
		logger.info("Approver selected");	
	}
	
	@Test(priority=18)
	public void Approver_Removal() throws IOException, InterruptedException, AWTException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.approvals_Doc1("New.docx");
		sp.deleteApprover();
		sp.approverRemovalAlert();	
		sp.closeApproverWindow();
		logger.info("Approver removed");
	}
	
	@Test(priority=19)
	public void Download_Doc() throws IOException, InterruptedException, AWTException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.Download("New");
		logger.info("Downloaded");
	}
	
	@Test(priority=20)
	public void Delete_Doc() throws IOException, InterruptedException, AWTException
	{
		SubjectPage sp = new SubjectPage(driver);
		Thread.sleep(2000);
		sp.delete_Doc("New.docx");
		sp.documentDeletionAlert();
		logger.info("Document deleted");
	}
	
	@Test(priority=21)
	public void Delete_Folder() throws IOException, InterruptedException, AWTException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.deleteFolder();
		sp.folderDeletionAlert1();
		logger.info("Deleted");
	}
	

	
}
