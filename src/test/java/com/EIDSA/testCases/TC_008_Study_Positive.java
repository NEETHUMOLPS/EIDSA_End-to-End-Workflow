package com.EIDSA.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.StudyPage;
import com.EIDSA.pageObjects.StudyVisit;
import com.EIDSA.utilities.XLUtility;

import Base.BaseClassTest;

public class TC_008_Study_Positive extends BaseClassTest {

	@Test(dataProvider="DD1", priority=1)
	public void Study_positive(String id, String name) throws IOException, InterruptedException
	{
	
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.createStudy(id,name);
		sp.studyAlert();
		logger.info("Study created successfully");
	}
	
	
	@Test(dataProvider="DD2",priority=2)
	public void edit_Study(String id) throws IOException, InterruptedException
	{
		StudyPage sp = new StudyPage(driver);
		sp.editStudyIcon(id);
		sp.editStudy("NA");
		sp.editAlert();
		logger.info("Study updated successfully");	
	}
	
	@Test(dataProvider="DD2",priority=3)
	public void visitCreation(String id) throws IOException, InterruptedException
	{
		StudyVisit sp = new StudyVisit(driver);
		sp.StudyNameOrIdSearch(id);
		sp.visitIcon(id);
		sp.createVisit("001", "Visit - 001", "Home Visit");
		sp.Alert1();
		logger.info("Visit added");
	}
	
	
	@Test(priority=4)
	public void edit() throws IOException, InterruptedException
	{
		StudyVisit sp = new StudyVisit(driver);
		sp.searchVisitNo("001");
		sp.editStudyIcon("001");
		sp.ClickSave();
		sp.Alert2();
		logger.info("Visit updated");
	}
	
	/*@Test(priority=9)
	public void AssignTemplate() throws IOException, InterruptedException
	{
		StudyVisit sp = new StudyVisit(driver);
		sp.assignTemplate("001");
		sp.templateAssigning("Repeated Measures-en-1");
		sp.Alert4();
		logger.info("Template assigned");	
	}*/
	
	@Test(priority=5)
	public void delete() throws IOException, InterruptedException
	{
		StudyVisit sp = new StudyVisit(driver);
		sp.delete("001");
		sp.Alert3();
		logger.info("Visit deleted");	
	}
	
	@Test(dataProvider="DD2",priority=6)
	public void delete_Study(String id) throws IOException, InterruptedException
	{	
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.searchStudyId(id);
		sp.delStudyIcon(id);
		sp.deleteAlert();
		logger.info("Study deleted successfully");		
		driver.navigate().refresh();
	}
	
	
	
	@DataProvider(name="DD1")
	 String [][] getData1() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\eclipse-workspace\\EndToEnd_EIDSA\\testData\\Study.xlsx";
int rownum=XLUtility.getRowCount(path, "Sheet1");
	int colcount=XLUtility.getCellCount(path, "Sheet1", 1);
	
	String data[][]=new String[rownum][colcount];
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			data[i-1][j]=XLUtility.getCellData(path, "Sheet1", i, j);
		}
	}
	
	return data;	

	}
	
	@DataProvider(name="DD2")
	 String [][] getData2() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\eclipse-workspace\\EndToEnd_EIDSA\\testData\\Study.xlsx";
int rownum=XLUtility.getRowCount(path, "Sheet2");
	int colcount=XLUtility.getCellCount(path, "Sheet2", 1);
	
	String data[][]=new String[rownum][colcount];
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			data[i-1][j]=XLUtility.getCellData(path, "Sheet2", i, j);
		}
	}
	
	return data;	

	}
	
	

}
