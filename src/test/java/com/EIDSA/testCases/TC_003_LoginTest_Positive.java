package com.EIDSA.testCases;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.EIDSA.pageObjects.LoginPage;
import com.EIDSA.utilities.XLUtility;

import Base.BaseClass;
public class TC_003_LoginTest_Positive extends BaseClass {
	
	@Test(dataProvider="DD1",description = "Login with valid credentials")
	public void LoginTest(String username,String mail,String pwd) throws IOException, InterruptedException
	{		
		logger.info("URL is opened");
		LoginPage lp=new LoginPage(driver);
		lp.login(username,mail,pwd);
		Thread.sleep(5000);
		lp.logout();
	}
	
	@DataProvider(name="DD1")
	 String [][] getData1() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\Desktop\\EIDSA_Integration\\Login.xlsx";
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

