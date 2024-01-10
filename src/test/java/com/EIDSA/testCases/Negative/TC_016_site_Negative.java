package com.EIDSA.testCases.Negative;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.EIDSA.pageObjects.SitePage;
import com.EIDSA.pageObjects.StudyPage;

import Base.BaseClassTest;

public class TC_016_site_Negative  extends BaseClassTest {

	@Test(priority=1)
	public void siteCreationNegative() throws IOException, InterruptedException
	{
		SitePage sp = new SitePage(driver);
		sp.selectStudy("Study - 001");
		sp.clickSite();
		sp.clickCreateSite();
		sp.invalidEmail("dd");
		sp.clickSave();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(sp.siteCodeErrorMsg(), "Please enter site code");
		softAssert.assertEquals(sp.emaileErrorMsg(), "Please enter a valid email");
		softAssert.assertAll();
        logger.info("Negative test passed");	
	}
	
	@Test(priority=2)
	public void duplicateAlert() throws IOException, InterruptedException
	{	
		SitePage sp = new SitePage(driver);
		sp.clickSite();
		sp.clickCreateSite();
		sp.duplicateSite("002");
		sp.clickSave();
		sp.duplicateAlert();
		logger.info("Site code already exists");
	}
	
	@Test(priority=3)
	public void Folder_negative3() throws IOException, InterruptedException, Exception
	{
		SitePage sp = new SitePage(driver);
		sp.clickSite();
		sp.selDoc("002");
		sp.folderCreation_Negative();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(sp.Err1(), "Please enter a folder name");
		softAssert.assertAll();
		sp.close_Folder();
		logger.info("Negative test3 passed");		
	}
	
	@Test(priority=4)
	public void Folder_negative4() throws IOException, InterruptedException, Exception
	{
		SitePage sp = new SitePage(driver);
		sp.FolderCreation("03");
		sp.duplicateFolderName();
		sp.close_Folder();
		logger.info("Negative test4 passed");
 
	}
	
	@Test(priority=5)
	public void Folder_negative5() throws IOException, InterruptedException, Exception
	{
		SitePage sp = new SitePage(driver);
		sp.folderDeletion_Negative1();
		sp.folderDeletionAlert2();
		logger.info("Negative test5 passed");	
		Thread.sleep(2000);
	}
	
	@Test(priority=6)
	public void editDocument_Negative6() throws IOException, InterruptedException, Exception
	{
		SitePage sp = new SitePage(driver);
		sp.selFolder3();
		sp.edit_Doc("New.docx");
		sp.editDocument_Negative();
		sp.documentEdit_Negative_Alert();
		logger.info("Negative test6 passed");		
	}

}
