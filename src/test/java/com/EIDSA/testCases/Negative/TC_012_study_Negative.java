package com.EIDSA.testCases.Negative;

import java.io.IOException;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.StudyPage;

import Base.BaseClassTest;

public class TC_012_study_Negative extends BaseClassTest {
	@Test(priority=1)
	public void Study_negative1() throws IOException, InterruptedException
	{
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.clickCreateSudy_Negative1();
        logger.info("Negative test1 passed");	
        driver.navigate().back();
	}
	
	@Test(priority=2)
	public void Study_negative2() throws IOException, InterruptedException
	{
		StudyPage sp = new StudyPage(driver);
		sp.createStudy_Negative("Study - 001","Study - 001");
		sp.duplicateAlert();
		logger.info("Negative test2 passed");
		driver.navigate().back();
	}
	
	@Test(priority=3)
	public void Folder_negative3() throws IOException, InterruptedException, Exception
	{
		StudyPage sp = new StudyPage(driver);
		sp.searchStudyId("Study - 001");
		sp.selDoc("Study - 001");
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
		StudyPage sp = new StudyPage(driver);
		sp.FolderCreation("03");
		sp.duplicateFolderName();
		sp.close_Folder();
		logger.info("Negative test4 passed");
 
	}
	
	@Test(priority=5)
	public void Folder_negative5() throws IOException, InterruptedException, Exception
	{
		StudyPage sp = new StudyPage(driver);
		sp.folderDeletion_Negative1();
		sp.folderDeletionAlert2();
		logger.info("Negative test5 passed");	
		Thread.sleep(2000);
	}
	
	@Test(priority=6)
	public void editDocument_Negative6() throws IOException, InterruptedException, Exception
	{
		StudyPage sp = new StudyPage(driver);
		sp.selFolder3();
		sp.edit_Doc("New.docx");
		sp.editDocument_Negative();
		sp.documentEdit_Negative_Alert();
		logger.info("Negative test6 passed");		
	}
}
