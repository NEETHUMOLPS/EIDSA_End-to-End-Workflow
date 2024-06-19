package com.EIDSA.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.LoginPage;
import com.EIDSA.pageObjects.SubmittedForm;

import Base.BaseClassTest;

public class TC_020_SubmittedForm extends BaseClassTest {
	

	@Test(priority=1)
	public void uploadDocument() throws IOException, InterruptedException
	{
		SubmittedForm sf = new SubmittedForm(driver);
		sf.selectStudy("IDS04");
		sf.clickOnSubmittedForm();
		sf.selectForm1();
		sf.uploadDocument();
		Thread.sleep(20000);
		Assert.assertEquals(sf.Alert(),"Document created successfully");
	}
	
	@Test(priority=2)
	public void viewUploadedDocument() throws IOException, InterruptedException
	{
		SubmittedForm sf = new SubmittedForm(driver);
		sf.viewDocuments();
		driver.navigate().back();
	}
	
	@Test(priority=3)
	public void downloadDocument() throws IOException, InterruptedException
	{
		SubmittedForm sf = new SubmittedForm(driver);
		sf.viewDocument();
		sf.download();	
		driver.navigate().refresh();//
	}

	/*@Test(priority=4)
	public void deleteDocument() throws IOException, InterruptedException
	{
		SubmittedForm sf = new SubmittedForm(driver);
		sf.delete();	
		sf.deleteAlert();	
	}*/
	
	@Test(priority=5)
	public void downloadPdf() throws IOException, InterruptedException
	{
		SubmittedForm sf = new SubmittedForm(driver);
		sf.downloadPdf();	
	}
	
	@Test(priority=6)
	public void formQuery() throws IOException, InterruptedException
	{
		SubmittedForm sf = new SubmittedForm(driver);
		sf.formQuery("Subject","Message");
		Assert.assertEquals(sf.Alert(),"Query generated successfully.");
	}
	
	@Test(priority=7)
	public void openQuery() throws IOException, InterruptedException
	{
		SubmittedForm sf = new SubmittedForm(driver);
		sf.openQuery();
		sf.close();
		Assert.assertEquals(sf.Alert(),"Are you sure you want to close the query?");
	}
	
	@Test(priority=8)
	public void closedQuery() throws IOException, InterruptedException
	{
		SubmittedForm sf = new SubmittedForm(driver);
		sf.closedQuery();
		driver.navigate().back();
	}
	
	@Test(priority=9)
	public void pageQuery() throws IOException, InterruptedException
	{
		SubmittedForm sf = new SubmittedForm(driver);
		sf.pageQuery("Subject","Message");
		Assert.assertEquals(sf.Alert(),"Query generated successfully.");
	}
	
	@Test(priority=10)
	public void sign() throws IOException, InterruptedException
	{
		SubmittedForm sf = new SubmittedForm(driver);
		sf.sign("neethumolp@datamatica.uk", "Neethu@11");
		sf.unsign("neethumolp@datamatica.uk", "Neethu@11");
	}
	
	@Test(priority=11)
	public void DataVerification() throws IOException, InterruptedException
	{
		SubmittedForm sf = new SubmittedForm(driver);
		sf.DataVerification();
	}
	
	@Test(priority=12)
	public void fieldQuery() throws IOException, InterruptedException
	{
		SubmittedForm sf = new SubmittedForm(driver);
		sf.clickOnFiled();
		sf.fieldQuery("Subject","Message");
		Assert.assertEquals(sf.Alert(),"Query generated successfully.");	
	}
	
	@Test(priority=13)
	public void verify() throws IOException, InterruptedException
	{
		SubmittedForm sf = new SubmittedForm(driver);
		sf.verifyForm();
		Assert.assertEquals(sf.Alert(),"Form verified successfully");
	}
	
	@Test(priority=14)
	public void pageSave() throws IOException, InterruptedException
	{
		SubmittedForm sf = new SubmittedForm(driver);
		sf.PageSave();
		Assert.assertEquals(sf.Alert(),"Page validated successfully");
	}
	
	@Test(priority=15)
	public void archive() throws IOException, InterruptedException
	{
		SubmittedForm sf = new SubmittedForm(driver);
		LoginPage lp=new LoginPage(driver);
		sf.archive();
		sf.archiveAlert();
		Thread.sleep(3000);
	}
	
	

}
