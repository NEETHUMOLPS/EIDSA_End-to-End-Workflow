package com.EIDSA.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.LoginPage;
import com.EIDSA.pageObjects.Profile;
import com.EIDSA.utilities.XLUtility;

import Base.BaseClass;

public class TC_004_Profiles_Positive extends BaseClass{
	
	@Test(dataProvider="DD1",priority=1, description = "Edit the user profile details")
	public void myProfile(String uname,String mail,String pwd) throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.login(uname,mail,pwd);
		Profile pp = new Profile(driver);
		pp.selectProfile();
		pp.myProfile("");
		pp.Alert1();
	}
	
	@Test(dataProvider="DD2",priority=2, description = "Change the password for user account")
	public void changePassword(String pwd1,String pwd2,String pwd3) throws IOException, InterruptedException
	{
		Profile pp = new Profile(driver);
		pp.changePassword(pwd1,pwd2,pwd3);
		pp.Alert2();
	}
	
	@Test(dataProvider="DD3",priority=3, description = "Update the password of digital signature ")
	public void digitalSignatureUpdation(String pwd1,String pwd2,String pwd3) throws IOException, InterruptedException
	{
		Profile pp = new Profile(driver);
		pp.digitalSignatureUpdation(pwd1,pwd2,pwd3);
		pp.Alert3();		
	}
	
	@Test(dataProvider="DD4",priority=4, description = "Set up the default Study")
	public void defaultSetup(String study) throws IOException, InterruptedException
	{
		Profile pp = new Profile(driver);
		pp.defaultSetup(study);		
	}
	
	@DataProvider(name="DD1")
	 String [][] getData1() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\Desktop\\EIDSA_Integration\\Profile.xlsx";
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
		String path = "C:\\Users\\NeethumolPS\\Desktop\\EIDSA_Integration\\Profile.xlsx";
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
	
	@DataProvider(name="DD3")
	 String [][] getData3() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\Desktop\\EIDSA_Integration\\Profile.xlsx";
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
		String path = "C:\\Users\\NeethumolPS\\Desktop\\EIDSA_Integration\\Profile.xlsx";
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
