package com.EIDSA.testCases.Positive;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.StudyVisit;

import Base.BaseClassTest;

public class TC_013_StudyVisit_Positive extends BaseClassTest {

	@Test(priority=1)
	public void visitCreation() throws IOException, InterruptedException
	{
		StudyVisit sp = new StudyVisit(driver);
		sp.clickStudy();
		sp.StudyNameOrIdSearch("Study - 001");
		sp.visitIcon("Study - 001");
		sp.createVisit("001", "Visit - 001", "Home Visit");
		sp.Alert1();
		logger.info("Visit added");
	}
	
	@Test(priority=2)
	public void visitNameSearch() throws IOException, InterruptedException
	{
		StudyVisit sp = new StudyVisit(driver);
		sp.searchVisitName("Visit - 001");
		Assert.assertTrue(sp.visitNameSearchValidation("Visit - 001"));
		logger.info("Visit name search functionality verified");
		driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void visitNoSearch() throws IOException, InterruptedException
	{
		StudyVisit sp = new StudyVisit(driver);
		sp.visitIcon("001");
		sp.searchVisitNo("001");
		Assert.assertTrue(sp.visitNoSearchValidation("001"));
		logger.info("Visit number search functionality verified");
		driver.navigate().refresh();
	}
	
	@Test(priority=3)
	public void edit() throws IOException, InterruptedException
	{
		StudyVisit sp = new StudyVisit(driver);
		sp.searchVisitNo("001");
		sp.editStudyIcon("001");
		sp.ClickSave();
		sp.Alert2();
		logger.info("Visit updated");
	}
	
	@Test(priority=4)
	public void AssignTemplate() throws IOException, InterruptedException
	{
		StudyVisit sp = new StudyVisit(driver);
		sp.assignTemplate("001");
		sp.templateAssigning("Repeated Measures-en-1");
		sp.Alert4();
		logger.info("Template assigned");	
	}
	
	@Test(priority=5)
	public void delete() throws IOException, InterruptedException
	{
		StudyVisit sp = new StudyVisit(driver);
		sp.delete("001");
		sp.Alert3();
		logger.info("Visit deleted");	
	}
	

}
