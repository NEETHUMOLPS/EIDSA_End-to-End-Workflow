package com.EIDSA.testCases;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.EIDSA.pageObjects.ForgotPassword;
import com.EIDSA.utilities.XLUtility;

import Base.BaseClass;

public class TC_002_ForgotPasswordOrUsername_Positive extends BaseClass{
	@Test(dataProvider="DD1", priority=1, description = "Click on forgot password option")
	public void forgotPassword(String mail) throws IOException, InterruptedException
	{
		ForgotPassword fp = new ForgotPassword(driver);
		fp.clickForgotPassword_ForgotUsername();
		fp.setEmail(mail);
		fp.clickSubmit();
		fp.Alert1();
	}	
	
	@Test(dataProvider="DD1", priority=2, description = "Click on forgot username option")
	public void forgotUsername(String mail) throws IOException, InterruptedException
	{
		ForgotPassword fp = new ForgotPassword(driver);
		fp.clickForgotPassword_ForgotUsername();
		fp.clickUsername();
		fp.setEmail(mail);
		fp.clickSubmit();
		fp.Alert2();
	}
	
	@DataProvider(name="DD1")
	 String [][] getData1() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\git\\EIDSA_IntegrationTest\\testData\\Login.xlsx";
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
	
}