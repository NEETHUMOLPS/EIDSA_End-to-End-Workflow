package com.EIDSA.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.Queries;

import Base.BaseClassTest;

public class TC_021_Queries  extends BaseClassTest {
	

	@Test(priority=1)
	public void generalQuery() throws IOException, InterruptedException
	{
		Queries qs = new Queries(driver);
		qs.selectStudy("IDS04");
		qs.formQuery("Subject", "Message");
		Assert.assertEquals(qs.Alert(),"Query generated successfully.");
	}
	
	@Test(priority=2)
	public void reply() throws IOException, InterruptedException
	{
		Queries qs = new Queries(driver);
		qs.reply("Message");
		Assert.assertEquals(qs.Alert(),"Are you sure you want to send this message?");
	}
	
	@Test(priority=3)
	public void replyAndClose() throws IOException, InterruptedException
	{
		Queries qs = new Queries(driver);
		qs.replyAndClose("Message");
		Assert.assertEquals(qs.Alert(),"Are you sure you want to send this message and close this query?");
	}
	
	@Test(priority=4)
	public void ViewForm() throws IOException, InterruptedException
	{
		Queries qs = new Queries(driver);
		qs.viewForm();
		driver.navigate().back();
	}
	
	@Test(priority=5)
	public void exportPdf() throws IOException, InterruptedException
	{
		Queries qs = new Queries(driver);
		qs.exportPdf();
	}
	

}
