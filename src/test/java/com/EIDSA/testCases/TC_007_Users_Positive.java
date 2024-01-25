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
	
	@Test(priority=2, description = "Edit the user details")
	public void userEdit() throws InterruptedException
	{
		UserPage up=new UserPage(driver);
		up.searchEmailOrName("neethug@yopmail.com");
		up.edit1("neethug@yopmail.com");
	    up.edit2("");
	    up.userUpdationAlert();
	}
	
	@Test(priority=3, description = "Delete the user")
	public void userDelete() throws IOException, InterruptedException
	{
		UserPage up=new UserPage(driver);	
		up.searchEmailOrName("neethug@yopmail.com");
		up.delete("neethug@yopmail.com");	
		up.userDeletionAlert();
	}
	
	@DataProvider(name="DD1")
	 String [][] getData1() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\Desktop\\EIDSA\\Users.xlsx";
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
