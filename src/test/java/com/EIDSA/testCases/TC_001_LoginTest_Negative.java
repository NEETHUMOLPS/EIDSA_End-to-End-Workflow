package com.EIDSA.testCases;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.EIDSA.pageObjects.LoginPage;
import com.EIDSA.utilities.XLUtility;
import Base.BaseClass;

public class TC_001_LoginTest_Negative extends BaseClass{
	
	@Test(dataProvider="DD1",priority=1, description = "Login with invalid username")
	public void loginWithInvalidUsername(String Username,String Email, String Password) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.login(Username,Email, Password);
		//Thread.sleep(10000);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(lp.ErrorMsg2(), "The username is not associated with this account.");
		softAssert.assertAll();
        logger.info("Negative test passed");
       // driver.navigate().refresh();
       
	}

	@Test(dataProvider="DD2",priority=2, description = "Login with invalid email/password")
	public void loginWithInvalidEmailAndPassword(String Username,String Email, String Password) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.clearLoginCredentials();
		lp.login(Username,Email, Password);
		//Thread.sleep(5000);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(lp.ErrorMsg1(), "Invalid email or password.");
		softAssert.assertAll();
        logger.info("Negative test passed");
        
	}	


	
	@DataProvider(name="DD1")
	 String [][] getData1() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\git\\EIDSA_IntegrationTest\\testData\\Login.xlsx";
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
		String path = "C:\\Users\\NeethumolPS\\git\\EIDSA_IntegrationTest\\testData\\Login.xlsx";
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
