package com.EIDSA.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.StudyPage;
import com.EIDSA.utilities.XLUtility;

import Base.BaseClassTest;

public class TC_008_Study_Positive extends BaseClassTest {

	@Test(dataProvider="DD1",priority=1, description = "Create new study")
	public void createStudy(String studyid,String studyname) throws IOException, InterruptedException
	{
		StudyPage sp = new StudyPage(driver);
		sp.StudyCreation(studyid,studyname);
		sp.studyCreationAlert();
	}
	
	@Test(priority=2, description = "Edit the study details")
	public void editStudy() throws IOException, InterruptedException
	{
		StudyPage sp = new StudyPage(driver);
		sp.editStudy("NA");
		sp.studyEditAlert();
	}
	
	@Test(priority=3, description = "Delete the study")
	public void deleteStudy() throws IOException, InterruptedException
	{
		StudyPage sp = new StudyPage(driver);
		sp.clickStudyList();
		sp.searchStudyId("Del01");
		sp.delStudyIcon("Del01");
		sp.deleteAlert();
		logger.info("Study deleted successfully");
	}
	
	
	@DataProvider(name="DD1")
	 String [][] getData1() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\git\\EIDSA_IntegrationTest\\testData\\Study.xlsx";
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
	
	

}
