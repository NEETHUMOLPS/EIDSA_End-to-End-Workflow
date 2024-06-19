package com.EIDSA.testCases;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.StudyProfile;
import com.EIDSA.pageObjects.SubjectVisitScheduleList;
import com.EIDSA.utilities.XLUtility;

import Base.BaseClassTest;

public class TC_010_Sub_VisitScheduleList extends BaseClassTest{
	
	@Test(dataProvider="DD1",priority=1, description = "Create unscheduled visit")
	public void unsheduledVisitCreation(String VisitNo, String VisitName, String VisitType, String PreVisit, String PostVisit, String Investigator,String VisitDate,String Template) throws IOException, InterruptedException
	{
		SubjectVisitScheduleList sp = new SubjectVisitScheduleList(driver);
		StudyProfile sp1 = new StudyProfile(driver);
		sp1.selectStudy("IDS04");
		sp.clickSubject();
		sp.searchSiteCode("S01");
		sp.searchSubID("P01");
		sp.findSubId("P01");
		sp.createUnScheduleVisit(VisitNo, VisitName, VisitType, PreVisit, PostVisit, Investigator,VisitDate,Template);
		sp.creationAlert();
		logger.info("Unsheduled visit created successfully");
	}
	
	@Test(priority=2)
	public void withdraw() throws IOException, InterruptedException
	{
		SubjectVisitScheduleList sp = new SubjectVisitScheduleList(driver);
		sp.withdraw("U01");
		sp.withdrawAlert();
		logger.info("Visit withdrew successfully");
		driver.navigate().refresh();
	}
	
	@DataProvider(name="DD1")
	 String [][] getData1() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\eclipse-workspace\\EndToEnd_EIDSA\\testData\\SubjectVisitScheduleList.xlsx";
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
