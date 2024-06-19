package com.EIDSA.testCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.EIDSA.pageObjects.UserPage;
import com.EIDSA.utilities.XLUtility;


import Base.BaseClassTest;

public class TC_007_Users_Positive extends BaseClassTest{
	
	@Test(dataProvider="DD1", priority=1, description = "Create new user")
	public void userCreation(String fname,String sname,String uname,String mail,String utype,String role) throws IOException, InterruptedException
	{		
		UserPage up=new UserPage(driver);
		up.clickUser();
		up.createUser(fname,sname,uname,mail,utype,role);
		up.userCreationAlert();
	}	
	
	
	@Test(dataProvider="DD2",priority=2, description = "Edit the user details")
	public void userEdit(String mail) throws InterruptedException
	{
		UserPage up=new UserPage(driver);
		up.searchEmailOrName(mail);
		up.edit1(mail);
	    up.edit2("");
	    up.userUpdationAlert();
	}
	
	
	@Test(dataProvider="DD2",priority=3, description = "Delete the user")
	public void userDelete(String mail) throws IOException, InterruptedException
	{
		UserPage up=new UserPage(driver);	
		up.searchEmailOrName(mail);
		up.delete(mail);	
		up.userDeletionAlert();
	}
	
	@DataProvider(name="DD1")
	 String [][] getData1() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\eclipse-workspace\\EndToEnd_EIDSA\\testData\\Users.xlsx";
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
		String path = "C:\\Users\\NeethumolPS\\eclipse-workspace\\EndToEnd_EIDSA\\testData\\Users.xlsx";
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
