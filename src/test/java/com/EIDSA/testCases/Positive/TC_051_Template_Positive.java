package com.EIDSA.testCases.Positive;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.Templates;

import Base.BaseClassTest;

public class TC_051_Template_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void TemplateSearchValidation() throws IOException, InterruptedException
	{
		Templates te = new Templates(driver);
		te.clickTemplates();
		te.searchTemplateName("Case Report");
		te.clickSearch();
		Assert.assertTrue(te.templateSearchValidation("Case Report"));
		logger.info("Template name search verification successfully completed");
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void translate() throws IOException, InterruptedException
	{
		Templates te = new Templates(driver);
		te.clickTemplates();
		te.searchTemplateName("Case Report");
		te.clickSearch();
		te.view("Case Report");
		te.translate("English");
		logger.info("Translated successfully");
		Thread.sleep(3000);
	}

}
