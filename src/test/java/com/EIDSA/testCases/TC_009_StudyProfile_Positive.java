package com.EIDSA.testCases;

import java.io.IOException;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.LoginPage;
import com.EIDSA.pageObjects.SitePage;
import com.EIDSA.pageObjects.StudyProfile;
import com.EIDSA.pageObjects.SubjectPage;
import com.EIDSA.pageObjects.UserPage;
import com.EIDSA.utilities.XLUtility;

import Base.BaseClassTest;

public class TC_009_StudyProfile_Positive extends BaseClassTest {
	
	@Test(dataProvider="DD1",priority=1, description = "Create new template")
	public void createTemplate(String studyid,String studyname) throws IOException, InterruptedException
	{
		StudyProfile sp = new StudyProfile(driver);
		sp.StudyCreation(studyid,studyname);
		sp.studyCreationAlert();
		sp.createForm("Patient Information");
		sp.formCreationAlert();
		sp.createPage01("01","Patient Name","Full Name","Name in capitals");
		sp.designCompleteAlert();
		sp.backToStudyProfile();
		Thread.sleep(3000);
		sp.createForm("Patient Details");
		sp.formCreationAlert();
		sp.createPage02("01","Patient Name","Full Name","Name in capitals");
		sp.designCompleteAlert();
		sp.backToStudyProfile();		
	}
	
	@Test(priority=2, description = "Update the user privilege")
	public void userPrivilege() throws InterruptedException
	{
		UserPage up=new UserPage(driver);
		StudyProfile sp = new StudyProfile(driver);
		up.clickUser();
	    up.searchEmailOrName("sujis@yopmail.com");
		up.privilege1("sujis@yopmail.com");
		up.privilege2();
	    up.privilegeAlert1();
	    logger.info("User privilege updated successfully");
	    sp.clickOnStudyProfile();
	}
	
	
	
	@Test(priority=3, description = "Add new version to the template")
	public void createNewVersion() throws IOException, InterruptedException
	{
		StudyProfile sp = new StudyProfile(driver);
		sp.createNewVersion1("Patient Information");
		sp.createNewVersion2("1.0", "1.1");
		sp.templateAdditionAlert();
		sp.createNewVersion3("Patient Address");
		sp.designCompleteAlert();
		sp.backToStudyProfile();
		
	}
	
	@Test(priority=4, description = "Retire the form")
	public void retireForm() throws IOException, InterruptedException
	{
		StudyProfile sp = new StudyProfile(driver);
		sp.retireForm1("Patient Details");
		sp.retireForm2();
		sp.formRetireAlert();
		
	}
	
	@Test(priority=5, description = "Create new visit")
	public void createVisit() throws IOException, InterruptedException
	{
		StudyProfile sp = new StudyProfile(driver);
		sp.createVisit01("V01","V01","Home Visit","Patient Information (1.0)");
		sp.visitCreationAlert();
		Thread.sleep(2000);
		sp.createVisit02("V02","V02","Home Visit","Diabetes (1.0)");
		sp.visitCreationAlert();
		Thread.sleep(2000);
		sp.createVisit01("V03","V03","Home Visit","Patient Information (1.0)");
		sp.visitCreationAlert();
	}
	
	@Test(priority=6, description = "Assign template to the visit")
	public void assignTemplate() throws IOException, InterruptedException
	{
		StudyProfile sp = new StudyProfile(driver);
		sp.assignTemplate1("V01");
		sp.assignTemplate2("Patient Information (1.0)");
		sp.assignTemplateAlert();
	}
	
	@Test(priority=7, description = "Edit the visit details")
	public void editVisit() throws IOException, InterruptedException
	{
		StudyProfile sp = new StudyProfile(driver);
		sp.editVisit1("V01");
		sp.editVisit2("Site Visit");
		sp.editVisitAlert();
	}
	
	@Test(priority=8, description = "Delete the visit")
	public void deleteVisit() throws IOException, InterruptedException
	{
		StudyProfile sp = new StudyProfile(driver);
		sp.deleteVisit("V02");
		sp.deleteVisitAlert();		
	}
	
	@Test(dataProvider="DD3",priority=9, description = "Create new site")
	public void createSite(String site) throws IOException, InterruptedException
	{
		StudyProfile sp = new StudyProfile(driver);
		SitePage sp1 = new SitePage(driver);
		sp.createSite(site);
		sp.siteCreationAlert();
		logger.info("Site created successfully");
	}
	
	
	@Test(priority=10, description = "Edit the site details")
	public void siteEdit() throws IOException, InterruptedException
	{	
		SitePage sp = new SitePage(driver);
		sp.searchSiteCode("S02");
		sp.editSiteIcon("S02");
		sp.editSite("S02a");
		sp.editAlert();
		logger.info("Study updated successfully");
	}	
	
	@Test(priority=11)
	public void siteActionOpen() throws IOException, InterruptedException
	{	
		SitePage sp = new SitePage(driver);
		sp.siteActionOpen("S03");
		logger.info("Site opened");
	}
		
	@Test(priority=12)
	public void siteActionComplete() throws IOException, InterruptedException
	{	
		SitePage sp = new SitePage(driver);
		sp.siteActionComplete("S03");
		logger.info("Site completed");
	}
	
	@Test(priority=13)
	public void siteActionTerminate() throws IOException, InterruptedException
	{
		SitePage sp = new SitePage(driver);
		sp.siteActionTerminate("S03");
		Thread.sleep(3000);
		logger.info("Site terminated");
	}
	
	@Test(priority=14, description = "Delete the site")
	public void siteDelete() throws IOException, InterruptedException
	{	
		SitePage sp = new SitePage(driver);
		SubjectPage sp1 = new SubjectPage(driver);
		sp.searchSiteCode("S02");
		sp.delSiteIcon("S02");
		sp.deleteAlert();
		logger.info("Site deleted");
		sp1.clickItems();
		sp1.clickSubject();
	}
	
	@Test(dataProvider="DD4",priority=15, description = "Create new subject")
	public void createSubject(String subid,String subname,String date,String inv) throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.createSubject(subid,subname,date,inv);
		sp.subjectAlert();
	}
	
	
	@Test(priority=16, description = "Edit the subject details")
	public void SubjectEdit() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.searchSubjectId("P02");
		sp.editSubject("P02");
		sp.editSub("NA");
		sp.subjectEditAlert();
		logger.info("Subject updated successfully");
	}

	@Test(priority=17, description = "Schedule the visit for a subject")
	public void schedule() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.searchSubjectId("P01");
		sp.scheduleSubject("P01");
		sp.scheduleAlert();
		logger.info("Schedule created successfully");	
		Thread.sleep(2000);
		sp.searchSubjectId("P04");
		sp.scheduleSubject("P04");
		sp.scheduleAlert();
		logger.info("Schedule created successfully");	
		Thread.sleep(2000);
	}
	
	@Test(priority=18)
	public void withdrawPatient() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.searchSubjectId("P03");
		sp.withdrawnSubject("P03");
		sp.subjectWithdrawAlert();
		logger.info("Subject withdrew successfully");
		driver.navigate().refresh();
	}
	
	
	@Test(priority=19, description = "Delete the subject")
	public void delete() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		LoginPage lp=new LoginPage(driver);
		sp.searchSubjectId("P02");
		sp.delSubject("P02");
		sp.subjectDelAlert();
		logger.info("Subject deleted successfully");
		lp.logout();
	}
	
	@DataProvider(name="DD1")
	 String [][] getData1() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\eclipse-workspace\\EndToEnd_EIDSA\\testData\\StudyProfile.xlsx";
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
	
	
	@DataProvider(name="DD3")
	 String [][] getData3() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\eclipse-workspace\\EndToEnd_EIDSA\\testData\\StudyProfile.xlsx";
int rownum=XLUtility.getRowCount(path, "Sheet3");
	int colcount=XLUtility.getCellCount(path, "Sheet3", 1);
	
	String data[][]=new String[rownum][colcount];
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			data[i-1][j]=XLUtility.getCellData(path, "Sheet3", i, j);
		}
	}
	
	return data;	

	}
	
	
	@DataProvider(name="DD4")
	 String [][] getData4() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\eclipse-workspace\\EndToEnd_EIDSA\\testData\\StudyProfile.xlsx";
int rownum=XLUtility.getRowCount(path, "Sheet4");
	int colcount=XLUtility.getCellCount(path, "Sheet4", 1);
	
	String data[][]=new String[rownum][colcount];
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			data[i-1][j]=XLUtility.getCellData(path, "Sheet4", i, j);
		}
	}
	
	return data;	

	}
	
	
	


}
