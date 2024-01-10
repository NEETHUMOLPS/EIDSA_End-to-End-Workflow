package com.EIDSA.testCases.Negative;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.EIDSA.pageObjects.SitePage;
import com.EIDSA.pageObjects.SubjectPage;

import Base.BaseClassTest;

public class TC_018_Subject_Negative extends BaseClassTest {
	
	@Test(priority=1)
	public void subjectCreationNegative() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.selectStudy("Study - 001");
		sp.clickSubject();
		sp.clickCreateSubject();
		sp.saveSub();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(sp.siteCodeErrorMsg(), "Please select a site code");
		softAssert.assertEquals(sp.subIdErrorMsg(), "Please enter a subject ID");
		softAssert.assertEquals(sp.dateErrorMsg(), "Please select enrolment date");
		softAssert.assertAll();
        logger.info("Negative test1 passed");	
	}
	
	@Test(priority=2)
	public void duplicateSub() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.clickSubject();
		sp.clickCreateSubject();
		sp.duplicateSiteCode("002");
		sp.duplicateSubjectId("Subject - 001");
		sp.duplicatedate("30-11-2023");
		sp.saveSub();
		sp.duplicateAlert();
		logger.info("Negative test2 passed");	
	}
	
	@Test(priority=3)
	public void CompleteSubjectWithEnrolledStatus() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.clickSubject();
		sp.searchSubjectId("007");
		sp.completeSubject("007");
		sp.completeSubjectWithEnrolledStatusAlert();
		logger.info("Negative test3 passed");
		driver.navigate().refresh();
	}
	
	@Test(priority=4)
	public void Folder_negative4() throws IOException, InterruptedException, Exception
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.clickSubject();
		sp.searchSubjectId("002");
		sp.selDoc("002");
		sp.folderCreation_Negative();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(sp.Err1(), "Please enter a folder name");
		softAssert.assertAll();
		sp.close_Folder();
		logger.info("Negative test4 passed");		
	}
	
	@Test(priority=5)
	public void Folder_negative5() throws IOException, InterruptedException, Exception
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.FolderCreation("03");
		sp.duplicateFolderName();
		sp.close_Folder();
		logger.info("Negative test5 passed");
 
	}
	
	@Test(priority=6)
	public void Folder_negative6() throws IOException, InterruptedException, Exception
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.folderDeletion_Negative1();
		sp.folderDeletionAlert2();
		logger.info("Negative test6 passed");	
		Thread.sleep(2000);
	}
	
	@Test(priority=7)
	public void editDocument_Negative7() throws IOException, InterruptedException, Exception
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.selFolder3();
		sp.edit_Doc("New.docx");
		sp.editDocument_Negative();
		sp.documentEdit_Negative_Alert();
		logger.info("Negative test7 passed");		
	}

}



